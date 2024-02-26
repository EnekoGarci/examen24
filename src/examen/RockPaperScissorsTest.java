package examen;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RockPaperScissorsTest {

	@Test
	void test1() {
		String resultadoEsperado="It's a tie!";
		String resultadoObtenido=RockPaperScissors.checkGame("Paper", "Paper");
		assertEquals(resultadoEsperado, resultadoObtenido);
	}
	
	@Test
	void test2() {
		String resultadoEsperado="You win this round!";
		String resultadoObtenido=RockPaperScissors.checkGame("Scissors", "Rock");
		assertEquals(resultadoEsperado, resultadoObtenido);
	}
	
	@Test
	void test3() {
		String resultadoEsperado="You win this round!";
		String resultadoObtenido=RockPaperScissors.checkGame("Rock", "Paper");
		assertEquals(resultadoEsperado, resultadoObtenido);
	}
	
	@Test
	void test4() {
		String resultadoEsperado="You win this round!";
		String resultadoObtenido=RockPaperScissors.checkGame("Paper", "Scissors");
		assertEquals(resultadoEsperado, resultadoObtenido);
	}


}
