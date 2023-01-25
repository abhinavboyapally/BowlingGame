package gameTesting;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Iterator;

import org.junit.Before;
import org.junit.jupiter.api.Test;

public class resultsClass extends baseClass{

		baseClass game;
		
		public void rollMany(int pins, int rolls) {
			for(int i=0; i<rolls; i++) {
				game.roll(pins);
			}
			
		}
		
		@Before
		public void initialize() {
			game = new baseClass();
		}
		
		@Test
		public void gutterGame() {
			rollMany(0, 20);
			assertEquals(0, game.getScore());
			
		}
		
		@Test
		public void rollAllOnce() {
			rollMany(1, 20);
			assertEquals(20, game.getScore());
		}
		
		@Test
		public void rollSpare() {
			game.roll(5);
			game.roll(5);
			game.roll(3);
			rollMany(0, 17);
			assertEquals(16, game.getScore());
		}
		
		@Test
		public void rollStrike() {
			game.roll(10);
			game.roll(4);
			game.roll(3);
			rollMany(0, 16);
			assertEquals(24, game.getScore());
		}
		
		@Test
		public void rollPerfectGame() {
			rollMany(10, 12);
			assertEquals(300, game.getScore());
		}

	

}
