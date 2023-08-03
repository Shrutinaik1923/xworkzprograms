package com.xworkz.iheritancecasting.boot;

import com.xworkz.iheritancecasting.app.Browser;
import com.xworkz.iheritancecasting.app.BrowserUtil;
import com.xworkz.iheritancecasting.app.ChromeBrowser;
import com.xworkz.iheritancecasting.app.Edge;
import com.xworkz.iheritancecasting.app.FireFoxBrowser;
import com.xworkz.iheritancecasting.app.OperaBrowser;

public class BrowserRunner {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Browser browser=new Browser();
		ChromeBrowser chromeBrowser=new ChromeBrowser();
		FireFoxBrowser fireFoxBrowser=new FireFoxBrowser();
		OperaBrowser  operaBrowser=new OperaBrowser();
		Edge edge=new Edge();
		
		BrowserUtil.run(operaBrowser);
		BrowserUtil.run(fireFoxBrowser);
		BrowserUtil.run(chromeBrowser);
		BrowserUtil.run(edge);	
		
		

	}

}
