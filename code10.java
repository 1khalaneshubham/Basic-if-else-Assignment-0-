





/* Q.9. Write a program in java to accept three numbers and check whether they are Pythagprean triplets or not 

example:
a = 3, b = 4 c = 5;
if  
a*a+b*b = c*c
then 
its pythagores triplet 
else
not a pythagores triplet

input1:
a = 3, b = 4, c = 5;
output: its pythagorse triplet

input2:
a = 1, b = 6 c = 7
output: it is not pythagorse triplet

input3:
a = 2, b = 2 c = 2
output:?????   */

class Demo{
	public static void main(String[] args){

	//	int a = 3;
	//      int b = 4; 
	//      int c = 5;

       //   	int a = 1;
       //  	int b = 6;
       //	int c = 7;

		int a = 2;
		int b = 2; 
		int c = 2;
	
		if(a*a == b*b + c*c || b*b == a*a + c*c || c*c == a*a + b*b){

			System.out.println(" Triangle is Pythagorean Triplet ");
		
		
		}
//		else if( a == b == c){

//			System.out.println("?????");

//		}
 
		else{

			System.out.println("Triangle is NOT pythagorean Triplet");
		}

	}
}


























