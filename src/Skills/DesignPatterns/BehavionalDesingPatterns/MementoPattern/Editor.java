package Skills.DesignPatterns.BehavionalDesingPatterns.MementoPattern;

import java.util.Stack;

public class Editor {

    private Stack<TextArea.Memento> stateHistory;
    private TextArea textArea;

    Editor(){
        this.stateHistory =  new Stack<>();
        this.textArea = new TextArea();
    }
    public String write(String text){
        textArea.set(text);
        stateHistory.push(textArea.takeSnapShot());
        return text;
    }

    public void undo(){
        textArea.restore(stateHistory.pop());
    }

    public TextArea.Memento getText(){
        return stateHistory.peek();
    }
}
