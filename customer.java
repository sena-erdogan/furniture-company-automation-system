import java.util.*;
public class customer extends branchEmployee{
	
	/**	Name of the customer
	
	*/
	protected String name;
	
	/**	Surname of the customer
	
	*/
	protected String surname;
	
	/**	 E-mail of the customer
	
	*/
	protected String email;
	
	/**	Password of the customer
	
	*/
	protected String password;
	
	/**	Array of the orders this customer made
	
	*/
	protected product[] order = new product[1];
	
	/**	Sole constructor.
	
	*/
	public customer(){
	
		//Intentionally empty
	
	}
	
	/**	customer constuctor
	
		@throws Exception if the e-mail address doesn't contain '@', therefore is invalid
	
		@param tName customer's name
		
		@param tSurname customer's surname
		
		@param tEmail customer's email
		
		@param tPassword customer's password
	
	*/
	public customer(String tName, String tSurname, String tEmail, String tPassword){
	
		try{
		
			if(tEmail.contains("@")==false)	throw new Exception("Invalid e-mail address.");
		
			System.out.println("Customer constructor is running...");
		
			name = tName;
			surname = tSurname;
			email = tEmail;
			password = tPassword;
			
			++cCount;
			cNumber = cCount;
			
			System.out.println("New customer " + name + ' ' + surname + "'s customer number is " + cNumber);
			
			customer[] tempCList;
			
			tempCList = new customer[cCount];
			
			for(int i=0; i<cCount; i++){
			
				tempCList[i] = new customer();

			}
			
			System.arraycopy(cList, 0, tempCList, 0, cCount-1);
			
			tempCList[cCount-1] = this;
			
			cList = tempCList;
		
		}
		
		catch(Exception e){	System.out.println(e);}
	
	}
	
	/**	Name of a customer
	
		@return String representing the name of the customer
	
	*/
	public String getName(){	return name;}
	
	/**	Surname of a customer
	
		@return String representing the surname of the customer
	
	*/
	public String getSurname(){	return surname;}
	
	/**	Email of a customer
	
		@return String representing the email of the customer
	
	*/
	public String getEmail(){	return email;}
	
	/**	Password of a customer
	
		@return String representing the password of the customer
	
	*/
	public String getPassword(){	return password;}
	
	/**	Customer number of a customer
	
		@return int representing the customer number of the customer
	
	*/
	public int getNumber(){	return cNumber;}
	
	/**	Allows a customer to see the products
	
	*/
	public void productList(){
	
		for(int i=0; i<35; i++){
		
			System.out.println("Office chair of model" + stock[i].getModel() + " in the color " + stock[i].getColor());
		
		}
		
		for(int i=35; i<55; i++){
		
			System.out.println("Office desk of model" + stock[i].getModel() + " in the color " + stock[i].getColor());
		
		}
		
		for(int i=55; i<95; i++){
		
			System.out.println("Meeting table of model" + stock[i].getModel() + " in the color " + stock[i].getColor());
		
		}
		
		for(int i=95; i<107; i++){
		
			System.out.println("Bookcase of model" + stock[i].getModel());
		
		}
		
		for(int i=107; i<119; i++){
		
			System.out.println("Office cabinet of model " + stock[i].getModel());
		
		}
	
	}
	
	/**	Allows a branch employee to add an order to the customer's previous orders
		Protected in customer class
		
		@param pro product the customer purchased
		
		@param num quantity of the product purchased
	
	*/
	protected void addOrder(product pro, int num){
		
		int j = order.length;
		
		product[] tOrder = new product[j+1];
		
		for(int i=0; i<j; i++)	tOrder[i] = order[i];
		
		tOrder[j] = pro;
		
		order = tOrder;
	
	}
	
	/**	Allows a customer to see their previous orders
	
	*/
	public void getOrders(){
	
		for(int i=0; i<order.length; i++){
		
			System.out.println(order[i].getName() + " of model" + order[i].getModel());
			
			if(order[i].getColor() != -1)	System.out.println(" int the color" + order[i].getColor());
		
		}
	
	}
	
	/**	Allows a customer to check if a product is available
	
		@param pro product to be searched
		
		@param num quantity of the product to be searched
		
		@return boolean true if the product is available, else false
	
	*/
	public boolean searchProduct(product pro, int num){
	
		for(int i=0; i<stock.length; i++){
		
			if(stock[i] == pro && stock[i].number>=num){
			
				System.out.println("This product is in stock");
				
				return true;
			
			}
		
		}
		
		return false;
	
	}
	
	/**	Allows a customer to shop online
	
		@throws Exception phone number should be of 11 numbers, throws exception if not
	
		@param pro product to be purchased
		
		@param num quantity of the product to be purchased
		
		@param address address which the order will be sent to
		
		@param phone phone number of the receiver
	
	*/
	public void shopOnline(product pro, int num, String address, String phone){
	
		try{
		
			if(phone.length() != 11)	throw new Exception("Invalid phone number");
			 
			removeProduct(pro, num);
			addOrder(pro, num);
			
			System.out.println("Your order of " + num + ' ' + pro.getName() + "s has been shipped to the address \"" + address + "\" and your phone number is " + phone);
		
		}
		
		catch(Exception e){
		
			System.out.println(e);
			
			System.out.println("Sorry, your order to \"" + address + "\" cannot be shipped");
			
			System.out.println("You can make sure your information is valid and then try again.");
			
		}
	
	}
	
	/**	Allows a customer to see which store has the product they're looking for
	
		@param pro product to be searched for
	
	*/
	public void whichStore(product pro){
	
		for(int i=0; i<stock.length; i++){
		
			if(stock[i].getName() == pro.getName() && stock[i].getModel() == pro.getModel() && 
				stock[i].getColor() == pro.getColor())	System.out.println("This product is in branch" + stock[i].store);
		
		}
	
	}
	
}
