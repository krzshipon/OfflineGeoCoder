package com.shipon.offlinegeocoder;

import android.os.Environment;



public class Constants {
    public static final String DOWNLOADED_APK_NAME = "base.apk";
    public static final String DOWNLOADED_WIFI_SETTINGS_APK_NAME = "base_wifi_settings.apk";
    public static final String DOWNLOADED_POCKETALK_APK_NAME = "base_pocketalk.apk";
    public static final String LICENSE_FILE_NAME = "text-license.txt";
    public static final String EULA_URL_PREFIX= "text-eula-";
    public static final String EULA_URL_SUFFIX= ".html";
    public static final int LOADING_ANIMATION_IMAGES_COUNT = 60;
    public static final int CHECKED_ANIMATION_IMAGES_COUNT = 37;
    public static final String CHECKED_ANIMATION_RES_NAME = "check";
    public static final int WRONG_ANIMATION_IMAGES_COUNT = 45;
    public static final String WRONG_ANIMATION_RES_NAME = "wrong";
    public static final int FB_ANIMATION_DURATION = 30;

    public static final int AMPLITUDE_MAX_VALUE = 30;
    public static final int AMPLITUDE_MIN_VALUE = 0;

    public static final float ANIMATION_MAX_LENGTH = 1.3f;
    public static final float ANIMATION_MIN_LENGTH = 0.6f;

    public static final int FM_BUTTON_ID = 0;
    public static final int MTK_BUTTON_ID = 1;
    public static final int SETTINGS_BUTTON_ID = 2;
    public static final int AGING_BUTTON_ID = 3;

    //SharedPreference Badge Key
    public static final String KEY_TEXT_TRANSLATION_COUNTER = "KEY_TEXT_TRANSLATION_COUNTER";
    public static final String KEY_IMAGE_TRANSLATION_COUNTER = "KEY_IMAGE_TRANSLATION_COUNTER";
    public static final String KEY_LANGUAGE_USAGES_COUNTER = "KEY_LANGUAGE_USAGES_COUNTER";

    public static final long DEFAULT_COUNTER_SIZE = 0;

    //Badge type
    public static final int BADGE_TYPE_WIFI = 0;
    public static final int BADGE_TYPE_POCKETALK_CENTER_REGISTRATION = 1;
    public static final int BADGE_TYPE_UPDATED_APP = 2;
    public static final int BADGE_TYPE_LANGUAGE_SWITCH_BY_VOICE = 3;
    public static final int BADGE_TYPE_USED_UNIT_CONVERSION = 4;
    public static final int BADGE_TYPE_USED_CAMERA_TRANSLATION = 5;
    public static final int BADGE_TYPE_TEXT_TRANSLATION = 6;
    public static final int BADGE_TYPE_IMAGE_TRANSLATION = 7;
    public static final int BADGE_TYPE_USED_MANY_LANGUAGES = 8;
    public static final int BADGE_TYPE_VISITED_COUNTRY = 9;
    public static final String KEY_BADGE_TYPE = "badge_type";




    // Baidu Constants
   // 填写网页上申请的APP SECRET 如 $secretKey="94dc99566550d87f8fa8ece112xxxxx"
    public static final String TTS_CUID_DEFAULT = "abcdxxx";
    public static final String STT_CUID_DEFAULT = "1234567JAVA";

    public static final String WiFi_CAPTIVE_URL = "http://www.google.com/generate_204";
    public static final String KEY_LANGUAGE = "KEY_LANGUAGE";
    public static final String KEY_SYSTEM_LANGUAGE_CODE = "KEY_SYSTEM_LANGUAGE_CODE";
    public static final String KEY_SYSTEM_LANGUAGE_CODE_SET = "KEY_SYSTEM_LANGUAGE_CODE_SET";
    public static final boolean DEFAULT_SYSTEM_LANGUAGE_CODE_SET = false;
    public static final String KEY_SYSTEM_LANGUAGE_NAME = "KEY_SYSTEM_LANGUAGE_NAME";
    public static final String KEY_NATIVE_LANGUAGE = "KEY_NATIVE_LANGUAGE";
    public static final String KEY_WIFI_SETTINGS = "KEY_WIFI_SETTINGS";
    public static final String KEY_RESET = "KEY_RESET";

