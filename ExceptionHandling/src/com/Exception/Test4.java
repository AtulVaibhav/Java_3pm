//throw: used to throw exception object explicitly


package com.Exception;

public class Test4 {
    public static void getQuotient(int a,int b){
    	if(b==0){
    		try{
    		throw new ArithmeticException();//Unchecked
    		}catch(ArithmeticException ae){
    			System.out.println("Exception handled. 2nd value shouldn't be equals to zero");
    			System.out.println("Try Again");
    		}
    	}else{
    		System.out.println(a/b);
    	}
    	
    }
	public static void main(String[] args) {
		getQuotient(12, 0);

	}

}
