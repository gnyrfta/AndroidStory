package com.gnyrfta.androidstorytwelve;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.util.Log;
import android.view.Display;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by david on 2016-04-17.
 */
public class StoryShower extends Activity {
    String firstText;
    String secondText;
    TextView textOne;
    TextView textTwo;
    ImageView image;
    AnimationDrawable animation;
    ImageButton forward;
    ImageButton backward;
    Intent i;
    int pageNumber;
    final SoundPoolHelper mSoundPoolHelper = new SoundPoolHelper(2,this);

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_story_shower);
        //making absolutely sure garbage collection happens:
        System.gc();
        //This is good to have:
        Display display = getWindowManager().getDefaultDisplay();
        int width = display.getWidth();
        int height = display.getHeight();

        pageNumber = getIntent().getExtras().getInt("pageNumber");
        i=new Intent(this,StoryShower.class);
        Typeface tf = Typeface.createFromAsset(getAssets(), "fonts/planetbe.ttf");
        firstText=getFirstText(pageNumber-1);
        textOne = ((TextView)findViewById(R.id.title_text));
        textOne.setText(firstText);
        textOne.setTypeface(tf);
        //set text color to pink:
        //textOne.setTextColor(Color.rgb(255,0,246));

        final int soundId;


        image=(ImageView)findViewById(R.id.image_page_one);
        if(pageNumber==1) {
            image.setBackgroundResource(R.drawable.animation1);
            soundId = mSoundPoolHelper.load(this,R.raw.page1,2);


        }
        else if(pageNumber==2)
        {
            image.setBackgroundResource(R.drawable.animation2);
            soundId = mSoundPoolHelper.load(this,R.raw.page2,2);

        }
        else if(pageNumber==3)
        {
            image.setBackgroundResource(R.drawable.animation3);
            soundId = mSoundPoolHelper.load(this,R.raw.page3,2);

        }
        else if(pageNumber==4)
        {
            image.setBackgroundResource(R.drawable.animation4);
            soundId = mSoundPoolHelper.load(this,R.raw.page4,2);

        }
        else if(pageNumber==5)
        {
            image.setBackgroundResource(R.drawable.animation5);
            soundId = mSoundPoolHelper.load(this,R.raw.page5,2);

        }
        else if(pageNumber==6)
        {
            image.setBackgroundResource(R.drawable.animation6);
            soundId = mSoundPoolHelper.load(this,R.raw.page6,2);
        }
        else if(pageNumber==7)
        {
            image.setBackgroundResource(R.drawable.animation7);
            soundId = mSoundPoolHelper.load(this,R.raw.page7,2);
        }
        else if(pageNumber==8)
        {
            image.setBackgroundResource(R.drawable.animation8);
            soundId = mSoundPoolHelper.load(this,R.raw.page8,2);
        }
        else if(pageNumber==9)
        {
            image.setBackgroundResource(R.drawable.animation9);
            soundId = mSoundPoolHelper.load(this,R.raw.page9,2);
        }
        else if(pageNumber==10)
        {
            image.setBackgroundResource(R.drawable.animation10);
            soundId = mSoundPoolHelper.load(this,R.raw.page10,2);
        }
        else if(pageNumber==11)
        {
            image.setBackgroundResource(R.drawable.animation11);
            soundId = mSoundPoolHelper.load(this,R.raw.page11,2);
        }
        else if(pageNumber==12)
        {
            image.setBackgroundResource(R.drawable.animation12);
            soundId = mSoundPoolHelper.load(this,R.raw.page12,2);
        }
        else if(pageNumber==13)
        {
            image.setBackgroundResource(R.drawable.animation13);
            soundId = mSoundPoolHelper.load(this,R.raw.page13,2);
        }
        else if(pageNumber==14)
        {
            image.setBackgroundResource(R.drawable.animation14);
            soundId = mSoundPoolHelper.load(this,R.raw.page14,2);
        }
        else if(pageNumber==15)
        {
            image.setBackgroundResource(R.drawable.animation15);
            soundId = mSoundPoolHelper.load(this,R.raw.page15,2);
        }
        else if(pageNumber==16)
        {
            image.setBackgroundResource(R.drawable.animation16);
            soundId = mSoundPoolHelper.load(this,R.raw.page16,2);
        }
        else if(pageNumber==17)
        {
            image.setBackgroundResource(R.drawable.animation17);
            soundId = mSoundPoolHelper.load(this,R.raw.page17,2);
        }
        else if(pageNumber==18)
        {
            image.setBackgroundResource(R.drawable.animation18);
            soundId = mSoundPoolHelper.load(this,R.raw.page18,2);
        }
        else if(pageNumber==19)
        {
            image.setBackgroundResource(R.drawable.animation19);
            soundId = mSoundPoolHelper.load(this,R.raw.page19,2);
        }
        else if(pageNumber==20)
        {
            image.setBackgroundResource(R.drawable.animation20);
            soundId = mSoundPoolHelper.load(this,R.raw.musikmaskin,2);
        }
        else if(pageNumber==21)
        {
            image.setBackgroundResource(R.drawable.animation21);
            soundId = mSoundPoolHelper.load(this,R.raw.page20,2);
        }
        else if(pageNumber==22)
        {
            image.setBackgroundResource(R.drawable.animation22);
            soundId = mSoundPoolHelper.load(this,R.raw.page21,2);
        }
        else if(pageNumber==23)
        {
            image.setBackgroundResource(R.drawable.animation23);
            soundId = mSoundPoolHelper.load(this,R.raw.page22,2);
        }
        else if(pageNumber==24)
        {
            image.setBackgroundResource(R.drawable.animation24);
            soundId = mSoundPoolHelper.load(this,R.raw.page23,2);
        }
        else if(pageNumber==25)
        {
            image.setBackgroundResource(R.drawable.animation25);
            soundId = mSoundPoolHelper.load(this,R.raw.page24,2);
        }
        else
        {
            soundId=0;
        }
        animation=(AnimationDrawable)image.getBackground();
        //image.setVisibility(View.INVISIBLE);
        image.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_DOWN) {
                    animation.setVisible(true, true);
                    animation.start();
                    mSoundPoolHelper.play(soundId);

                }
                return true;
            }
        });
        secondText=getSecondText(pageNumber-1);
        textTwo = ((TextView)findViewById(R.id.main_body_text));
        textTwo.setText(secondText);
        textTwo.setTypeface(tf);
        //textTwo.setTextColor(Color.rgb(255, 0, 246));
        if(pageNumber<25)
        {
            forward = (ImageButton) findViewById(R.id.arrow_forward);
            forward.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    //  image.clearAnimation();
                    // image.setBackground(null);
                    // animation=(AnimationDrawable)image.getBackground();

                        pageNumber++;
                        i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                        i.putExtra("pageNumber", pageNumber);
                        mSoundPoolHelper.release();
                        animation.setCallback(null);
                        startActivity(i);
                        finish();
                        System.gc();
                        //image.setBackgroundResource(R.drawable.animation2);
                        //load new animation and text.

                }
            });
        }
        else
        {
            forward = (ImageButton) findViewById(R.id.arrow_forward);
            forward.setVisibility(View.INVISIBLE);
        }
        if(pageNumber>1) {
            backward = (ImageButton) findViewById(R.id.arrow_backward);
            backward.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    //  image.clearAnimation();
                    // image.setBackground(null);
                    // animation=(AnimationDrawable)image.getBackground();
                        pageNumber--;
                        i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                        i.putExtra("pageNumber", pageNumber);
                        startActivity(i);
                        finish();
                        //image.setBackgroundResource(R.drawable.animation2);
                        //load new animation and text.
                    }
            });
        }
        else
        {
            backward = (ImageButton) findViewById(R.id.arrow_backward);
            backward.setVisibility(View.INVISIBLE);
        }

    }
    private String getFirstText(int pn) {
        String returnString="";
        switch(pn)
        {
            case 0: returnString=getString(R.string.title_page_zero);
                break;
            case 1: returnString=getString(R.string.title_page_one);
                break;
            case 2: returnString=getString(R.string.title_page_two);
                break;
            case 3: returnString=getString(R.string.title_page_three);
                break;
            case 4: returnString=getString(R.string.title_page_four);
                break;
            case 5: returnString=getString(R.string.title_page_five);
                break;
            case 6: returnString=getString(R.string.title_page_six);
                break;
            case 7: returnString=getString(R.string.title_page_six_point_five);
                break;
            case 8: returnString=getString(R.string.title_page_seven);
                break;
            case 9: returnString=getString(R.string.title_page_eight);
                break;
            case 10: returnString=getString(R.string.title_page_nine);
                break;
            case 11: returnString=getString(R.string.title_page_ten);
                break;
            case 12: returnString=getString(R.string.title_page_eleven);
                break;
            case 13: returnString=getString(R.string.title_page_twelve);
                break;
            case 14: returnString = getString(R.string.title_page_thirteen);
                break;
            case 15: returnString = getString(R.string.title_page_fourteen);
                break;
            case 16: returnString = getString(R.string.title_page_fifteen);
                break;
            case 17:  returnString = getString(R.string.title_page_sixteen);
                break;
            case 18: returnString = getString(R.string.title_page_seventeen);
                break;
            case 19: returnString = getString(R.string.title_page_eighteen);
                break;
            case 20: returnString = getString(R.string.title_page_nineteen);
                break;
            case 21: returnString = getString(R.string.title_page_twenty);
                break;
            case 22: returnString = getString(R.string.title_page_twentyone);
                break;
            case 23: returnString = getString(R.string.title_page_twentytwo);
                break;
            case 24: returnString = getString(R.string.title_page_twentythree);
                break;

            default : returnString=getString(R.string.title_page_default);
        }
        //Log.d("ScreenSlidePageFragment.getPageText","This is string: "+returnString+"");
        // TODO Auto-generated method stub
        return returnString;
    }

    private String getSecondText(int pn) {
        String returnString="";
        switch(pn)
        {
            case 0: returnString=getString(R.string.text_page_zero);
                break;
            case 1: returnString=getString(R.string.text_page_one);
                break;
            case 2: returnString=getString(R.string.text_page_two);
                break;
            case 3: returnString=getString(R.string.text_page_three);
                break;
            case 4: returnString=getString(R.string.text_page_four);
                break;
            case 5: returnString=getString(R.string.text_page_five);
                break;
            case 6: returnString=getString(R.string.text_page_six);
                break;
            case 7: returnString=getString(R.string.text_page_six_point_five);
                break;
            case 8: returnString=getString(R.string.text_page_seven);
                break;
            case 9: returnString=getString(R.string.text_page_eight);
                break;
            case 10: returnString=getString(R.string.text_page_nine);
                break;
            case 11: returnString=getString(R.string.text_page_ten);
                break;
            case 12: returnString=getString(R.string.text_page_eleven);
                break;
            case 13: returnString=getString(R.string.text_page_twelve);
                break;
            case 14: returnString = getString(R.string.text_page_thirteen);
                break;
            case 15: returnString = getString(R.string.text_page_fourteen);
                break;
            case 16: returnString = getString(R.string.text_page_fifteen);
                break;
            case 17:  returnString = getString(R.string.text_page_sixteen);
                break;
            case 18: returnString = getString(R.string.text_page_seventeen);
                break;
            case 19: returnString = getString(R.string.text_page_eighteen);
                break;
            case 20: returnString = getString(R.string.text_page_nineteen);
                break;
            case 21: returnString = getString(R.string.text_page_twenty);
                break;
            case 22: returnString = getString(R.string.text_page_twentyone);
                break;
            case 23: returnString = getString(R.string.text_page_twentytwo);
                break;
            case 24: returnString = getString(R.string.text_page_twentythree);
                break;

            default : returnString=getString(R.string.title_page_default);
        }
        //Log.d("ScreenSlidePageFragment.getPageText","This is string: "+returnString+"");
        // TODO Auto-generated method stub
        return returnString;
    }

    @Override
    public void onBackPressed() {
            super.onBackPressed();
            Log.d("testing", "backbutton pressed");
            mSoundPoolHelper.release();
            animation.setCallback(null);
            finish();
            System.gc();
            return;
    }
}
