package com.example.repro_keypad_bug;

import android.app.Application;
import io.flutter.embedding.engine.FlutterEngine;
import io.flutter.embedding.engine.FlutterEngineCache;
import io.flutter.embedding.engine.dart.DartExecutor.DartEntrypoint;

public final class MainApplication extends Application {

  @Override
  public void onCreate() {
    super.onCreate();
    FlutterEngine engine = new FlutterEngine(this, null, /* automaticallyRegisterPlugins= */ false);
    FlutterEngineCache cache = FlutterEngineCache.getInstance();

    engine.getDartExecutor().executeDartEntrypoint(DartEntrypoint.createDefault());

    cache.put("foo", engine);
  }
}
