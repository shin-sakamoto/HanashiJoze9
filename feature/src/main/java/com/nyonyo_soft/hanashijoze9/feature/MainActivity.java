package com.nyonyo_soft.hanashijoze9.feature;

import android.content.pm.PackageManager;
import android.graphics.ColorSpace;
import android.os.Build;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewConfiguration;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ResourceBundle;

import static com.nyonyo_soft.hanashijoze9.feature.HanashiJoze.MY_PERMISSION_REQUEST_CODE;

public class MainActivity extends AppCompatActivity {

    private TextView textFilename=null, textFilenamePlaying = null;
    private ImageView imageView = null;

    private HanashiJozeModel hanashiJozeModel = new HanashiJozeModel();
    private MediaPlayerManager mediaPlayerManager = new MediaPlayerManager();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // ストレージの読み込み権限を確認する
        if (Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.M) {
            if (checkSelfPermission(android.Manifest.permission.READ_EXTERNAL_STORAGE) != PackageManager.PERMISSION_GRANTED) {
                requestPermissions(new String[]{android.Manifest.permission.READ_EXTERNAL_STORAGE}, MY_PERMISSION_REQUEST_CODE);
            }
        }

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        // 画面インスタンス作成
        textFilename = (TextView) findViewById(R.id.textFilename);
        textFilenamePlaying = (TextView) findViewById(R.id.textFilenamePlaying);
        Button buttonStart = (Button) findViewById(R.id.buttonStart);
        Button buttonRepeat = (Button) findViewById(R.id.buttonRepeat);
        Button buttonStop = (Button) findViewById(R.id.buttonStop);







    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
