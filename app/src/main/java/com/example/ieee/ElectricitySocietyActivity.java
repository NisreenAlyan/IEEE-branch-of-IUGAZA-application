package com.example.ieee;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.ieee.items.item2;

public class ElectricitySocietyActivity extends AppCompatActivity {
    Dialog myDialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // hide the action bar
        getSupportActionBar().hide();
        setContentView(R.layout.activity_electricity_society);
        myDialog = new Dialog(this);


    }
    public void ShowPopup(View v) {
        TextView txtclose;
        Button btnFollow;
        myDialog.setContentView(R.layout.electricscreen);
        txtclose =(TextView) myDialog.findViewById(R.id.txtclose);
        txtclose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myDialog.dismiss();
            }
        });
        myDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        myDialog.show();
    }


    public void Administrationlist(View view) {
        Toast toast = Toast.makeText(this, " Back to Administration list ", Toast.LENGTH_SHORT);
        Intent intent = new Intent(this,MainActivity.class);

        toast.show();
        startActivity(intent);
    }

    public void Departments(View view) {
        Toast toast = Toast.makeText(this, "  Departments page ", Toast.LENGTH_SHORT);
        Intent intent = new Intent(this, item2.class);

        toast.show();
        startActivity(intent);
    }


    public void initiatives1(View view) {
        Uri webpage = Uri.parse("http://smartcities.ieee.org/");
        Intent intent = new Intent(Intent.ACTION_VIEW, webpage);

        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        } else {
            Log.d("ImplicitIntents", "Can't handle this intent!");
        }
    }

    public void initiatives2(View view) {
        Uri webpage = Uri.parse("http://smartgrid.ieee.org");
        Intent intent = new Intent(Intent.ACTION_VIEW, webpage);

        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        } else {
            Log.d("ImplicitIntents", "Can't handle this intent!");
        }
    }

    public void initiatives3(View view) {
        Uri webpage = Uri.parse("http://ieee-smart-village.org");
        Intent intent = new Intent(Intent.ACTION_VIEW, webpage);

        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        } else {
            Log.d("ImplicitIntents", "Can't handle this intent!");
        }
    }

    public void initiatives4(View view) {
        Toast toast = Toast.makeText(this, "It is an initiative that works through a team \n "+"of men and women that helps in the development of women \n" +
                "For its potential and skills \n " +"in the electric power industries.!", Toast.LENGTH_SHORT);
        toast.show();
        }

}
