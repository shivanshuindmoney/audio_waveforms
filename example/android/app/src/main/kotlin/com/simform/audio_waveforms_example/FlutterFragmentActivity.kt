package com.simform.audio_waveforms_example

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import io.flutter.embedding.android.FlutterFragment

class FlutterFragmentActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        
        if (savedInstanceState == null) {
            val flutterFragment = FlutterFragment.withNewEngine()
                .build<FlutterFragment>()
            
            supportFragmentManager
                .beginTransaction()
                .add(android.R.id.content, flutterFragment, "flutter_fragment")
                .commit()
        }
    }
}

