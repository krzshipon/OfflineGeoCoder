package com.shipon.offlinegeocoder;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.io.IOException;
import java.io.InputStream;

public class MainActivity extends AppCompatActivity {
    private final String TAG = MainActivity.class.getSimpleName();
    private EditText etLatitude,etLongitude;
    private Button btGeocode;
    private TextView showGeocode;
    private ReverseGeoCoder reverseGeoCoder;
    public static final String mAddreessFileName = "cities15000.txt";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etLatitude = findViewById(R.id.et_latitude_input);
        etLongitude = findViewById(R.id.et_longitude_input);
        btGeocode = findViewById(R.id.button_geocode);
        showGeocode = findViewById(R.id.tv_show_result);
        try {

            InputStream inputStream  = getAssets().open(mAddreessFileName);
            ReverseGeoCoder.initialize(inputStream, true);

        } catch (IOException e) {
            Log.e(TAG , e.getMessage());
            e.printStackTrace();
        }
        btGeocode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                geocode();
            }
        });


    }

    private void geocode() {
        //get singletone instance
        reverseGeoCoder =  ReverseGeoCoder.getInstance();
        Double lat  = Double.parseDouble(etLatitude.getText().toString().trim());
        Double lng  = Double.parseDouble(etLongitude.getText().toString().trim());

        // find by algorithm
        GeoName geoName = reverseGeoCoder.nearestPlace(lat, lng);

        //show result
        showGeocode.setText(geoName.toString());



    }
}
