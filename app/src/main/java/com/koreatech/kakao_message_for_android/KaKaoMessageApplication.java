package com.koreatech.kakao_message_for_android;

import android.app.Application;
import android.content.Context;

import com.kakao.sdk.common.KakaoSdk;

public class KaKaoMessageApplication extends Application {
    private Context applicationContext;

    @Override
    public void onCreate() {
        super.onCreate();
        this.applicationContext = this;
        init();
    }

    private void init(){
        KakaoSdk.init(applicationContext, applicationContext.getResources().getString(R.string.kakao_api_key));
    }
}
