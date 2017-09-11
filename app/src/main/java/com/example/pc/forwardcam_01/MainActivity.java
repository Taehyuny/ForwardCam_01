package com.example.pc.forwardcam_01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView image1,image2;
    ImageButton ib1, ib2;
    EditText text1, text2;
    Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        image1 = (ImageView) findViewById(R.id.camera);
        image2 = (ImageView) findViewById(R.id.main_title);
        ib1 = (ImageButton) findViewById(R.id.main_register);
        ib2 = (ImageButton) findViewById(R.id.main_forgotpw);
        text1 = (EditText) findViewById(R.id.main_id);
        text2 = (EditText) findViewById(R.id.main_pw);
        login = (Button) findViewById(R.id.login);

        final Animation tran = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.translate);
        final Animation show = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.showing);

        image1.startAnimation(tran);
        image2.startAnimation(tran);


        tran.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                ib1.setVisibility(ib1.VISIBLE);
                ib2.setVisibility(ib2.VISIBLE);
                text1.setVisibility(text1.VISIBLE);
                text2.setVisibility(text2.VISIBLE);
                ib1.startAnimation(show);
                ib2.startAnimation(show);
                text1.startAnimation(show);
                text2.startAnimation(show);
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });
    }
    public void onClickRegister_main (View v){
        Intent intent = new Intent(this, RegisterActivity.class);
        startActivity(intent);
    }
    public void onClickGo (View v){
        Intent intent = new Intent(this, SlideActivity.class);
        startActivity(intent);
    }

}
