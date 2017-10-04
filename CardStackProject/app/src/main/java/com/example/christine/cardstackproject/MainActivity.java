package com.example.christine.cardstackproject;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Collections;
import java.util.Stack;

public class MainActivity extends AppCompatActivity {

    private TextView topLeftLetterTextView;
    private TextView bottomRightLetterTextView;
    private ImageView topLeftSuitImageView;
    private ImageView bottomRightSuitImageView;
    private ImageView centerSuitImageView;
    Stack<Card> CardStack = new Stack<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        topLeftLetterTextView = (TextView) findViewById(R.id.tv_rightside_up_letter);
        bottomRightLetterTextView = (TextView) findViewById(R.id.tv_upside_down_letter);
        topLeftSuitImageView = (ImageView) findViewById(R.id.iv_rightside_up_suit);
        bottomRightSuitImageView = (ImageView) findViewById(R.id.iv_upside_down_suit);
        centerSuitImageView = (ImageView) findViewById(R.id.iv_center_suit);


        for (int i=1; i<=13; ++i)
        {
            for (int j=1;j<=4;++j) {
                CardStack.push(new Card(j, i));
            }
        }
        Collections.shuffle(CardStack);
        nextCard();
    }

    public void onClickScreen(View view)
    {
        nextCard();
    }

    public void nextCard()
    {
        if(CardStack.size()==0)
        {
            finish();
        }
        else{
            Card currentCard = CardStack.pop();
            int cardNumber = currentCard.getNumber();
            int cardSuit = currentCard.getSuit();
            if(cardSuit== 1)
            {
                topLeftLetterTextView.setTextColor(Color.RED);
                bottomRightLetterTextView.setTextColor(Color.RED);
                bottomRightSuitImageView.setBackgroundResource(R.drawable.ic_heart);
                topLeftSuitImageView.setBackgroundResource(R.drawable.ic_heart);
                centerSuitImageView.setBackgroundResource(R.drawable.ic_heart);
            }
            else if (cardSuit==2)
            {
                topLeftLetterTextView.setTextColor(Color.RED);
                bottomRightLetterTextView.setTextColor(Color.RED);
                bottomRightSuitImageView.setBackgroundResource(R.drawable.ic_diamond);
                topLeftSuitImageView.setBackgroundResource(R.drawable.ic_diamond);
                centerSuitImageView.setBackgroundResource(R.drawable.ic_diamond);
            }
            else if (cardSuit==3)
            {
                topLeftLetterTextView.setTextColor(Color.BLACK);
                bottomRightLetterTextView.setTextColor(Color.BLACK);
                bottomRightSuitImageView.setBackgroundResource(R.drawable.ic_spade);
                topLeftSuitImageView.setBackgroundResource(R.drawable.ic_spade);
                centerSuitImageView.setBackgroundResource(R.drawable.ic_spade);
            }
            else
            {
                topLeftLetterTextView.setTextColor(Color.BLACK);
                bottomRightLetterTextView.setTextColor(Color.BLACK);
                bottomRightSuitImageView.setBackgroundResource(R.drawable.ic_club);
                topLeftSuitImageView.setBackgroundResource(R.drawable.ic_club);
                centerSuitImageView.setBackgroundResource(R.drawable.ic_club);
            }

            if (cardNumber==1)
            {
                topLeftLetterTextView.setText("A");
                bottomRightLetterTextView.setText("A");
            }
            else if (cardNumber<11)
            {
                String stringCardNumber = Integer.toString(cardNumber);
                topLeftLetterTextView.setText(stringCardNumber);
                bottomRightLetterTextView.setText(stringCardNumber);
            }

            else if(cardNumber==11)
            {
                topLeftLetterTextView.setText("J");
                bottomRightLetterTextView.setText("J");
            }
            else if(cardNumber==12)
            {
                topLeftLetterTextView.setText("Q");
                bottomRightLetterTextView.setText("Q");
            }
            else
            {
                topLeftLetterTextView.setText("K");
                bottomRightLetterTextView.setText("K");
            }

        }
    }
}
