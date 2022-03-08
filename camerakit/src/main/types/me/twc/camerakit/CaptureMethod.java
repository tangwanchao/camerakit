package me.twc.camerakit;


import static me.twc.camerakit.CameraKit.Constants.METHOD_STANDARD;
import static me.twc.camerakit.CameraKit.Constants.METHOD_STILL;

import android.support.annotation.IntDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.SOURCE)
@IntDef({METHOD_STANDARD, METHOD_STILL})
public @interface CaptureMethod {
}
