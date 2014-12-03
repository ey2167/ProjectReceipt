
import java.util.Scanner;

import javax.swing.JOptionPane;
/*initialize variables for account type, username and password
 * prompt for and select account type using JOption Pane
 * prompt for username
 * while the username does not match and the trials do not exceed the limit,repeat prompting for username and add the number of trials
 * if trials exceed limit, ask for admin and terminate program
 * if not, prompt for password
 * while the password does not match inputpassword and the trials do not exceed the limit, repeat prompting for password and add the number of trials;
 * if trials exceed limit, ask for admin and terminate program
 * if not, check account
 * branch off of different account types using switch case
 * display response for appropriate account type 
 * go into New Calculate
 */
public class login {
public static void main(String[]args){
	//initializing variables
	String inputpassword,inputusername, staffusername, staffpassword, traineeusername, traineepassword, adminusername,adminpassword;
	staffusername = "fzero30";
	staffpassword = "lonk";
	traineeusername = "zatch338";
	traineepassword = "shelk";
	adminusername = "reality7";
	adminpassword = "mike";
	int trial;
	
	
	
	
	String[] choices = {"Admin", "Trainee", "Staff"};
	String input = (String) JOptionPane.showInputDialog(null, "Choose Account Type","Account Type",JOptionPane.QUESTION_MESSAGE, null, choices, choices[1]);
	System.out.println(input);
	
	
trial = 1;

//get the loops running so that if either condition is not met than you exit the loop for each case
switch (input) {
case "Staff":{
while (trial <= 3) {

	 inputusername = JOptionPane.showInputDialog(null, "What is your Username?");

	if (!staffusername.equals(inputusername) && (trial < 3))
	{
		JOptionPane.showMessageDialog(null, "wrong, try again");
		trial ++;
	}
	else if ((trial == 3) && (!staffusername.equals(inputusername))) 
	{
	JOptionPane.showMessageDialog(null, "good bye, BANNED");	
	System.exit(0);
	} else
		while (trial <= 3) {
			inputpassword = JOptionPane.showInputDialog(null, "What is the password?");

			if (!staffpassword.equals(inputpassword) && (trial < 3))
			{
				JOptionPane.showMessageDialog(null, "wrong, try again");
				trial ++;
			}
			else if ((trial == 3) && (!staffpassword.equals(inputpassword))) 
			{
			JOptionPane.showMessageDialog(null, "good bye, BANNED");	
			System.exit(0);
			}
			else{
				JOptionPane.showMessageDialog(null, " Hello " + staffusername);
				System.out.println("type number of apples (50 cents per apple) to the left, type number of bananas (75 cents per banana) to the right. there's 10% tax");
			new Calculate();
			
			
			}
			break;
		}
break;
}
/*breaks end the loop, while the console gives instructions for calculating the items. new Calculate will send the user to the Calculation page
 * 
 */
}


}
switch (input) {

case "Trainee":{
while (trial <= 3) {

	 inputusername = JOptionPane.showInputDialog(null, "What is your Username?");

	if (!traineeusername.equals(inputusername) && (trial < 3))
	{
		JOptionPane.showMessageDialog(null, "wrong, try again");
		trial ++;
	}
	else if ((trial == 3) && (!traineeusername.equals(inputusername))) 
	{
	JOptionPane.showMessageDialog(null, "good bye, BANNED");	
	System.exit(0);
	} else
		while (trial <= 3) {
			inputpassword = JOptionPane.showInputDialog(null, "What is the password?");

			if (!traineepassword.equals(inputpassword) && (trial < 3))
			{
				JOptionPane.showMessageDialog(null, "wrong, try again");
				trial ++;
			}
			else if ((trial == 3) && (!traineepassword.equals(inputpassword))) 
			{
			JOptionPane.showMessageDialog(null, "good bye, BANNED");	
			System.exit(0);
			}
			else{
				JOptionPane.showMessageDialog(null, " Hello " + traineeusername);
				System.out.println("type number of apples (50 cents per apple) to the left, type number of bananas (75 cents per banana) to the right. there is 10% tax");
				new Calculate();
			}
			break;
		}
	break;
}
/*breaks end the loop, while the console gives instructions for calculating the items. new Calculate will send the user to the Calculation page
 * 
 */
}
}


switch (input) {

case "Admin":{
while (trial <= 3) {

	 inputusername = JOptionPane.showInputDialog(null, "What is your Username?");

	if (!adminusername.equals(inputusername) && (trial < 3))
	{
		JOptionPane.showMessageDialog(null, "wrong, try again");
		trial ++;
	}
	else if ((trial == 3) && (!adminusername.equals(inputusername))) 
	{
	JOptionPane.showMessageDialog(null, "good bye, BANNED");	
	System.exit(0);
	} else
		while (trial <= 3) {
			inputpassword = JOptionPane.showInputDialog(null, "What is the password?");

			if (!adminpassword.equals(inputpassword) && (trial < 3))
			{
				JOptionPane.showMessageDialog(null, "wrong, try again");
				trial ++;
			}
			else if ((trial == 3) && (!adminpassword.equals(inputpassword))) 
			{
			JOptionPane.showMessageDialog(null, "good bye, BANNED");	
			System.exit(0);
			}
			else{
				JOptionPane.showMessageDialog(null, " Hello " + adminusername);
				System.out.println("type number of apples (50 cents per apple) to the left, type number of bananas (75 cents per banana) to the right. there is 10% tax");
	new Calculate();			
				
			}
			break;
			
		}
	break;
}
/*breaks end the loop, while the console gives instructions for calculating the items. new Calculate will send the user to the Calculation page
 * 
 */
}
}
}
}