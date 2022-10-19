package com.henryynolasco.notes.notetaking;
import java.util.Scanner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CommandLine implements CommandLineRunner {
	@Override
    public void run(String... args) throws Exception {
        System.out.println("Enter word!");
        try (Scanner scanner = new Scanner(System.in)) {
			String line = scanner.nextLine();
			System.out.println(line);
		}
     }
}
