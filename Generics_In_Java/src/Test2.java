
//Bounded Type
class SumOfNumber{
	public static <T extends Number> double getSum(T[] arr){
		double sum = 0;
		for(T data:arr){
		
			sum  = sum +data.doubleValue();
		}
		return sum;
	}
}
public class Test2 {

	public static void main(String[] args) {
		Integer[] arr = {1,2,3,4,5};//new Integer(1)
		Double[] arr2 = {1.2,2.3,3.4,4.5};
		String[] arr3 = {"Hi","Hello"};
		
		System.out.println("Sum of Integer arr:"+SumOfNumber.getSum(arr));
		System.out.println("Sum of Double arr:"+SumOfNumber.getSum(arr2));
		//System.out.println("Sum of Integer arr:"+SumOfNumber.getSum(arr3));

	}

}
