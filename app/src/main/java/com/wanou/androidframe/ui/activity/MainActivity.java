package com.wanou.androidframe.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.ashokvarma.bottomnavigation.BottomNavigationBar;
import com.ashokvarma.bottomnavigation.BottomNavigationItem;
import com.wanou.androidframe.R;
import com.wanou.androidframe.fragmentfactory.MainFragmentFactory;
import com.wanou.framelibrary.utils.UiTools;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity implements View.OnClickListener, BottomNavigationBar.OnTabSelectedListener {

    private BottomNavigationBar mBottomBar;
    private int lastSelectedPosition = 0;
    private String[] mainArray = UiTools.getStringArray(R.array.main);

    public static void startActivity(LoginActivity mPresenterView) {
        Intent intent = new Intent(mPresenterView, MainActivity.class);
        mPresenterView.startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mBottomBar = findViewById(R.id.bottom_navigation_bar);
        initBottomBar();
    }

    private void initBottomBar() {
        mBottomBar
                .addItem(new BottomNavigationItem(R.drawable.ic_home_white_24dp, R.string.first))
                .addItem(new BottomNavigationItem(R.drawable.ic_favorite_white_24dp, R.string.second))
                .addItem(new BottomNavigationItem(R.drawable.ic_location_on_white_24dp, R.string.third))
                .addItem(new BottomNavigationItem(R.drawable.ic_tv_white_24dp, R.string.four))
                .addItem(new BottomNavigationItem(R.drawable.ic_music_note_white_24dp, R.string.five))
                .setTabSelectedListener(this)
                .setFirstSelectedPosition(lastSelectedPosition)
                .initialise();

        mBottomBar.selectTab(lastSelectedPosition);
    }

    @Override
    public void onClick(View v) {
     new ArrayList<>();
     
    }

    @Override
    public void onTabSelected(int position) {
        setScrollableText(position);
    }

    @Override
    public void onTabUnselected(int position) {

    }

    @Override
    public void onTabReselected(int position) {
    }

    private void setScrollableText(int position) {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        Fragment fragmentByTag = getSupportFragmentManager().findFragmentByTag(mainArray[position]);
        List<Fragment> fragments = getSupportFragmentManager().getFragments();
        for (Fragment fragment : fragments) {
            fragmentTransaction.hide(fragment);
        }
        if (fragmentByTag != null) {
            fragmentTransaction.show(fragmentByTag);
        } else {
            fragmentTransaction.add(R.id.fl_container, MainFragmentFactory.getFragment(position), mainArray[position]);
            fragmentTransaction.show(MainFragmentFactory.getFragment(position));
        }
        fragmentTransaction.commitAllowingStateLoss();
    }

}
