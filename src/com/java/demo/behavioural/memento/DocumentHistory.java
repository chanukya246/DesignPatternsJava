package com.java.demo.behavioural.memento;

import java.util.ArrayList;
import java.util.List;

public class DocumentHistory {
    private List<DocumentState> states = new ArrayList<>();

    public void push (DocumentState state) {
        states.add(state);
    }

    public DocumentState pop() {
        int lastIndex = states.size() - 1;
        DocumentState state = states.get(lastIndex);
        states.remove(lastIndex);
        return state;
    }



}
