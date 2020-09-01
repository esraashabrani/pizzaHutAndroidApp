package com.example.pizzahut;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class starters extends AppCompatActivity {
    static int garlicBread;
    static int trio;
    static int rolls;
    static int sticks =0;
    Button btnGarlicInc , btnGarlicDec , btnTrioInc , btnTrioDec , btnRollsInc  , btnRollsDec ,  btnSticksInc , btnSticksDec;
    TextView txtGarlic , txtTrio, txtRolls , txtSticks ;
    static float garlicPrice;
    static float trioPrice;
    static float rollsPrice;
    static float sticksPrice;
    static int starters_quantity;
    static String starters_names;
    static float starters_price;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_starters);

        btnGarlicInc =(Button)findViewById(R.id.increment_garlic);
        btnGarlicDec =(Button)findViewById(R.id.decrement_garlic);

        btnTrioInc =(Button)findViewById(R.id.increment_trio);
        btnTrioDec =(Button)findViewById(R.id.decrement_trio);

        btnRollsInc = (Button)findViewById(R.id.increment_rolls);
        btnRollsDec = (Button)findViewById(R.id.decrement_rolls);

        btnSticksInc = (Button)findViewById(R.id.increment_mozzarilla);
        btnSticksDec = (Button)findViewById(R.id.decrement_mozzarilla);

        txtGarlic = (TextView) findViewById(R.id.garlic_quantity_text_view);
        txtTrio = (TextView) findViewById(R.id.trio_quantity_text_view);
        txtRolls = (TextView) findViewById(R.id.rolls_quantity_text_view);
        txtSticks = (TextView) findViewById(R.id.mozzarilla_quantity_text_view);

        btnGarlicInc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                garlicBread =increment(garlicBread);
                garlicPrice = (float) (garlicBread * 3.25);
                System.out.println(garlicPrice);
                txtGarlic.setText("" + garlicBread);
            }
        });

        btnGarlicDec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                garlicBread =decrement(garlicBread);
                garlicPrice = (float) (garlicBread * 3.25);
                txtGarlic.setText("" + garlicBread);
            }
        });

        btnTrioInc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                trio =increment(trio);
                trioPrice = (float) (trio * 3.25);
                txtTrio.setText("" + trio);
            }
        });

        btnTrioDec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                trio =decrement(trio);
                trioPrice = (float) (trio * 3.25);
                txtTrio.setText("" + trio);
            }
        });

        btnRollsInc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rolls =increment(rolls);
                rollsPrice = (float) (rolls * 3.25);
                txtRolls.setText("" +rolls);
            }
        });
        btnRollsDec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rolls =decrement(rolls);
                rollsPrice = (float) (rolls * 3.25);
                txtRolls.setText("" +rolls);
            }
        });
        btnSticksInc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sticks =increment(sticks);
                sticksPrice = (float) (sticks * 3.25);
                txtSticks.setText("" +sticks);
            }
        });
        btnSticksDec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sticks =decrement(sticks);
                sticksPrice = (float) (sticks* 3.25);
                txtSticks.setText("" +sticks);
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
