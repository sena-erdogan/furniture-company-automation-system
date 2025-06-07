public class officeChair extends product{

	/**	officeChair constructor with no parameters, intentionally left empty
	
	*/
	public officeChair(){
	 
		//Intentionally empty
		
	}
	
	/**	officeChair constructor
	
		@throws exception if model or color is invalid
		
		@param model of the office chair
		
		@param color of the office chair
	
	*/
	public officeChair(int model, int color){
	
		try{
			if(model>7 && model<1 && color>5 && color<1)	throw new Exception("An office chair of the specified model and color does not exist.");
		
			this.model = model;
			this.color = color;
			this.name = "Office Chair";
			
		}
		
		catch(Exception e){	System.out.println(e);}
		
	}
	
	@Override
	public int getColor(){	return color;}
	
}
