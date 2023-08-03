package com.xworkz.inheritancetwolevel.app;

	public class TalkingParrot extends Parrot {
		public double weight;
		public TalkingParrot()
		{
			System.out.println("No arg constructor talkingparrot");
		}
		public void speak()
			{
				System.out.println("Invoking speak() in TalkingParrot");
			}

}
