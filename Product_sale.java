
 
import java.util.Scanner; 
class Product 
{     
	int pcode,price;     
	Product()     
	{         
		String pname;         
		Scanner in=new Scanner(System.in); 
		System.out.println("Enter the pcode");         
		pcode=in.nextInt();         
		System.out.println("Enter the pname");         
		pname=in.next();         
		System.out.println("Enter the price");         
		price=in.nextInt();       
	} 
	void min_price(Product p1,Product p2,Product p3)    
	{         
		if(p1.price<p2.price)         
		{             
			if(p1.price<p3.price)                 
				System.out.println(p1.price);             
			else                 
				System.out.println(p3.price); 
		}         
			else         
			{             
				if(p2.price<p3.price)                 
					System.out.println(p2.price);             
				else                 
					System.out.println(p3.price);         
			}     
	} 

} 
public class Product_sale 
{     
	public static void main(String args[])     
	{         
		Product p1=new Product();         
		Product p2=new Product();         
		Product p3=new Product();         
		System.out.println("Minimum price:");         
		p1.min_price(p1,p2,p3);      
	} 
}          
		
 
 
 
 
