package com.example.target_iit_jee_neeet;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.lang.reflect.Array;

public class percentileresult extends AppCompatActivity {
    TextView pres, range,rank,marks,difficult,remark;
    ImageView iv;
    double[] k = new double[320];
    double a = 0.8980000, b = 46.123, c = 88.67, d = 96.23, e = 98.71, f = 99.012, g = 99.75, h;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_percentileresult);
        pres = findViewById(R.id.pres);
        range = findViewById(R.id.range);
        rank=findViewById(R.id.rank);
        marks=findViewById(R.id.marks);
        difficult=findViewById(R.id.difficult);
        remark=findViewById(R.id.remark);
        iv=findViewById(R.id.iv);
        String percentile = getIntent().getStringExtra("percentile");
        String n = getIntent().getStringExtra("level");
        int p = Integer.parseInt(percentile);
        int j=0;
        for(j=300;j<320;j++)
        {
            k[j]=100.000000;
        }
        if (p > 300) {
            Toast.makeText(this, "Please enter valid marks", Toast.LENGTH_SHORT).show();
            percentileresult.this.finish();
        } else {
            for (int i = 0; i < 305; i++) {
                if (i <= 50) {
                    a += 0.898;
                    k[i] = a;
                } else if (i <= 100) {
                    b += 0.867;
                    k[i] = b;
                } else if (i <= 150) {
                    c += 0.149;
                    k[i] = c;
                } else if (i <= 180) {
                    d += 0.0821;
                    k[i] = d;
                } else if (i <= 210) {
                    e += 0.00999;
                    k[i] = e;
                } else if (i <= 250) {
                    f += 0.0177;
                    k[i] = f;
                } else if (i <= 280) {
                    g += 0.00787;
                    k[i] = g;
                } else if (i > 280) {
                    h = 100.00000;
                    k[i] = h;
                }
            }
            if (p<75)
            {
                remark.setText("Need Improvement!!");
                iv.setImageResource(R.drawable.ic_baseline_sentiment_very_dissatisfied_24);
            }
            else if(p<150)
            {
                remark.setText("satisfactory!!");
                iv.setImageResource(R.drawable.ok);
            }
            else if(p<=200)
            {
                remark.setText("Good!!");
                iv.setImageResource(R.drawable.happy2);
            }
            else if(p>200)
            {
                remark.setText("Excellent!!");
                iv.setImageResource(R.drawable.happy);
            }
            marks.setText(String.valueOf(p)+"/300");
            if (n.equalsIgnoreCase("Easy")) {
                difficult.setText("Easy");
                String co = String.valueOf(k[p]).substring(0,5);
                pres.setText(co);
                if(p==0)
                {
                    range.setText("0.898-0.103");
                    rank.setText("1100000");
                }
                else {
                    range.setText(String.valueOf(k[p - 1]).substring(0, 5) + " - " + String.valueOf(k[p + 1]).substring(0, 5));
                    rank.setText(result(k[p + 1], k[p - 1]));
                }
            } else if (n.equalsIgnoreCase("Medium")) {
                difficult.setText("Medium");
                String co = String.valueOf(k[p + 10]).substring(0,5);
                pres.setText(co);
                range.setText( String.valueOf(k[p +9]).substring(0,5) + " - " + String.valueOf(k[p +11]).substring(0,5));
                rank.setText(result(k[p+11],k[p+9]));
            } else if (n.equalsIgnoreCase("Hard")) {
                difficult.setText("Hard");
                String co = String.valueOf(k[p + 15]).substring(0,5);
                pres.setText(co);
                range.setText(String.valueOf(k[p + 14]).substring(0,5) + " - " + String.valueOf(k[p + 16]).substring(0,5));
                rank.setText(result(k[p+16],k[p+14]));
            } else {
                percentileresult.this.finish();
            }
        }
    }

    public String result( double a, double b)
    {
        double res1= ((100-a)/100*1100000);
        double res2= ((100-b)/100*1100000);
        if(res1==00||res2==00)
        {
            res1=1.0;
            res2=5.0;
        }
        return String.valueOf((int)res1)+"-"+String.valueOf((int)res2);

    }


}
