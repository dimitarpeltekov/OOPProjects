package SOLID.impl;

import SOLID.enums.ReportLevel;
import SOLID.interfaces.Appender;
import SOLID.interfaces.Logger;

import java.util.Arrays;

public class MessageLogger implements Logger {
    private Appender[] appenders;

    public MessageLogger(Appender... appender){
        this.appenders = appender;
    }


    @Override
    public void logInfo(String time, String message) {
        Arrays.stream(appenders).forEach(appender->appender.append(time,message, ReportLevel.INFO));
    }

    @Override
    public void logWarning(String time, String message) {
        Arrays.stream(appenders).forEach(appender->appender.append(time,message, ReportLevel.WARNING));

    }

    @Override
    public void logError(String time, String message) {
        Arrays.stream(appenders).forEach(appender->appender.append(time,message, ReportLevel.ERROR));
    }

    @Override
    public void logCritical(String time, String message) {
        Arrays.stream(appenders).forEach(appender->appender.append(time,message, ReportLevel.CRITICAL));

    }

    @Override
    public void logFatal(String time, String message) {
        Arrays.stream(appenders).forEach(appender->appender.append(time,message, ReportLevel.FATAL));

    }
}
