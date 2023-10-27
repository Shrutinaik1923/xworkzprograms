package collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Cities {

	public static void main(String[] args) {
       Collection<String> city=new ArrayList();
       city.add("Karwar");
       city.add("Honnavar");
       city.add("Ankola");
       city.add("Ujire");
       city.add("Dharmasthala");
       
       city.add("vasco");
       city.add("RajajiNagar");
       city.add("Kumta");
       city.add("Marthalli");
       city.add("Kundapura");
  
       city.add("Kolhapura");
       city.add("bhatkal");
       city.add("Halyal");
       city.add("Shivmoga");
       city.add("Sirsi");
    
       city.add("Yallapur");
       city.add("Udupi");
       city.add("Dharwad");
       city.add("Hubli");
       city.add("Gulbarga");
       
       System.out.println("total number of cities :"+city.size());
       Iterator<String>itr=city.iterator();
       while(itr.hasNext())
       {
    	   String value=itr.next();
    	   System.out.println("laptop model is:"+value);
       }
       
	}

}
