package com.zlp.zinlinphyo.exercise3;

import android.app.Application;
import android.content.Context;

/**
 * Created by zinlinphyo on 6/24/16.
 */
public class Exercise3App extends Application {

    public static Context context;

    @Override
    public void onCreate() {
        super.onCreate();
        context = getApplicationContext();
    }

    public static Context getContext() {
        return context;
    }
}
