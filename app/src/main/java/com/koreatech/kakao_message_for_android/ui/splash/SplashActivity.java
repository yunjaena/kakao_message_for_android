package com.koreatech.kakao_message_for_android.ui.splash;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.annotation.Nullable;

import com.koreatech.core.activity.ActivityBase;
import com.koreatech.kakao_message_for_android.R;
import com.koreatech.kakao_message_for_android.ui.main.MainActivity;

public class SplashActivity extends ActivityBase {
    public static String TAG = "SplashActivity";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        new Handler().postDelayed(() -> startActivity(new Intent(SplashActivity.this, MainActivity.class)), 1000);
    }
}
