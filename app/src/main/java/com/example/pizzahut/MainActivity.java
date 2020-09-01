package com.example.pizzahut;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView imgcall,imgemail,imglocation,imgweb,imgorder ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgcall = (ImageView)findViewById(R.id.call);
        imgemail = (ImageView)findViewById(R.id.email);
        imglocation = (ImageView)findViewById(R.id.location);
        imgweb = (ImageView)findViewById(R.id.web);
        imgorder = (ImageView)findViewById(R.id.order_now);

    }

    public void openWebPage(View view) {
        String url = "https://www.jordan.pizzahut.me/";
        Uri webpage = Uri.parse(url);
        Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }

    @RequiresApi(api = Build.VERSION_CODES.M)
    public void dialPhoneNumber(View view) {
        String phoneNumber = "0799265341";
        Intent intent = new Intent(Intent.ACTION_CALL);
        intent.setData(Uri.parse("tel:" + phoneNumber));
        if (intent.resolveActivity(getPackageManager()) != null) {
            if (checkSelfPermission(Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                // TODO: Consider calling
                //    Activity#requestPermissions
                // here to request the missing permissions, and then overriding
                //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
                //                                          int[] grantResults)
                // to handle the case where the user grants the permission. See the documentation
                // for Activity#requestPermissions for more details.
                return;
            }
            startActivity(intent);
        }
    }
    public void showMap(View view) {
        Uri geoLocation = Uri.parse("geo:0,0?q=29.532710, 35.003437(مطعم بيتزا هت )");

        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(geoLocation);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }
    public void showMenu(View view){
        Intent intent = new Intent(this, Menu.class);
        startActivity(intent);
    }

    public void contactUs(View view) {
        String address = "esraashabrani@gmail.com";
        String subject = "Recommendation";
        String emailBody = ("Any Recommendations or comments ! " );
        Intent intent = new Intent(Intent.ACTION_SENDTO);
        intent.setData(Uri.parse("mailto:"));


        // only email apps should handle this
        intent.putExtra(Intent.EXTRA_EMAIL, address);
        intent.putExtra(Intent.EXTRA_SUBJECT, subject);
        intent.putExtra(Intent.EXTRA_TEXT, emailBody);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }

    }

}
