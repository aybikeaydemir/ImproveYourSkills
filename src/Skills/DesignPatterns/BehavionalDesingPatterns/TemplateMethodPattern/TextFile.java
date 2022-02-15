package Skills.DesignPatterns.BehavionalDesingPatterns.TemplateMethodPattern;

public class TextFile extends DataProcessor {

    public void readData(){
        System.out.println("Text File Read Data");
    }
    public void processData(){
        System.out.println("Text File Processing Data");
    }
    public void saveData(){
        System.out.println("Text File Saved Db");
    }



}



