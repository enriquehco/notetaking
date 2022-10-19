package com.henryynolasco.notes.notetaking;
import java.util.Scanner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CommandLine implements CommandLineRunner {
	@Override
    public void run(String... args) throws Exception {
		NoteController controller = new NoteController();
        System.out.println("Enter a note");
        
        Scanner scanner = new Scanner(System.in);
		String line = scanner.nextLine();
        while(!".".equals(line)) {
    		if(line.equals("insertar")) {
    			System.out.println("Enter a title");
    			String title = scanner.nextLine();
    			System.out.println("Enter a message");
    			String msg = scanner.nextLine();
    			controller.insertNote(title,msg);
    		}
    		line = scanner.nextLine();
        }
        controller.showNotes();
        
     }
}
