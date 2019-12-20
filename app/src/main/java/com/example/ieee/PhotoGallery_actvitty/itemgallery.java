package com.example.ieee.PhotoGallery_actvitty;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

import com.example.ieee.R;

import java.util.ArrayList;
import java.util.List;

public class itemgallery extends AppCompatActivity {

        private RecyclerView staggeredRv;
        private StaggeredRecyclerAdapter adapter ;
        private StaggeredGridLayoutManager manager;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            requestWindowFeature(Window.FEATURE_NO_TITLE);
            getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

            setContentView(R.layout.activity_itemgallery);

            // let's make the activity on full screen for better ui

            getSupportActionBar().hide();

            staggeredRv = findViewById(R.id.staggered_rv);
            manager = new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL);
            staggeredRv.setLayoutManager(manager);
            // lets create a simple array list of images
            List<row> lst = new ArrayList<>();
            lst.add(new row(R.drawable.android_course_ads));
            lst.add(new row(R.drawable.activity_ieee));
            lst.add(new row(R.drawable.activityieee));
            lst.add(new row(R.drawable.madc_jion));
            lst.add(new row(R.drawable.activity0));
            lst.add(new row(R.drawable.activity1));
            lst.add(new row(R.drawable.activity2));
            lst.add(new row(R.drawable.ieeeextrem));
            lst.add(new row(R.drawable.ieeeextrem_step));
            lst.add(new row(R.drawable.ieeemadc_deadline));
            lst.add(new row(R.drawable.madc_jion));
            lst.add(new row(R.drawable.madc_step));
            lst.add(new row(R.drawable.picture4));
            lst.add(new row(R.drawable.picture3));
            lst.add(new row(R.drawable.ieee_activi));
            lst.add(new row(R.drawable.ieee_activity));
            lst.add(new row(R.drawable.activity3));
            lst.add(new row(R.drawable.activity6));
            lst.add(new row(R.drawable.activity7));
            lst.add(new row(R.drawable.ieee_extrem));
            lst.add(new row(R.drawable.ieee_extrem1));
            lst.add(new row(R.drawable.ieee_extrem2));
            lst.add(new row(R.drawable.activity8));
            lst.add(new row(R.drawable.activity_ieee));
            lst.add(new row(R.drawable.ieee_activityy));
            lst.add(new row(R.drawable.android_course_ads));
            lst.add(new row(R.drawable.madc_step));
            lst.add(new row(R.drawable.ieee));
            lst.add(new row(R.drawable.ieee_activi));
            lst.add(new row(R.drawable.ieee_activity));
            lst.add(new row(R.drawable.ieee_extrem));
            lst.add(new row(R.drawable.ieee_extrem1));
            lst.add(new row(R.drawable.ieee_extrem2));
            lst.add(new row(R.drawable.ieee_extrem6));
            lst.add(new row(R.drawable.ieee_hayamadc));
            lst.add(new row(R.drawable.ieeemadc));
            lst.add(new row(R.drawable.ieee_madc));
            lst.add(new row(R.drawable.ieee_madc_extend));
            lst.add(new row(R.drawable.ieee_madc_step));
            lst.add(new row(R.drawable.ieee_madc_stepsjoin));
            lst.add(new row(R.drawable.ieeemadc_ucac));
            lst.add(new row(R.drawable.ieee_micromouse));
            lst.add(new row(R.drawable.ieee_volt));
            lst.add(new row(R.drawable.ieeeextrem));
            lst.add(new row(R.drawable.ieeeextrem_step));
            lst.add(new row(R.drawable.ieeemadc_deadline));
            lst.add(new row(R.drawable.madc_jion));
            lst.add(new row(R.drawable.madc_step));
            lst.add(new row(R.drawable.picture4));
            lst.add(new row(R.drawable.picture3));
            lst.add(new row(R.drawable.ieee_activi));
            lst.add(new row(R.drawable.ieee_activity));
            lst.add(new row(R.drawable.ieee_extrem));
            lst.add(new row(R.drawable.ieee_extrem1));
            lst.add(new row(R.drawable.ieee_extrem2));
            lst.add(new row(R.drawable.madc_jion));
            lst.add(new row(R.drawable.madc_step));
            lst.add(new row(R.drawable.picture4));
            lst.add(new row(R.drawable.picture3));
            lst.add(new row(R.drawable.ieee_activi));
            lst.add(new row(R.drawable.ieee_activity));
            lst.add(new row(R.drawable.ieee_extrem6));
            lst.add(new row(R.drawable.ieee_hayamadc));

            adapter = new StaggeredRecyclerAdapter(this,lst);
            staggeredRv.setAdapter(adapter);



        }
    }


