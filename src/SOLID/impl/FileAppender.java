package SOLID.impl;

import SOLID.enums.ReportLevel;
import SOLID.interfaces.Appender;

public class FileAppender implements Appender {
    @Override
    public void append(String time, String message, ReportLevel reportLevel) {
        //append to file;
    }
}
