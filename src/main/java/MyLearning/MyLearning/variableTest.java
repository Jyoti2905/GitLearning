package MyLearning.MyLearning;

import java.util.ArrayList;
import java.util.Random;

import net.bytebuddy.utility.RandomString;

public class variableTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=20;
		double b=29.99;
		String s="Stringtest";
		boolean w=true;
		int[] rollno= {1,2,3,4,5};
		String[] name= {"Test1","Test2","Test3"};
		
		int[] id=new int[5];
		id[0]=10;
		id[1]=15;
		id[2]=20;
		id[3]=25;
		id[4]=30;
		
		for (int i=0;i<name.length;i++) {
			System.out.println(name[i]);
		}
		
		for(int i=0;i<id.length;i++) {
			if(id[i]%2==0) {
			System.out.println(id[i]+ " its an even num");
		}
			else {
				System.out.println(id[i]+ " its an odd num");
			}
		}
		
		for(String s1:name) {
			System.out.println(s);
		}
		
		ArrayList<String> al=new ArrayList<String>();
		al.add("Jihn");
		al.add("Jack");
		
		System.out.println(al.get(1));
	
String[] name11=new String[5];
	
	for(int i=0;i<name11.length;i++) {
	//	Random random=new Random();
		String h=RandomString.make(5).toString();
		System.out.println(h);
		}
	int[] hj=new int[10];
	for(int i=0;i<hj.length;i++) {
		Random random=new Random();
		int ddd= random.nextInt(1000);
	System.out.println(ddd);
	}
}
	
	}

