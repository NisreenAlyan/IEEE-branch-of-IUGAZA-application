package com.example.ieee.items;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.example.ieee.MainActivity;
import com.example.ieee.R;

public class item1 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // hide the action bar
        getSupportActionBar().hide();

        setContentView(R.layout.activity_item1);
    }
    public void Administrationlist(View view) {
        Toast toast = Toast.makeText(this, " Back to Administration list ", Toast.LENGTH_SHORT);
        Intent intent = new Intent(this, MainActivity.class);

        toast.show();
        startActivity(intent);
    }

    public void Headofthebranch(View view) {
        Toast toast = Toast.makeText(this, " Head of the branch page ", Toast.LENGTH_SHORT);
        Intent intent = new Intent(this,item1.class);

        toast.show();
        startActivity(intent);
    }

    public void gmailpage(View view) {
        Uri gmail = Uri.parse("jaser.y.z@ieee.org");
        Intent intent = new Intent(Intent.ACTION_VIEW, gmail);

        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        } else {
            Log.d("ImplicitIntents", "Can't handle this intent!");
        }
    }

    public void openphone(View view) {
        Uri phoneNum = Uri.parse("tel:0597105184");
        Intent intent = new Intent(Intent.ACTION_DIAL, phoneNum);
         startActivity(intent);

    }
}

