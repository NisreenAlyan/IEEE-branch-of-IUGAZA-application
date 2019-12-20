package com.example.ieee.items;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.ieee.MainActivity;
import com.example.ieee.R;

public class item3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // hide the action bar
        getSupportActionBar().hide();

        setContentView(R.layout.activity_item3);
    }


    public void Administrationlist(View view) {
        Toast toast = Toast.makeText(this, " Back to Administration list ", Toast.LENGTH_SHORT);
        Intent intent = new Intent(this, MainActivity.class);

        toast.show();
        startActivity(intent);
    }

    public void Committees(View view) {
        Toast toast = Toast.makeText(this, "  Committees page ", Toast.LENGTH_SHORT);
        Intent intent = new Intent(this,item3.class);

        toast.show();
        startActivity(intent);
    }


}
