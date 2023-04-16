





/* Q.7. Calculate profit or loss.
Write a program that takes the cost price and selling price (Take it hardcode)and calcultes its profit or loss.

Input1:

sellingPrice = 1200;
CastPrice  = 1000
Output : profit of 200

Input2:

sellingPrice = 300
CastPrice = 500
Output = loss of 200

input3:

sellingPrice = 900
CastPrice = 900
Output = ???
*/

class Demo{
	public static void main(String[] args){

		int selling_price = 300;
		int cost_price = 500;

		if(selling_price > cost_price){

			System.out.println("Profit of"+(selling_price-cost_price));

		}else if(selling_price < cost_price){

			System.out.println("Loss of"+(cost_Price-selling_price));

		}else{
			System.out.println("No loss No prifit");

		}
	}
}

























