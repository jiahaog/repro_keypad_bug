package com.example.repro_keypad_bug;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public final class FooActivity extends Activity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);

    try {
      // Without this, the repro rate is much lower.
      Thread.sleep(2000);
    } catch (InterruptedException e) {
      throw new RuntimeException(e);
    }

    startActivity(new Intent(this, MainActivity.class));
    finish();
  }
}
