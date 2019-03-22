package HouseConstruction;

public class houseConstructionExpense {
	public int calc(String mstandard,double area, String fah) {
		if(mstandard.equals("high standard materials") && fah.equals("Fully Automated Home"))
		{
			return (int) (2500*area);
		}
	   else if(mstandard.equals("standard materials"))
		{
			return (int) (area*1200);
		}
		else if(mstandard.equals("above standard materials"))
		{
			return (int) (1500*area);
		}
		else if(mstandard.equals("high standard materials"))
		{
			return (int) (1800*area);
		}
		return 0;
		
	}

}
