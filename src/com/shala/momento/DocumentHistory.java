package com.shala.momento;

import java.util.LinkedList;

public class DocumentHistory { // StateCare
    private LinkedList<DocumentSnapshot> snapshots = new LinkedList<>();

    public void add(DocumentSnapshot snapshot) {
        snapshots.add(snapshot);
    }

    public DocumentSnapshot getPrevious() {
        return snapshots.pollLast();
    }
}
