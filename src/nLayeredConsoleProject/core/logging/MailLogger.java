package nLayeredConsoleProject.core.logging;

public class MailLogger implements Logger{
    @Override
    public void log() {
        System.out.println("data mail ile kaydedildi");
    }
}
