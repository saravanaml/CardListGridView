package com.hopend.saravana.cardlistgridview;

import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


public class GridFragment extends Fragment {



    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    ArrayList<objectbean> cards = new ArrayList<>();

    public GridFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState)
    {
        View view = inflater.inflate(R.layout.fragment_recyclerview, container, false);


        mRecyclerView = (RecyclerView) view.findViewById(R.id.recyclerView);
        RecyclerView.LayoutManager layoutManager =  new GridLayoutManager(getActivity(), 2);
        mRecyclerView.setLayoutManager(layoutManager);
        mRecyclerView.setHasFixedSize(true);


        for(int k=0;k<=10;k++)
        {
            objectbean obj = new objectbean();
            obj.setTitle(String.valueOf(k));
            obj.setSinger(String.valueOf(k));
            obj.setDuration(String.valueOf(k));
            cards.add(obj);
        }


        mAdapter = new RecyclerViewMaterialAdapter(new ObjectGridAdapter(cards,getActivity()));
        mRecyclerView.setAdapter(mAdapter);





        return view;

    }


    public void onButtonPressed(Uri uri) {

    }


}
