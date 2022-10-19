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
		Note lastnote = new Note(1,name, message, null,null,null,null,null,0);
		historyService.storeNoteMessage(lastnote);
	}
	
	public List<Note> retrieveAllCourses(){
		return historyService.getNoteHistory();
	}
	
	public void showNotes() {
		List<Note> lista = retrieveAllCourses();
		for(Note n : lista){
			System.out.println(n.toString());
		}
	}
}
