package com.example.map;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private CardView add;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        BottomNavigationView bottomNavigationView = findViewById(R.id.bottomBar);
        bottomNavigationView.setSelectedItemId(R.id.dashboard);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

                switch (menuItem.getItemId()){
                    case R.id.dashboard:

                        break;
                    case R.id.home:
                        startActivity(new Intent(getApplicationContext()
                                ,MapsActivity2.class));
                        overridePendingTransition(0,0);
                        break;
                    case R.id.about:
                        startActivity(new Intent(getApplicationContext()
                                ,about.class));
                        overridePendingTransition(0,0);
                        break;
                }
                return false;
            }
        });

        add=findViewById(R.id.cardView);
        add.setOnClickListener(this);
        add=findViewById(R.id.cardViewss);
        add.setOnClickListener(this);
        add=findViewById(R.id.cardViewsss);
        add.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent i;
        switch (v.getId()) {
            case R.id.cardView:
                i = new Intent(this, MapsActivity2.class);
                startActivity(i);
                break;
            case R.id.cardViewss:
                i = new Intent(this, MapsActivity2.class);
                startActivity(i);
                break;
            case R.id.cardViewsss:
                i = new Intent(this, MapsActivity2.class);
                startActivity(i);
                break;
            default:
                break;
        }
    }

}