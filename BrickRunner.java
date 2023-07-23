class BrickRunner{
	public static void main(String[] args)
	{
		System.out.println("Running main in brickrunner");
		
		Brick brick=new Brick("square",20);
		Brick.staticBrick();
		brick.instanceBrick();
		
		System.out.println("################################");
		Brick brick1=new Brick("cuboid",100);
		Brick.staticBrick();
		brick1.instanceBrick();
		
	}
}