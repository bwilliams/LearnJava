package coding.kata;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class BowlingTest {
    private Bowling bowlingGame;
	
    //This runs before every single test, so you have a fresh game
	@Before
	public void beforeEachTest() {
		bowlingGame = new Bowling();
	}
	
	//First two are the same, just add up the rolls to get the score
	@Test
	public void allGutterBalls() {
		bowlingGame.roll(0);
		bowlingGame.roll(0);
		
		assertEquals(0, bowlingGame.score());
	}
	
	@Test
	public void openFrame() {
		bowlingGame.roll(4);
		bowlingGame.roll(3);
		
		assertEquals(4 + 3, bowlingGame.score());
	}
	
	
	//if you get 10 in a frame with two balls, the next ball counts as a bonus
	@Test
	public void spare() {
		bowlingGame.roll(9);
		bowlingGame.roll(1);
		bowlingGame.roll(4);
		bowlingGame.roll(2);
		
		//the 4 counts twice
		assertEquals(9 + 1 + 4 + 4 + 2, bowlingGame.score());
	}
	
	//strike is like spare, but better, the strike gets two bonuses
	@Test
	public void strike() {
		bowlingGame.roll(10);
		bowlingGame.roll(3);
		bowlingGame.roll(4);
		
		assertEquals(10 + 3 + 4 + 3 + 4, bowlingGame.score());
	}
	
	//Two strikes in a row can get crazy
	@Test
	public void twoStrikes() {
		bowlingGame.roll(10);
		bowlingGame.roll(10);
		bowlingGame.roll(5);
		bowlingGame.roll(2);
		
		int firstFrameScore = 10 + 10 + 2;
		int secondFrameScore = 10 + 5 + 2;
		int thirdFrameScore = 5 + 2;
		int expectedScore = firstFrameScore + secondFrameScore + thirdFrameScore;
		
		assertEquals(expectedScore, bowlingGame.score());
	}
	
	@Test
	public void worstGame() {
		for(int i = 0; i < 20; i++) {
			bowlingGame.roll(0);
		}
		assertEquals(0, bowlingGame.score());
	}
	
	@Test
	public void goodGame() {
		for(int i = 0; i < 21; i++) {
			bowlingGame.roll(5);
		}
		assertEquals(150, bowlingGame.score());
	}
	
	@Test
	public void perfectGame() {
		for(int i = 0; i < 12; i++) {
			bowlingGame.roll(10);
		}
		assertEquals(300, bowlingGame.score());
	}
}
