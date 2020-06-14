package com.example.covid_19;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button button1, button2, button3, button4, button5;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1 = (Button) findViewById(R.id.InfoButton);
        button2 = (Button) findViewById(R.id.SymptomButton);
        button3 = (Button) findViewById(R.id.StatisticsButton);
        button4 = (Button) findViewById(R.id.PreventionButton);
        button5 = (Button) findViewById(R.id.TreatmentButton);

        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
    }

    public void onClick(View v) {

        if (v.getId() == R.id.InfoButton) {
            Intent intent = new Intent(this, SecondActivity.class);
            startActivity(intent);

        } else if (v.getId() == R.id.SymptomButton) {
            Intent intent = new Intent(this, ThirdActivity.class);
            startActivity(intent);

        } else if (v.getId() == R.id.StatisticsButton) {
            Intent intent = new Intent(this, FourthActivity.class);
            startActivity(intent);

        } else if (v.getId() == R.id.PreventionButton) {
            Intent intent = new Intent(this, FifthActivity.class);
            startActivity(intent);

        } else if (v.getId() == R.id.TreatmentButton) {
            Intent intent = new Intent(this, SixthActivity.class);
            startActivity(intent);
        }
    }
}



        /*button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openNewActivity();
            }
        });
    }
    public void openNewActivity()
    {
        Intent intent = new Intent(this, SecondActivity.class);
        startActivity(intent);
    }*/
