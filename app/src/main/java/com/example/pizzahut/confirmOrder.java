package com.example.pizzahut;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class confirmOrder extends AppCompatActivity {
    Button btnShowOrder;
    TextView txtQuantity , txtItemName , txtPrice , txtTotal;
    float total;
    String strQty , strItemName , strPrice;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirm_order);

        btnShowOrder=(Button)findViewById(R.id.showOrder);
        txtQuantity = (TextView)findViewById(R.id.qty);
        txtItemName = (TextView)findViewById(R.id.itemName);
        txtPrice = (TextView)findViewById(R.id.price);
        txtTotal = (TextView)findViewById(R.id.total);
    }

    public void showOrder(View view){

        strQty = ("" + starters.garlicBread+'\n' + starters.trio + '\n' + starters.rolls + '\n' + starters.sticks + '\n' +
                salad.salad + '\n' + pizza.pepperoni + '\n' +pizza.vegi + '\n' +pizza.grilled + '\n' + pizza.margherita + '\n' + pizza.fajita + '\n' +
                pasta.lasagna + '\n' + pasta.chickenPasta + '\n' + deserts.chocoCake + '\n'+deserts.cheeseCake + '\n' +deserts.cookie + '\n'+
                drinks.pepsi + '\n' + drinks.mirinda + '\n' +drinks.seven + '\n');
        strItemName = ("" + "Garlic Bread " + '\n' + "Trio Platter" + '\n' +"BBQ Rolls" + '\n' + "Mozzarella Sticks" +'\n'+
                "Salad Bar" +'\n' +"Pepperoni" + '\n' + "Vegetarian" +'\n' + "Grilled Chicken" +'\n' + "Margherita" + '\n' + "Chicken Fajita" +
                '\n' + "Lasagna" + '\n' + "Chicken Pasta" + '\n' + "Chocolate Cake" + '\n' + "Cheese Cake " + '\n' + "Cookie" +
                '\n' +"Pepsi"+'\n'+"Seven" + '\n' + "Mirinda");

        total = (starters.garlicPrice+ starters.trioPrice +  starters.rollsPrice +  starters.sticksPrice +
                salad.saladPrice +  pizza.pepperoniPrice + pizza.vegiPrice + pizza.grilledPrice +  pizza.margheritaPrice +  pizza.fajitaPrice +
                pasta.lasagnaPrice +  pasta.chickenPastaPrice +  deserts.chocoPrice + deserts.cheesePrice + deserts.cookiePrice +
                drinks.pepsiPrice +  drinks.mirindaPrice + drinks.sevenPrice  );
        strPrice = ("" + starters.garlicPrice+'\n' + starters.trioPrice + '\n' + starters.rollsPrice + '\n' + starters.sticksPrice + '\n' +
                salad.saladPrice + '\n' + pizza.pepperoniPrice + '\n' +pizza.vegiPrice + '\n' +pizza.grilledPrice + '\n' + pizza.margheritaPrice + '\n' + pizza.fajitaPrice + '\n' +
                pasta.lasagnaPrice + '\n' + pasta.chickenPastaPrice + '\n' + deserts.chocoPrice + '\n'+deserts.cheesePrice + '\n' +deserts.cookiePrice + '\n'+
                drinks.pepsiPrice + '\n' + drinks.mirindaPrice + '\n' +drinks.sevenPrice + '\n');



        txtQuantity.setText(strQty);
        txtItemName.setText(strItemName);
        txtPrice.setText(strPrice);
        txtTotal.setText("" + total);

    }

    public void sendEmail(View view) {
        String address = "esraashabrani@gmail.com";
        String subject = "Order Details";
        String emailBody = ("your order will received in 30 minutes " + '\n' +"Your Subtotal is :" + '\n' + total);
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
