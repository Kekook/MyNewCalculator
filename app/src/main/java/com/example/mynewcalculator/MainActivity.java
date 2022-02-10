package com.example.mynewcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    private CalculatorModel calculator;
    private TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        int[] numbersId = new int[]{
                R.id.zero,
                R.id.one,
                R.id.two,
                R.id.three,
                R.id.four,
                R.id.five,
                R.id.six,
                R.id.seven,
                R.id.eight,
                R.id.nine,


        };
        int [] actionsId = new int[] {
                R.id.plus,
                R.id.minus,
                R.id.divide,
                R.id.multiply,
                R.id.equals

        };
        text = findViewById(R.id.text);
        calculator = new CalculatorModel();
        View.OnClickListener numberButtonClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculator.onNumPress(view.getId());
                text.setText(calculator.getText());

            }
        };
        View.OnClickListener actionsButtonOnClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculator.onActionsPressed(view.getId());
                text.setText(calculator.getText());

            }
        };
        for (int i = 0; i < numbersId.length; i++) {
            findViewById(numbersId[i]).setOnClickListener(numberButtonClickListener);

        }
        for (int i = 0;  i < actionsId.length  ; i++) {
            findViewById(actionsId[i]).setOnClickListener(actionsButtonOnClickListener);
            
        }
    }


}