import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str1=sc.nextLine();
		String str2=sc.nextLine();
		String str3=sc.nextLine();
		String str4=str1.replace(str2,str3);
		System.out.println(str1);//old string
		System.out.println(str2);//old substring
		System.out.println(str3);//new substring
		System.out.println(str4);//new modified substring
		
		
	}
}
