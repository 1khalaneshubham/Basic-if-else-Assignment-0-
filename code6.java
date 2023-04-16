/* Q.6. Write a program t find a maximum between three numbers 

 input1;
 num1 = 1;
 num2 = 2;
 num3 = 3;
 Output 3 is the maximum between 1,2 and 3

 input2;
 num1 = 1;
 num2 = 4;
 num3 = 3;
 Output = 4 is the maximum  between 1,4 and 3

 input3;
 num1 = 42;
 num2 = 32;
 num3 = 42; 
 Output = ?????   */

class Demo{
	public static void main(String[] args){

	/*	int num1 = 1;
		int num2 = 2;
		int num3 = 3;   */

        /*	int num1 = 1;
		int num2 = 4;
		int num3 = 3; */

		int num1 = 42;	
		int num2 = 32;
		int num3 = 42;

		if(num1 > num2 && num1 > num3){
			System.out.println(num1+" is the maximum between "+num1+","+num2+" and "+num3);
		}else if(num2 > num1 && num2 > num3){
			System.out.println(num2+" is the maximum between "+num1+","+num2+" and "+num3);
		}else if(num3 > num1 && num3 > num2){
			System.out.println(num3+" is the maximum between "+num1+","+num2+" and "+num3);
		}else if(num1 > num2 && num1 == num3){
			System.out.println(num1+" is Greater then "+num2+" and  Equal to "+num3);
		}else if(num2 > num3 && num2 == num3){
			System.out.println(num2+" is Greater than "+num3+" and Equal to "+num1);
		}else if(num3 > num1 && num3 == num2)
			System.out.println(num3+" is Greater than "+num1+" and Equal to "+num2);
		else{
			System.out.println(" All Numbers are Equal");
		}
	}

}

