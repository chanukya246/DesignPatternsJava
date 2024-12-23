package com.java.demo.behavioural.memento;

// Undo Mechanism
public class MementoPattern {

    public static void main(String[] args) {
        Document document = new Document();
        DocumentHistory history = new DocumentHistory();

        document.setContent("Hello");
        document.setFontName("Arial");
        document.setFontSize(12);
        history.push(document.createState());

        document.setContent("Hello World");
        document.setFontName("Arial");
        document.setFontSize(12);
        history.push(document.createState());

        document.setContent("Hello World!!");
        document.setFontName("Arial");
        document.setFontSize(12);
        history.push(document.createState());

        document.restore(history.pop());
        System.out.println(document.getContent());
        document.restore(history.pop());
        System.out.println(document.getContent());
        document.restore(history.pop());
        System.out.println(document.getContent());
    }

}