    //Gps Constants
    public static final int GEOCODER_MAX_RESULT = 5;
    public static final int LOCATION_REQUEST = 1000;
    public static final int GPS_REQUEST = 1001;
    public static final int MIN_TIME_BW_UPDATES = 500;
    public static final int FASTEST_TIME_BW_UPDATES = 100;
    public static final int MIN_DISTANCE_CHANGE_FOR_UPDATES = 0;

    //Calcuator Constants
    public static final String KEY_CACULATION_METHOD = "KEY_CACULATION_METHOD";
    public static final String KEY_UNIT_LIST_DEFAULT_CONFIG = "KEY_UNIT_LIST_DEFAULT_CONFIG";
    public static final int VOICE_SEARCH_CSV_MINIMUM_COLUMN = 2;
    public static final int DEFAULT_CONFIG_COLUMN_LENGTH = 8;
    public static final String KEY_DEFAULT_CONFIG_ROW_NUMBER = "KEY_DEFAULT_CONFIG_ROW_NUMBER";
    public static final String KEY_DEFAULT_CONFIG_MEMBER_COUNTRY = "KEY_DEFAULT_CONFIG_MEMBER_COUNTRY";
    public static final String KEY_DEFAULT_CONFIG_COUNTRY_NAME = "KEY_DEFAULT_CONFIG_COUNTRY_NAME";
    public static final String KEY_DEFAULT_CONFIG_SYMBOL = "KEY_DEFAULT_CONFIG_SYMBOL";
    public static final String KEY_DEFAULT_CONFIG_CURRENCY_CODE= "KEY_DEFAULT_CONFIG_CURRENCY_CODE";
    public static final String KEY_DEFAULT_CONFIG_LENGTH_CODE = "KEY_DEFAULT_CONFIG_LENGTH_CODE";
    public static final String KEY_DEFAULT_CONFIG_WEIGHT_CODE = "KEY_DEFAULT_CONFIG_WEIGHT_CODE";
    public static final String KEY_DEFAULT_CONFIG_TEMPERATURE_CODE = "KEY_DEFAULT_CONFIG_TEMPERATURE_CODE";
    public static final String KEY_FLAG_FOR_EMPTY_SYMBOL = "-1";




    //LockScreen
    public static final String KEY_GET_LAST_LOACTION_ADDRESS = "KEY_GET_LAST_LOACTION_ADDRESS";
    public static final String KEY_GET_LAST_LOACTION_ZONEID = "KEY_GET_LAST_LOACTION_ZONEID";
    public static final String LOCK_SCREEN_LOCAL_DATE_FORMAT = "yyyy/MM/dd (E)";
    public static final int LOCATION_HISTORY_MAX_ENTRY = 4;

    //Time Calculation Values
    public static final int DAY_HOURS = 24;
    public static final int HOUR_TO_MILLIS_OFFSET = 1000 * 60 * 60;
    public static final int MINUTES_TO_MILLIS_OFFSET = 1000 * 60;
    public static final int SECONDS_TO_MILLIS_OFFSET = 1000;
    public static final int SIXTY_INT = 60;
    public static final double SIXTY_DOUBLE = 60.0;
    public static final String MINUTES_FORMAT = ".#";
    public static final String NOTAION_PLUS = "+";
    public static final String NOTAION_MINUS = "-";
    public static final String EMPTY_STRING = "";


    /* Fixes vup#50 */
    public static final String KEY_IS_INITIAL_TUTORIAL_SHOWN = "KEY_IS_INITIAL_TUTORIAL_SHOWN";
    public static final String KEY_MOBILE_DATA_SETTINGS = "KEY_MOBILE_DATA_SETTINGS";
    public static final String KEY_EULA_ACCEPTED = "KEY_EULA_ACCEPTED";
    public static final String KEY_TRANSLATION_LANGUAGE = "KEY_TRANSLATION_LANGUAGE";
    public static final String KEY_SELECTED_LANGUAGE_NAME_NATIVE = "KEY_SELECTED_LANGUAGE_NAME_NATIVE";
    public static final String KEY_SELECTED_LANGUAGE_NAME_TRANSLATED = "KEY_SELECTED_LANGUAGE_NAME_TRANSLATED";
    public static final String DEFAULT_SYSTEM_LANGUAGE_CODE = "en";
    public static final String DEFAULT_SYSTEM_LANGUAGE_NAME = "English(US)";
    public static final String KEY_VOICE_RECEIVED_TEXT = "KEY_VOICE_RECEIVED_TEXT";
    public static final String KEY_HOST = "KEY_HOST";
    public static final String FROM_HOME = "FROM_HOME";
    public static final String FROM_DEFAULT = "FROM_DEFAULT";
    public static final String ACTION_UPLOAD_DATA = "ACTION_UPLOAD_DATA";
    public static final String KEY_MAC_ADDRESS = "KEY_MAC_ADDRESS";

