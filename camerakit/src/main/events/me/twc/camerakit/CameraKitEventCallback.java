package me.twc.camerakit;

public interface CameraKitEventCallback<T extends CameraKitEvent> {
    void callback(T event);
}
