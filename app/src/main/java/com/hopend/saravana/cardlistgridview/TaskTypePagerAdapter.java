package com.hopend.saravana.cardlistgridview;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;



import java.util.Random;

public class TaskTypePagerAdapter extends FragmentPagerAdapter {

    private int pagerCount = 2;

    Context ctx;


       final Fragment[] fragments =
       {



       };

    private Random random = new Random();

    public TaskTypePagerAdapter(FragmentManager fm, Context ctx)
    {
        super(fm);

        this.ctx = ctx;

    }

    @Override public Fragment getItem(int i)
    {
        //return ColorFragment.newInstance(0xff000000 | random.nextInt(0x00ffffff));

        //return ColorFragment.newInstance(0xffffffff);

        if(i==0)
        {
            return  new ListFragment();
        }
        else
        {
            return new GridFragment();
        }



    }



    @Override public int getCount() {
        return pagerCount;
    }



}