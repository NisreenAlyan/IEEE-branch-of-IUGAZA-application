package com.example.ieee;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class contactActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // hide the action bar
        getSupportActionBar().hide();
        setContentView(R.layout.activity_contact);

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

//    public void gmailpage(View view) {
//        Uri gmail = Uri.parse("https://ieee@iugaza.edu.ps");
//        Intent intent = new Intent(Intent.ACTION_VIEW, gmail);
//
//        if (intent.resolveActivity(getPackageManager()) != null) {
//            startActivity(intent);
//        } else {
//            Log.d("ImplicitIntents", "Can't handle this intent!");
//        }
//    }

    public void openphone(View view) {
        Uri phoneNum = Uri.parse("tel: 009720597105184");
        Intent intent = new Intent(Intent.ACTION_DIAL, phoneNum);
        startActivity(intent);

    }

    public void facebookpage(View view) {
        Uri webpage = Uri.parse("https://www.facebook.com/IEEE.IUG/");
        Intent intent = new Intent(Intent.ACTION_VIEW, webpage);

        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        } else {
            Log.d("ImplicitIntents", "Can't handle this intent!");
        }
    }

        public void instgrampage (View view){
            Uri webpage = Uri.parse("https://www.instagram.com/ieee.iug/");
            Intent intent = new Intent(Intent.ACTION_VIEW, webpage);

            if (intent.resolveActivity(getPackageManager()) != null) {
                startActivity(intent);
            } else {
                Log.d("ImplicitIntents", "Can't handle this intent!");
            }
        }

    public void openMap(View view) {

            Uri addressUri = Uri.parse("geo:0,0?q= islamic university gaza");
            Intent intent = new Intent(Intent.ACTION_VIEW, addressUri);

            if (intent.resolveActivity(getPackageManager()) != null) {
                startActivity(intent);
            } else {
                Log.d("ImplicitIntents", "Can't handle this intent!");
            }

        }
    }



