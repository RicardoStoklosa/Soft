 import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BoardTest {
	@Test
	void testGenerator() {
		Board velha = new Board(new int[][] {{1,-1,-1},{-1,1,1},{0,0,-1}});
		assertArrayEquals(new int[][] {{1,-1,-1},{-1,1,1},{0,0,-1}}, velha.getBoard());
	}
	
	@Test
	void testCheckVelha() {
		Board velha = new Board(new int[][] {{1,-1,-1},{-1,1,1},{0,0,-1}});
		assertTrue(velha.checkVelha(),"Erro ao identificar velha");
		Board notVelha = new Board(new int[][] {{1,-1,-1},{0,1,1},{0,-1,-1}} );
		assertFalse(notVelha.checkVelha(),"Nao eh velha");
	}

}
