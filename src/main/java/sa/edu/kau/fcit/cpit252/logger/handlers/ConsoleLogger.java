package sa.edu.kau.fcit.cpit252.logger.handlers;

public class ConsoleLogger {
    public ConsoleLogger() {
        super.label = "Console logger";
    }
    @Override
    public String getLevel() {
        return "info";
    }
}