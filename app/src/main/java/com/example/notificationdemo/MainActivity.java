package com.example.notificationdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openNotification(View view) {
        NotificationManagerCompat manager = NotificationManagerCompat.from(this);

        NotificationCompat.Builder notification = new NotificationCompat.Builder(this);
        notification.setContentTitle("1 new message");
        notification.setContentText("How is it going?");
        notification.setSmallIcon(android.R.drawable.ic_btn_speak_now);

        Intent i1 = new Intent(this, MainActivity.class);
        PendingIntent pd = PendingIntent.getActivity(this, 1, i1, 0);
        notification.setContentIntent(pd);
        notification.setAutoCancel(true);

        manager.notify(1, notification.build());
        finish();
    }
}