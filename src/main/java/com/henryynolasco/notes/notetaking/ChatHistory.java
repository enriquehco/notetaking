package com.henryynolasco.notes.notetaking;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class ChatHistory {
	List<Note> chatHistory = new LinkedList<>();

    public void storeChatMessage(Note chatString) {
        chatHistory.add(chatString);
    }

    public List<Note> getChatHistory() {
        return Collections.unmodifiableList(chatHistory);
    }
    
    public int getLength() {
    	return chatHistory.size();
    }
}