    public static final String KEY_SELECTED_LANGUAGE_CODE_NATIVE = "selected_position_native_language";
    public static final String KEY_SELECTED_LANGUAGE_CODE_TARGET = "selected_position_target_language";
    public static final String TMP_SELECTED_ITEM_POSITION_NATIVE_LANGUAGE = "tmp_selected_position_native_language";
    public static final String TMP_SELECTED_ITEM_POSITION_TARGET_LANGUAGE = "tmp_selected_position_target_language";
    public static final String DEFAULT_CODE_NATIVE = "en";
    public static final String DEFAULT_CODE_TARGET = "es";
    public static final String DEFAULT_LANGUAGE_NATIVE = "English(US)";
    public static final String DEFAULT_LANGUAGE_TARGET = "Español(España)";
    public static final boolean DEFAULT_WIFI_STATE = false;
    public static final boolean DEFAULT_RESET_STATE = false;
    public static final boolean DEFAULT_MOBILE_DATA_STATE = false;
    public static final boolean DEFAULT_EULA_STATE = false;
    public static final String TAG_CALLER_ACTIVITY_IDENTIFIER = "caller_activity_identifier";
    public static final String TAG_LANGUAGE_CODE = "language_code";
    public static final String TAG_LEFT_BUTTON_CLICK = "left_button_click";
    public static final String TAG_KEY_EVENT_ACTION = "key_event_action";
    public static final String TAG_KEY_EVENT_REPEAT = "key_event_repeat";
    public static final String ACTIVITY_CONVERSATION = "ConversationActivity";
    public static final String SHORT_LAUNCH = "SHORT_LAUNCH";
    public static final int TEXT_VIEW_LINE_HEIGHT = 26;
    /* Session related key */
    public static final String SESSION_KEY_DEFAULT_APN = "SESSION_KEY_DEFAULT_APN";
    public static final String SESSION_DEFAULT_APN = "";
    public static final String SESSION_KEY_PROGRESS = "SESSION_KEY_PROGRESS";
    public static final int DEFAULT_KEY_PROGRESS = 0;
    public static final String SESSION_KEY_LAST_MODIFIED_TIME = "SESSION_KEY_LAST_MODIFIED_TIME";
    public static final String DEFAULT_KEY_LAST_MODIFIED_TIME = "";
    // Fixed vup#44
    public static final String SESSION_KEY_POCKETALK_UPDATE = "SESSION_KEY_POCKETALK_UPDATE";

    /* Settings: Font Size */
    public static final String KEY_SETTINGS_FONT_SCALE = "settings_font_scale";
    public static final float DEFAULT_FONT_SCALE = 1.0f;

    /* Settings: Font Style */
    public static final String KEY_SETTINGS_FONT_STYLE = "settings_font_style";
    public static final String DEFAULT_FONT_STYLE = "pron_w3.otf";
    public static final String BASE_FONT_PATH = "fonts/";
    public static final String STATIC_TYPE_FACE_FIELD_NAME = "sans-serif";

    /* Intent key */
    public static final String INTENT_KEY_APN_SETTINGS = "INTENT_KEY_APN_SETTINGS";

    /* STT Google Method Delay Millis */
    public static final int STT_GOOGLE_DELAY_MILLIS = 500;

