package com.bignerdranch.android.photogallery;

import android.os.HandlerThread;
import android.util.Log;

/**
 * Created by kim-un-yong on 2018. 2. 27..
 */
//초기 스레드 코드
public class ThumbnailDownloader<T> extends HandlerThread {
    private static final String TAG = "ThumbnailDownloader";

    public ThumbnailDownloader() {
        super(TAG);
    }

    public void queueThumbnail(T target, String url) {
        Log.i(TAG, "Got a URL : " + url);
    }


}
