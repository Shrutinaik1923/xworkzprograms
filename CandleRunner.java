class CandleRunner
{
	public static void main(String[] args)
	{
		Candle candle = new Candle('M', 10);
		candle.candleInstanceVarMethod();
		Candle.candleStaticVarMethod();
		System.out.println("\n");
	}
}