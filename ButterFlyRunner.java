class ButterFlyRunner
{
	public static void main(String[] args)
	{
		ButterFly butterfly = new ButterFly(2, "Inside  Body");
		butterfly.instanceVarMethod();
		ButterFly.staticVarMethod();
		System.out.println("\n");
	}
}