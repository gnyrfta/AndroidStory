package com.gnyrfta.androidstorytwelve;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.graphics.Typeface;
import android.media.Image;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Display;
import android.view.MotionEvent;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    ImageButton b;
    Intent intent;
    static int pageNumber=0;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        System.gc();
        Display display = getWindowManager().getDefaultDisplay();
        Typeface tf = Typeface.createFromAsset(getAssets(), "fonts/planetbe.ttf");
        int width = display.getWidth();
        int height = display.getHeight();

      //  Toolbar myToolbar = (Toolbar) findViewById(R.id.my_toolbar);
      //  setSupportActionBar(myToolbar);

        //ImageView home = (ImageView)findViewById(R.id.background_image);
        //home.requestLayout();
        //home.getLayoutParams().height=height;
        //home.getLayoutParams().width=width;
       // ImageView cow = (ImageView)findViewById(R.id.cow);
       // cow.getLayoutParams();

        tv = (TextView)findViewById(R.id.title_text);
        tv.setTypeface(tf);
        tv.setTextSize(36);

        double heightD= 0.59*width;
        int heightSF = (int)heightD;
        double widthD = width/2;
        int widthSF = (int)widthD;

        ImageButton sf = (ImageButton)findViewById(R.id.swedish_flag);
        sf.requestLayout();
        sf.getLayoutParams().width=widthSF;
        sf.getLayoutParams().height=heightSF;
        sf.setOnTouchListener(new View.OnTouchListener() {
            public boolean onTouch(View v, MotionEvent event)
            {
                int action = event.getAction();
                switch(action)
                {
                    case MotionEvent.ACTION_DOWN:
                        Locale locale = new Locale("sv");
                        Locale.setDefault(locale);
                        Configuration config = new Configuration();
                        config.locale = locale;
                        getApplicationContext().getResources().updateConfiguration(config, null);
                        tv.setText("Sprickan i Himlen");
                        //	octopus.setImageResource(R.drawable.octopus_giving_us_options_swedish);

                }
                return true;
            }
        });
        //sf.setY(height/3);

        ImageButton bf = (ImageButton)findViewById(R.id.brittish_flag);
        bf.requestLayout();
        bf.getLayoutParams().width=widthSF;
        bf.getLayoutParams().height=heightSF;
        bf.setOnTouchListener(new View.OnTouchListener() {
            public boolean onTouch(View v, MotionEvent event)
            {
                int action = event.getAction();
                switch(action)
                {
                    case MotionEvent.ACTION_DOWN:
                        Locale locale = new Locale("en");
                        Locale.setDefault(locale);
                        Configuration config = new Configuration();
                        config.locale = locale;
                        tv.setText("The Crack in the Sky");
                        getApplicationContext().getResources().updateConfiguration(config, null);
                        //	octopus.setImageResource(R.drawable.octopus_giving_us_options_english);
                        //	Intent intent = getIntent();
                        //	finish();
                        //	startActi@Overridevity(intent);
                }
                return true;
            }
        });

        ImageButton lb = (ImageButton)findViewById(R.id.launch_button);
        lb.requestLayout();
        lb.getLayoutParams().width=width;
       // lb.setY(2*height/3);
        intent = new Intent(this, StoryShower.class);
        intent.putExtra("pageNumber", 1);
        //startActivity(intent);

        /*b = (ImageButton)findViewById(R.id.launch);
        b.requestLayout();
        float bookposition=4*height/7;
        b.setX(3 * width / 7);
        b.setY(bookposition);*/

        lb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                startActivity(intent);
            }
        });

       /* PreferenceManager.setDefaultValues(this, R.xml.preferences, false);
        SharedPreferences.OnSharedPreferenceChangeListener listener =
                new SharedPreferences.OnSharedPreferenceChangeListener() {
                    public void onSharedPreferenceChanged(SharedPreferences prefs, String key) {
                        // listener implementation
                    }
                };

      /*  Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });*/
    }

   @Override
   protected void onResume()
   {
       super.onResume();
       System.gc();
   }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        //getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
      /*  switch(item.getItemId())
        {
            case R.id.action_settings:
                invokeSettings();
                return true;
        }*/
        return true;
        }



        private void invokeSettings() {
            Intent settingsIntent = new Intent(this, SettingsActivity.class);
            startActivity(settingsIntent);
        }
}

