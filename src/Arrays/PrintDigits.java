package Arrays;

import java.awt.AWTException;
import java.awt.Robot;
import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintDigits {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str="2absdsdj2sdlkl2dksk87asd222bghff2";
		char[]ca=str.toCharArray();
		for(int i=0;i<ca.length;i++) {
			int count=0;
		int digits=0;
		char ch=str.charAt(i);
		if(ch>='0' && ch<='9') {
		int output=ch-'0';
		count++;
		System.out.println(output+"");
		
		}
		}
	}
	}


//8925599133
//8124404404
//996289876
//0-->12 34 56 98 100 95 20 99 89
//1-->12 20 56 98 100 95 34 99 89
//2-->12 24 34 98 100 95 56 99 89// 12 24 34 56 100 98 95 99 89 
//3-->12 24 34 56 100 98 95 99 89// 12 24 34 56 89 100 98 99 95
//4-->12 24 34 56 89 100 98 99 95// 12 24 34 56 89 95 100 99 98
//5-->12 24 34 56 89 95 100 99 98// 12 24 34 56 89 95 98 100 99
//6-->12 24 34 56 89 95 98 100 99 // 12 24 34 56 89 95 98 99 100
//7-->12 24 34 56 89 95 98 99 100


// 12 34 56 98 100 95 20 99 89
// 12 20 56 98 100 95 34 99 89
// 12 20 34 98 100 95 56 99 89
// 12 20 34 56 100 98 95 99 89
// 12 20 34 56 89 100 98 99 95
// 12 20 34 56 89 95 100 99 98
// 12 20 34 56 89 95 98 100 99
// 12 20 34 56 89 95 98 99 100