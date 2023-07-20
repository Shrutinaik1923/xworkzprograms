public class WoodMain{
	public static void main(String[] args){
		
		Wood wood = new Wood("Large");
		System.out.println("\n");
		
		Wood wood1 = new Wood("Large", 1000);
		System.out.println("\n");
		
		Wood wood2 = new Wood("Large", 1000,"Decorative");
		System.out.println("\n");
		
		Wood wood3 = new Wood("Large", 1000, "Decorative", "Neem");
		System.out.println("\n");
		
		Wood wood4 = new Wood("Large", 1000, "Decorative", "Neem", true);
	}	
}