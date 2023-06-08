package com.example.repro_keypad_bug;

import io.flutter.embedding.android.FlutterActivity;

public class MainActivity extends FlutterActivity {
  @Override
  public String getCachedEngineId() {
    return "foo";
  }
}
