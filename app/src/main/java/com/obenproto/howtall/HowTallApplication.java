package com.obenproto.howtall;

import android.app.Application;

import com.obenproto.howtall.api.HowTallAPIClient;

/**
 * Created by Petro Rington on 12/21/2015.
 */

public class HowTallApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        HowTallAPIClient.init();
    }
}