    /* Intent request code */
    /* Fixes vup#50 */
    public static final int INTENT_REQUEST_CODE_SHORT_INPUT = 4200;
    public static final String INTENT_KEY_BUTTON_TYPE = "INTENT_KEY_BUTTON_TYPE";
    public static final int INTENT_REQUEST_CODE_APN_SETTINGS_DETAIL = 420;
    public static final int INTENT_REQUEST_CODE_APN_SETTINGS_NEW = 421;
    public static final int INTENT_APN_ADD_SETTINGS = 951;
    public static final int INTENT_APN_UPDATE_SETTINGS = 952;
    public static final int INTENT_APN_DELETE_SETTINGS = 953;
    public static final String KEY_IS_FROM_SETTINGS = "key_from_settings" ;
    public static final int SPEECH_REQUEST_CODE = 1002;
    /* Intent result code */
    /* Fixes vup#50 */
    public static final int INTENT_RESULT_CODE_TUTORIAL = 3251;
    public static final int INTENT_RESULT_CODE_APN_SETTINGS_DETAIL = 422;
    public static final String PHRASE_FILE_NAME = "fixed_phrase.json";
    public static final String KEY_FIXED_PHRASE_POSITION = "KEY_FIXED_PHRASE_POSITION";
    public static final long DEFAULT_KEY_FIXED_PHRASE_POSITION = -1;
    public static boolean isResetHistory = false;
    public static final String KEY_APP_FIRST_LAUNCH = "APP_FIRST_LAUNCH";
    public static final boolean DEFAULT_APP_FIRST_LAUNCH = true;
    public static final String BROADCAST_RECEIVER_PAIRING = "BROADCAST_RECEIVER_PAIRING";
    public static final String SCAN_BLUETOOTH = "SCAN_BLUETOOTH";

    /* Settings: Sleep time */
    public static final String KEY_SETTINGS_TIME_OUT = "KEY_SETTINGS_TIME_OUT";
    public static final int DEFAULT_TIME_OUT_VALUE = 60000; // milli sec

    /* Settings: Session_id time */
    public static final String KEY_SETTINGS_SESSION_ID = "KEY_SETTINGS_SESSION_ID";
    public static final String DEFAULT_SESSION_ID = "";

    /* Settings: Bluetooth state */
    public static final String KEY_SETTINGS_BLUETOOTH_STATE = "KEY_SETTINGS_BLUETOOTH_STATE";
    public static final boolean DEFAULT_BLUETOOTH_STATE = false;

    /* Unit Calculator */
    public static String KEY_UNIT_LIST = "unit_list";
    public static String KEY_UNIT_TYPE = "unit_type_name";
    public static String KEY_UNIT_CODE = "unit_code_name";
    public static String KEY_UNIT_SYMBOL = "unit_code_symbol";
    public static String KEY_UNIT_DEFAULT_CODE = "unit_default_code";

    /*Dummy  app update response*/
    public static final String DUMMY_APP_UPDATE_RESPONSE = "<root>\n" +
            "<String>\n" +
            "http://a1763.g.akamai.net/f/1763/9658/10m/ftp.sourcenext.co.jp/k7_patch/downstall/app_hodai/update/staging/store_67_stg.apk\n" +
            "</String>\n" +
            "</root>";

    public static final int ROW_FETCH_PER_SCROLL = 500;
    public static final int MAX_HISTORY_ROW = 10000;

    /* Battery Low Dialog Broadcast */
    public static final String ACTION_BATTERY_DIALOG_DISMISS = "ACTION_BATTERY_DIALOG_DISMISS";

    /* Session ID Update Dialog Broadcast */
    public static final String ACTION_SESSION_ID_UPDATE = "ACTION_SESSION_ID_UPDATE";

    public static final String ACTION_LAUNCH_WIFI_SETTINGS = "android.settings.WIFI_SETTINGS";

    public static final String BASE_URL_DEBUG = "http://test.pocketalkcenter.com";
    public static final String BASE_URL_RELEASE = "https://www.pocketalkcenter.com";

    /* Translation data server api */
    public static final String TRANS_DATA_SYNC_URL = "/pocketalkapi/registrationtranslation";
    public static final String SESSION_ID_PARAM = "sessionid";
    public static final String FROM_LANG_PARAM = "fromlang";
    public static final String TO_LANG_PARAM = "tolang";
    public static final String FROM_MSG_PARAM = "frommsg";
    public static final String TO_MSG_PARAM = "tomsg";
    public static final String REVERSE_PARAM = "reverse";
    public static final String WIFI_MAC_PARAM = "wifimacaddress";
    public static final String MCC_PARAM = "mcc";
    public static final String MNC_PARAM = "mnc";
    public static final String LAC_PARAM = "lac";
    public static final String CID_PARAM = "cid";
    public static final String MNC_PREFIX = "0";

