public class meetingTable extends product{
	
	/**	meetingTable constructor with no parameters, intentionally left empty
	
	*/
	public meetingTable(){ 
	
		//Intentionally empty
		
	}
	
	/**	meetingTable constructor
		
		@param model of the meeting table
		
		@param color of the meeting table
	
	*/
	public meetingTable(int model, int color){
	
		try{
			if(model>10 && model<1 && color>4 && color<1)	throw new Exception("A meeting table of the specified model and color does not exist.");
			
			this.model = model;
			this.color = color;
			this.name = "Meeting Table";
		}
		
		catch(Exception e){	System.out.println(e);}
		
	}
	
	@Override
	public int getColor(){	return color;}
	
}
