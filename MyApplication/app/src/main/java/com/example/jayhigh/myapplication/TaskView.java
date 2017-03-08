package com.example.jayhigh.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by apps on 3/4/17.
 */

public class TaskView extends LinearLayout {
    TextView nameView;
    TextView descriptionView;
    Button deleteButton;
    int deleteState = 0;
    View view;


    public TaskView(Task task, Context context){
        super(context);

        //here we need to inflate the layout on construction
        inflate(context, R.layout.task_view, this);
       // LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
   //     inflater.inflate(R.layout.event_view, this, true);

        nameView = (TextView) this.findViewById(R.id.event_name);
        descriptionView = (TextView) findViewById(R.id.event_description);

        nameView.setText(task.name);
        descriptionView.setText(task.description);

    }



    private class deleteClickListener implements OnClickListener{
        @Override
        public void onClick(View v){
            if(deleteState == 1){
                //remove event from it's parent list
            }
        }

    }

}


