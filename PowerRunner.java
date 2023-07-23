class PowerRunner
{
	public static void main(String[] args)
	{
		System.out.println("Running main in powerrunner");
		
		Power power=new Power("physical","activity");
		Power.staticPower();
		power.instancePower();
		
		System.out.println("################################");
		Power power1=new Power("scalar","real power");
		Power.staticPower();
		power1.instancePower();
		
	}

}