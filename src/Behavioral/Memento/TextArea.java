package Behavioral.Memento;

public class TextArea {

    private String text;

    public void set(String text) {
        this.text = text;
    }

    public Memento takeSnapshot() {
        return new Memento(text);
    }

    public void restore(Memento memento) {
        this.text = memento.getSavedText();
    }

    public String getText() {
        return text;
    }

    public static class Memento{
        private final String text;

        private Memento(String textToSave) {
            this.text = textToSave;
        }

        private String getSavedText() {
            return text;
        }
    }

}
