package com.xworkz.fourteen.boot;

import com.xworkz.fourteen.app.Building;
import com.xworkz.fourteen.app.InstitutionalBuilding;

public class BuildingRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("invoking main in buildingRunner");
        Building building=new InstitutionalBuilding();
        building.agricultural();
        building.commerciaal();
        building.cultural();
        building.governmental();
        building.healthcare();
        building.hospitality();
        building.industrail();
        building.religious();
        building.research();
        building.retail();
      
	}

}
