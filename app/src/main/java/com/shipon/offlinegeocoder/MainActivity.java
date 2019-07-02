package com.shipon.offlinegeocoder;

import android.Manifest;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;


import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.ResolvableApiException;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.location.LocationSettingsRequest;
import com.google.android.gms.location.LocationSettingsResponse;
import com.google.android.gms.location.LocationSettingsStatusCodes;
import com.google.android.gms.location.SettingsClient;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.material.snackbar.Snackbar;

import android.content.Intent;
import android.content.IntentSender;
import android.content.pm.PackageManager;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import java.io.IOException;
import java.io.InputStream;

public class MainActivity extends AppCompatActivity implements LocationListener {
    private final String TAG = MainActivity.class.getSimpleName();
    private EditText etLatitude, etLongitude;
    private Button btGeocode;
    private TextView showGeocode, languageTv;
    private ReverseGeoCoder reverseGeoCoder;
    public static final String mAddreessFileName = "_city_list.csv";
    private String language = "en";
    ProgressBar progressBar;
    // location provider api
    private LocationManager mLocationManager;
    private SettingsClient mSettingsClient;
    private LocationSettingsRequest mLocationSettingsRequest;
    private LocationRequest mLocationRequest;
    private boolean isGPSEnabled = false;
    private boolean isNetworkEnabled = false;
    private Location mLocation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etLatitude = findViewById(R.id.et_latitude_input);
        etLongitude = findViewById(R.id.et_longitude_input);
        btGeocode = findViewById(R.id.button_geocode);
        showGeocode = findViewById(R.id.tv_show_result);
        progressBar = findViewById(R.id.progressbar);
        languageTv = findViewById(R.id.language_tv);
        initializeCoder(language);

        // Acquire a reference to the system Location Manager
        mLocationManager = (LocationManager) this.getSystemService(Context.LOCATION_SERVICE);
        mSettingsClient = LocationServices.getSettingsClient(this);
        mLocationRequest = LocationRequest.create();
        mLocationRequest.setPriority(LocationRequest.PRIORITY_HIGH_ACCURACY);
        mLocationRequest.setInterval(Constants.MIN_TIME_BW_UPDATES);
        mLocationRequest.setFastestInterval(Constants.FASTEST_TIME_BW_UPDATES);
        LocationSettingsRequest.Builder builder = new LocationSettingsRequest.Builder()
                .addLocationRequest(mLocationRequest);
        mLocationSettingsRequest = builder.build();
        builder.setAlwaysShow(true);

        getLocation();

