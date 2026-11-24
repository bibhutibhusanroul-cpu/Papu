package com.selfie.guard

import android.app.admin.DeviceAdminReceiver
import android.content.Context
import android.content.Intent
import android.os.UserHandle
import androidx.core.content.ContextCompat

class MyDeviceAdminReceiver : DeviceAdminReceiver() {
    override fun onPasswordFailed(context: Context, intent: Intent, user: UserHandle) {
        super.onPasswordFailed(context, intent, user)
        val serviceIntent = Intent(context, SelfieCaptureService::class.java)
        ContextCompat.startForegroundService(context, serviceIntent)
    }
}
