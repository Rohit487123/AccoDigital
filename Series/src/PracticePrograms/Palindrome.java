package PracticePrograms;

import java.util.Scanner;

public class Palindrome {

	public static boolean Palindrome(String str1) {
		
		//String str1 =" aeebbeea";
		String str=str1.trim();
	
		if(str.length()%2==1) {
			return false;
		}
		int i=0;
		int j =str.length()-1; 
		
		while(i<j) {
	
	char ch =str.charAt(i);
	char c= str.charAt(j);
 
	
		if(ch!=c) {
		return false;
	}
		else {
			i=i+1;
			j=j-1;
		}

}
		return true;
}
	public static void main(String[] args) {
		if(Palindrome("abba")==true) {
		System.out.println("The string is palindrome");}
		else {
			System.out.println("The string is not palindrome");
		}
}
}
