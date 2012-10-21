package com.icedwater.sleague;

import android.app.Activity;
import android.os.Bundle;

import android.app.ActionBar;
import android.app.Fragment;
import android.app.FragmentTransaction;

import android.view.View;
import android.widget.Button;
import android.content.Intent;

public class MainActivity extends Activity
{
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        Button btnFixtures = (Button) findViewById(R.id.btn_Fixtures);
        btnFixtures.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // go to Fixtures
                startActivity(new Intent("com.icedwater.sleague.Fixtures"));
            }
        });

        final ActionBar actionBar = getActionBar();

        // display tabs in the action bar
        actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);

        // tab listener is called when user changes tabs
        ActionBar.TabListener tabListener = new ActionBar.TabListener() {

            // stuff here.
            public void onTabSelected(ActionBar.Tab tab, FragmentTransaction ft) {
                // when tab is selected
            }

            public void onTabUnselected(ActionBar.Tab tab, FragmentTransaction ft) {
                // when tab is unselected
            }

            public void onTabReselected(ActionBar.Tab tab, FragmentTransaction ft) {
                // when tab is reselected
            }

        };

        for (int i = 0; i < 3; i++) {
            actionBar.addTab(
                actionBar.newTab()
                    .setText("Tab " + (i + 1))
                    .setTabListener(tabListener));
        }


    }

}
