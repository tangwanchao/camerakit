package me.twc.camerakit.demo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import me.twc.camerakit.CameraView;


public class MainActivity extends AppCompatActivity {

    private CameraView mCameraView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mCameraView = findViewById(R.id.camera_kit);
        findViewById(R.id.btn_take).setOnClickListener(v -> mCameraView.captureImage(event -> {
            File photoFile = new File(getCacheDir(), "tcbang" + System.currentTimeMillis() + ".jpeg");
            try {
                new FileOutputStream(photoFile).write(event.getJpeg());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }));
    }

    @Override
    protected void onResume() {
        super.onResume();
        startPreview();
    }

    @Override
    protected void onPause() {
        stopPreview();
        super.onPause();
    }

    private void startPreview() {
        try {
            mCameraView.start();
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    private void stopPreview() {
        try {
            mCameraView.stop();
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}