package com.example.target_iit_jee_neeet;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;

public class weightage extends AppCompatActivity {
 SeekBar marksbarp,marksbarc,marksbarm;
 TextView mdp,mdc,mdm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weightage);
        marksbarp=findViewById(R.id.marksbarp);
        marksbarc=findViewById(R.id.marksbarc);
        marksbarm=findViewById(R.id.marksbarm);
        mdp=findViewById(R.id.mdp);
        mdc=findViewById(R.id.mdc);
        mdm=findViewById(R.id.mdm);
        mdp.setVisibility(View.GONE);
        mdc.setVisibility(View.GONE);
        mdm.setVisibility(View.GONE);
        marksbarp.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                mdp.setVisibility(View.VISIBLE);
                mdp.setText(String.valueOf(i));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
        marksbarc.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                mdc.setVisibility(View.VISIBLE);
                mdc.setText(String.valueOf(i));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
        marksbarm.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                mdm.setVisibility(View.VISIBLE);
                mdm.setText(String.valueOf(i));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }
}