    /* Registration data server api */
    public static final String REG_DATA_URL = "/pocketalkapi/registrationproduct";
    public static final String IMEI_SIM_SLOT_PARAM = "imei1";
    public static final String ICCID_SIM_SLOT_PARAM = "iccid1";
    public static final String DEVICE_TYPE_PARAM = "devicetype";
    public static final String DEVICE_TYPE_VALUE = "POCKETALK2";
    public static final String IMEI_EMBEDDED_PARAM = "imei2";
    public static final String ICCID_EMBEDDED_PARAM = "iccid2";
    public static final String KEY_ONETIME_KEY = "onetimekey";
    public static final String KEY_SHORTEN_URL = "shorten_url";
    public static final String KEY_URL = "url";
    public static final String KEY_SESSION_ID = "sessionid";
    public static final String KEY_LICENSE_TYPE = "license_type";
    public static final String KEY_HAS_REGISTRATION = "hasRegistration";

    // License types
    public static final int UPDATE_AVAILABLE_0 = 0;
    public static final int ALREADY_UPDATED_1 = 1;
    public static final int UPDATE_AVAILABLE_2 = 2;
    public static final int ALREADY_UPDATED_3 = 3;
    public static final int STAGE_UPDATE = 4;

    /* Server response code */
    public static final String METHOD_POST = "POST";
    public static final String METHOD_GET = "GET";
    public static final String RESULT_CODE = "result_code";
    public static final String RESULT_OK = "OK";
    public static final String RESULT_WARN_INPUT_PARAM = "WARN_INPUT_PARAM";
    public static final String RESULT_INFO_NOT_SESSION = "INFO_NOT_SESSION";
    public static final String RESULT_ERR_UNKNOWN = "ERR_UNKNOWN";
    public static final String RESULT_INFO_PRODUCT_COMPLETE = "INFO_PRODUCT_COMPLETE";
    public static final String RESULT_INFO_NOT_REGIST_LICENSE = "INFO_NOT_REGIST_LICENSE";
    public static final String KEY_LANGUAGE_SELECTION_PAGE_TRANSLATE = "PAGE_TRANSLATE";
    public static final int DEFAULT_LANGUAGE_SELECTION_PAGE_TRANSLATE = 0;
    public static final String KEY_LANGUAGE_SELECTION_PAGE_NATIVE = "PAGE_NATIVE";
    public static final int DEFAULT_LANGUAGE_SELECTION_PAGE_NATIVE = 0;

    public static final String RESULT_DATA_NATIVE_TEXT = "native_txt";
    public static final String RESULT_DATA_TRANSLATE_TEXT = "translated_txt";
    public static final String RESULT_DATA_NATIVE_CODE = "native_code";
    public static final String RESULT_DATA_TRANSLATE_CODE = "translated_code";
    public static final String RESULT_DATA_FILE_NAME = "file_name";
    public static final String RESULT_DATA_IS_NATIVE = "is_native";
    public static final String TEXT_JP_PRETTY = "めちゃめちゃええやん";
    public static final String TEXT_EN_PRETTY = "Pretty good.";
    public static final long SNACK_BAR_VIEW_DELAY = 2000;
    public static final long CAPTIVE_BAR_VIEW_DELAY = 6000;
    public static final long CLOSE_ANIM_DELAY = 10;
    public static final String KEY_DATABASE_PRE_VERSION = "KEY_DATABASE_PRE_VERSION";

    /* China Mode*/
    public static final String DEFAULT_CODE_NATIVE_CHINA_MODE = "zh-CN";
    public static final String DEFAULT_CODE_TARGET_CHINA_MODE = "ja";

    /* SIM, APN, Data Constants */
    public static final int EMBEDDED_SIM_SLOT = 1;
    public static final int EXTERNAL_SIM_SLOT = 0;
    public static final int INVALID_SIM_SLOT = -1;
    public static final String EXTERNAL_MULTI_APN = "external_multi_apn";

    public static final int MOBILE_DATA_STATE_ON = 1;
    public static final int MOBILE_DATA_STATE_OFF = 0;
    public static final String SIM_STATE_CHANGE_EVENT_KEY = "sim_state_change_event_key";
    public static final String APN_CHANGE_EVENT_KEY = "sim_state_event_key";
    public static final String MOBILE_DATA_STATE_CHANGE_EVENT_KEY = "mobile_data_state_change_event_key";
    public static final String POCKETALK_SIM_APN_NAME = "POCKETALK SIM";

