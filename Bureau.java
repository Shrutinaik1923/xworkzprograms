class Bureau{
	int noOfDoors;
	char size;
	static String madeFrom;
	static boolean storesItems;
	
    void instanceVarMethod()
	{
		System.out.println("noOfDoors is:"+noOfDoors+ "size is:"+size);
	}
	
	static void staticVarMethod()
	{
		System.out.println("madeFrom is:"+madeFrom+ "storesItems is:"+storesItems);
	}
	
	Bureau(int noOfDoors, char size)
	{
		this.noOfDoors = noOfDoors;
		this.size = size;
	}
	
	static
	{
		madeFrom = "Metalic";
		storesItems = true;
	}
}