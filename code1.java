/* Q.1 Write a java program to check if a numbers is even or odd.
 *
 * input: var = 10;
 * output: 10 is an even no
 * input: var = 37
 * output: 37 is an odd no
 * input: var = 0
 * output: ???
 */

class Demo{
	public static void main(String[] args){

		//int var = 10;
	        //int var = 37;
		int var = 0;

		if(var == 0){
			System.out.println("???");
		}
		else if(var % 2 == 0){
			System.out.println(var+" is Even");
		}
		else{
			System.out.println(var+" is Odd");
		}
	}
}


