package com.hopend.saravana.cardlistgridview;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import java.util.List;

/**
 * Created by saravana on 6/14/2015.
 */
public class ObjectListAdapter extends RecyclerView.Adapter<ObjectHolder>
{

    List<objectbean> contents;

    Context ctx;


    public ObjectListAdapter(List<objectbean> contents, Context ctx)
    {
        this.ctx = ctx;
        this.contents = contents;
    }

    @Override
    public ObjectHolder onCreateViewHolder(ViewGroup parent, final int viewType)
    {
        View view = null;

        view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item_card_small, parent, false);
        return new ObjectHolder(view , new ObjectHolder.IMyViewHolderClicks()
        {
            @Override
            public void onPlay(View caller)
            {
               Log.e("getting data", "view"+contents.get((int)caller.getTag()).getTitle());

               /* HomePage.songtitle.setText(contents.get((int)caller.getTag()).getFilename());
                HomePage.songplaypause.setImageDrawable(null);
                HomePage.songplaypause.setImageResource(android.R.drawable.ic_media_pause);
                try
                {
                    HomePage.mp.reset();
                    HomePage.mp.setDataSource(ctx, Uri.parse("file://"+contents.get((int) caller.getTag()).getUri()));
                    HomePage.mp.prepare();
                    HomePage.mp.start();
                    HomePage. mp.setOnPreparedListener((MediaPlayer.OnPreparedListener) ctx);
                    HomePage.mp.prepareAsync();

                }
                catch (Exception e)
                {
                    e.printStackTrace();
                }*/

                Toast.makeText(ctx,contents.get((int)caller.getTag()).getTitle(),Toast.LENGTH_LONG).show();

            }
        }){};

    }

    @Override
    public void onBindViewHolder(ObjectHolder holder, int position)
    {
        objectbean song = contents.get(position);
        holder.bindSong(song,position);
    }



    @Override
    public int getItemCount() {
        return contents.size();
    }
}
