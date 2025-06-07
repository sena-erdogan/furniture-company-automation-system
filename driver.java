import java.util.*;

class driver{
	public static void main(String args[]){
	
		admin Admin = new admin(1);
		
		Admin.addBranchEmployee(2);
		Admin.addBranchEmployee(3);
		Admin.addBranchEmployee(4);
		
		customer customer1 = new customer("dfsdg","sdfgn","s@gmail.com","1234");
		customer customer2 = new customer("dfg","sdfg","f@hotmail.com","abcd");
		customer customer3 = new customer("sdg","asdf","hello@gmail.com","hi");
		customer customer4 = new customer("myname","mysurname","NotAnEmail","something");
		
		branchEmployee branchEmployee1 = new branchEmployee(3);
		
		Admin.addBranch();
		
		branchEmployee branchEmployee2 = new branchEmployee(5);
		
		System.out.println("branchEmployee1's branch is: " + branchEmployee1.getBranch());
		
		System.out.println("customer2's customer number is: " + customer2.getNumber());
		
		officeChair officeChair1 = new officeChair(6,3);
		
		branchEmployee2.addNeed(officeChair1,-2); 
		
		branchEmployee2.addNeed(officeChair1,13);
		
		bookcase bookcase1 = new bookcase(11);
		
		System.out.println("This will print true if bookcase1 is in stock, false if not: " + branchEmployee2.isInStock(bookcase1,2));
		
		branchEmployee branchEmployee3 = new branchEmployee(3);
		
		branchEmployee3.makeSale(bookcase1, 4, customer2);
		
		branchEmployee3.addProduct(officeChair1, 4);
		
		officeCabinet officeCabinet1 = new officeCabinet(9);
		
		branchEmployee1.removeProduct(officeCabinet1, 30);
		
		System.out.println("Name of customer1 is: " + customer1.getName());
		
		System.out.println("Surname of customer3 is: " + customer3.getSurname());
		
		System.out.println("Email of customer3 is: " + customer3.getEmail());
		
		System.out.println("Password of customer2 is: " + customer2.getPassword());
		
		System.out.println("This will print true if bookcase1 is in stock, false if not: " + customer2.searchProduct(bookcase1,2));
		
		customer2.shopOnline(officeCabinet1,5,"A galaxy far far away","12345678901");
		
		customer2.shopOnline(officeCabinet1,10,"Wonderland","1234");
		
		Admin.addBranchEmployee(6);
		
		Admin.addBranchEmployee(4);
		
		branchEmployee1.setBranch(3);
		
		System.out.println("branchemployee1 is working at branch 3 now.");
	
	}
}