        btGeocode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                geocode();
            }
        });


    }

    private void geocode() {
        //get singletone instance
        reverseGeoCoder = ReverseGeoCoder.getInstance();
        Double lat = Double.parseDouble(etLatitude.getText().toString().trim());
        Double lng = Double.parseDouble(etLongitude.getText().toString().trim());

        // find by algorithm
        GeoName geoName = reverseGeoCoder.nearestPlace(lat, lng);

        //show result
        showGeocode.setText(geoName.toString());


    }

    /**
     * For inflating menu
     *
     * @param menu
     * @return
     */
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }


    /**
     * Selection Menu IN Main Activity
     *
     * @param item
     * @return
     */
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.lang_en:
                language = "en";
                languageTv.setText("English");
                initializeCoder(language);
                geocode();
                return true;
            case R.id.lang_ja:
                language = "ja";
                languageTv.setText("Japanese");
                initializeCoder(language);
                geocode();
                return true;
            case R.id.lang_zh:
                language = "zh";
                languageTv.setText("Chinese");
                initializeCoder(language);
                geocode();
                return true;
            case R.id.lang_ko:
                language = "ko";
                languageTv.setText("korean");
                initializeCoder(language);
                geocode();
                return true;
            case R.id.lang_de:
                language = "de";
                languageTv.setText("German");
                initializeCoder(language);
                geocode();
                return true;
            case R.id.lang_es:
                language = "es";
                languageTv.setText("Spanish");
                initializeCoder(language);
                geocode();
            case R.id.lang_fr:
                language = "fr";
                languageTv.setText("French");
                initializeCoder(language);
                geocode();
                return true;
            case R.id.lang_it:
                language = "it";
                languageTv.setText("Italian");
                initializeCoder(language);
                geocode();
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    private void initializeCoder(String language) {
        try {
            progressBar.setVisibility(View.VISIBLE);
            String file = language + mAddreessFileName;
            InputStream inputStream = getAssets().open(file);
            ReverseGeoCoder.initialize(inputStream, true);
            progressBar.setVisibility(View.GONE);

        } catch (IOException e) {
            Log.e(TAG, e.getMessage());
            e.printStackTrace();
            progressBar.setVisibility(View.GONE);
        }
    }


    public void getLocation() {
        try {
            // Getting GPS status
            isGPSEnabled = mLocationManager
                    .isProviderEnabled(LocationManager.GPS_PROVIDER);
            // Getting network status
            isNetworkEnabled = mLocationManager
                    .isProviderEnabled(LocationManager.NETWORK_PROVIDER);

            if (!isGPSEnabled && !isNetworkEnabled) {
                turnGPSOn();
            } else {
                if (isNetworkEnabled) {
                    if (checkSelfPermission(Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && checkSelfPermission(Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
                        requestPermissions();
                        return;
                    }
                    mLocationManager.requestLocationUpdates(
                            LocationManager.NETWORK_PROVIDER,
                            Constants.MIN_TIME_BW_UPDATES,
                            Constants.MIN_DISTANCE_CHANGE_FOR_UPDATES, this);
                    if (mLocationManager != null) {
                        mLocation = mLocationManager
                                .getLastKnownLocation(LocationManager.NETWORK_PROVIDER);
                        updateCode(mLocation);
                    }
                }
                // If GPS enabled, get latitude/longitude using GPS Services
                else if (isGPSEnabled) {
                    if (mLocation == null) {
                        if (checkSelfPermission(Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && checkSelfPermission(Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
                            requestPermissions();
                            return;
                        }
                        mLocationManager.requestLocationUpdates(
                                LocationManager.GPS_PROVIDER,
                                Constants.MIN_TIME_BW_UPDATES,
                                Constants.MIN_DISTANCE_CHANGE_FOR_UPDATES, this);
                        if (mLocationManager != null) {
                            mLocation = mLocationManager
                                    .getLastKnownLocation(LocationManager.GPS_PROVIDER);
                            updateCode(mLocation);

                        }
                    }
                }
            }
        } catch (Exception e) {
            Log.e(TAG, e.getMessage());
        }
    }


    private void requestPermissions() {
        boolean shouldProvideRationale =
                (ActivityCompat.shouldShowRequestPermissionRationale(this,
                        Manifest.permission.ACCESS_FINE_LOCATION)
                        && (ActivityCompat.shouldShowRequestPermissionRationale(this,
                        Manifest.permission.ACCESS_COARSE_LOCATION))
                );

        // Provide an additional rationale to the user. This would happen if the user denied the
        // request previously, but didn't check the "Don't ask again" checkbox.
        if (shouldProvideRationale) {
            Log.i(TAG, "Displaying permission rationale to provide additional context.");
            Snackbar.make(
                    findViewById(R.id.root_layout),
                    R.string.permission_rationale,
                    Snackbar.LENGTH_INDEFINITE)
                    .setAction(R.string.ok, new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            // Request permission
                            ActivityCompat.requestPermissions(MainActivity.this,
                                    new String[]{Manifest.permission.ACCESS_FINE_LOCATION},
                                    Constants.LOCATION_REQUEST);
                        }
                    })
                    .show();
        } else {
            Log.i(TAG, "Requesting permission");
            // Request permission. It's possible this can be auto answered if device policy
            // sets the permission in a given state or the user denied the permission
            // previously and checked "Never ask again".
            ActivityCompat.requestPermissions(MainActivity.this,
                    new String[]{Manifest.permission.ACCESS_FINE_LOCATION},
                    Constants.LOCATION_REQUEST);
        }
    }

    @Override
    public void onLocationChanged(Location location) {
        mLocation = location;
        updateCode(location);
    }



    @Override
    public void onStatusChanged(String s, int i, Bundle bundle) {

    }

    @Override
    public void onProviderEnabled(String s) {

    }

    @Override
    public void onProviderDisabled(String s) {

    }

    private void updateCode(Location location) {
        //get singletone instance
        reverseGeoCoder =  ReverseGeoCoder.getInstance();
        if(location != null) {
            Double lat = location.getLatitude();
            Double lng = location.getLongitude();
            etLatitude.setText(lat+"");
            etLongitude.setText(lng+"");

            // find by algorithm
            GeoName geoName = reverseGeoCoder.nearestPlace(lat, lng);

            //show result
            showGeocode.setText(geoName.toString());
            Toast.makeText(this, "Updated ", Toast.LENGTH_SHORT).show();
        }else {
            Toast.makeText(this, "Location not found", Toast.LENGTH_SHORT).show();
        }
    }


    /**
     * Turn ON GPS without leaving app
     */
    public void turnGPSOn() {
        Activity activity = this;

        if (mLocationManager.isProviderEnabled(LocationManager.GPS_PROVIDER)) {
            isGPSEnabled =true;
        } else {
            mSettingsClient
                    .checkLocationSettings(mLocationSettingsRequest)
                    .addOnSuccessListener(this, new OnSuccessListener<LocationSettingsResponse>() {
                        @SuppressLint("MissingPermission")
                        @Override
                        public void onSuccess(LocationSettingsResponse locationSettingsResponse) {

                            //  GPS is already enable, callback GPS status through listener
                            if (isGPSEnabled) {
                                getLocation();
                            }
                        }
                    })
                    .addOnFailureListener(this, new OnFailureListener() {
                        @Override
                        public void onFailure(@NonNull Exception e) {
                            int statusCode = ((ApiException) e).getStatusCode();
                            switch (statusCode) {
                                case LocationSettingsStatusCodes.RESOLUTION_REQUIRED:

                                    try {
                                        // Show the dialog by calling startResolutionForResult(), and check the
                                        // result in onActivityResult().
                                        ResolvableApiException rae = (ResolvableApiException) e;
                                        rae.startResolutionForResult( activity, Constants.GPS_REQUEST);
                                    } catch (IntentSender.SendIntentException sie) {
                                    }
                                    break;
                                case LocationSettingsStatusCodes.SETTINGS_CHANGE_UNAVAILABLE:

                                    Toast.makeText(MainActivity.this, "Gps error", Toast.LENGTH_LONG).show();
                            }
                        }
                    });
        }
    }

    @Override
    protected void onResume() {
        super.onResume();
        getLocation();
    }
}
