package com.nqmgaming.learnkmp

import platform.Foundation.NSLog
import platform.UIKit.UIDevice
import platform.UIKit.UIScreen

actual class Platform {
    actual val osName: String
        get() = UIDevice.currentDevice().systemName
    actual val osVersion: String
        get() = UIDevice.currentDevice().systemVersion
    actual val deviceModel: String
        get() = UIDevice.currentDevice().model
    actual val density: Int
        get() = UIScreen.mainScreen().scale.toInt()

    actual fun logSystemInfo() {
        NSLog("OS: $osName $osVersion")
        NSLog("Device: $deviceModel")
        NSLog("Density: $density")
    }

}