    /*Settings Brightness*/
    public static final int MAX_BRIGHTNESS = 255;
    public static final String KEY_SETTINGS_BRIGHTNESS = "KEY_SETTINGS_BRIGHTNESS";
    public static final int DEFAULT_BRIGHTNESS = 178;

    public static final String KEY_MODE_STATE = "KEY_MODE_STATE";
    public static final int MODE_STATE_DEMO = 0;
    public static final int MODE_STATE_RELEASE = 1;

    /*Registration Constants */
    public static final String KEY_REGISTRATION_STATUS = "key_registration_status";
    public static final boolean REGISTRATION_STATUS = false;

    public static float MAX_BATTERY_LEVEL = 100f;

    /*Settings Auto App Update*/
    public static final String KEY_NEW_VERSION_APK = "String";
    public static final String KEY_NEW_VERSION_FIRMWARE= "Boolean";
    public static final int STAGING_SERVER_UPDATE_CHECKING = 4;
    public static final String KEY_AUTO_APP_UPDATE_TIME = "KEY_AUTO_APP_UPDATE_TIME";
    public static final String KEY_IS_DEVICE_BOOTED = "KEY_IS_DEVICE_BOOTED";
    public static final int DEFAULT_AUTO_APP_UPDATE_TIME = 0;
    public static final boolean DEFAULT_IS_DEVICE_BOOTED = false;
    public static final long AUTO_APP_UPDATE_REQUEST_INTERVAL = 24 * 60 * 60 * 1000; // 24 hour
    public static final String KEY_FONT_SET_TIME = "KEY_FONT_SET_TIME";
    public static final int DEFAULT_FONT_SET_TIME = 0;
    public static final String URL_CONFIGURATION_TEST = "https://www2.sourcenext.com/k7/autoUpdater/autoUpdaterTest.do";
    public static final String URL_CONFIGURATION_RELEASE = "https://www2.sourcenext.com/k7/autoUpdater/autoUpdater.do";
    public static final String KEY_VER_UPDATE_TEST = "root";
    public static final String PARAM_DISPLAY_VERSION = "DisplayVersion";
    public static final String PARAM_NUMBER = "Num";
    public static final String PARAM_PRODUCT_CODE = "ProductCode";
    public static final String PARAM_SCAN_CODE = "ScanMode";
    public static final String PARAM_SUITE = "Suite";
    public static final String PARAM_VALUE_NUMBER = "2000";
    public static final String PARAM_VALUE_PRODUCT_CODE_FIRMWARE = "{96EB6E05-EF55-41FC-BC33-376EB396B44E}";
    public static final String PARAM_VALUE_PRODUCT_CODE_POCKETALK = "{EC7102B6-110D-4936-8106-13B1C2E25BBA}";
    public static final String PARAM_VALUE_PRODUCT_CODE_WIFI_SETTINGS = "{2A7C0928-CAB4-4D9C-B332-F9932AE0DF2B}";
    public static final String PARAM_VALUE_SCAN_MODE_FIRMWARE = "1";
    public static final String PARAM_VALUE_SCAN_MODE_POCKETALK = "2";
    public static final String PARAM_VALUE_SCAN_MODE_WIFI_SETTINGS = "2";
    public static final String PARAM_VALUE_SUIT = "standard";

    public static final String WIFI_SETTINGS_PACAKGE_NAME = "com.sourcenext.pocketalk.settings";
    public static final String ACTION_SILENT_UPDATE_COMPLETE = "action_silent_update_complete";
    public static final String KEY_SILENT_UPDATE_PACKAGE_NAME = "key_silent_update_package_name";
    public static final String KEY_SILENT_UPDATE_FILE_PATH = "key_silent_update_file_path";

    public static final int BATTERY_50 = 50;
    public static final int BATTERY_30 = 30;
    public static final int BATTERY_LOW = 20;

    /* WIFI Constants */
    public static final int WIFI_STRENGTH_LEVEL = 4;
    public static final int LEVEL_NO_WIFI = -1;
    public static final int LEVEL_1_WIFI = 0;
    public static final int LEVEL_2_WIFI = 1;
    public static final int LEVEL_3_WIFI = 2;
    public static final int LEVEL_4_WIFI = 3;

