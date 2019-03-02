package com.example.android.takehomeassignment06_yuy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText amount_view;
    EditText tax_p_view;
    EditText tip_p_view;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        amount_view = findViewById(R.id.amount);
        tax_p_view = findViewById(R.id.tax);
        tip_p_view = findViewById(R.id.tip);
    }

    public void submit(View view){
        double amount = Double.valueOf(amount_view.getText().toString());
        double tax_p = Double.valueOf(tax_p_view.getText().toString());
        double tip_p = Double.valueOf(tip_p_view.getText().toString());
        Receipt r = new Receipt(amount,tax_p,tip_p);

        Intent intent = new Intent(MainActivity.this,SecondActivity.class);
        intent.putExtra(Keys.RECEIPT,r);
        startActivity(intent);
    }
}
