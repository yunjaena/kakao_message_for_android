package com.koreatech.kakao_message_for_android;

import android.app.Application;
import android.content.Context;

import com.kakao.auth.IApplicationConfig;
import com.kakao.auth.KakaoAdapter;
import com.kakao.auth.KakaoSDK;

public class KaKaoMessageApplication extends Application {
    private Context applicationContext;

    @Override
    public void onCreate() {
        super.onCreate();
        this.applicationContext = this;
        init();
    }

    private void init(){
        KakaoSDK.init(new KakaoAdapter() {
            @Override
            public IApplicationConfig getApplicationConfig() {
                return () -> KaKaoMessageApplication.this;
            }
        });
    }
}
