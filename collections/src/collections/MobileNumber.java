package collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class MobileNumber {
	public static void main(String[] args) {
		Collection<Long> mobileNumber=new ArrayList();
		mobileNumber.add(9148735391L);
		mobileNumber.add(9148735392L);
		mobileNumber.add(9148735393L);
		mobileNumber.add(9148735395L);
		mobileNumber.add(9148735396L);
		mobileNumber.add(9148735397L);
		
		mobileNumber.add(9148735398L);
		mobileNumber.add(9148735399L);
		mobileNumber.add(9148735390L);
		mobileNumber.add(9148735315L);
		mobileNumber.add(9148735326L);
		mobileNumber.add(9148735337L);
		
		mobileNumber.add(9148735301L);
		mobileNumber.add(9148735342L);
		mobileNumber.add(9148735353L);
		mobileNumber.add(9148735365L);
		mobileNumber.add(9148735376L);
		mobileNumber.add(9148735387L);
		
		mobileNumber.add(9148735191L);
		mobileNumber.add(9148735292L);
		mobileNumber.add(9148735493L);
		mobileNumber.add(9148735595L);
		mobileNumber.add(9148735696L);
		mobileNumber.add(9148735797L);
		
		mobileNumber.add(9148735891L);
		mobileNumber.add(9148735992L);
		mobileNumber.add(9148731393L);
		mobileNumber.add(9148732395L);
		mobileNumber.add(9148733396L);
		mobileNumber.add(9148734397L);
		
		System.out.println("Total elemrnts:"+mobileNumber.size());
		Iterator<Long> itr=mobileNumber.iterator();
		while(itr.hasNext())    //hashNext will check whether the next element is present or not
		{
			Long value=itr.next();  //access all the element
			System.out.println("MobileNumber is:" +value);
			}
	}
	

}
