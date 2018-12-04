package vn.edu.poly.slidee8demoo;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.media.MediaPlayer;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import vn.edu.poly.slidee8demoo.demo.CamTestActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ActivityCompat.requestPermissions(MainActivity.this,
                new String[]{Manifest.permission.CAMERA},
                999);
    }


    public void onOpenCameraIntent(View view) {

        startNewActivity(CameraIntentActivity.class);

    }

    public void onOpenCamera1(View view) {


        if (ContextCompat.checkSelfPermission(MainActivity.this, Manifest.permission.CAMERA)
                != PackageManager.PERMISSION_GRANTED) {
            // Permission is not granted
            ActivityCompat.requestPermissions(MainActivity.this,
                    new String[]{Manifest.permission.CAMERA},
                    999);
        } else
            startNewActivity(CamTestActivity.class);

    }

    public void onOpenMedia(View view) {
        startNewActivity(MediaPlayerActivity.class);
    }

    public void startNewActivity(Class target) {
        Intent intent = new Intent(this, target);
        startActivity(intent);
    }
}
