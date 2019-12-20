package com.example.ieee.items;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.ieee.ComputerSocietyActivity;
import com.example.ieee.ElectricitySocietyActivity;
import com.example.ieee.MainActivity;
import com.example.ieee.R;

public class item2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // hide the action bar
        getSupportActionBar().hide();

        setContentView(R.layout.activity_item2);
    }


    public void Administrationlist(View view) {
        Toast toast = Toast.makeText(this, " Back to Administration list ", Toast.LENGTH_SHORT);
        Intent intent = new Intent(this, MainActivity.class);

        toast.show();
        startActivity(intent);
    }

    public void Departments(View view) {
        Toast toast = Toast.makeText(this, "  Departments page ", Toast.LENGTH_SHORT);
        Intent intent = new Intent(this,item2.class);

        toast.show();
        startActivity(intent);
    }


    public void goToElectricSection(View view) {
        Toast toast = Toast.makeText(this, " Electricity and Energy Society page ", Toast.LENGTH_SHORT);
        Intent intent = new Intent(this, ElectricitySocietyActivity.class);

        toast.show();
        startActivity(intent);

    }

    public void goToComputerSection(View view) {
        Toast toast = Toast.makeText(this, "Computer Society ", Toast.LENGTH_SHORT);
        Intent intent = new Intent(this, ComputerSocietyActivity.class);

        toast.show();
        startActivity(intent);
    }
}
