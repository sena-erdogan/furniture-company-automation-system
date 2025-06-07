import java.util.*;
public class admin implements automationSystem{

	/**	Array of all the customers
	
	*/
	protected customer[] cList = new customer[2];
	
	/**	Customer number
	
	*/
	protected int cNumber;
	
	/**	Customer count
	
	*/
	protected static int cCount=0;
	
	/**	Array of all the branches
	
	*/
	protected int[] branch = new int[4];
	
	/**	Array of stocked products
	
	*/
	protected product[] stock = new product[119];
	
	/**	Array of the needed products
	
	*/
	protected product[] need = new product[119];
	
	/**	Array of all the branch employees
	
	*/
	protected branchEmployee[] employee = new branchEmployee[1];
	
	/**	Sole constructor.
	
	*/
	public admin(){
	
		//Intentionally empty
	
	}
	
	/**	admin constructor
	
		@param dummy is used to distinguish the no parameter constructor from this constructor
	
	*/
	public admin(int dummy){
	
		System.out.println("Admin constructor is running...");
		
		cList[0] = new customer();
		cList[1] = new customer();
	
		branch[0] = 1;
		branch[1] = 2;
		branch[2] = 3;
		branch[3] = 4;
		
		int k=0;
		
		for(int i=1; i<8; i++){
		
			for(int j=1; j<6; j++){
			
				officeChair officeChair1 = new officeChair(i,j);
				
				stock[k] = new officeChair();
				need[k] = new officeChair();
			
				stock[k].equal(officeChair1);
				need[k].equal(officeChair1);
				
				stock[k].number = 50;
				need[k].number = 0;
				
				k++;
			
			}
		
		}
		
		for(int i=1; i<6; i++){
		
			for(int j=1; j<5; j++){
			
				officeDesk officeDesk1 = new officeDesk(i,j);
			
				stock[k] = new officeDesk();
				need[k] = new officeDesk();
				
				stock[k].equal(officeDesk1);
				need[k].equal(officeDesk1);
				
				stock[k].number = 50;
				need[k].number = 0;
				
				k++;
			
			}
		
		}
		
		for(int i=1; i<11; i++){
		
			for(int j=1; j<5; j++){
			
				meetingTable meetingTable1 = new meetingTable(i,j);
			
				stock[k] = new meetingTable();
				need[k] = new meetingTable();
				
				stock[k].equal(meetingTable1);
				need[k].equal(meetingTable1);
				
				stock[k].number = 50;
				need[k].number = 0;
				
				k++;
			 
			}
		
		}
		
		for(int i=1; i<13; i++){
		
			bookcase bookcase1 = new bookcase(i);
			
			stock[k] = new bookcase();
			need[k] = new bookcase();
				
			stock[k].equal(bookcase1);
			need[k].equal(bookcase1);
			
			stock[k].number = 50;
			need[k].number = 0;
			
			if(i==2)	stock[k].number = 0; // for test case
				
			k++;
		
		}
		
		for(int i=1; i<13; i++){
		
			officeCabinet officeCabinet1 = new officeCabinet(i);
			
			stock[k] = new officeCabinet();
			need[k] = new officeCabinet();
				
			stock[k].equal(officeCabinet1);
			need[k].equal(officeCabinet1);
			
			stock[k].number = 50;
			need[k].number = 0;
				
			k++;
		
		}
		
		System.out.println("Admin has successfully logged in");
	
	}
	
	public void addBranchEmployee(int tBranch){
	
		try{
			if(tBranch>branch.length)	throw new Exception("There is no branch " + tBranch + " to add employees.");
			
			branchEmployee employee1 = new branchEmployee(tBranch);
			
			System.out.println("Admin added a new employee to the branch " + tBranch);
		
		}catch(Exception e){	System.out.println(e);}
	
	}
	
	public void removeBranchEmployee(int index){
	
		try{
			if(index>employee.length)	throw new Exception("There isn't a branch employee of the specified index.");
			
			branchEmployee[] tEmployee = new branchEmployee[employee.length+1];
			
			for(int i=0; i<employee.length; i++){
			
				if(i<index)	tEmployee[i].setBranch(employee[i].getBranch());
				else if(i>index)	tEmployee[i].setBranch(employee[i-1].getBranch());
			
			}
			
			employee = tEmployee;
			
			System.out.println("Branch employee is successfully removed");
		
		}catch(Exception e){	System.out.println(e);}
	
	}
	
	public void addBranch(){
	
		int[] tBranch = new int[branch.length+1];
		
		tBranch[branch.length] = branch.length-1;
		
		branch = tBranch;
		
		System.out.println("A new branch is opened!");
		
		System.out.println("New branch is: " + branch.length);
	
	}

	public void removeBranch(int num){
	
		int[] tBranch = new int[branch.length-1];
		
		int i=0;
		
		while(branch[i] != num){
		
			tBranch[i] = branch[i];
			i++;
		
		}
		
		i++;
		
		while(i<branch.length){
		
			tBranch[i-1] = branch[i];
			i++;
		
		}
		
		for(i=0; i<employee.length; i++){
		
			if(employee[i].branch == num){
			
				removeBranchEmployee(i);
				--i;
			}
		
		}
	
	}

	public void anyProductNeeded(){
	
		for(int i=0; i<need.length; i++){
		
			if(need[i].number>0){
			
				stock[i].number += need[i].number + 30;
			
				need[i].number = 0;
				
				System.out.println("Products needed are supplied");
			
			}
		
		}
	
	}
	
}
