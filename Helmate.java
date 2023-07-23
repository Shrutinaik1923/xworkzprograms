class Helmate{
	double price;
	char  helmateSize;
	static String helmateBrand;
	static String manufacturingState;
	
	//method uses instance variables
	void helmateInstanceVariables(){
		System.out.println("Price is:"+price+"helmatesize is"+helmateSize );
	}
	
	//method uses static variables
	static void staticVariableMethod(){
		System.out.println("Brand is:"+brand+"manufacturingState is"+manufacturingState);
	}
	
	Helmate(double price,char helmateSize){
		this.price = price;
		this.helmateSize = helmateSize;
	}
	
	//static block
	static{
		helmateBrand = "aa";
		manufacturingState = "Karnataka";
	}
}