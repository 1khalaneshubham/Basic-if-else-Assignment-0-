/* Q.3 Write a java code program take a number and print whether it is positive or negative 
input: num = 5;
output: 5 is a postive number;
input: -9;
Output: -9 is negative number;
inpuT: num = 0;
output: ???????? */

class Demo{
	public static void main(String[] args){

//		int num = 5;
//		int num = -9;
		int num = 0;

		if(num == 0){
			System.out.println("????????");
		}
		else if(num > 0){
			System.out.println(num+" is a postive number");
		}
		else{
			System.out.println(num+" is negative number");
		}
	}
}

