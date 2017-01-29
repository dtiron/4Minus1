package com.seara.firstapp;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.content.Intent;
import android.app.Activity;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TabHost tabHost = (TabHost) findViewById(R.id.tabhost);
        tabHost.setup();

        TabSpec spec1 = tabHost.newTabSpec("tab1");
        spec1.setContent(R.id.tab1);
        spec1.setIndicator("Quiz", null);
        tabHost.addTab(spec1);

        TabSpec spec2 = tabHost.newTabSpec("tab2");
        spec2.setContent(R.id.tab2);
        spec2.setIndicator("Main Page", null);
        tabHost.addTab(spec2);

        TabSpec spec3 = tabHost.newTabSpec("tab3");
        spec3.setContent(R.id.tab3);
        spec3.setIndicator("History", null);
        tabHost.addTab(spec3);


    }


    //key charasteristics: public, void return value,view as only parameter

}
