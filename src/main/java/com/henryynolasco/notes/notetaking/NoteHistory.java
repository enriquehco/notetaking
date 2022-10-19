package com.henryynolasco.notes.notetaking;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class NoteHistory {
	List<Note> noteHistory = new LinkedList<>();

    public void storeNoteMessage(Note noteString) {
    	noteHistory.add(noteString);
    }

    public List<Note> getNoteHistory() {
        return Collections.unmodifiableList(noteHistory);
    }
    
    public int getLength() {
    	return noteHistory.size();
    }
}

