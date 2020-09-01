package com.example.pizzahut;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class drinks extends AppCompatActivity {
    static int pepsi;
    static int seven;
    static int mirinda;
    Button btnPepsiInc, btnPepsiDec, btnSevenInc, btnSevenDec, btnMirindaInc, btnMirindaDec;
    TextView txtPepsi , txtSeven , txtMirinda;
    static float pepsiPrice;
    static float sevenPrice;
    static float mirindaPrice = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drinks);
        btnPepsiInc = (Button) findViewById(R.id.increment_pepsi);
        btnSevenInc= (Button) findViewById(R.id.increment_seven);
        btnSevenDec = (Button) findViewById(R.id.decrement_seven);
        btnPepsiDec = (Button) findViewById(R.id.decrement_pepsi);
        btnMirindaInc = (Button) findViewById(R.id.increment_mirinda);
        btnMirindaDec = (Button) findViewById(R.id.decrement_mirinda);
        txtPepsi = (TextView) findViewById(R.id.pepsi_quantity_text_view) ;
        txtSeven= (TextView) findViewById(R.id.seven_quantity_text_view) ;
        txtMirinda = (TextView) findViewById(R.id.mirinda_quantity_text_view) ;



        btnPepsiInc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pepsi =increment(pepsi);
                pepsiPrice = (float) (pepsi * 0.90);
                txtPepsi.setText("" + pepsi);
                System.out.println(pepsiPrice);
            }
        });

        btnPepsiDec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pepsi =decrement(pepsi);
                pepsiPrice = (float) (pepsi * 0.90);
                txtPepsi.setText("" + pepsi);
                System.out.println(pepsiPrice);
            }
        });

        btnSevenInc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                seven =increment(seven);
                sevenPrice = (float) (seven * 0.90);
                txtSeven.setText("" + seven);
            }
        });

        btnSevenDec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                seven =decrement(seven);
                sevenPrice = (float) (seven * 0.90);
                txtSeven.setText("" + seven);

            }
        });
        btnMirindaInc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mirinda=increment(mirinda);
                mirindaPrice = (float) (mirinda * 0.90);
                txtMirinda.setText(" " +mirinda);

            }
        });

        btnMirindaDec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mirinda=decrement(mirinda);
                mirindaPrice = (float) (mirinda * 0.90);
                txtMirinda.setText(" " +mirinda);

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
