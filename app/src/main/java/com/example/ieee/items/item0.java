package com.example.ieee.items;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.example.ieee.MainActivity;
import com.example.ieee.R;

import java.util.ArrayList;
import java.util.List;

public class item0 extends AppCompatActivity {

    FragmentManager fragmentManager;
    FragmentTransaction fragmentTransaction ;
    RecyclerView recyclerView ;
    List<item> mData;
    MenuAdapter adapter;

    // fragment codes
    public static final int DASHBOARD_CODE = 0 ;
    public static final int SCHOOL_CODE = 1 ;
    public static final int WIFI_CODE = 2 ;
    public static final int SETTINGS_CODE = 3 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // hide the action bar
        getSupportActionBar().hide();

        setContentView(R.layout.activity_item0);

        recyclerView = findViewById(R.id.rv_menu);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        mData = new ArrayList<>();
        mData.add(new item(R.drawable.ic_dashboard_black_24dp,DASHBOARD_CODE,"Dashboard Fragment"));
        mData.add(new item(R.drawable.ic_school_black_24dp,SCHOOL_CODE,"Dashboard Fragment"));
        mData.add(new item(R.drawable.ic_wifi_black_24dp,WIFI_CODE,"Dashboard Fragment"));
        mData.add(new item(R.drawable.ic_settings_black_24dp,SETTINGS_CODE,"Dashboard Fragment"));
        mData.add(new item(R.drawable.ic_dashboard_black_24dp,DASHBOARD_CODE,"Dashboard Fragment"));
        mData.add(new item(R.drawable.ic_dashboard_black_24dp,DASHBOARD_CODE,"Dashboard Fragment"));
        mData.add(new item(R.drawable.ic_school_black_24dp,SCHOOL_CODE,"Dashboard Fragment"));
        mData.add(new item(R.drawable.ic_wifi_black_24dp,WIFI_CODE,"Dashboard Fragment"));
        mData.add(new item(R.drawable.ic_settings_black_24dp,SETTINGS_CODE,"Dashboard Fragment"));
        mData.add(new item(R.drawable.ic_dashboard_black_24dp,DASHBOARD_CODE,"Dashboard Fragment"));
        mData.add(new item(R.drawable.ic_dashboard_black_24dp,DASHBOARD_CODE,"Dashboard Fragment"));
        mData.add(new item(R.drawable.ic_school_black_24dp,SCHOOL_CODE,"Dashboard Fragment"));
        mData.add(new item(R.drawable.ic_wifi_black_24dp,WIFI_CODE,"Dashboard Fragment"));
        mData.add(new item(R.drawable.ic_settings_black_24dp,SETTINGS_CODE,"Dashboard Fragment"));
        mData.add(new item(R.drawable.ic_dashboard_black_24dp,DASHBOARD_CODE,"Dashboard Fragment"));
        adapter = new MenuAdapter(this,mData);
        recyclerView.setAdapter(adapter);



        fragmentManager = getSupportFragmentManager();
        fragmentTransaction = fragmentManager.beginTransaction();

        // Dashboard instantiate
        DashboardFrag dashboardFrag = new DashboardFrag();

        fragmentTransaction.replace(R.id.container,dashboardFrag);
        fragmentTransaction.commit();


    }


    public void Administrationlist(View view) {
        Toast toast = Toast.makeText(this, " Back to Administration list ", Toast.LENGTH_SHORT);
        Intent intent = new Intent(this, MainActivity.class);

        toast.show();
        startActivity(intent);
    }

    public void BranchSupervisor(View view) {
        Toast toast = Toast.makeText(this, "  BranchSupervisor page ", Toast.LENGTH_SHORT);
        Intent intent = new Intent(this,item0.class);

        toast.show();
        startActivity(intent);
    }

    public void googlepage(View view) {
        Uri webpage = Uri.parse("helaydi@iugaza.edu.ps");
        Intent intent = new Intent(Intent.ACTION_VIEW, webpage);

        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        } else {
            Log.d("ImplicitIntents", "Can't handle this intent!");
        }
    }

    public void websitepage(View view) {
        Uri webpage = Uri.parse("http://site.iugaza.edu.ps/helaydi");
        Intent intent = new Intent(Intent.ACTION_VIEW, webpage);

        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        } else {
            Log.d("ImplicitIntents", "Can't handle this intent!");
        }
    }

    public void gmailpage(View view) {
        Uri webpage = Uri.parse("helaydi@iugaza.edu.ps");
        Intent intent = new Intent(Intent.ACTION_VIEW, webpage);

        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        } else {
            Log.d("ImplicitIntents", "Can't handle this intent!");
        }
    }

    public void openphone(View view) {
        Uri phoneNum = Uri.parse("tel:972 8 264 4400 ");

        Intent intent = new Intent(Intent.ACTION_DIAL, phoneNum);
        startActivity(intent);

    }

    public void fax(View view) {
        Uri faxNum = Uri.parse("fax:+972 8 264 4800 ");

        Intent intent = new Intent(Intent.ACTION_DIAL, faxNum);
        startActivity(intent);
    }
}

