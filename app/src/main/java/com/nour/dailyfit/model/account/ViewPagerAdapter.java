package com.nour.dailyfit.model.account;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.nour.dailyfit.view.homepage.CalendarPage;
import com.nour.dailyfit.view.homepage.EntriesPage;
import com.nour.dailyfit.view.homepage.SettingsPage;

public class ViewPagerAdapter extends FragmentStateAdapter {

    public ViewPagerAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position) {
            case 1:
                return new CalendarPage();
            case 2:
                return new SettingsPage();
            default:
                return new EntriesPage();
        }
    }

    @Override
    public int getItemCount() {
        return 3;
    }
}
