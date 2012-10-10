package com.icedwater.sleague;

import android.app.Activity;
import android.os.Bundle;

import android.app.ActionBar;
import android.app.FragmentTransaction;
import android.view.Window;

public class MainActivity extends Activity
{
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
/*        final ActionBar actionBar = getActionBar();

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
*/

    }

}
