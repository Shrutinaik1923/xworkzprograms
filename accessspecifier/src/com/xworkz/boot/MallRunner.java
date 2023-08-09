package com.xworkz.boot;

import com.xworkz.app.accessspecifier.LuluMall;
import com.xworkz.app.accessspecifier.Mall;

public class MallRunner {

	public static void main(String[] args) {
	
			System.out.println("Running main in MallRunner");
			Mall mall=new  Mall();
			mall.store();
			
			Mall mall1=new Mall();
			mall1.store("Mantri Mall");
			
			Mall mall2=new  Mall();
			mall2.store('s');
			
			Mall mall3=new  Mall();
			mall3.store(8);
			
			Mall mall4=new  Mall();
			mall4.store("Bnaglore",10);
			
			Mall mall5=new  Mall();
			mall5.store("Mantri Mall",'s',8,10);
			
			Mall luluMall=new  LuluMall();
			luluMall.store();
			
			Mall luluMall1=new  LuluMall();
			luluMall1.store("central mall");
			
			Mall luluMall2=new  LuluMall();
			luluMall2.store('l');
			
			Mall luluMall3=new  LuluMall();
			luluMall3.store("10");
			
			Mall luluMall4=new  LuluMall();
			luluMall4.store("Central Mall",8);
			
			Mall luluMall5=new  LuluMall();
			luluMall5.store("central mall",'l',10,8);


		}

	}


