package com.example.pizzahut;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class deserts extends AppCompatActivity {
    static int chocoCake;
    static int cheeseCake;
    static int cookie = 0;
    Button btnChocoInc, btnChocoDec, btnCheeseInc, btnCheeseDec, btnCookieInc, btnCookieDec;
    TextView txtChoco , txtCheese , txtCookie;
    static float chocoPrice;
    static float cheesePrice;
    static float cookiePrice = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deserts);
        btnChocoInc = (Button) findViewById(R.id.increment_chococake);
        btnChocoDec = (Button) findViewById(R.id.decrement_chococake);
        btnCheeseInc = (Button) findViewById(R.id.increment_cheesecake);
        btnCheeseDec = (Button) findViewById(R.id.decrement_cheesecake);
        btnCookieInc = (Button) findViewById(R.id.increment_cookie);
        btnCookieDec = (Button) findViewById(R.id.decrement_cookie);
        txtChoco = (TextView) findViewById(R.id.chococake_quantity_text_view) ;
        txtCheese = (TextView) findViewById(R.id.cheesecake_quantity_text_view) ;
        txtCookie = (TextView) findViewById(R.id.cookie_quantity_text_view) ;


        btnChocoInc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                chocoCake =increment(chocoCake);
                chocoPrice = (float) (chocoCake * 2.00);
                txtChoco.setText("" + chocoCake);
                System.out.println(chocoPrice);
            }
        });
        btnChocoDec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                chocoCake = decrement(chocoCake);
                txtChoco.setText("" + chocoCake);
                chocoPrice = (float) (chocoCake * 2.00);

            }
        });

        btnCheeseInc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cheeseCake = increment(cheeseCake);
                txtCheese.setText("" + cheeseCake);
                cheesePrice = (float) (cheeseCake * 2.00);

            }
        });
        btnCheeseDec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cheeseCake = decrement(cheeseCake);
                txtCheese.setText("" + cheeseCake);
                cheesePrice = (float) (cheeseCake * 2.00);

            }
        });

        btnCookieInc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cookie = increment(cookie);
                txtCookie.setText("" + cookie);
                cookiePrice = (float) (cookie * 3.25);

            }
        });
        btnCookieDec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               cookie=  decrement(cookie);
                txtCookie.setText("" + cookie);
                cookiePrice = (float) (cookie * 3.25);

            }
        });


    }


    public static int increment(int quantity) {


        quantity = quantity +1;
        return quantity;


    }

    public static int decrement(int quantity) {


        quantity = quantity -1;
        if (quantity < 0) {
            quantity = 0;

        }
        return quantity;

    }


}
