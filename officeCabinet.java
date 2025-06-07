public class officeCabinet extends product{

	/**	officeCabinet constructor with no parameters, intentionally left empty 
	
	*/
	public officeCabinet(){
	
		//Intentionally empty
		
	}
	
	/**	officeCabinet constructor
		
		@param model of the office cabinet
	
	*/
	public officeCabinet(int model){
		try{
			if(model>12 && model<1)		throw new Exception("An office cabinet of the specified model does not exist.");
		
			this.model = model;
			this.name = "Office Cabinet";
		}
		
		catch(Exception e){	System.out.println();}
		
	}
	
	@Override
	public int getColor(){	return -1;}
	
}
