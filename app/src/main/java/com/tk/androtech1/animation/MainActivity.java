package com.tk.androtech1.animation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

     private ImageView iv_ball;

     private Animation mRotation;
     private Animation mScale;
     private Animation mTranslate;
     private Animation mAlpha;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        iv_ball= (ImageView) findViewById(R.id.iv_ball);
    }

    public  void scaleAnimation(View view){
        mScale= AnimationUtils.loadAnimation(this,R.anim.scale_anim);
        iv_ball.startAnimation(mScale);
    }

    public  void rotateAnimation(View view){
        mRotation= AnimationUtils.loadAnimation(this,R.anim.rotate_anim);
        iv_ball.startAnimation(mRotation);
    }

    public  void alphaAnimation(View view){
        mAlpha= AnimationUtils.loadAnimation(this,R.anim.alpha_anim);
        iv_ball.startAnimation(mAlpha);
    }
    public  void translateAnimation(View view){
        mTranslate= AnimationUtils.loadAnimation(this,R.anim.translate_anim);
        iv_ball.startAnimation(mTranslate);
    }

}
