package com.example.ieee;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;

public class IntroActivity extends AppCompatActivity {

    private ViewPager screenPager;
    IntroViewPagerAdapter introViewPagerAdapter;
    private Object ScreenItem;
    TabLayout tabIndicator;
    Button btnNext;
    int position = 0;
    Button btnGetAdminis;
    Button  btnGetAds ;
    Button btncontact;
    Button btnExit;
    Button  btnHomePage;
    Animation btnAnim;
    TextView tvSkip;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // make the activity on full screen
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        //  when this activity is about to be launch we need to check if its openened before or not

//        if (restorePrefData()) {
//
//            Intent mainActivity = new Intent(getApplicationContext(),MainActivity.class );
//            startActivity(mainActivity);
//            finish();
//        }

        // hide the action bar
       getSupportActionBar().hide();

        setContentView(R.layout.activity_intro);

        // ini views
        btnNext = findViewById(R.id.btn_next);
        btnGetAdminis = findViewById(R.id.btn_get_Administration);
        btnGetAds = findViewById(R.id.btn_get_Advertisement);
        tabIndicator = findViewById(R.id.tab_indicator);
        btnAnim = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.button_animation);
        btnExit = findViewById(R.id.btn_exit);
        btnHomePage =findViewById(R.id.btn_homepage);
        tvSkip = findViewById(R.id.tv_skip);
        btncontact=findViewById(R.id.contact);


        // fill list screen
        final List<ScreenItem> mList = new ArrayList<>();

        mList.add(new ScreenItem(" The Main Page ","Learn about IEEE IUG BRANCH","Student Branch of the Institute of Electrical and computer Engineers  Instate of electrical and electronics Engineering Acronym for _ IEEE .\n " + "It is an association dedicated to promoting innovation and excellence Designed to serve engineers and engineers in all aspects and fields of electrical engineering and computer engineering" +
                "And electronics technology.Composed of several communities, each community is specialized in a particular area" +
                "Such as the electricity community, the computer community, the women's society in engineering and other communities" +
                "The Society has headquarters in New York In Palestine it was the first branch going on at the university In 1998.. ",R.drawable.ieeimage));


        mList.add(new ScreenItem("Vision of the Center" , "Vision" ,"The branch was established in order to develop and improve the educational process and keep pace with technological development and progress in order to develop the practical aspect of students and contribute to its development, and contribute to alleviate the financial burden on students and provide them with tools and equipment at the lowest possible cost. This vision is represented through the activities of the branch throughout the year, where more than 15 events are held during the academic year (during the two semesters), some of which are in theoretical side such as scientific lectures and study days and some in the practical side such as courses and practical lectures in addition to workshops that This is in addition to the reduction campaigns on printing and photocopying of books and scientific materials and the provision of electronic parts at the lowest possible cost.." ,R.drawable.vision3));
        
        mList.add(new ScreenItem(" The Activities", " Activities" ,"The activities of the association are different and include all fields and theoretical and practical aspects and all hurt" +
                "To serve the community and students and develop the skill and experience and develop the practical side of students" +
                "Activities range from study days, scientific conferences, exhibitions to engineering projects, and competitions in" +
                "Both theoretical and practical aspects, in addition to the annual courses held in the winter holiday period" +
                "And summer, which entrench the practical side of students.." ,R.drawable.illustration0));





        // setup viewpager

        screenPager = findViewById(R.id.screen_viewpager);
        introViewPagerAdapter = new IntroViewPagerAdapter(IntroActivity.this, mList);
        screenPager.setAdapter(introViewPagerAdapter);

        // setup tablayout with viewpager

        tabIndicator.setupWithViewPager(screenPager);

        // next button click Listner

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                position = screenPager.getCurrentItem();
                if (position < mList.size()) {

                    position++;
                    screenPager.setCurrentItem(position);
                }
                if (position == mList.size() - 1) {     // when we rech to the last screen
                    // TODO : show the GETSTARTED Button and hide the indicator and the next button
                    loaddLastScreen();
                }
            }
        });

        // tablayout add change listener
        tabIndicator.addOnTabSelectedListener(new TabLayout.BaseOnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {

                if (tab.getPosition() == mList.size() - 1) {

                    loaddLastScreen();
                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {
            }
        });


        // Get Started button click listener
        btnGetAdminis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //open main activity
                Intent mainActivity = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(mainActivity);

                finish();
            }
        });


        // Get Advertisement button click listener
        btnGetAds.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //open ads activity
                Intent mainActivity = new Intent(getApplicationContext(), adsActivity.class);
                startActivity(mainActivity);

                finish();
            }
        });

        // Get contact button click listener
        btncontact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //open ads activity
                Intent mainActivity = new Intent(getApplicationContext(), contactActivity.class);
                startActivity(mainActivity);

                finish();
            }
        });

        // skip click listener
        tvSkip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                screenPager.setCurrentItem(mList.size());
            }
        });
    }


    // show the GETSTARTED Button and hide the indicator and the next button
    private void loaddLastScreen() {
        btnNext.setVisibility(View.INVISIBLE);
        btnGetAdminis.setVisibility(View.VISIBLE);
        btnGetAds.setVisibility(View.VISIBLE);
        tvSkip.setVisibility(View.INVISIBLE);
        btncontact.setVisibility(View.VISIBLE);

        tabIndicator.setVisibility(View.VISIBLE);
        // TODO : ADD an animation the getstarted button
                          // setup animation
        btnGetAdminis.setAnimation(btnAnim);
         btnGetAds.setAnimation(btnAnim);
        btncontact .setAnimation(btnAnim);
    }
}