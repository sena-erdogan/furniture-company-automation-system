public class bookcase extends product{
	
	/**	bookcase constructor with no parameters, intentionally left empty
	
	*/
	public bookcase(){ 
	
		//Intentionally empty
		
	}

	/**	bookcase constructor
		
		@param model of the bookcase
	
	*/
	public bookcase(int model){
		try{
			if(model>12 && model<1)	throw new Exception("A bookcase of the specified model does not exist.");
		
			this.model = model;
			this.name = "Bookcase";
		}
		
		catch(Exception e){	System.out.println(e);}
	}
	
	@Override
	public int getColor(){	return -1;}

}
