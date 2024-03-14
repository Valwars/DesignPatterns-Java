package Behavioral.Memento;

import java.util.Deque;
import java.util.LinkedList;

public class Editor {

    private Deque<TextArea.Memento> stateHistory;
    private TextArea textArea;

    public Editor() {
        this.textArea = new TextArea();
        this.stateHistory = new LinkedList<>();
    }

    public String getTextArea() {
        return textArea.getText();
    }

    public void write(String text) {
        textArea.set(text);
        stateHistory.add(textArea.takeSnapshot());
    }

    public void undo(){
        textArea.restore(stateHistory.pop());
    }
}
