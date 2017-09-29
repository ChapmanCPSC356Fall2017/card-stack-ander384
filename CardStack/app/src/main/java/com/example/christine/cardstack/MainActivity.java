package com.example.christine.cardstack;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Stack;

public class MainActivity extends AppCompatActivity {

    private TextView topLeftLetterTextView;
    private TextView bottomRightLetterTextView;
    private ImageView topLeftSuitImageView;
    private ImageView bottomRightSuitImageView;
    private ImageView centerSuitImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        topLeftLetterTextView = (TextView) findViewById(R.id.tv_rightside_up_letter);
        bottomRightLetterTextView = (TextView) findViewById(R.id.tv_upside_down_letter);
        topLeftSuitImageView = (ImageView) findViewById(R.id.iv_rightside_up_suit);
        bottomRightSuitImageView = (ImageView) findViewById(R.id.iv_upside_down_suit);
        centerSuitImageView= (ImageView) findViewById(R.id.iv_center_suit);

        Stack<Card> CardStack;



    }
}