    public static final String KEY_BAIDU_TOKEN = "BAIDU_TOKEN";
    public static final String TAG_ERROR_DETAILS = "err_detail";
    public static final String TAG_ERROR_MESSAGE = "err_msg";
    public static final String TAG_BAIDU_ERROR_NO = "err_no";
    public static final String BAIDU_AUTHENTICATION_ERROR_NO = "3302";
    public static final int DATABASE_PRE_VERSION = 0;
    public static final String DEVICE_ID_DEFAULT = "0000";
    public static final String KEY_UUID = "KEY_UUID";
    public static final String DEFAULT_UUID = "";
    public static final boolean DEFAULT_FILE_DOWNLOAD_FLAG = false;
    public static final String KEY_LANGUAGE_MODEL_INITIALIZE = "KEY_LANGUAGE_INITIALIZE";
    public static final boolean DEFAULT_LANGUAGE_MODEL_INITIALIZE = false;
    public static final String KEY_PREVIOUS_VERSION = "KEY_PREVIOUS_VERSION";
    public static final long DEFAULT_PREVIOUS_VERSION = 0;
    public static final String KEY_WIFI_APP_PREVIOUS_VERSION = "KEY_WIFI_APP_PREVIOUS_VERSION";
    public static final String DEFAULT_WIFI_APP_PREVIOUS_VERSION = "";
    public static final String KEY_FIRMWARE_PREVIOUS_VERSION = "KEY_FIRMWARE_PREVIOUS_VERSION";
    public static final String DEFAULT_FIRMWARE_PREVIOUS_VERSION = "";
    public static final String KEY_FIRMWARE_UPDATE_AVAILABLE = "KEY_FIRMWARE_UPDATE_AVAILABLE";
    public static final boolean DEFAULT_FIRMWARE_UPDATE_AVAILABLE = false;
    public static final String KEY_WIFI_UPDATE_AVAILABLE = "KEY_WIFI_UPDATE_AVAILABLE";
    public static final boolean DEFAULT_WIFI_UPDATE_AVAILABLE = false;
    public static final String KEY_POCKETALK_UPDATE_AVAILABLE = "KEY_POCKETALK_UPDATE_AVAILABLE";
    public static final boolean DEFAULT_POCKETALK_UPDATE_AVAILABLE = false;

    /*STT timer*/
    public static final long DEFAULT_STT_COUNTDOWN_INTERVAL = 1000;
    public static final long DEFAULT_STT_TIMEOUT = 30 * DEFAULT_STT_COUNTDOWN_INTERVAL;

    // GSTT delay log tag
    public static final String GSTT_LOG_TAG = "GSTTDelay";
    public static final String PREF_ACCESS_TOKEN_EXPIRATION_TIME = "access_token_expiration_time";

    // Start Fix VUP#63
    public static final String THAI_LANGUAGE_CODE = "th";
    public static final String ARABIC_LANGUAGE_CODE = "ar";
    // Fixed VUP#63. On TTS screen and ic_translation list item no line space will be added for below lang codes
    //Modified for VUP#168.Remove custom font for Thai language
    public static final String[] CODES_NO_LINE_SPACE = {/*THAI_LANGUAGE_CODE,*/ ARABIC_LANGUAGE_CODE, "uk", "kk", "el", "ky",
            "sr", "tg", "be", "bg", "mk", "mn", "ru"};
    public static final String FONT_NOTOSANS_THAI_REGULAR = "notosans_thai_regular.ttf";
    public static final String FONT_NOTOSANS_ARABIC_REGULAR = "notosans_arabic_regular.ttf";
    public static final String FONT_OPENSANS_REGULAR = "OpenSans-Regular.ttf";
    // End Fix VUP#63
    // Fixed vup#127
    public static final int SOFTWARE_UPDATE_BATTERY_PERCENTAGE = 30;

    /*Tutorial screen*/// Fixed vup#50
    public static final String RAW_URI_PATH = "android.resource://";
    public static final String SYMBOL_SLASH = "/";

    /*Fixed VUP#40(Font cut issue)*/
    public static final float FONT_CUT_MIN_PX = 11.8f;
    public static final float FONT_CUT_MAX_PX = 13.1f;
    public static final float FONT_CUT_TARGET_PX = 13.2f;
    public static final String TARGET_CHARACTER = "4";

    public static String BASE_REGISTRATION_VERSION_URL_RELEASE = "https://www.pocketalkcenter.com/pocketalkapi/registrationversion";
    public static String BASE_REGISTRATION_VERSION_URL_STAGE = "http://test.pocketalkcenter.com/pocketalkapi/registrationversion";

