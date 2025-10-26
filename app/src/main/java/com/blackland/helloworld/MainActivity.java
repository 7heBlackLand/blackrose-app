package com.blackland.helloworld;
import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TextView tv = new TextView(this);
        tv.setText("Welcome to The Black Land - Hello World");
        tv.setTextSize(24); tv.setPadding(20,50,20,50);
        setContentView(tv);
    }
}
