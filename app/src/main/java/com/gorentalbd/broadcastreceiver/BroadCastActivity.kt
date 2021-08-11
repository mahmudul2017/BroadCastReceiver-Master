package com.gorentalbd.broadcastreceiver

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.gorentalbd.broadcastreceiver.airPlaneMode.AirPlaneActivity
import com.gorentalbd.broadcastreceiver.batteryLevel.BatteryActivity
import kotlinx.android.synthetic.main.activity_broadcast.*

class BroadCastActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_broadcast)

        btnBatteryLevel.setOnClickListener {
            startActivity(Intent(this, BatteryActivity::class.java))
        }

        btnAirPlaneModel.setOnClickListener {
            startActivity(Intent(this, AirPlaneActivity::class.java))
        }
    }
}