package com.example.pizzahut;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class salad extends AppCompatActivity {
    static int salad =0;
    Button btnSaladInc , btnSaladDec;
    TextView txtSalad;
    static float saladPrice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_salad);

        btnSaladInc =(Button)findViewById(R.id.increment_salad);
        btnSaladDec = (Button)findViewById(R.id.decrement_salad);
        txtSalad = (TextView)findViewById(R.id.salad_quantity_text_view);

        btnSaladInc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                salad =increment(salad);
                saladPrice = (float) (salad* 3.75);
                txtSalad.setText("" + salad);
            }
        });

        btnSaladDec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                salad =decrement(salad);
                saladPrice = (float) (salad* 3.75);
                txtSalad.setText("" + salad);
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
