package com.gorentalbd.broadcastreceiver.airPlaneMode

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast

class AirPlaneReceiver : BroadcastReceiver() {

    override fun onReceive(context: Context, intent: Intent) {
        val isAirPlaneModeEnabled = intent?.getBooleanExtra("state", false)

        if (isAirPlaneModeEnabled) {
            Toast.makeText(context, "AirPlane Mode Enabled...", Toast.LENGTH_LONG).show()
        } else {
            Toast.makeText(context, "AirPlane Mode Disabled...", Toast.LENGTH_LONG).show()
        }
    }
}