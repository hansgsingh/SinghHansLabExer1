package com.example.singhhanslabexer1;

import android.app.IntentService;
import android.content.Intent;
import android.util.Log;

public class MyService extends IntentService {
    public MyService() {
        super("MyService");
    }

    @Override
    protected void onHandleIntent(Intent intent) {
        Log.d("Places","UST FIELD");
        Log.d("Places","Lovers Lane");
        Log.d("Places","Arch Of The Century");
        Log.d("Places","UST Main Building");
    }
}
