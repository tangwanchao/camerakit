package me.twc.camerakit;

public class GooglePlayServicesUnavailableException extends Exception {
    public GooglePlayServicesUnavailableException() {
        super("Could not start text detection - Google Play Services Unavailable.");
    }
}
