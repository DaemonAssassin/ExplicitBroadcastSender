package com.gmail.mateendev3.dynamicbr;

import androidx.appcompat.app.AppCompatActivity;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.os.Bundle;
import android.widget.TextView;

import java.security.Security;

public class MainActivity extends AppCompatActivity {
    TextView tvSendBroadcast;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvSendBroadcast = findViewById(R.id.tv_send_broadcast);
        tvSendBroadcast.setOnClickListener(v -> {
            Intent intent = new Intent();
            ComponentName name = new ComponentName(
                    "com.gmail.mateendev3.receiverapp",
                    "com.gmail.mateendev3.receiverapp.MyBRRec"
            );
            intent.setComponent(name);
            sendBroadcast(intent);
        });
    }
}