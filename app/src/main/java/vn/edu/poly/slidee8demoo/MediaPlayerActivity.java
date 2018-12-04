package vn.edu.poly.slidee8demoo;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.io.IOException;

public class MediaPlayerActivity extends AppCompatActivity {


    public String res = "http://data32.chiasenhac.com/downloads/1923/2/1922324-0c9b50ed/128/Ky%20Niem%20Nao%20Buon%20-%20Nhu%20Quynh_%20Manh%20Quynh%20[128kbps_MP3].mp3";


    public MediaPlayer mediaPlayer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_media_player);
        mediaPlayer = new MediaPlayer();
        try {
            mediaPlayer.setDataSource(res);
            mediaPlayer.prepare();
            mediaPlayer.start();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
