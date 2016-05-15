package com.gnyrfta.androidstorytwelve;


import android.content.SharedPreferences;
import android.content.SharedPreferences.OnSharedPreferenceChangeListener;
import android.os.Bundle;
import android.preference.Preference;
import android.preference.PreferenceActivity;
import android.util.Log;

public class SettingsActivity extends PreferenceActivity implements OnSharedPreferenceChangeListener {
    //  public static final String KEY_BACKGROUND_COLOR = "background_color";
    public static final String KEY_SOUND_ON ="sound";
    public static final String KEY_INFO = "info";
    public static final String LANGUAGE = "language";

    @SuppressWarnings("deprecation")
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.preferences);
    }
    public void onSharedPreferenceChanged(SharedPreferences sharedPreferences,
                                          String key) {
    	/*
            if (key.equals(KEY_BACKGROUND_COLOR)) {
                @SuppressWarnings("deprecation")
				Preference backgroundColor = findPreference(key);
                Log.d("in OnSharedPreferenceChanged","KEY_BACKGROUND_COLOR has been changed");
                // Set summary to be the user-description for the selected value
                backgroundColor.setSummary(sharedPreferences.getString(key, ""));
            }*/
        if (key.equals(KEY_SOUND_ON)) {
            @SuppressWarnings("deprecation")
            Preference sound = findPreference(key);
            Log.d("in settings","KEY_SOUND_ON has been changed");
            // Set summary to be the user-description for the selected value
            sound.setSummary(sharedPreferences.getString(key, ""));
        }

        if (key.equals(KEY_INFO)) {
            @SuppressWarnings("deprecation")
            Preference info = findPreference(key);
            Log.d("in settings","KEY_INFO has been changed");
            // Set summary to be the user-description for the selected value
            info.setSummary(sharedPreferences.getString(key, ""));
        }

    }
}