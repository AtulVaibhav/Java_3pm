package com.inheritance;

public class Query {
    public static void numberOfHouse(int[] arr,int r ,int unit){
    	//rats : 7 unit:2
    	if(arr.length==0)System.out.println("-1");
    	int foodRequired = r*unit;
    	int sum=0;
    	for(int i=0;i<arr.length;i++){
    		sum = sum+arr[i];
    		if(foodRequired<=sum){
    			System.out.println(i+1);
    			break;
    		}
    		
    	}
    	if(foodRequired>sum){
			System.out.println("0");
		}
    	
    }
	public static void main(String[] args) {
		int[] arr= {2,8,3,5,7,4,1,2};
		int r=7;
		int unit=2;
		numberOfHouse(arr, r, unit);

	}

}
