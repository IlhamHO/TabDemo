package be.ehb.tabdemo.utilities;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.Random;

import be.ehb.tabdemo.fragments.AgendaFragment;
import be.ehb.tabdemo.fragments.SettingsFragment;
import be.ehb.tabdemo.fragments.SpiegelFragment;

public class AgendaTabAdapter extends FragmentPagerAdapter {

    public AgendaTabAdapter(FragmentManager fm) {
        super(fm);
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {

            case 0: return "Deze week";
            case 1: return "Spiegel";
            case 2: return "Settings";
        }
        return "hackerman"/*+position*/;

    }

    @Override
    public Fragment getItem(int i) {
        switch (i){
            case 0:
                Random random =new Random();
                return AgendaFragment.newInstance(random.nextInt(20));
            case 1: return SpiegelFragment.newInstance();
            case 2: return SettingsFragment.newInstance();
        }
        return null;
    }

    @Override
    public int getCount() {
        return 3;
    }
}
