package com.example.stani.serviceexample;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //buttons onClick methods

    //method to start the service
    public void startService(View view) {
        startService(new Intent(getBaseContext(), SimpleService.class));
    }

    // emthod to stop the service
    public void stopService(View view) {
        stopService(new Intent(getBaseContext(), SimpleService.class));
    }
}
