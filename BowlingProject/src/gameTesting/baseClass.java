package gameTesting;

public class baseClass {


	 
		int[] rolls = new int[21];
		int currentroll = 0;
		
		public void roll(int pins) {
			rolls[currentroll++]= pins;		
		}
		
		@SuppressWarnings("unused")
		public void getScore() {
			
			int result = 0;
			int rollIndex = 0;
			for (int frameIndex=0; frameIndex<10; frameIndex++) {
				if(rolls[rollIndex]==  10) {
					result += rolls[rollIndex] + rolls[rollIndex +1] + rolls[rollIndex +2];
					rollIndex++;
				} else if(rolls[rollIndex] + rolls[rollIndex +1] == 10) {
					result += rolls[rollIndex] + rolls[rollIndex +1] + rolls[rollIndex +2];
					rollIndex+= 2;
				}else {
					result += rolls[rollIndex] + rolls[rollIndex +1];
					rollIndex+= 2;
				}
			}
		}



}
