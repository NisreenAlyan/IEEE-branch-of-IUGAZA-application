package com.example.ieee;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.ieee.PhotoGallery_actvitty.itemgallery;
import com.example.ieee.items.item0;
import com.example.ieee.items.item1;
import com.example.ieee.items.item2;
import com.example.ieee.items.item3;
import com.example.ieee.items.item4;


public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

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



    public void tostaff(View view) {
        Toast toast = Toast.makeText(this, " Staff Page", Toast.LENGTH_SHORT);
        Intent intent = new Intent(this, item4.class);

        toast.show();
        startActivity(intent);
    }



    public void tocommittes(View view) {
        Toast toast = Toast.makeText(this, " Committees Page", Toast.LENGTH_SHORT);
        Intent intent = new Intent(this, item3.class);

        toast.show();
        startActivity(intent);
    }




    public void tosection(View view) {
        Toast toast = Toast.makeText(this,  "  Section Page", Toast.LENGTH_SHORT);
        Intent intent = new Intent(this, item2.class);

        toast.show();
        startActivity(intent);
    }




    public void toheadbranch(View view) {
        Toast toast = Toast.makeText(this, " Head of the branch Page", Toast.LENGTH_SHORT);
        Intent intent = new Intent(this, item1.class);

        toast.show();
        startActivity(intent);
    }



    public void toBranchSupervisor(View view) {
        Toast toast = Toast.makeText(this, "Branch Supervisor Page", Toast.LENGTH_SHORT);
        Intent intent = new Intent(this, item0.class);

        toast.show();
        startActivity(intent);

    }

    public void toPhotoGallery(View view) {
        Toast toast = Toast.makeText(this, "Photo Gallery Page", Toast.LENGTH_SHORT);
        Intent intent = new Intent(this, itemgallery.class);

        toast.show();
        startActivity(intent);
    }
}