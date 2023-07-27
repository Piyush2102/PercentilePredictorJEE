package com.example.target_iit_jee_neeet;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class PercentilePredictor extends AppCompatActivity {
    EditText percentile;
    RadioButton radiobutton,hard,easy,medium;
    Button btns;
    RadioGroup tough;
 int x;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_percentile_predictor);
        percentile = findViewById(R.id.percentile);
        hard=findViewById(R.id.hard);
        medium=findViewById(R.id.medium);
        easy=findViewById(R.id.easy);
        btns = findViewById(R.id.btns);
        tough = findViewById(R.id.tough);
        btns.setOnClickListener(view -> {
            if (percentile.getText().toString().isEmpty()) {
                Toast.makeText(PercentilePredictor.this, "please enter valid number!!", Toast.LENGTH_SHORT).show();
            }
            else {
                Intent intent = new Intent(PercentilePredictor.this, percentileresult.class);
                intent.putExtra("percentile", percentile.getText().toString().trim());
                    if(easy.isChecked())
                    intent.putExtra("level", easy.getText().toString());
               else if(medium.isChecked())
                    intent.putExtra("level", medium.getText().toString());
               else if(hard.isChecked())
                    intent.putExtra("level", hard.getText().toString());
               else {
                        Toast.makeText(this, "select difficulty level", Toast.LENGTH_SHORT).show();
                        intent.putExtra("level", "error");
                    }
               startActivity(intent);
                }
        });
    }
}

