package me.twc.camerakit;


import static me.twc.camerakit.CameraKit.Constants.VIDEO_QUALITY_1080P;
import static me.twc.camerakit.CameraKit.Constants.VIDEO_QUALITY_2160P;
import static me.twc.camerakit.CameraKit.Constants.VIDEO_QUALITY_480P;
import static me.twc.camerakit.CameraKit.Constants.VIDEO_QUALITY_720P;
import static me.twc.camerakit.CameraKit.Constants.VIDEO_QUALITY_HIGHEST;
import static me.twc.camerakit.CameraKit.Constants.VIDEO_QUALITY_LOWEST;
import static me.twc.camerakit.CameraKit.Constants.VIDEO_QUALITY_QVGA;

import android.support.annotation.IntDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.SOURCE)
@IntDef({VIDEO_QUALITY_QVGA, VIDEO_QUALITY_480P, VIDEO_QUALITY_720P, VIDEO_QUALITY_1080P, VIDEO_QUALITY_2160P, VIDEO_QUALITY_HIGHEST, VIDEO_QUALITY_LOWEST})
public @interface VideoQuality {
}
