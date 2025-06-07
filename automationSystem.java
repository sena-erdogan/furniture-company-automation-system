public interface automationSystem{ 

	/** 	Allows the admin to add a branch employee
	
		@throws Exception if the branch specified doesn't exist
	
		@param tBranch branch in which the employee will work
		
	*/
	void addBranchEmployee(int tBranch);
	
	/**	Allows the admin to remove a branch employee
	
		@throws Exception if there isn't an employee of the specified index
	
		@param index index of the branch employee array, which employee will be removed
	
	*/
	void removeBranchEmployee(int index);
	
	/**	Allows the admin to add a new branch, the branch number is assigned automatically
	
	*/
	void addBranch();
	
	/**	Allows the admin to remove a branch
	
		@param num index of the branch array, which branch will be removed
	
	*/
	void removeBranch(int num);
	
	/**	Allows admin to see if there are any products needed by checking the need array
	
	*/
	void anyProductNeeded();

}
