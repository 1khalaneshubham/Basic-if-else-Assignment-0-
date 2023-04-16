





/* Q.10. Write a unique real-time example of IF ELSE IF ELSE Ladder     */

class Demo{

	public static void main(String[] args){

		float Money = 1500.00f;

		if( Money == 0.0f ){

			System.out.println(" Don't go anywhere keep starving ");

		}else if( Money >= 700.00f && Money < 5000.00f ){
         
	         	System.out.println("Party at Barbeque Nation");

		}else if( Money >= 5000.00f ){

			System.out.println(" Dine in 5 star ");

		}else{

			System.out.println(" Monthly Mess ");
		}
	}
}


