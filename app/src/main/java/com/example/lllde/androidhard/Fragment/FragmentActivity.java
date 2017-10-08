package com.example.lllde.androidhard.Fragment;

import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.example.lllde.androidhard.R;

public class FragmentActivity extends AppCompatActivity {
    private int fragment_num = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                android.support.v4.app.FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
                if (fragment_num == 0) {
                    ft.replace(R.id.fragment_container, new SecondFragment());
                    fragment_num = 1;
                } else if (fragment_num == 1) {
                    ft.replace(R.id.fragment_container, new FragmentActivityFragment());
                    fragment_num = 0;
                }
                ft.commit();
                Snackbar.make(view, "切换fragment", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

}
