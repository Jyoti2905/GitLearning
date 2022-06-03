package MyLearning.MyLearning;

import java.util.Scanner;

public class primeNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  int a=67;
  //Scanner input=new Scanner(System.in);
  //System.out.println("enter a num");
 // a=input.nextInt();
  System.out.println(a);
 
  // Even num 
  if(a%2==0) {
	  System.out.println("even num:" +a);
  }
  else {
	  System.out.println("odd num:" +a);
  }
  
  //prime num
  int no=4; int temp=0;
  for(int i=2;i<no-1;i++)
  {
	  if(no % i ==0) {
		 temp++;
		 break;
	  }
  }
	  if(temp==0) {
		  System.out.println("num is prime "+no);
	  }
	  else {
		  System.out.println("num is not prime "+no);
	  }
  
  
  //reverse string
  String astr="abc";
  String rev="";
  for(int i=astr.length()-1;i>=0;i--) {
	  rev=rev+astr.charAt(i);
  }
  System.out.println(rev);
  
//remove numeric from string
  String str="abc545454ghgh";

  String str1=str.replaceAll("[^0-9]", "");
  String str2=str.replaceAll("[^a-z]","");
		  System.out.println(str1);
		  System.out.println(str2);
	}

}
