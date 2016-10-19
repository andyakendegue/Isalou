package com.isalou;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;



public class SplashActivity extends AppCompatActivity {

    private static int SPLASH_TIME_OUT;

    /* renamed from: com.appli.ilink.SplashActivity.1 */
    class Splash implements Runnable {
        Splash() {
        }

        public void run() {
            SplashActivity.this.startActivity(new Intent(SplashActivity.this, LoginActivity.class));
            SplashActivity.this.finish();
        }
    }

    static {
        SPLASH_TIME_OUT = 3000;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        new Handler().postDelayed(new Splash(), (long) SPLASH_TIME_OUT);
    }
}
