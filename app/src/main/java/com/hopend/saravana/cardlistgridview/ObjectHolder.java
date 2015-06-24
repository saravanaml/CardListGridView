package com.hopend.saravana.cardlistgridview;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;



/**
 * Created by saravana on 6/14/2015.
 */
public  class ObjectHolder extends RecyclerView.ViewHolder implements View.OnClickListener
{
    TextView textTitle;
    TextView textDuration;

    TextView textSinger;
    public IMyViewHolderClicks mListener;

    View vi;

    objectbean msong;

    public ObjectHolder(View itemView, IMyViewHolderClicks listener)
    {
        super(itemView);
        mListener = listener;

        vi = itemView;
        textTitle = (TextView) itemView.findViewById( R.id.textTitle);
        textDuration = (TextView) itemView.findViewById(R.id.textDuration);
        textSinger = (TextView) itemView.findViewById(R.id.textSinger);

        itemView.setOnClickListener(this);

    }

    public void bindSong(objectbean song,int pos)
    {
        msong = song;
        vi.setTag(pos);
        textTitle.setText(song.getTitle());
        textDuration.setText(song.getSinger());
        textSinger.setText(song.getDuration());

    }

    @Override
    public void onClick(View view)
    {
        mListener.onPlay(view);
    }

    public static interface IMyViewHolderClicks {
        public void onPlay(View caller);

    }

}
