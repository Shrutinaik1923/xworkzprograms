package com.xworkz.boot.accessspecifier;

import com.xworkz.app.accessspecifier.Market;
import com.xworkz.app.accessspecifier.StockMarket;

public class MarketRunner {

	public static void main(String[] args) {
		System.out.println("invoking main in MarketRunner");
		Market market=new Market();
		market.sell();
		market.sell("Grand Bazar");
		market.sell(10);
		market.sell(10,true);
		market.sell(6,"delhi");
		market.sell("Grand Bazar","delhi",10,6);
		
		Market stockMarket=new StockMarket();
		stockMarket.sell();
		stockMarket.sell("Grand Bazar");
		stockMarket.sell(10);
		stockMarket.sell(10,true);
		stockMarket.sell(6,"delhi");
		stockMarket.sell("Grand Bazar","delhi",10,6);

	}

}
