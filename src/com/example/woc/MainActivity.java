package com.example.woc;

import android.R.string;
import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        Button butt = (Button) findViewById(R.id.Butt);
        
        final EditText start = (EditText) findViewById(R.id.editText1);
        
        final TextView p40 = (TextView) findViewById(R.id.p40);
        final TextView p50 = (TextView) findViewById(R.id.p50);
        final TextView p60 = (TextView) findViewById(R.id.p60);
        final TextView p65 = (TextView) findViewById(R.id.p65);
        final TextView p70 = (TextView) findViewById(R.id.p70);
        final TextView p75 = (TextView) findViewById(R.id.p75);
        final TextView p80 = (TextView) findViewById(R.id.p80);
        final TextView p85 = (TextView) findViewById(R.id.p85);
        final TextView p90 = (TextView) findViewById(R.id.p90);
        final TextView p95 = (TextView) findViewById(R.id.p95);
        
        
        butt.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				String a;
				double weight;
				
				//for 40
				a = start.getText().toString();
				weight = Double.parseDouble(a);
				weight = (weight/100)*40;
				weight = Math.round(weight *100);
				weight = weight/100;
				a = Double.toString(weight);
				p40.setText("40% is "+a);
				
				//for 50
				a = start.getText().toString();
				weight = Double.parseDouble(a);
				weight = (weight/100)*50;
				weight = Math.round(weight *100);
				weight = weight/100;
				a = Double.toString(weight);
				p50.setText("50% is "+a);
				
				//for 60
				a = start.getText().toString();
				weight = Double.parseDouble(a);
				weight = (weight/100)*60;
				weight = Math.round(weight *100);
				weight = weight/100;
				a = Double.toString(weight);
				p60.setText("60% is "+a);
				
				//for 65
				a = start.getText().toString();
				weight = Double.parseDouble(a);
				weight = (weight/100)*65;
				weight = Math.round(weight *100);
				weight = weight/100;
				a = Double.toString(weight);
				p65.setText("65% is "+a);
				
				//for 70
				a = start.getText().toString();
				weight = Double.parseDouble(a);
				weight = (weight/100)*70;
				weight = Math.round(weight *100);
				weight = weight/100;
				a = Double.toString(weight);
				p70.setText("70% is "+a);
				
				//for 75
				a = start.getText().toString();
				weight = Double.parseDouble(a);
				weight = (weight/100)*75;
				weight = Math.round(weight *100);
				weight = weight/100;
				a = Double.toString(weight);
				p75.setText("75% is "+a);
				
				//for 80
				a = start.getText().toString();
				weight = Double.parseDouble(a);
				weight = (weight/100)*80;
				weight = Math.round(weight *100);
				weight = weight/100;
				a = Double.toString(weight);
				p80.setText("80% is "+a);
				
				//for 85
				a = start.getText().toString();
				weight = Double.parseDouble(a);
				weight = (weight/100)*85;
				weight = Math.round(weight *100);
				weight = weight/100;
				a = Double.toString(weight);
				p85.setText("85% is "+a);
				
				//for 90
				a = start.getText().toString();
				weight = Double.parseDouble(a);
				weight = (weight/100)*90;
				weight = Math.round(weight *100);
				weight = weight/100;
				a = Double.toString(weight);
				p90.setText("90% is "+a);
				
				//for 95
				a = start.getText().toString();
				weight = Double.parseDouble(a);
				weight = (weight/100)*95;
				weight = Math.round(weight *100);
				weight = weight/100;
				a = Double.toString(weight);
				p95.setText("95% is "+a);
				
			}
		});
        
       
        
    }


   
}