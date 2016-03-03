
public class NumberCubeQuestion {

	public static int[] getCubeTosses(NumberCube numberCube, int length) {
		int[] array = new int[length];
		for (int i = 0; i < length; i++) {
			array[i] = numberCube.toss();
		}
		return array;
	}

	public static Object getLongestRun(int[] testValues) {
		int curRunNum = testValues[0];
		int curRunLeng = 1;
		int runIndex = -1;
		int longestRun = 0;
		int longestIndex = -1;
		boolean firstRun = true;
		
		for (int i = 1; i < testValues.length; i++){
		//	System.out.println("currrent Run Number:" + curRunNum + " Current Number:" + testValues[i]);
			if(curRunNum == testValues[i]){
				if(firstRun){
					runIndex = i-1;
					firstRun = false;
				}
				curRunLeng = curRunLeng + 1;
				System.out.println("-Run Started-" + i);
				
				
			} else if  (testValues[i] != curRunNum && curRunLeng > 1){
				System.out.println("-Run ended- Length:" + curRunLeng);
				curRunNum = testValues[i];
				firstRun = true;
				
				if(curRunLeng >= longestRun){
					
					System.out.println("Longest Run, Start Index:" + (runIndex) + " End Index:" + i);
					longestRun = curRunLeng;
					longestIndex = runIndex;
				}
				curRunLeng = 1;
				runIndex = -1;
				
			} else if (testValues[i] != curRunNum) {
				curRunLeng = 1;
				curRunNum = testValues[i];
				runIndex = -1;
				firstRun = true;
			}
		}
		System.out.println("+-+Check Done +-+");
		return longestIndex;
	}

}
