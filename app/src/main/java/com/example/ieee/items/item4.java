package com.example.ieee.items;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.ieee.MainActivity;
import com.example.ieee.R;

public class item4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // hide the action bar
        getSupportActionBar().hide();

        setContentView(R.layout.activity_item4);
    }
    public void Administrationlist(View view) {
        Toast toast = Toast.makeText(this, " Back to Administration list ", Toast.LENGTH_SHORT);
        Intent intent = new Intent(this, MainActivity.class);

        toast.show();
        startActivity(intent);
    }

    public void dr_hateempage(View view) {
        Toast toast = Toast.makeText(this, " Branch Supervisor page  ", Toast.LENGTH_SHORT);
        Intent intent = new Intent(this, item0.class);

        toast.show();
        startActivity(intent);

    }

    public void eng_jaserpage(View view) {
        Toast toast = Toast.makeText(this, " Head of the branch page ", Toast.LENGTH_SHORT);
        Intent intent = new Intent(this, item1.class);

        toast.show();
        startActivity(intent);

    }

    public void Staff(View view) {
        Toast toast = Toast.makeText(this, " Staff page ", Toast.LENGTH_SHORT);
        Intent intent = new Intent(this,item4.class);

        toast.show();
        startActivity(intent);
    }
}
