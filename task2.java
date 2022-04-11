import java.util.*; 
import java.io.*;

class Main {

  public static int cyclicPermutation(int num) {
    // code goes here  
    int count = 0;   
	while (num>0)   
	{  
		//increments the variable count by 1 if n>0    
		count++;   
		//divides the variable n by 10   
		num = num / 10;   
	}   
	//returns the total number of digits  
	return count;   
	}   
	//the function generates the cyclic permutations  
	static int MathChallenge(int N)   
	{   
		int num = N;   
		int n = cyclicPermutation(N);   
		while (true)   
		{   
			//the next three statements generate the cyclic permutations  
			int remainder = num % 10;   
			int dev = num / 10;   
			num = (int)((Math.pow(10, n - 1)) * remainder + dev);   
			//if the condition is true, it exits from the loop  
			if (num == N)   
			break;   
			else{
				for (int i = 2; i * i <= num; i++)
        			if (num % i == 0)
          				return 0; 
    			return 1;
    		}
		}   	
		return 1;	
  }

  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.println(MathChallenge(s.nextInt())); 
  }

}