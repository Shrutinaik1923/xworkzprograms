class Power
{
	static String powerUnit; 
	static char powerSymbol; 
	String quantityType; 
	String alternateName; 
	
	Power(String quantityType,String alternateName)
	{
		System.out.println("invoking string  constructor in power");
		this.quantityType=quantityType;
		this.alternateName=alternateName;
	}
	static 
	{
		powerUnit="watts";
		powerSymbol='p';
		
	}
	 static void staticPower()
	{
		System.out.println("invoking String,char constructor in Power");
		System.out.println("powerUnit is:"+powerUnit+ "powerSymbol is:"+powerSymbol);
		
	}
	void instancePower()
	{
		System.out.println("Instance variable in power is");
		System.out.println("quantityType is:"+quantityType+ "alternateName is:"+alternateName);
	}

}