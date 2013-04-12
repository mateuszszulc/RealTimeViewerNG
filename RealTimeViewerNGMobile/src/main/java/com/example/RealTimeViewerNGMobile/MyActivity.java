package com.example.RealTimeViewerNGMobile;

import android.app.Activity;
import android.os.Bundle;
import org.springframework.web.client.RestTemplate;

public class MyActivity extends Activity {
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        RestTemplate restTemplate;
        setContentView(R.layout.main);
    }
}
