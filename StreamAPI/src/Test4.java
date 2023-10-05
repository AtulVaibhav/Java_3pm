import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test4 {

	public static void main(String[] args) {
		//Creating a stream
		//1.Stream.of()
		Stream<Integer> number = Stream.of(1,2,3,4,5,6);
		
		//2.Stream.of(arr)
		String[] str = {"Harsh","Amit","Vivek","Satyam","Akshay","Abhay"};
		Stream<String> names = Stream.of(str);
		
		
		// list.stream()
		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		
		List<Integer> list2 = Arrays.asList(11,12,13,14,15,16);
		
		
		//Intermediate Operation
		//1.filter
		number
		.filter(x->x%2==0)
		.forEach(x->System.out.print(x+" "));
		System.out.println();
		
        names
        .filter(x-> x.startsWith("A"))
        .forEach(x->System.out.print(x+" "));
		System.out.println();
		
		//map()
		list2.stream()
		.map(x->x*x)
		.forEach(x->System.out.print(x+" "));
		System.out.println();
		
		
		//filter() & map()
		list2.stream()
		.filter(x->x%2==0)
		.map(x->x*x)
		.forEach(x->System.out.print(x+" "));
		System.out.println();
		
		//sorted()
String[] str2 = {"Harsh","Amit","Vivek","Satyam","Akshay","Abhay"};
		Stream<String> names2 = Stream.of(str2);
		
		names2.sorted().forEach(x->System.out.print(x+" "));
		System.out.println();
		
		String[] str3 = {"Harsh","Amit","Vivek","Satyam","Akshay","Abhay"};
		Stream<String> names3 = Stream.of(str3);
		
		names3.filter(x->x.startsWith("A"))
        .sorted()
        .map(String::toUpperCase)
        .forEach(x->System.out.print(x+" "));
		System.out.println();
		
		
		//distict
	List<Integer> nums = Arrays.asList(1,2,1,2,3,4,5,3,4,6,7,8);
	nums.stream()
	.distinct()
	.forEach(x->System.out.print(x+" "));
	System.out.println();
	
	//limit()
	List<Integer> intList =  Stream.iterate(1,x->x+1)
	                         .limit(10)
                             .collect(Collectors.toList());
	System.out.println(intList);
	
	//skip
	List<Integer> intList2 =  Stream.iterate(1,x->x+1)
			.limit(10)
            .skip(5)
            .collect(Collectors.toList());
System.out.println(intList2);
	
	
	//Terminal Operation
	//1.forEach
	
	//2.collect
	
	List<Integer> numList = Arrays.asList(1,2,1,2,1,1,1,3,4,5,3,4,6,7,8);
	List<Integer> newObjs = numList.stream()
	                        .distinct()
                        	.collect(Collectors.toList());
	System.out.println(newObjs);
	
	//count
	long countOf_1 = numList.stream()
	                 .filter(x->x==1)
	                 .count();
	System.out.println(countOf_1);
	
	//reduce()
//	int[] data = {1,2,3,4,5,6};
//	Stream.of(data)
//	.map(x->x)
//   .reduce((a,b)->a+b);
	
	//match()
	String[] nameList = {"Harsh","Amit","Vivek","Satyam","Akshay","Abhay"};
	
	boolean result = Stream.of(nameList)
	                 .anyMatch(x->x.endsWith("ay"));
	System.out.println(result);
	
	boolean result2 = Stream.of(nameList)
            .allMatch(x->x.endsWith("ay"));
System.out.println(result2);

    
	
	
	
	
	
	
	
	
	
	
	
		
	}

}
