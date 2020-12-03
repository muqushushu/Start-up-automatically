package com.example.statebarandnavigationbarhide_demo;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

/**
 * @auther eerdunsang
 * @date 2020/12/3
 * @time 9:39.
 */
public class MyReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Log.i("tag", "onReceive: "+"广播调起来了");
        String ACTION = "android.intent.action.BOOT_COMPLETED";
        String action = intent.getAction();
        if (action.equals(ACTION)){
            Intent i = new Intent(context, MainActivity.class);
            i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            context.startActivity(i);
            Log.i("tag", "onReceive: "+"通过广播监听权限启动项目");
        }
    }
}
