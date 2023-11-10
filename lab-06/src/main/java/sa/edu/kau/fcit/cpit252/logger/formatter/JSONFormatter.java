package sa.edu.kau.fcit.cpit252.logger.formatter;


public class JSONFormatter extends FormatDecorator {

    public JSONFormatter(BaseLogger logger){
        super.logger = logger;
    }

    public String getLabel() {
        return super.logger.getLabel() + ", JSONFormatter";
    }


    public String getLevel() {
        return "Info " + super.logger.getLevel();
    }
}