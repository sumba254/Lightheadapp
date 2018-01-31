package com.example.dansumba.lightheadapp;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RelativeLayout bgElement = (RelativeLayout)
                findViewById(R.id.activity_main);
        bgElement.setBackgroundColor(Color.WHITE);//sets the background to white
        myButtonListenerMethod();//calls the listener method
    }

    public void myButtonListenerMethod(){
        button=(Button)findViewById(R.id.button);
        button.setOnClickListener(new
              View.OnClickListener() {
                  @Override
                  public void onClick(View v) {
                      RelativeLayout bgElement=(RelativeLayout)findViewById(R.id.activity_main);
                      int color = ((ColorDrawable)bgElement.getBackground()).getColor();
                      if(color == Color.RED){
                          bgElement.setBackgroundColor(Color.BLUE);
                      } else {
                          bgElement.setBackgroundColor(Color.RED);
                      }

                  }
              });

    }
}
