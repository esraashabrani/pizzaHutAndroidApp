package com.example.pizzahut;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class pizza extends AppCompatActivity {
    static int pepperoni;
    static int vegi;
    static int grilled;
    static int margherita;
    static int fajita = 0;
    Button btnPepperoniInc , btnPepperoniDec , btnvegiInc , btnvegiDec , btnGrilledInc ,
            btnGrilledDec , btnMargheritaInc ,btnMargheritaDec ,btnFajitaInc ,btnFajitaDec;
    TextView txtPepperoni , txtVegi , txtGrilled , txtMargherita , txtFajita;
    static float pepperoniPrice;
    static float vegiPrice;
    static float grilledPrice;
    static float margheritaPrice;
    static float fajitaPrice  = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pizza);

        btnPepperoniInc = (Button)findViewById(R.id.increment_pepperoni);
        btnPepperoniDec = (Button)findViewById(R.id.decrement_pepperoni);

        btnvegiInc = (Button)findViewById(R.id.increment_vegi);
        btnvegiDec = (Button)findViewById(R.id.decrement_vegi);

        btnGrilledInc = (Button)findViewById(R.id.increment_grilled);
        btnGrilledDec = (Button)findViewById(R.id.decrement_grilled);

        btnMargheritaInc = (Button)findViewById(R.id.increment_margarita);
        btnMargheritaDec = (Button)findViewById(R.id.decrement_margarita);

        btnFajitaInc = (Button)findViewById(R.id.increment_fajita);
        btnFajitaDec = (Button)findViewById(R.id.decrement_fajita);


        txtPepperoni = (TextView)findViewById(R.id.pepperoni_quantity_text_view);
        txtVegi = (TextView)findViewById(R.id.vegi_quantity_text_view);
        txtGrilled = (TextView)findViewById(R.id.grilled_quantity_text_view);
        txtMargherita =(TextView)findViewById(R.id.margarita_quantity_text_view);
        txtFajita = (TextView)findViewById(R.id.fajita_quantity_text_view);


        btnPepperoniInc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pepperoni =increment(pepperoni);
                pepperoniPrice = (float) (pepperoni* 3.25);
                txtPepperoni.setText(" " + pepperoni);
            }
        });

        btnPepperoniDec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pepperoni =decrement(pepperoni);
                pepperoniPrice = (float) (pepperoni* 3.25);
                txtPepperoni.setText(" " + pepperoni);
            }
        });

        btnvegiInc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                vegi =increment(vegi);
                vegiPrice = (float) (vegi* 3.25);
                txtVegi.setText(" " + vegi);
            }
        });
        btnvegiDec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                vegi =decrement(vegi);
                vegiPrice = (float) (vegi* 3.25);
                txtVegi.setText(" " + vegi);
            }
        });

        btnGrilledInc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                grilled =increment(grilled);
                grilledPrice = (float) (grilled* 3.25);
                txtGrilled.setText(" " + grilled);
            }
        });
        btnGrilledDec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                grilled =decrement(grilled);
                grilledPrice = (float) (grilled * 3.25);
                txtGrilled.setText(" " + grilled);
            }
        });

        btnMargheritaInc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                margherita =increment(margherita);
                margheritaPrice = (float) (margherita * 3.25);
                txtMargherita.setText(" " + margherita);
            }
        });

        btnMargheritaDec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                margherita =decrement(margherita);
                margheritaPrice = (float) (margherita * 3.25);
                txtMargherita.setText(" " + margherita);
            }
        });

        btnFajitaInc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fajita =increment(fajita);
                fajitaPrice = (float) (fajita * 3.25);
                txtFajita.setText(" " + fajita);
            }
        });

        btnFajitaDec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fajita =decrement(fajita);
                fajitaPrice = (float) (fajita * 3.25);
                txtFajita.setText(" " + fajita);
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
