package me.twc.camerakit;


import static me.twc.camerakit.CameraKit.Constants.FOCUS_CONTINUOUS;
import static me.twc.camerakit.CameraKit.Constants.FOCUS_OFF;
import static me.twc.camerakit.CameraKit.Constants.FOCUS_TAP;
import static me.twc.camerakit.CameraKit.Constants.FOCUS_TAP_WITH_MARKER;

import android.support.annotation.IntDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.SOURCE)
@IntDef({FOCUS_CONTINUOUS, FOCUS_TAP, FOCUS_OFF, FOCUS_TAP_WITH_MARKER})
public @interface Focus {
}