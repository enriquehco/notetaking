package com.henryynolasco.notes.notetaking;
import java.util.Scanner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CommandLine implements CommandLineRunner {
	@Override
    public void run(String... args) throws Exception {
		NoteController controller = new NoteController();
        System.out.println("Type \"insert\" to enter a note");
        
        Scanner scanner = new Scanner(System.in);
		String line = scanner.nextLine();
        while(!".".equals(line)) {
    		if(line.equals("insert")) {
    			System.out.println("Enter a title");
    			String title = scanner.nextLine();
    			System.out.println("Enter a message");
    			String msg = scanner.nextLine();
    			System.out.println("Enter the estimated date of completion (DD-MM-YY)");
    			String estimate = scanner.nextLine();
    			System.out.println("Enter a link or press enter to skip");
    			String link = scanner.nextLine();
    			System.out.println("Enter a mention to someone (@someone) or press enter to skip");
    			String mention = scanner.nextLine();
    			System.out.println("Enter priority (0 to 5)");
    			String priority = scanner.nextLine();
    			controller.insertNote(title, msg, estimate, link, mention, Integer.parseInt(priority));
    		}
    		line = scanner.nextLine();
        }
        controller.showNotes();
        
     }
}
