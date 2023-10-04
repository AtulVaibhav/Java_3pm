import java.util.Arrays;
import java.util.List;

//Wildcard : ?
//lowerbounded  wildcard : <? super class>:<? super Integer> A b c d
//upperbounded  wildcard : <? extends class>

//Number , Object
//Double
//All classes which act as parent class for Integer class
public class Test3 {
	public static void show(List<? super Integer> list){
		 for(Object data : list){
			 System.out.print(data+" ");
		 }
	}
	
	//All classes which act as child class of Number,we can pass
	public static void display(List<? extends Number> list){
		for(Object data: list){
			System.out.print(data+" ");
		}
	}
   
	public static void main(String[] args) {
		List<Number> list = Arrays.asList(1,2,3,4);
		show(list);
		
		List<Double> list2 = Arrays.asList(1.1,2.2,3.3);
		//show(list2);
		
		List<Object> list3 = Arrays.asList("Hello",1,1.2);
		show(list3);
		
		
		display(list2);
		
		
		
	}

}
