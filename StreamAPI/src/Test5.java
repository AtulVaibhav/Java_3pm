import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Test5 {

	public static void main(String[] args) {
		//Print sum of all numbers
		List<Integer> list = Arrays.asList(1,2,3,4,5,6);
		       Integer result_0=      list.stream()
				                     .reduce((a,b)->a+b).get();
		System.out.println(result_0);
		
		//Print average of all numbers
		double result = list.stream()
				       .mapToInt(x->x)
				       .average().getAsDouble();
		System.out.println(result);
		
		
		
		//Print Numbers start with prefix 2
      List<Integer> numbers = 
              Arrays.asList(1,2,22,12,32,222,234,132,213);
          numbers.stream()
         .map(x->String.valueOf(x))
         .filter(x->x.startsWith("2"))
         .mapToInt(x->Integer.parseInt(x))
         .forEach(x->System.out.print(x+" "));
        System.out.println();
      
      //Print duplicate numbers 
      List<Integer> duplicateNumbers = 
    		  Arrays.asList(2,3,1,2,3,1,2,3,3,3,4,5,6,5,7);
      duplicateNumbers.stream()
      .filter(x->Collections.frequency(duplicateNumbers, x)>1)
      .distinct()
      .sorted()
      .forEach(x->System.out.print(x+" "));
      
      System.out.println();
      //Find max and min
      List<Integer> list1 = 
    		  Arrays.asList(10,3,2,4,6,12,1,45,27,34);
      int len = list1.size();
      list1.stream()
      .sorted()
      .skip(len-1)
      .forEach(System.out::print);
      System.out.println();
	  list1.stream()
	  .sorted()
	  .limit(1)
	  .forEach(System.out::print);
        
	}

}
