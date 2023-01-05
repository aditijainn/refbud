package com.example.arefugeesbuddy.ui;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

public class NgoAssistance extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ngo_assistance);
        BottomNavigationView navView = findViewById(R.id.nav_view);
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(
                R.id.navigation_home, R.id.navigation_dashboard, R.id.navigation_notifications)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);
        NavigationUI.setupWithNavController(navView, navController);
    }
    public void process(View view) {
        Intent intent = null, chooser=null;
        private int PHONE_PERMISSION_CODE = 1;
        if(view.getId()==R.id.website1) {
            Intent browserIntent =new Intent (Intent.ACTION_VIEW, Uri.parse(https://www.christian-action.org.hk/en/));
            startActivity(browserIntent);
        }
        if(view.getId()==R.id.address1) {
            intent = new Intent (android.content.Intent.ACTION_VIEW);
            intent.setData(Uri.parse("geo:22.33340,114.21407"));
            chooser=Intent.createChooser(intent,"Launch Maps");
            startActivity(chooser);
        }
        if(view.getId()==R.id.email1) {
            intent = new Intent (Intent.ACTION_SEND);
            intent.setData(Uri.parse("mailto:"));
            String[] to={"info@christian-action.org.hk"};
            intent.setType("message/rfc822");
            chooser=Intent.createChooser(intent,"Send Email");
            startActivity(chooser);
        }
        if(view.getId()==R.id.phone1) {
            intent = new Intent(Intent.ACTION_CALL);
            intent.setData(Uri.parse("tel:+85223823339"));
            if (ContextCompat.checkSelfPermission(context: this,
                    Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED){
                return;
            }
            startActivity(intent);
        }


        if(view.getId()==R.id.website2) {
            Intent browserIntent =new Intent (Intent.ACTION_VIEW, Uri.parse(https://www.justicecentre.org.hk/));
            startActivity(browserIntent);
        }
        if(view.getId()==R.id.address2) {
            intent = new Intent (android.content.Intent.ACTION_VIEW);
            intent.setData(Uri.parse("geo: 22.28663,114.13357"));
            chooser=Intent.createChooser(intent,"Launch Maps");
            startActivity(chooser);
        }
        if(view.getId()==R.id.email2) {
            intent = new Intent (Intent.ACTION_SEND);
            intent.setData(Uri.parse("mailto:"));
            String[] to={"info@justicecentre.org.hk"};
            intent.setType("message/rfc822");
            chooser=Intent.createChooser(intent,"Send Email");
            startActivity(chooser);
        }
        if(view.getId()==R.id.phone2) {
            intent = new Intent(Intent.ACTION_CALL);
            intent.setData(Uri.parse("tel:+85231097359"));
            if (ContextCompat.checkSelfPermission(context: this,
                    Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED){
                return;
            }
            startActivity(intent);
        }


        if(view.getId()==R.id.website3) {
            Intent browserIntent =new Intent (Intent.ACTION_VIEW, Uri.parse(http://www.vfnow.org/));
            startActivity(browserIntent);
        }
        if(view.getId()==R.id.address3) {
            intent = new Intent (android.content.Intent.ACTION_VIEW);
            intent.setData(Uri.parse("geo:22.28333,114.13333"));
            chooser=Intent.createChooser(intent,"Launch Maps");
            startActivity(chooser);
        }
        if(view.getId()==R.id.email3) {
            intent = new Intent (Intent.ACTION_SEND);
            intent.setData(Uri.parse("mailto:"));
            String[] to={"refugeeunionhk@gmail.com"};
            intent.setType("message/rfc822");
            chooser=Intent.createChooser(intent,"Send Email");
            startActivity(chooser);
        }
        if(view.getId()==R.id.phone3) {
            intent = new Intent(Intent.ACTION_CALL);
            intent.setData(Uri.parse("tel:+85298287176"));
            if (ContextCompat.checkSelfPermission(context: this,
                    Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED){
                return;
            }
            startActivity(intent);
        }


        if(view.getId()==R.id.website4) {
            Intent browserIntent =new Intent (Intent.ACTION_VIEW, Uri.parse(https://branchesofhope.org.hk/));
            startActivity(browserIntent);
        }
        if(view.getId()==R.id.address4) {
            intent = new Intent (android.content.Intent.ACTION_VIEW);
            intent.setData(Uri.parse("geo:22.27701,114.17650"));
            chooser=Intent.createChooser(intent,"Launch Maps");
            startActivity(chooser);
        }
        if(view.getId()==R.id.email4) {
            intent = new Intent (Intent.ACTION_SEND);
            intent.setData(Uri.parse("mailto:"));
            String[] to={"info@branchesofhope.org.hk"};
            intent.setType("message/rfc822");
            chooser=Intent.createChooser(intent,"Send Email");
            startActivity(chooser);
        }
        if(view.getId()==R.id.phone4) {
            intent = new Intent(Intent.ACTION_CALL);
            intent.setData(Uri.parse("tel:+85235276088"));
            if (ContextCompat.checkSelfPermission(context: this,
                    Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED){
                return;
            }
            startActivity(intent);
        }


        if(view.getId()==R.id.website5) {
            Intent browserIntent =new Intent (Intent.ACTION_VIEW, Uri.parse(http://www.isshk.org/en/));
            startActivity(browserIntent);
        }
        if(view.getId()==R.id.address5) {
            intent = new Intent (android.content.Intent.ACTION_VIEW);
            intent.setData(Uri.parse("geo:22.44038,114.09897"));
            chooser=Intent.createChooser(intent,"Launch Maps");
            startActivity(chooser);
        }
        if(view.getId()==R.id.email5) {
            intent = new Intent (Intent.ACTION_SEND);
            intent.setData(Uri.parse("mailto:"));
            String[] to={"isshk@isshk.org"};
            intent.setType("message/rfc822");
            chooser=Intent.createChooser(intent,"Send Email");
            startActivity(chooser);
        }
        if(view.getId()==R.id.phone5) {
            intent = new Intent(Intent.ACTION_CALL);
            intent.setData(Uri.parse("tel:+85228346863"));
            if (ContextCompat.checkSelfPermission(context: this,
                    Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED){
                return;
            }
            startActivity(intent);
        }

        if(view.getId()==R.id.website6) {
            Intent browserIntent =new Intent (Intent.ACTION_VIEW, Uri.parse(https://www.amnesty.org.hk/));
            startActivity(browserIntent);
        }
        if(view.getId()==R.id.address6) {
            intent = new Intent (android.content.Intent.ACTION_VIEW);
            intent.setData(Uri.parse("geo:22.30951,114.16788"));
            chooser=Intent.createChooser(intent,"Launch Maps");
            startActivity(chooser);
        }
        if(view.getId()==R.id.email6) {
            intent = new Intent (Intent.ACTION_SEND);
            intent.setData(Uri.parse("mailto:"));
            String[] to={"admin-hk@amnesty.org.hk"};
            intent.setType("message/rfc822");
            chooser=Intent.createChooser(intent,"Send Email");
            startActivity(chooser);
        }
        if(view.getId()==R.id.phone6) {
            intent = new Intent(Intent.ACTION_CALL);
            intent.setData(Uri.parse("tel:+85223001250"));
            if (ContextCompat.checkSelfPermission(context: this,
                    Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED){
                return;
            }
            startActivity(intent);
        }
    }
