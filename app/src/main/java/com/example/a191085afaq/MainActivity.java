package com.example.a191085afaq;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    ImageView Afaqlogo191085;
    TextView Afaqservices191085,Afaqelec191085,Afaqplumb191085,Afaqmech191085,Afaqcarp191085,Afaqdesc191085,Afaqstatus191085,Afaqnote191085;
    Animation anim01,anim02;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Afaqcarp191085 = findViewById(R.id.tv_carpenter);
        Afaqplumb191085 = findViewById(R.id.tv_plumber);
        Afaqservices191085 = findViewById(R.id.tv_services);
        Afaqelec191085 = findViewById(R.id.tv_electrician);
        Afaqmech191085 = findViewById(R.id.tv_mechanic);
        Afaqlogo191085 = findViewById(R.id.img_logo);
        Afaqdesc191085 = findViewById(R.id.tv_desc);
        Afaqstatus191085 = findViewById(R.id.tv_status);
        Afaqnote191085 = findViewById(R.id.tv_note);

        anim01 = AnimationUtils.loadAnimation(MainActivity.this, R.anim.anim_text);
        Afaqelec191085.startAnimation(anim01);
        Afaqplumb191085.startAnimation(anim01);
        Afaqmech191085.startAnimation(anim01);
        Afaqcarp191085.startAnimation(anim01);
        Afaqservices191085.startAnimation(anim01);
        
        anim02 = AnimationUtils.loadAnimation(MainActivity.this, R.anim.anim_bottomtotop);
        Afaqdesc191085.startAnimation(anim02);
        Afaqstatus191085.startAnimation(anim02);
        Afaqnote191085.startAnimation(anim02);
        Afaqlogo191085.startAnimation(anim02);

    }
}