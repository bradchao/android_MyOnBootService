package tw.brad.myonbootservice;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class MyReceiver extends BroadcastReceiver {
    public MyReceiver() {
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        Log.d("brad", "onReceive");
        Intent it = new Intent(context, MyService.class);
        context.startService(it);
    }
}
