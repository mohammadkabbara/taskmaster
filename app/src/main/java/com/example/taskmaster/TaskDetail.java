package com.example.taskmaster;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class TaskDetail extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task_detail);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Intent intent = getIntent();
        String taskName = intent.getExtras().getString("tasks");
        TextView taskTitle = findViewById(R.id.taskDetails);
        taskTitle.setText(taskName);
    }
}