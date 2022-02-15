package Skills.DesignPatterns.BehavionalDesingPatterns.TemplateMethodPattern;

public class Test {

    public static void main(String[] args) {

        ExcelFile excelFile = new ExcelFile();
        excelFile.parseAndSaveData();
        //excelFile.readData();
        // excelFile.processData();
       // excelFile.processData();

        TextFile textFile = new TextFile();
        textFile.parseAndSaveData();
        //textFile.readData();
       // textFile.processData();
       // textFile.processData();

        //1.sorun: Bu sıra ile çağrılması gerekiyor. Bunu maine bırakma!
        //2.sorun: Dublicate ettin


    }
}
