package ro.pub.cs.systems.eim.Colocviu1_1;

import androidx.annotation.NonNull;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class Colocviu1_1MainActivity extends AppCompatActivity {

    Button North;
    Button West;
    Button East;
    Button South;
    Button SecondaryActivity;

    TextView text;
    String result = "";

    Integer nrCardinalPoints = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colocviu1_1_main);

        North = findViewById(R.id.north);
        West = findViewById(R.id.west);
        East = findViewById(R.id.east);
        South = findViewById(R.id.south);
        SecondaryActivity = findViewById(R.id.secondary_Activity_button);
        text = findViewById(R.id.result);

        North.setOnClickListener(it -> {
            result += "North";
            nrCardinalPoints++;
            text.setText(result);
        });

        West.setOnClickListener(it -> {
            result += "West";
            nrCardinalPoints++;
            text.setText(result);
        });

        East.setOnClickListener(it -> {
            result += "East";
            nrCardinalPoints++;
            text.setText(result);
        });

        South.setOnClickListener(it -> {
            result += "South";
            nrCardinalPoints++;
            text.setText(result);
        });

//        @Override
//        protected void onSaveInstanceState( Bundle outState) {
//            super.onSaveInstanceState(outState);
//
//            outState.putInt(Constants.NR_CARDINAL_POINTS, this.nrCardinalPoints);
//        }

//        @Override
//        protected void onRestoreInstanceState( Bundle savedInstanceState) {
//            super.onRestoreInstanceState(savedInstanceState);
//
//            nrCardinalPoints = savedInstanceState.getInt(Constants.NR_CARDINAL_POINTS);
//        }
    }
}