package com.Nanask.re;

public class Review_01 {
	
	public static void main(String[] args) {
		

		// 1~10까지의 수 중 짝수의 합을 구하라
	    		
		   int intNum = 0;
		   int intSum = 0;
		    
		    intNum += 2;
		    intSum += intNum;
		    intNum += 2;
		    intSum += intNum;
		    intNum += 2;
		    intSum += intNum;
		    intNum += 2;
		    intSum += intNum;
		    intNum += 2;
		    intSum += intNum;
		    
		    System.out.println("짝수의 합 : " + intSum);
		
		
		    System.out.println("=====================================");
		    
		
		    intNum = 0;
		    intSum = 0;

	    intSum += (intNum += 2); // intNum = 0 + 2; // intSum = intSum + (intNum + 2)
	    intSum += (intNum += 2);  
	    intSum += (intNum += 2);
	    intSum += (intNum += 2);
	    intSum += (intNum += 2);
	    
	    System.out.println("짝수의 합 : " + intSum);
	    
	    //두 방법의 결과 값은 같으나 첫번째 구성이 합쳐진 것이 두번째 구성이다.
	    
	    intNum = 2;
	    intSum = 1;
	    
	    
	    for(;intSum < 10;) {
	    	System.out.printf("짝수의 합 : %d * %d = d%\n ", intNum, intSum, 2*intNum * intSum );
	    	
	    }
	    
	    
	    
	}
	    
}

}
