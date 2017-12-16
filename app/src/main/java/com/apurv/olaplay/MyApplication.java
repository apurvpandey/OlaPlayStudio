package com.apurv.olaplay;

import android.app.Application;
import android.content.Context;

/**
 * Created by Apurv Pandey on 16/12/17.
 * mailapurvpandey@gmail.com
 * Contact No. - +91-8377887369
 */

public class MyApplication extends Application {

    private static MyApplication instance;

    public static MyApplication getInstance() {
        return instance;
    }

    public static Context getContext() {
        return instance.getApplicationContext();
    }

    @Override
    public void onCreate() {

        super.onCreate();
        instance = this;
    }
}
