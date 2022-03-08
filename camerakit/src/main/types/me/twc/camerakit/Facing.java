package me.twc.camerakit;


import static me.twc.camerakit.CameraKit.Constants.FACING_BACK;
import static me.twc.camerakit.CameraKit.Constants.FACING_FRONT;

import android.support.annotation.IntDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@IntDef({FACING_BACK, FACING_FRONT})
@Retention(RetentionPolicy.SOURCE)
public @interface Facing {
}