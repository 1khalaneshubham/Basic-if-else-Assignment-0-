/* Q.4. Write a java program that check a number from 0 to 5 and prints its spelling ,if the number is greather than 5 print the number is greather than 5 
 *
 * input: var=4;
 * output: four
 *
 * input:var=6
 * output:Number is greater than 5;
 *
 * input: var=-6;
 * output: ???    */

class Demo{
	public static void main(String[] args){
				
		     
		//		int var = 4;
	        //		int var = 6;
				int var = -6;

				if(var<0){
					System.out.println(" ??? ");
				}
				else if(var == 0){
					System.out.println(" Zero");
				}
				else if(var == 1){
					System.out.println(" One");
				}
				else if(var == 2){
					System.out.println(" Two");
				}
				else if(var == 3){
					System.out.println(" Three");
				}
				else if(var == 4){
					System.out.println(" Four");
				}
				else if(var == 5){
					System.out.println(" Five");
				}
				else{

					System.out.println(var+" is Greather than 5");
				}
	}
}

