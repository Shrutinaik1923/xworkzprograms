package com.xworkz.inheritancesuperchaining.boot;

import com.xworkz.inheritancesuperchaining.app.GableRoof;
import com.xworkz.inheritancesuperchaining.app.Roof;

public class RoofRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Roof roof=new Roof();
		this(roof.type);
		this(roof.colour);
		this(roof.isDurable);
		this(roof.price);
		Roof GableRoof=new GableRoof();
		this(GableRoof.type);
		this(GableRoof.colour);
		this(GableRoof.isDurable);
		this(GableRoof.price);




	}

}
