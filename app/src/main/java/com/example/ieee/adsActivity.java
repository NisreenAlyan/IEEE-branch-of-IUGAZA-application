package com.example.ieee;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class adsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // hide the action bar
        getSupportActionBar().hide();
        setContentView(R.layout.activity_ads);
    }

    public void returnhomepage(View view) {
        Toast toast = Toast.makeText(this, "Return the Home Page", Toast.LENGTH_SHORT);
        Intent intent = new Intent(this, Activity1.class);

        toast.show();
        startActivity(intent);
    }


    public void exitapp(View view) {
        Toast toast = Toast.makeText(this, "Exit Application", Toast.LENGTH_SHORT);

        moveTaskToBack(true);
        android.os.Process.killProcess(android.os.Process.myPid());
        System.exit(1);
    }


    public void ads1(View view) {
        Uri webpage = Uri.parse("https://forms.gle/f4hiGEjRebqdegAe8");
        Intent intent = new Intent(Intent.ACTION_VIEW, webpage);

        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        } else {
            Log.d("ImplicitIntents", "Can't handle this intent!");
        }
    }

    public void ads2(View view) {
        Uri webpage = Uri.parse("https://forms.gle/nC28LHrGFdRtWxpTA");
        Intent intent = new Intent(Intent.ACTION_VIEW, webpage);

        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        } else {
            Log.d("ImplicitIntents", "Can't handle this intent!");

        }
    }
}
