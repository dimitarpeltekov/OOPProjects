package SOLID;

import SOLID.impl.ConsoleAppender;
import SOLID.impl.MessageLogger;
import SOLID.impl.SimpleLayout;
import SOLID.interfaces.Appender;
import SOLID.interfaces.Layout;
import SOLID.interfaces.Logger;

public class Test {
    public static void main(String[] args) {
        Layout simpleLayout = new SimpleLayout();
        Appender consoleAppender = new ConsoleAppender(simpleLayout);
        Logger logger = new MessageLogger(consoleAppender);

        logger.logError("3/26/2015 2:08:11 PM", "Error parsing JSON.");
        logger.logInfo("3/26/2015 2:08:11 PM", "User Pesho successfully registered.");



    }


}
