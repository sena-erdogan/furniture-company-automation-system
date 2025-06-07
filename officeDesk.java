public class officeDesk extends product{
	
	/**	officeDesk constructor with no parameters, intentionally left empty
	
	*/
	public officeDesk(){ 
	
		//Intentionally empty
		
	}
	
	/**	officeDesk constructor
		
		@param model of the office desk
		
		@param color of the office desk
	*/
	public officeDesk(int model, int color){
	
		try{
			if(model>5 && model<1 && color>4 && color<1)	throw new Exception("An office desk of the specified model and color does not exist.");
		
			this.model = model;
			this.color = color;
			this.name = "Office Desk";
		}
		
		catch(Exception e){	System.out.println(e);}
		
	}
	
	@Override
	public int getColor(){	return color;}
	
}
