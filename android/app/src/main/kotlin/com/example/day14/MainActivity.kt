package com.example.day14

import android.os.Bundle

import io.flutter.app.FlutterActivity
import io.flutter.plugins.GeneratedPluginRegistrant

package com.your_package_name

import io.flutter.embedding.android.FlutterActivity

class MainActivity: FlutterActivity() {
}
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    GeneratedPluginRegistrant.registerWith(this)
  }
}
