package com.gorentalbd.broadcastreceiver.batteryLevel

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.TextView
import android.widget.Toast

class BatteryReceiver internal constructor(var tv: TextView): BroadcastReceiver() {

    override fun onReceive(context: Context?, intent: Intent?) {
        var percentage = intent?.getIntExtra("level", 0)

        if (percentage != null) {
            tv.text = "Battery Charge Level : ${percentage}%"
        }
    }
}