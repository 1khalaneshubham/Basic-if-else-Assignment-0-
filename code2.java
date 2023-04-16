/* Q.2 Write a java  program, take a number and print whether it is less than 10 or greather than 10
 *
 * input: var = 5;
 * output: 5 is less than 10.
 * input: var = 16;
 * output: 16 is greathr than 10,
 * input: var = 10;
 * output: ??
 */

class Demo{
	public static void main(String[] args){

//		int var = 5;
//	        int var = 16;
     	        int var = 10;

		if(var == 10){
			System.out.println("???");
		}
		else if( var > 10){
			System.out.println(var+" is greath than 10 ");
		}
		else{
			System.out.println(var+" is less than 10");
		}
	}
}


