package com.henryynolasco.notes.notetaking;

import java.lang.reflect.Constructor;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class NoteController {

	@Autowired
    NoteHistory historyService;
	
	public NoteController() {
		this.historyService = new NoteHistory();
	}

	public void insertNote(String name, String message) {
		int notenumber = historyService.getLength() + 1;
		Note lastnote = new Note(notenumber,name, message, null,null,null,null,null,0);
		historyService.storeNoteMessage(lastnote);
	}
	
	public List<Note> retrieveAllNotes(){
		return historyService.getNoteHistory();
	}
	
	public void showNotes() {
		List<Note> lista = retrieveAllNotes();
		for(Note n : lista){
			System.out.println(n.toString());
		}
	}
	
	public int getNumberNotes() {
		return historyService.getLength();
	}
}
