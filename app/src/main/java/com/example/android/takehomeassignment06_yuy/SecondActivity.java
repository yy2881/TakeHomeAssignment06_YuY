package com.example.android.takehomeassignment06_yuy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    TextView total_view;
    TextView tax_view;
    TextView tip_view;
    TextView grand_total_view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        total_view = findViewById(R.id.total);
        tax_view = findViewById(R.id.tax);
        tip_view= findViewById(R.id.tip);
        grand_total_view = findViewById(R.id.grand_total);

        Intent intent = getIntent();
        Receipt newReceipt = (Receipt) intent.getSerializableExtra(Keys.RECEIPT);

        double total = newReceipt.getAmount();
        double tax =newReceipt.getTax_percentage()* total;
        double tip = newReceipt.getTip_percentage()* total;
        total_view.setText(String.valueOf(total));
        tax_view.setText(String.valueOf(tax));
        tip_view.setText(String.valueOf(tip));
        grand_total_view.setText(String.valueOf(total+tip+tax));

        this.setTitle("Your Receipt");
    }
}
