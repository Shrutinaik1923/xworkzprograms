package collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IndianState {
	public static void main(String[] args) {
		Collection<String>indianState =new ArrayList();
		indianState.add("Karnataka");
		indianState.add("Goa");
		indianState.add("Bihar");
		indianState.add("Chattisghar");
		indianState.add("Gujarat");
		indianState.add("Maharasthra");

		
		indianState.add("Assam");
		indianState.add("Manipur");
		indianState.add("Arunachal-Pradesh");
		indianState.add("West Bengal");
		indianState.add("Jharkhand");
		indianState.add("Kerala");

		
		
		indianState.add("Haryan");
		indianState.add("Himachal Pradesh");
		indianState.add("Punjab");
		indianState.add("Sikkim");
		indianState.add("Madhya Pradesh");
		indianState.add("Odisha");

		
		indianState.add("Tamil Nadu");
		indianState.add("Goa");
		indianState.add("Mizoram");
		indianState.add("Tripura");
		indianState.add("Rajasthan");
		indianState.add("Uttara Pradesh");

		
		indianState.add("Nagaland");
		indianState.add("Telangana");
		indianState.add("Meghalaya");
		indianState.add("Delhi");
		indianState.add("Jammu & Kashmir");
		indianState.add("UttaraKhand");
		
		System.out.println("Total Number of States:"+indianState.size());
		Iterator<String> itr=indianState.iterator();
		while(itr.hasNext())
		{
			String value=itr.next();
			System.out.println("indianState is :"+value);
		}
		
	}

}
