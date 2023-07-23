class ButterFly{
	static int legs;
	static int wings;
	int noOfAntena;
	String digestiveTract;
	
    void instanceVarMethod(){
		System.out.println("Number of Antena is :"+noOfAntena+"digestiveTract is:"+digestiveTract);
	}
	
	static void staticVarMethod(){
		System.out.println("no of leg is"+legs+"no of wings is"+wings);
	}
	
	ButterFly(int noOfAntena, String digestiveTract){
		this.noOfAntena = noOfAntena;
		this.digestiveTract = digestiveTract;
	}
	
	static{
		legs = 6;
		wings = 4;
	}
}