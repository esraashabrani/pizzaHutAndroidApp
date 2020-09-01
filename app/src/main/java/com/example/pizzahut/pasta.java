package com.example.pizzahut;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class pasta extends AppCompatActivity {
    static int lasagna;
    static int chickenPasta = 0;
    Button btnLasagnaInc , btnLasagnaDec , btnChickenPastaInc , btnChickenPastaDec ;
    TextView txtLasagna , txtChickenPasta ;
    static float lasagnaPrice;
    static float chickenPastaPrice  = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pasta);

        btnLasagnaInc = (Button) findViewById(R.id.increment_lasagna);
        btnLasagnaDec = (Button) findViewById(R.id.decrement_lasagna);

        btnChickenPastaInc = (Button) findViewById(R.id.increment_pasta);
        btnChickenPastaDec = (Button) findViewById(R.id.decrement_pasta);

        txtLasagna = (TextView)findViewById(R.id.lasagna_quantity_text_view);

        txtChickenPasta=(TextView)findViewById(R.id.pasta_quantity_text_view);



        btnLasagnaInc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                lasagna =increment(lasagna);
                lasagnaPrice = (float) (lasagna * 3.25);
                txtLasagna.setText("" + lasagna);
            }
        });
        btnLasagnaDec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                lasagna =decrement(lasagna);
                lasagnaPrice = (float) (lasagna * 3.25);
                txtLasagna.setText("" + lasagna);
            }
        });

        btnChickenPastaInc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                chickenPasta =increment(chickenPasta);
                chickenPastaPrice = (float) (chickenPasta * 3.00);
                txtChickenPasta.setText("" + chickenPasta);
            }
        });

        btnChickenPastaDec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                chickenPasta =decrement(chickenPasta);
                chickenPastaPrice = (float) (chickenPasta * 3.00);
                txtChickenPasta.setText("" + chickenPasta);
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
