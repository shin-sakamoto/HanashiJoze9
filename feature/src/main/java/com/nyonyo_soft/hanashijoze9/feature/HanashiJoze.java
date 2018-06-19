package com.nyonyo_soft.hanashijoze9.feature;

import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.media.MediaPlayer;
import android.view.GestureDetector;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by walku on 2018/02/17.
 */

public interface HanashiJoze {

     int MAX_MEDIA_PLAYER_INSTANCES = 5;
     final static String DELIMETER = "?";

    int mediaPlayerCounter_origin = 0;

     String[] filepathPlaying=null;

     boolean FLAG_AUTO_REPEAT = false;
     boolean FLAG_AUTO_CONTINUE = false;


    String filepathImage_original=null;
    Point point=null;

     MenuItem menuActionSetting = null;
     Canvas canvas = null;
     Paint paint = null;
     Bitmap bitmap_original = null;
     SharedPreferences pref = null;
     GestureDetector gestureDetector = null;
//     GestureDetector.SimpleOnGestureListener onGestureListener = new GestureListener();

     int positionNearestX=0, positionSelectedX=0;
     int positionNearestY=0, positionSelectedY=0;
     float imageSizeXFactor=0f, imageSizeYFactor=0f;

     HashMap<String, String> fileHashMap = new HashMap<String, String>();
     ArrayList<Integer> positionListX = new ArrayList<Integer>();
     ArrayList<Integer> positionListY = new ArrayList<Integer>();


     final static String KEY_INITIAL = "key_initial";
     final static String KEY_REPEAT = "key_repeat";
     final static String KEY_CONTINUE = "key_autoContinue";

     final static String FILENAME_IMAGE = "imgFilename";
     final static String POSITION_SELECTED = "positionSelected";
     final static String FILENAME_SELECTED = "filenameSelected";
     final static String POSITION_NEAREST = "positionNearest";
     final static String FILENAME_NEAREST = "filenameNearest";
     final static String POSITION_LIST_X = "positionListX";
     final static String POSITION_LIST_Y = "positionListY";
     final static String FILENAME_LIST = "filenameList";
     final static String LOAD_CONFIG = "loadConfiguration";
     final static String SAVE_CONFIG = "saveConfiguration";

     final static int MY_PERMISSION_REQUEST_CODE = 12345;

     final static float BITMAP_SIZE = 0.6f;
     final static int CIRCLE_DIAMETER = 30 ;


}
