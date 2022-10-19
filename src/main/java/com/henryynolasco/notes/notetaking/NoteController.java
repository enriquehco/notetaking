package com.henryynolasco.notes.notetaking;

import java.lang.reflect.Constructor;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class NoteController {

	@Autowired
    ChatHistory historyService;
	
	public NoteController() {
		this.historyService = new ChatHistory();
	}

	public void insertNote(String name, String message) {
		int notenumber = historyService.getLength() + 1;
		Note lastnote = new Note(notenumber,name, message, null,null,null,null,null,0);
		historyService.storeChatMessage(lastnote);
	}
	
	public List<Note> retrieveAllNotes(){
		return historyService.getChatHistory();
	}
	
	public void showNotes() {
		List<Note> lista = retrieveAllNotes();
		for(Note n : lista){
			System.out.println(n.toString());
		}
	}
}
