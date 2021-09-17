package com.example.week3_demo1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {
int i =0;
    TextView mTextView3;
    Button button1;
    Button button2;
    Button button3;
    Button button4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTextView3 = (TextView)findViewById(R.id.tv1);
        mTextView3.setOnClickListener(new MyLstnr());

        button1 = (Button)findViewById(R.id.btn1);
        button1.setOnClickListener(view ->{
            button1.setTextSize(14+i++);
        });

        button2 = (Button)findViewById(R.id.btn2);
        button2.setOnClickListener(this::showToast);

        button3 = (Button)findViewById(R.id.btn3);
        button3.setOnClickListener((new Button3Listener()));

        button4 = (Button)findViewById(R.id.btn4);



    }

    private void showToast(View view) {
        Toast.makeText(MainActivity.this, "Bryan Hennes", Toast.LENGTH_LONG).show();

    }

    private void changeTheSiz(View view) {
        //mTextView3.setTextSize(14+i++);
    }

    public void showSnackBar(View view) {
        Snackbar sb = Snackbar.make(view, "This is a snack bar", Snackbar.LENGTH_LONG);
        sb.show();
    }

    class MyLstnr implements View.OnClickListener{

        @Override
        public void onClick(View view) {
            Toast.makeText(MainActivity.this, "Bryan Hennes", Toast.LENGTH_LONG).show();

            Snackbar sb = Snackbar.make(view, "Hennes, Bryan", Snackbar.LENGTH_LONG);
            sb.show();
        }
    }

    class Button3Listener implements View.OnClickListener{

        @Override
        public void onClick(View view) {
            button3.setTextColor(135);
        }
    }

    @Override
    protected void onStart(){
        super.onStart();


    }
}