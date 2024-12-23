package com.java.demo.behavioural.memento;

public class Document {

    private String content;
    private String fontName;
    private int fontSize;

    public DocumentState createState() {
        return new DocumentState(content, fontName, fontSize);
    }

    public void restore(DocumentState state) {
        this.content = state.getContent();
        this.fontName = state.getFontName();
        this.fontSize = state.getFontSize();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getFontName() {
        return fontName;
    }

    public void setFontName(String fontName) {
        this.fontName = fontName;
    }

    public int getFontSize() {
        return fontSize;
    }

    public void setFontSize(int fontSize) {
        this.fontSize = fontSize;
    }
}
