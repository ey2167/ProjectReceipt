
/*
 * extends the properties of Class GUI into Class Calculate
 * csc200
 * EloheYonas
 * 
 */
public class Calculate extends GUIcalc{
	

	public static double calscore(int [] apples, int [] banana) {
		/*
		 * initializing the scores to double to include integers
		 */
		
		double totalScore=0;
			for(int i=0; i<apples.length; i++) {
				totalScore+=apples[i]*.5*1.1 + banana[i]*.75*1.1;
			}
			/*
			 * set i to increase until the total score matches the solution
			 */
			
			/*
			 *once information is typed and calculate is pressed, the receipt is printed out in the console
			 */
			System.out.println("your total is" + " " + totalScore + " dollars, please print out the receipt");
		return totalScore;
		
	}
}