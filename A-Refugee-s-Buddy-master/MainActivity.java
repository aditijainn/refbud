package com.example.arefugeesbuddy;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.example.arefugeesbuddy.language;
import com.example.arefugeesbuddy.ui.NgoAssistance;
import com.example.arefugeesbuddy.ui.other;
import com.example.arefugeesbuddy.ui.transportation;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

public class MainActivity extends AppCompatActivity {
    private ImageButton button1;
    private ImageButton button2;
    private ImageButton button3;
    private ImageButton button4;
    private ImageButton button5;
    private ImageButton button6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BottomNavigationView navView = findViewById(R.id.nav_view);
        // Passing each menu ID as a set of Ids because each menu should be considered as top level destinations.
        AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(
                R.id.navigation_home, R.id.navigation_events, R.id.navigation_map)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);
        NavigationUI.setupWithNavController(navView, navController);

        button1 = (ImageButton) findViewById(R.id.ngoassistancebutton);
        button2 = (ImageButton) findViewById(R.id.transportationbutton);
        button3 = (ImageButton) findViewById(R.id.abouthkbutton);
        button4 = (ImageButton) findViewById((R.id.langbutton));
        button5 = (ImageButton) findViewById((R.id.otherbutton));
        button6 = (ImageButton) findViewById((R.id.medicalbutton));

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openNgoAssistance();
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openTransportation();
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAboutHK();
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openLanguage();
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openOther();
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMedical();
            }
        });
    }
    public void openNgoAssistance() {
        Intent intent1 = new Intent(this, NgoAssistance.class);
        startActivity(intent1);
    }
    public void openTransportation() {
        Intent intent2 = new Intent(this, transportation.class);
        startActivity(intent2);
    }
    public void openAboutHK() {
        Intent intent3 = new Intent(this, AboutHK.class);
        startActivity(intent3);
    }
    public void openLanguage() {
        Intent intent4 = new Intent(this, language.class);
        startActivity(intent4);
    }
    public void openOther() {
        Intent intent5 = new Intent(this, other.class);
        startActivity(intent5);
    }
    public void openMedical() {
        Intent intent6 = new Intent(this, MedicalActivity.class);
        startActivity(intent6);
    }
}
