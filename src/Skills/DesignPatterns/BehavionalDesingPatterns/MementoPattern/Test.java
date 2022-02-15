package Skills.DesignPatterns.BehavionalDesingPatterns.MementoPattern;

public class Test {


    int rollno;
    String name;
    static String college = "ITS";
    //static method to change the value of static variable
    static void change(){
        college = "BBDIT";
    }
    //constructor to initialize the variable

    //method to display values
    void display(){
        college = "";
        System.out.println(rollno+" "+name+" "+college);}

    public static void main (String args[]) {
        /*Editor editor = new Editor();
        editor.write("Aybike");
        System.out.print(editor.getText()+" ");
        editor.write("Aydemir"+" ");
        System.out.print(editor.getText());
        editor.undo();
        System.out.print(editor.getText());
*/
        String a ="aybike";
        String b=a+"aydemir";
        String c ="aybikeaydemir";
        String ab ="aybikeaydemir";
        System.out.println(a);
        System.out.println(b);
        System.out.println(ab);
        System.out.println(ab==b);
        System.out.println(ab==c);

    }
}
