package com.henryynolasco.notes.notetaking;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

@SpringBootTest
class NotetakingApplicationTests {

	NoteController _nc;
	
	protected void setUp() throws Exception {
		_nc  = new NoteController();
	}
	
	@Test
	void contextLoads() {
	}
	
	@Test
	void insertaNotaTest() {
		//Note nota = new Note(1,"Primera nota","hoy el sol se escondio",null,null,null,null,null,0);
		_nc.insertNote("Primera nota", "hoy el sol se escondio");
		Assert.isTrue(_nc.getNumberNotes() == 1, "Passed");
	}

}
