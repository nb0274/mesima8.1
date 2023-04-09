package com.example.mesima81;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
    Button btn;
    ToggleButton toggleButton1;
    Switch switch1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn;
        btn = (Button)findViewById(R.id.btn);
        toggleButton1 = (ToggleButton)findViewById(R.id.toggleButton1);
        switch1 = (Switch)findViewById(R.id.switch1);


    }

    public void clicker(View view) {
        boolean con1 = toggleButton1.isChecked();
        boolean con2 = switch1.isChecked();

        if(con1 && con2){
            setActivityBackgroundColor(Color.YELLOW);
        }
        if(!(con1) && !(con2)){
            setActivityBackgroundColor(Color.MAGENTA);
        }
        if(!(con1) && con2){
            setActivityBackgroundColor(Color.GREEN);
        }
        if(con1 && !(con2)){
            setActivityBackgroundColor(Color.CYAN);
        }


    }

    public void setActivityBackgroundColor(int color) {
        View view = this.getWindow().getDecorView();
        view.setBackgroundColor(color);
    }
}