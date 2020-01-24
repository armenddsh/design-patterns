package com.shala.momento;

public class Document { // Originator
    private String content;
    private String fontName;
    private String fontSize;

    public Document() {
    }

    public Document(String content, String fontName, String fontSize) {
        this.content = content;
        this.fontName = fontName;
        this.fontSize = fontSize;
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

    public String getFontSize() {
        return fontSize;
    }

    public void setFontSize(String fontSize) {
        this.fontSize = fontSize;
    }

    public DocumentSnapshot saveState() {
        return new DocumentSnapshot(content, fontName, fontSize);
    }

    public void restoreState(DocumentSnapshot snapshot) {
        if (snapshot == null) return;
        
        this.fontName = snapshot.getFontName();
        this.content = snapshot.getContent();
        this.fontSize = snapshot.getFontSize();
    }

    @Override
    public String toString() {
        return "Document{" +
                "content='" + content + '\'' +
                ", fontName='" + fontName + '\'' +
                ", fontSize='" + fontSize + '\'' +
                '}';
    }
}
