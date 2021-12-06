package SOLID.impl;

import SOLID.enums.ReportLevel;
import SOLID.interfaces.Appender;
import SOLID.interfaces.Layout;

public class ConsoleAppender implements Appender {
    Layout layout;

    public ConsoleAppender(Layout layout) {
        this.layout = layout;
    }

    @Override
    public void append(String time, String message, ReportLevel reportLevel) {
        String formattedMessage = this.layout.format(time,message,reportLevel);
        System.out.println(formattedMessage);
    }
}
