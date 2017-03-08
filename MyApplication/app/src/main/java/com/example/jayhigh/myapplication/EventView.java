package com.example.jayhigh.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.sql.Time;
import java.util.Date;

/**
 * Created by apps on 3/4/17.
 */

public class EventView extends LinearLayout {
    TextView nameView;
    TextView endTimeView;
    TextView startTimeView;
    TextView descriptionView;
    Button deleteButton;
    int deleteState = 0;
    View view;
    Event event;


    public EventView(Event event, Context context){
        super(context);
        this.event = event;

        //here we need to inflate the layout on construction
        inflate(context, R.layout.event_view, this);
        //LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        //inflater.inflate(R.layout.event_view, this, true);

        nameView = (TextView) this.findViewById(R.id.event_name);
        startTimeView = (TextView) findViewById(R.id.event_time);
        descriptionView = (TextView) findViewById(R.id.event_description);

        nameView.setText(event.name);

        String time = event.startTime + "-" + event.endTime;

        startTimeView.setText(event.startTime);
        descriptionView.setText(event.description);

    }



    private class deleteClickListener implements View.OnClickListener{
        @Override
        public void onClick(View v){
            if(deleteState == 1){
                //remove event from it's parent list
            }
        }

    }

}


