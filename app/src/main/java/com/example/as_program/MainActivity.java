package com.example.as_program;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private Button flip_btn;
    private ImageView coin_iv;
    private Random random;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        flip_btn=findViewById(R.id.flip_btn);
        coin_iv=findViewById(R.id.coin_iv);

        flip_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                flipCoin();
            }
        });

    }

        private void flipCoin(){
            random= new Random();
            int side=random.nextInt(2);

            if(side==1){
                coin_iv.setImageResource(R.drawable.heads);
                Toast.makeText(getApplicationContext(), "Heads",Toast.LENGTH_SHORT).show();
            }
            else if(side==0){
                coin_iv.setImageResource(R.drawable.tails);
                Toast.makeText(getApplicationContext(), "Tails",Toast.LENGTH_SHORT).show();


            }
        }
}
