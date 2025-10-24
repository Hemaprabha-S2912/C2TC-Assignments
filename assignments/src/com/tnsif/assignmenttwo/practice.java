package com.tnsif.assignmenttwo;
import java.util.*;

public class practice {

	public static void main(String[] args) {
		String s1="Geeks";
		String s2="Kseeg";
		if(s1.length()!=s2.length()) {
			System.out.println(false);
		}
		int[] arr=new int[26];
		for(int i=0;i<s1.length();i++) {
			char ch=s1.charAt(i);
			arr[ch-'a']++;
		}
		for(int i=0;i<s2.length();i++) {
			char ch=s2.charAt(i);
			arr[ch-'a']--;
		}
		for(int i {
			
		}
		
	}

}
