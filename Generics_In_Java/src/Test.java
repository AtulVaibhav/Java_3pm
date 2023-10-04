//Generic Class

//class Integer_Class{
//	Integer obj;
//	Integer_Class(Integer obj){
//		this.obj = obj;
//	}
//	
//	public Integer getObj(){
//		return this.obj;
//	}
//	
//}
//class Double_Class{
//	Double obj;
//	Double_Class(Double obj){
//		this.obj = obj;
//	}
//	
//	public Double getObj(){
//		return this.obj;
//	}
//	
//}


class Generic<T>{
	private T obj;
	Generic(T obj){
		this.obj = obj;
	}
	
	public  T getObj(){
		return this.obj;
	}
}

//Generic Method


class PrintData{
	public <T> void print(T[] arr){
		for(T data:arr){
			System.out.print(data+" ");
		}
		System.out.println();
	}
}

class PrintArray<T>{
	private T[] obj;
	
	PrintArray(T[] obj){
		this.obj = obj;
	}
	
	public void print(){
		for(T data:obj){
			System.out.print(data+" ");
		}
		System.out.println();
	}	  
	
}


public class Test {
	public static void main(String[] args) {
		Integer obj = new Integer(20);
//		Integer_Class intClass = new Integer_Class(obj);
//		System.out.println(intClass.getObj());
		
		Double doubleObj = new Double(30.45);
//		Double_Class obj2 = new Double_Class(doubleObj);
//		System.out.println(obj2.getObj());
		
		Generic<Integer> intObj = new Generic<>(obj);
		System.out.println(intObj.getObj());
		
		
		Generic<Double> doubleObj2 = new Generic<>(doubleObj);
		System.out.println(doubleObj2.getObj());
		
		Generic<String> strObj = new Generic<>("Java");
		System.out.println(strObj.getObj());
		
		
		PrintData printObj = new PrintData();
		Integer[] arr = {1,2,3,4,5};
		Double[] arr2 = {1.2,2.3,3.4,4.5};
		String[] arr3 = {"Hi","Hello"};
		printObj.print(arr);
		printObj.print(arr2);
		printObj.print(arr3);
		
		PrintArray<Integer> obj1 = new PrintArray<>(arr);
		obj1.print();
		PrintArray<Double> obj2 = new PrintArray<>(arr2);
		obj2.print();
		PrintArray<String> obj3 = new PrintArray<>(arr3);
		obj3.print();
		
		
		

	}

}


/*
 * 
 //Type-safety
//Explicit type-conversion not required
class ShowData{
	Object obj;
	ShowData(Object obj){
		this.obj = obj;
	}
	public String getObj(){
		return (String)this.obj;
	}
	
}
public static void show(){
		ArrayList<String> list = new ArrayList<>();
		list.add("Java");
		list.add("J2EE");
		list.add(new Integer(10));
		
		String str =(String)list.get(0);
		System.out.println(str);
		String str2 = (String)list.get(2);
		System.out.println(str2);
		
	}
	


*/