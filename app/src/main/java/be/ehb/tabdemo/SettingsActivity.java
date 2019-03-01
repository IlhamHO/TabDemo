package be.ehb.tabdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import be.ehb.tabdemo.fragments.SettingsFragment;

public class SettingsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        getSupportFragmentManager().beginTransaction().replace(R.id.settings_container, SettingsFragment.newInstance()).commit();
    }
}
