package com.bignerdranch.android.photogallery;

import android.app.IntentService;
import android.content.Intent;
import android.support.annotation.Nullable;
import android.util.Log;

/**
 * Created by kim-un-yong on 2018. 3. 2..
 */

public class PollService extends IntentService {
    private static final String TAG = "PollService";


//    public static Intent newIntent(Context context) {
////        return newIntent(context, PollService.class);
//    }

    public PollService() {
        //디폴트 생성자 생성
        super(TAG);
    }

    @Override
    protected void onHandleIntent(@Nullable Intent intent) {
        Log.i(TAG, "Received an intent: " + intent);
    }
}
