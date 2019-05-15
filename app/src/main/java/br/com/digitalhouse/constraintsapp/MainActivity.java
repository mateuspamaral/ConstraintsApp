package br.com.digitalhouse.constraintsapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText editTextProductPrice;
    EditText editTextProductDiscount;
    Button buttonTotal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextProductPrice = findViewById(R.id.editTextProductPrice);
        editTextProductDiscount = findViewById(R.id.editTextProductDiscount);
        buttonTotal = findViewById(R.id.buttonTotal);

        buttonTotal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Double price = Double.parseDouble(editTextProductPrice.getText().toString());
                Integer discount = Integer.parseInt(editTextProductDiscount.getText().toString());

                Double total = price - (price * discount) / 100;

                Toast.makeText(MainActivity.this, "Valor com o desconto: " + total, Toast.LENGTH_SHORT).show();

            }
        });
    }
}
