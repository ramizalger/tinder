package com.example.user.startcardview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.wenchao.cardstack.CardStack;

public class MainActivity extends AppCompatActivity implements CardStack.CardEventListener {

    private CardStack card_stack;
    private CardAdapter card_adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initImages();

        card_stack = (CardStack)findViewById(R.id.card_stack);
        card_stack.setContentResource(R.layout.card_layout);
        card_stack.setStackMargin(20); //écartement au niveau des stacks
        card_stack.setAdapter(card_adapter);

        card_stack.setListener(this);
    }

    private void initImages() {
        card_adapter= new CardAdapter(getApplicationContext(),0);
        card_adapter.add(R.drawable.brook);
        card_adapter.add(R.drawable.chooper);
        card_adapter.add(R.drawable.luffy1);
        card_adapter.add(R.drawable.nami);
        card_adapter.add(R.drawable.zoro);

    }


    @Override
    public boolean swipeEnd(int i, float v) {
        return (v>300)?true:false;
    }

    @Override
    public boolean swipeStart(int i, float v) {
        return false;
    }

    @Override
    public boolean swipeContinue(int i, float v, float v1) {
        return false;
    }

    @Override
    public void discarded(int i, int i1) {

    }

    @Override
    public void topCardTapped() {

    }
}
