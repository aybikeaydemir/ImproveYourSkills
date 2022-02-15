package Skills.DesignPatterns.BehavionalDesingPatterns.TemplateMethodPattern;

public class ExcelFile extends DataProcessor {
    

    public void readData(){
        System.out.println("Excel File Read Data");
    }
    public void processData(){
        System.out.println("Excel File Processing Data");
    }
    public void saveData(){
        System.out.println("Excel File Saved Db");
    }

}
