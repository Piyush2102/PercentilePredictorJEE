package com.example.target_iit_jee_neeet;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    ImageView ppi;
    TextView ppt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ppi=findViewById(R.id.ppi);
        ppt=findViewById(R.id.ppt);
        ppi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,com.example.target_iit_jee_neeet.PercentilePredictor.class);
                startActivity(intent);
            }
        });
        ppt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,com.example.target_iit_jee_neeet.PercentilePredictor.class);
                startActivity(intent);
            }
        });
    }
}