package MyLearning.MyLearning;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.annotations.Test;


public class javaStream {

	@Test
	public void teststream() {
		String[] abc= {"abc","def","ghi"};
		ArrayList<String> name=new ArrayList<String>();
		name.add("abc");
		
		List<String> names=Arrays.asList("test","streams","learning");
		List<String> names1=Arrays.asList("Aest","Ntreams","Pearning");
		
		long d=names.stream().filter(s->s.startsWith("t")).sorted().count();
		//.forEach(s->System.out.println(s));
			names.stream().filter(s->s.contains("m")).forEach(s->System.out.println(s));
			System.out.println(d);
			names.stream().filter(s->s.endsWith("s")).map(s->s.toUpperCase()).forEach(s->System.out.println(s));
			names.stream().filter(s->s.length()>4).sorted().forEach(s->System.out.println(s));
			
			Stream<String> abc1= Stream.concat(names.stream(), names1.stream());
			abc1.sorted().forEach(s->System.out.println(s));
	}
	
	@Test
	public void removeduplicate() {
		List<Integer> value=Arrays.asList(1,4,3,5,4,2,3,7,8,9,7);
		
		//removing duplicate
		value.stream().distinct().forEach(s->System.out.println(s));
		
		//get 3rd digit after removing duplicate n sorting
		List<Integer> value1=value.stream().distinct().sorted().collect(Collectors.toList());
		System.out.println(value.get(2));
		
	}
	
}
