package Skills.DesignPatterns.BehavionalDesingPatterns.TemplateMethodPattern;

public abstract class DataProcessor {

    public void parseAndSaveData(){
        readData();
        processData();
        saveData();
    }

    public abstract void readData();
    public abstract void processData();
    public abstract void saveData();


}
