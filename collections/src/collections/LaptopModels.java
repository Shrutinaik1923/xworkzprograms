package collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class LaptopModels {

	public static void main(String[] args) {
       Collection<String>laptopModel=new ArrayList();
       laptopModel.add("HP Chromebook X360");
       laptopModel.add("Asus Aspire Lite AMD Ryzen 5");
       laptopModel.add("Asus Vivobook 15");
       laptopModel.add("Asus Vivobook Go 14");
       laptopModel.add("Asus Vivobook 14");
       laptopModel.add("Asus Creator Series Vivobook");
       laptopModel.add("ASUS Zenbook 14 OLED");
       laptopModel.add("Xiaomi Notebook");
       laptopModel.add("HP Laptop 15s");
       laptopModel.add("ASUS Creator Series Vivobook");
       
       laptopModel.add("ASUS");
       laptopModel.add("HP Laptop 14s");
       laptopModel.add("Chuwi HeroBook Pro 14.1");
       laptopModel.add("Asus Vivobook 16");
       laptopModel.add("Asus Vivobook 15x");
       laptopModel.add("HP Laptop 15s");
       laptopModel.add("Acer Aspire Lite Premium Metal  Laptop");
       laptopModel.add("Asus Vivobook 16x");
       laptopModel.add("Asus Vivobook 15 OLED");
       laptopModel.add("HP 14s");
       
       laptopModel.add("HP 15s");
       laptopModel.add("Asus Vivobook GO 15");
       laptopModel.add("Asus Vivobook Pro 15");
       laptopModel.add("Acer");
       laptopModel.add("Dell");
       laptopModel.add("Lenovo");
       laptopModel.add("Apple");
       laptopModel.add("Apple MNEH3HNA MacBook Air");
       laptopModel.add("Apple MNEH3HNA MacBook Pro");
       laptopModel.add("Dell XPS 17");

       laptopModel.add("Dell XPS 15");
       laptopModel.add("Dell XPS 16");
       laptopModel.add("Dell Inspiration 16");
       laptopModel.add("Dell Allienware x 16");
       laptopModel.add("Dell Allienware  16");
       laptopModel.add("Dell Allienware m 18");
       laptopModel.add("Dell XPS 13");
       laptopModel.add("Dell G15");
       laptopModel.add("Dell Vostro");
       laptopModel.add("Dell Latitude");
       
       laptopModel.add("Dell XPS 17");
       laptopModel.add("Dell XPS 15");
       laptopModel.add("Dell G15");
       laptopModel.add("Dell G3 15 3500");
       laptopModel.add("Asus Inspiration 7375");
       laptopModel.add("Dell ChromeBook");
       laptopModel.add("Lenovo ideapad");
       laptopModel.add("Lenovo Yoga 9i");
       laptopModel.add("Lenovo ideaPad");
       laptopModel.add("ASUS Tuf Gaming");
       
       System.out.println("Total Number of LaptopModes are :"+laptopModel.size());
       Iterator<String> iter=laptopModel.iterator();
       while(iter.hasNext())
       {
    	   String value=iter.next();    
    	   System.out.println("laptopModel is:"+value);
       }
       
       
	}

}
