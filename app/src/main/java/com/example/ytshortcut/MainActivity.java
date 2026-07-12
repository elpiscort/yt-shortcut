package com.example.ytshortcut;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        try {
            Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://m.youtube.com"));
            i.setPackage("com.opera.browser");
            startActivity(i);
        } catch (Exception e) {
            Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://m.youtube.com"));
            startActivity(i);
        }
        finish();
    }
}
