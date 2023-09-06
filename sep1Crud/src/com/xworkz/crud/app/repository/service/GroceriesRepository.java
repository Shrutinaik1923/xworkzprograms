package com.xworkz.crud.app.repository;

public class GroceriesRepository implements Grocery {
    private String[] groceries=new String[TOTAL_ITEMS];
    private int position;
	@Override
	public void save(String groceries) {
		if(position<TOTAL_ITEMS)
		{
			this.groceries[position]=groceries;
			this.position++;
			System.out.println("total grocery items"+groceries+"at"+position);
		}
		else
		{
			System.out.println("data size is exceeds");
		}
		
	}
	

}
