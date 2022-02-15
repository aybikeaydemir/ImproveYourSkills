package Skills.DesignPatterns.BehavionalDesingPatterns.MementoPattern;

public class TextArea {

    private String text;

    public void set(String text){
        this.text = text;
    }

    public void restore(Memento memento){
        this.text = memento.getSavedText();
    }

    public  Memento takeSnapShot(){

        return new Memento(this.text);
    }

    public static class Memento{
        //snapshot of text

        private final String text;

        private Memento(String text) {

            this.text = text;
        }

        private String getSavedText(){

            return text;
        }

        @Override
        public String toString() {
            return text;
        }
    }

}
