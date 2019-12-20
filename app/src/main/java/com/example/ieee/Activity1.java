package com.example.ieee;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.VideoView;

import static android.util.Log.d;

public class Activity1 extends AppCompatActivity {

    private static final String LOG_TAG = null;
    private VideoView videoBG;

    MediaPlayer mMediaPlayer;
    int mCurrentVideoPosition;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // hide the action bar
        getSupportActionBar().hide();

        setContentView(R.layout.activity1_full);


        videoBG = (VideoView) findViewById(R.id.videoView);


        // video Uri
        Uri uri = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.ieeevideo);

        videoBG.setVideoURI(uri);
        videoBG.start();

        videoBG.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mediaPlayer) {

                mMediaPlayer = mediaPlayer;

                mMediaPlayer.setLooping(true);

                if (mCurrentVideoPosition != 0) {
                    mMediaPlayer.seekTo(mCurrentVideoPosition);
                    mMediaPlayer.start();
                }
            }
        });
    }

    @Override
    protected void onPause() {
        super.onPause();

        mCurrentVideoPosition = mMediaPlayer.getCurrentPosition();
        videoBG.pause();
    }

    @Override
    protected void onResume() {
        super.onResume();

        videoBG.start();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mMediaPlayer.release();
        mMediaPlayer = null;
    }



    public void nextSwappage(View view) {
        d(LOG_TAG, "Button clicked!");

        Intent intent = new Intent(this,IntroActivity.class);
        startActivity(intent);
    }
}

