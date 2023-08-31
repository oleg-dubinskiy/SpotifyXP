package com.spotifyxp.stabilizer;

import com.spotifyxp.exception.ExceptionDialog;
import com.spotifyxp.logging.ConsoleLogging;
import com.spotifyxp.panels.ContentPanel;
import com.spotifyxp.utils.GraphicalMessage;

import java.net.UnknownHostException;

public class GlobalExceptionHandler implements Thread.UncaughtExceptionHandler {
    @Override
    public void uncaughtException(Thread thread, Throwable throwable) {
        ConsoleLogging.Throwable(throwable);
        throwable.printStackTrace();
        ExceptionDialog.open(throwable);
    }
}
