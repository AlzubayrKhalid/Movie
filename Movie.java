package lab2022;

public class Movie {
	private String name;
	private double price;
	private int tickets;
	private double profit= 0.0;
	public int sellTickets;
	public int remaintickets;
	
	public Movie ()
	{
		name = "NA";
		price = 100;
	}
	
	public Movie (String name, double price, int tickets)
	{
		this.name= name;
		this.price= price;
		this.tickets= tickets;
		remaintickets = tickets;

	}
	
	
	public void display()
	{
		System.out.println("Movie Name: "+ name);
		System.out.printf("Ticket Price: %.1f SR\n",price);
		System.out.printf("Available Tickets: %d tickets\n",remaintickets);
		System.out.println("Movie Profit: "+ profit);
	}
	

	public boolean sellTickets(int num)
	{
		if (remaintickets>=num && num>=1)
		{
			remaintickets -= num;
			profit = profit + (price*num);
			return true;
		}
		
		else
		{
			return false;
		}
		
		
		
	}
	
	
	public void addTickets(int num)
	{
		if (num>= 0)
		{
			remaintickets += num;
			System.out.println(num + " Tickets has been added");
		}
		
		else
			System.out.println("Tickets must be positive!");
			
	}
	
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getTickets() {
		return tickets;
	}

	public void setTickets(int tickets) {
		this.tickets = tickets;
	}

	public double getProfit() {
		return profit;
	}

	public void setProfit(double profit) {
		this.profit = profit;
	}

	public int getSellTickets() {
		return sellTickets;
	}

	public void setSellTickets(int sellTickets) {
		this.sellTickets = sellTickets;
	}

	public int getRemaintickets() {
		return remaintickets;
	}

	public void setRemaintickets(int remaintickets) {
		this.remaintickets = remaintickets;
	}
	
	
	


}
