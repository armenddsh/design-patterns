package com.shala.momento;

public class Main {
    public static void main(String[] args) {
        DocumentHistory history = new DocumentHistory();

        Document document = new Document("Armend", "Arial", "12px");
        System.out.println(document);

        DocumentSnapshot state1 = document.saveState();
        document.setContent("Mendi");
        System.out.println(document);
        DocumentSnapshot state2 = document.saveState();

        history.add(state1);
        history.add(state2);

        System.out.println("UNDO");
        document.restoreState(history.getPrevious());
        System.out.println(document);
        System.out.println("UNDO");
        document.restoreState(history.getPrevious());
        System.out.println(document);
        System.out.println("UNDO");
        document.restoreState(history.getPrevious());
        System.out.println(document);
    }
}
