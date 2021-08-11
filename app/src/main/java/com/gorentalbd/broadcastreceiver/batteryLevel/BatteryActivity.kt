package com.gorentalbd.broadcastreceiver.batteryLevel

import android.content.BroadcastReceiver
import android.content.Intent
import android.content.IntentFilter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.gorentalbd.broadcastreceiver.R
import kotlinx.android.synthetic.main.activity_batterylevel.*

class BatteryActivity : AppCompatActivity() {
    private lateinit var batteryReceiver: BatteryReceiver

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_batterylevel)

        batteryReceiver = BatteryReceiver(tvBatteryLevel)
    }

    override fun onResume() {
        super.onResume()
        registerReceiver(batteryReceiver, IntentFilter(Intent.ACTION_BATTERY_CHANGED))
    }

    override fun onStop() {
        super.onStop()
        unregisterReceiver(batteryReceiver)
    }
}