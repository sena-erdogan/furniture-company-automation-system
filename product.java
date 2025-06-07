public abstract class product{

	/**	Model of the furniture
	
	*/
	protected int model;
	
	/**	How many of this furniture are there
	
	*/
	protected int number;
	
	/**	Which store is the furniture in
	
	*/
	protected int store;
	
	/**	Name of the product
	
	*/
	protected String name;
	
	/**	Color of the product
	
	*/
	protected int color;
	
	/**	Model of furniture
	
		@return int representing the model of the furniture
	
	*/ 
	public int getModel(){	return model;}
	
	/**	Name of furniture
	
		@return String representing the name of the furniture
	
	*/
	public String getName(){	return name;}
	
	/**	Color of furniture
	
		@return int representing the color of the furniture
	
	*/
	public abstract int getColor();
	
	/**	Number of furniture
	
		@return int representing how many of a furniture there are
	
	*/
	public int getNumber(){	return number;}
	
	/**	Equals to furnitures to each other
	
		This product will be equal to the parameter product
	
		@param pro the product that this product will be the same with
	
	*/
	public void equal(product pro){
	
		this.model = pro.getModel();
		this.number = pro.getNumber();
		this.name = pro.getName();
		this.color = pro.getColor();	
		
	}
}
