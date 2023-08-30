
public class Checker {
	
	 
	 boolean isArmstrong(int num){   
		 int dc = countDigit(num);
		 int original = num;
		 int sum=0;
		 while(num!=0) {
			 int LastDigit = num%10;
			 int drp =(int) Math.pow(LastDigit,dc);
			 sum = sum+drp;
			 num = num/10;
		} 
	if(original==sum) {  
	return true;
	}
	else return false;   
	}   
	 
	 int countDigit(int num) {
		 int count=0;
		 while(num!=0) {
			 num = num/10;
			 count++;
		 }
		 return count;
	 }
		
}
	



