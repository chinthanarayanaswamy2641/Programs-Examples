package Strings3;

import java.util.Scanner;

public class AAA {

    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    	String str=sc.nextLine();
    	String[]words=str.split(" ");
    	String duplicates="";
    	for(int i=0;i<words.length;i++) {
    		for(int j=i+1;j<words.length;j++) {
    			if(!words[i].equals(words[j]) && !duplicates.contains(words[i])) {
    				duplicates=duplicates+words[i]+" ";
    			}
    		}
    	}
    	System.out.println(duplicates);
    }

}
