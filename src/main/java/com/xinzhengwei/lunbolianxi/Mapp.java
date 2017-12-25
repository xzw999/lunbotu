package com.xinzhengwei.lunbolianxi;

import android.app.Application;

import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.ImageLoaderConfiguration;

/**
 * Created by 辛政维 on 2017/11/14.
 */

public class Mapp extends Application{

    @Override
    public void onCreate() {
        super.onCreate();
        ImageLoaderConfiguration configuration = new ImageLoaderConfiguration.Builder(this).build();

        ImageLoader.getInstance().init(configuration);
    }
}
