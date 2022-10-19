package com.henryynolasco.notes.notetaking;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class NoteHistory {
	List<Note> chatHistory = new LinkedList<>();

    public void storeNoteMessage(Note chatString) {
        chatHistory.add(chatString);
    }

    public List<Note> getNoteHistory() {
        return Collections.unmodifiableList(chatHistory);
    }
}
