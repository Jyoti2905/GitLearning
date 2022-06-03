package MyLearning.MyLearning;

public class StringvarLearning {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="testing";
		String s1=new String("Testing");
		System.out.println( " char at 1 position "+s.charAt(1));
		s.compareTo(s1);
		System.out.println(s.concat(" java"));
		String bb="Selenium lea56ing using Java ba78cs";
		String[] ss=bb.split("using");
		System.out.println("before using word we have :" +ss[0].trim());
		System.out.println("after using word we have :" +ss[1]);	
		
	//	for(int i=bb.length()-1;i>0;i--) {
		//	System.out.println(bb.charAt(i));
	//	}
		
		String num=bb.replaceAll("[^0-9]", "");
		System.out.println(num);
		
	}

}