    // Version Registration param vup#103
    public static final String IMEI_PARAM = "imei";
    public static final String APP_VERSION_PARAM = "apversion1";
    public static final String WIFI_SETTING_VERSION_PARAM = "apversion2";
    public static final String FIRMWARE_VERSION_PARAM = "fwversion";
    public static final String RESPONSE_MESSAGE_KEY = "result_code";
    public static final String KEY_REGISTRATION_VERSION_STATUS = "KEY_REGISTRATION_VERSION_STATUS";
    public static final String KEY_FIRST_TIME_SETTINGS = "KEY_FIRST_TIME_SETTINGS";
    public static final boolean DEFAULT_FIRST_TIME_SETTINGS = true;
    public static final boolean DEFAULT_REGISTRATION_VERSION_STATUS = true;
    public static final String KEY_FIRST_BOOT = "KEY_FIRST_BOOT";
    public static final boolean DEFAULT_FIRST_BOOT_VALUE = true;

    public static final int CURRENCY_CONVERSION = 0;
    public static final int LENGTH_CONVERSION = 1;
    public static final int WEIGHT_CONVERSION = 2;
    public static final int TEMPERATURE_CONVERSION = 3;

    public static final String UNIT_SELECTION_TITLE = "UNIT_SELECTION_TITLE";
    public static final String UNIT_SELECTION_NATIVE_UNIT = "UNIT_SELECTION_NATIVE_UNIT";
    public static final String UNIT_SELECTION_TARGET_UNIT = "UNIT_SELECTION_TARGET_UNIT";
    public static final String UNIT_SELECTION_NATIVE_SYMBOL = "UNIT_SELECTION_NATIVE_SYMBOL";
    public static final String UNIT_SELECTION_TARGET_SYMBOL = "UNIT_SELECTION_TARGET_SYMBOL";
    public static final String UNIT_CALCULATION_METHOD = "UNIT_CALCULATION_METHOD";

    //Currency conversion related constants
    public static final String CURRENCY_RATE_URL = "https://exchange-rates-st.s3-ap-northeast-1.amazonaws.com/rates/";

    public static final String CURRENCY_RATE_TIMESTAMP = "timestamp";
    public static final String CURRENCY_RATE_BASE = "base";
    public static final String CURRENCY_RATE_DATE = "date";
    public static final String CURRENCY_RATES = "rates";

    // unit list selection constants
    public static final String UNIT_SELECTION_LAST = "UNIT_SELECTION_LAST";

    public static final String GUIDE_LINE_TEXT = "key_guide_line_text";

    // Currency conversion rate related constants
    public static final String POCKETALKS_FOLDER_DIR_IN_SD = "/POCKETALKS/";
    public static final String JSON_FILE_PATH = Environment.getExternalStorageDirectory() + POCKETALKS_FOLDER_DIR_IN_SD ;
    public static final String RATE_JSON_FILE_NAME = "rates.json";
    public static final int RATE_UPDATE_INTERVAL =  24 * 60 * 60 * 1000;
    public static final int DECIMAL_NUMBER_FORMAT_TWO_DIGIT = 2;
    //valid number check regex
    public static final String NUMBER_VALIDITY_REGEX = "^([0-9]*|\\d*\\.\\d{1}?\\d*)$";
    public static final String NUMBER_VALIDITY_REGEX_TEMPERATURE = "^-?([0-9]*|\\d*\\.\\d{1}?\\d*)$";

    public static final String REQUEST_RATE_UPDATE_LAST = "request_rate_update_last";
    public static final String _RATE_UPDATE_TIMESTAMP = "rate_update_timestamp";
    public static final String FRAG_VIEW_KEY = "FRAG_VIEW_KEY";

    public static String NATIVE_CODE = "NATIVE_CODE";
    public static String TARGET_CODE = "TARGET_CODE";
    public static String NATIVE_TEXT = "NATIVE_TEXT";
    public static String TARGET_TEXT = "TARGET_TEXT";
    public static String FILE_NAME = "FILE_NAME";

    public static final int WIFI_SCREEN_CODE = 1005;
    public static final int APN_SETTINGS_SCREEN_CODE = 1003;
    public static final int APN_EDITOR_SCREEN_CODE = 1002;

}