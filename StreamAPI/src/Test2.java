//LambdaExpression
/**
 * withoutname
   without returntype
   without accessModifier

 * 
 * 
 *
 */

@FunctionalInterface
interface AccountDept{
	//void m1();
	//  void m2(int a);
	//  void m3(int[] arr);
	String m4(String obj);
}




public class Test2 {

	public static void main(String[] args) {
//		AccountDept account	   = ()->{System.out.println("m1() is called");}; 
//		account.m1();
//		AccountDept account = (a)->System.out.println(a*a); 
//		account.m2(10);
//		int[] arr = {1,2,3,4,5,6};
//		AccountDept account = (arr1)->{
//			int sum=0;
//			for(int data:arr1){
//				sum += data;
//			}
//			System.out.print(sum);
//		};
//		account.m3(arr);
		String str = "java";
		
		AccountDept account = (obj)->{return obj.toUpperCase();};
		System.out.println(account.m4(str));
		
		

	}

}
