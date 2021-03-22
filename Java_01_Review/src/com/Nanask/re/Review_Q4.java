
public class Review_Q4 {
	
	public static void main(String[] args) {
		
		int intNum = 0;
		int intSum = 0;
//		
//		intSum += (intNum += 2);
//		intSum += (intNum += 2);
//		intSum += (intNum += 2);
//		intSum += (intNum += 2);
//		intSum += (intNum += 2);
//		
//		System.out.println("짝수의 합 : " + intSum);
//		
		intNum = 0;
		intSum = 0;
		
		for( ; intNum < 10 ;) {
			intSum += (intNum += 2 );	
		}
		System.out.println(" 짝수의 합 : " + intSum);
	}
	

}
