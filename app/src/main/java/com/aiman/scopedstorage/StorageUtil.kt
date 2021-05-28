package com.aiman.scopedstorage

import android.os.Build

inline fun <T> sdk29AndUp(onSDK29: () -> T): T? {
    // if we're running on SDK 29 and above run the lambda function
    return if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
        onSDK29()
    } else null
}