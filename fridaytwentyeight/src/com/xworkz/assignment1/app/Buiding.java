package com.xworkz.assignment1.app;

public class Buiding {
	public Floor[] floor;
	public Lift[] lift;
	
	public Buiding(Floor[] floor,Lift[] lift)
	{
		this.floor=floor;
		this.lift=lift;
	}
		public void printInfo() {
			
			for(int index=0; index< floor.length; index++) {
				System.out.println("Floors details are: ");
				Floor ref=this.floor[index];
				ref.PrintInfo();
				System.out.println("***********************************");
			}
			
			for(int index=0; index< lift.length; index++) {
				System.out.println("Lift details are: ");
				Lift ref=this.lift[index];
				ref.PrintInfo();
				System.out.println("***********************************");

			}
		
		}

	
		
		
		
	}


