package com.example.pizzahut;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Menu extends AppCompatActivity {
    ImageView imgStarters , imgSalad ,imgPizza,imgpasta , imgDeserts,imgDrinks;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        imgStarters = (ImageView) findViewById(R.id.starters);
        imgSalad = (ImageView)findViewById(R.id.salads);
        imgPizza = (ImageView) findViewById(R.id.pizza);
        imgpasta = (ImageView) findViewById(R.id.pasta);
        imgDeserts = (ImageView) findViewById(R.id.deserts);
        imgDrinks = (ImageView) findViewById(R.id.drinks);
    }
        public void showStarters(View view){
            Intent intent = new Intent(this, starters.class);
            startActivity(intent);
        }

    public void showSalad(View view){
        Intent intent = new Intent(this, salad.class);
        startActivity(intent);
    }
    public void showPizza(View view){
        Intent intent = new Intent(this, pizza.class);
        startActivity(intent);
    }
    public void showPasta(View view){
        Intent intent = new Intent(this, pasta.class);
        startActivity(intent);
    }
    public void showDeserts(View view){
        Intent intent = new Intent(this, deserts.class);
        startActivity(intent);
    }
    public void showDrinks(View view){
        Intent intent = new Intent(this, drinks.class);
        startActivity(intent);
    }
    public void confirmOrder(View view){
        Intent intent = new Intent(this, confirmOrder.class);
        startActivity(intent);

    }
}

