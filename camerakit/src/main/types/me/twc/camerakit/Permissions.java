package me.twc.camerakit;


import static me.twc.camerakit.CameraKit.Constants.PERMISSIONS_LAZY;
import static me.twc.camerakit.CameraKit.Constants.PERMISSIONS_PICTURE;
import static me.twc.camerakit.CameraKit.Constants.PERMISSIONS_STRICT;

import android.support.annotation.IntDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.SOURCE)
@IntDef({PERMISSIONS_STRICT, PERMISSIONS_LAZY, PERMISSIONS_PICTURE})
public @interface Permissions {
}
