package me.twc.camerakit;


import static me.twc.camerakit.CameraKit.Constants.FLASH_AUTO;
import static me.twc.camerakit.CameraKit.Constants.FLASH_OFF;
import static me.twc.camerakit.CameraKit.Constants.FLASH_ON;
import static me.twc.camerakit.CameraKit.Constants.FLASH_TORCH;

import android.support.annotation.IntDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.SOURCE)
@IntDef({FLASH_OFF, FLASH_ON, FLASH_AUTO, FLASH_TORCH})
public @interface Flash {
}