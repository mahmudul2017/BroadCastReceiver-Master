package com.gorentalbd.broadcastreceiver.airPlaneMode

import android.content.Intent
import android.content.IntentFilter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.gorentalbd.broadcastreceiver.R

class AirPlaneActivity : AppCompatActivity() {
    private lateinit var airPlaneReceiver: AirPlaneReceiver

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_airplane)

        airPlaneReceiver = AirPlaneReceiver()

        IntentFilter(Intent.ACTION_AIRPLANE_MODE_CHANGED).also {
            registerReceiver(airPlaneReceiver, it)
        }
    }

    override fun onStop() {
        super.onStop()
        unregisterReceiver(airPlaneReceiver)
    }
}
