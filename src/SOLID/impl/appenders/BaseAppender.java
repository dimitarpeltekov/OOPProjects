package SOLID.impl.appenders;

import SOLID.enums.ReportLevel;
import SOLID.interfaces.Appender;
import SOLID.interfaces.Layout;
import com.sun.source.tree.BreakTree;

public abstract class BaseAppender implements Appender {
    private static final ReportLevel DEFAULT_REPORT_LEVEL = ReportLevel.INFO;

    Layout layout;
    private ReportLevel reportLevel;
    private int messagesCount;

    public BaseAppender(Layout layout) {
        this(layout,DEFAULT_REPORT_LEVEL);
    }
    public BaseAppender(Layout layout,ReportLevel reportLevel) {
        this.layout = layout;
        this.reportLevel =reportLevel;
        this.messagesCount  = 0;
    }

    public void setReportLevel(ReportLevel reportLevel) {
        this.reportLevel = reportLevel;
    }

    public boolean canAppend(ReportLevel reportLevel){

        return this.reportLevel.ordinal()<= reportLevel.ordinal();
    }

    @Override
    public void append(String time, String message, ReportLevel reportLevel) {

    }

    public void increaseMessagesCount(){
        this.messagesCount++;
    }

    @Override
    public String toString() {
        return String.format("Appender type: %s, Layout type: %s, Report level: %s, Messages appended: %d",this.getClass().getSimpleName(),this.layout.getClass().getSimpleName(),
                this.reportLevel,this.messagesCount) ;
    }
}
