package com.hopend.saravana.cardlistgridview;

import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.getbase.floatingactionbutton.FloatingActionButton;

import it.neokree.materialtabs.MaterialTab;
import it.neokree.materialtabs.MaterialTabHost;
import it.neokree.materialtabs.MaterialTabListener;


public class MainActivity extends ActionBarActivity implements MaterialTabListener {

    FloatingActionButton floatbut;
    MaterialTabHost tabHost;
    ViewPager pager;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tabHost = (MaterialTabHost) findViewById(R.id.materialTabHost);
        pager = (ViewPager)findViewById(R.id.viewpager);
        floatbut = (FloatingActionButton)findViewById(R.id.addnewtask);

        TaskTypePagerAdapter pagerAdapter = new TaskTypePagerAdapter(getSupportFragmentManager(),MainActivity.this);
        pager.setAdapter(pagerAdapter);
        pager.setOnPageChangeListener(new ViewPager.SimpleOnPageChangeListener() {
            @Override
            public void onPageSelected(int position) {
                // when user do a swipe the selected tab change
                tabHost.setSelectedNavigationItem(position);
            }
        });

        String []tabdata = {"ListView","GridView"};
        // insert all tabs from pagerAdapter data
        for (int i = 0; i < pagerAdapter.getCount(); i++)
        {
            tabHost.addTab(
                    tabHost.newTab()
                            .setText(tabdata[i])
                            .setTabListener(MainActivity.this)
            );

        }


        floatbut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"Floating Action Button",Toast.LENGTH_LONG).show();
            }
        });


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onTabSelected(MaterialTab materialTab) {
        pager.setCurrentItem(materialTab.getPosition());
    }

    @Override
    public void onTabReselected(MaterialTab materialTab) {

    }

    @Override
    public void onTabUnselected(MaterialTab materialTab) {

    }
}
