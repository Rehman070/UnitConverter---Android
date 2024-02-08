package com.example.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button convert;
    TextView textView;
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        convert = findViewById(R.id.convert_button);
        textView = findViewById(R.id.result);
        editText = findViewById(R.id.editText_kilogram);

        convert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String user_input = editText.getText().toString();
                    double convert_user_input = Double.parseDouble(user_input);

                    double cal_result = convert_user_input * 2.205;

                    textView.setText("" + Math.round(cal_result));
                } catch (NumberFormatException e) {
                    Toast.makeText(getApplicationContext(),"Invalid Input", Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}