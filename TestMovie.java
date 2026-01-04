package lab2022;
import java.util.Scanner;
public class TestMovie {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		Movie m;
		int num;
		boolean exit= true;
		
		System.out.println("Welcome to the Cinema Ticket System\n");
		System.out.print("Please enter movie name, price, and tickets: ");
		String name = read.next();
		double price = read.nextDouble();
		int tickets = read.nextInt();
		m = new Movie (name , price, tickets);
		
		

		
		
		
		do {
			
			System.out.println("-----------------\n"+"Please choose from the following options:\n"+ "1- Display Movie Information      2- Edit Movie Information\n"+ "3- Sell Movie Tickets             4- Add Movie Tickets\n"+ "5- Exit\n"+ "-----------------");
			System.out.print("Enter your option: ");
			int userch = read.nextInt();
			
			switch (userch)
			{
			
			case 1:
				m.display();
				break;
			case 2:
			{
				System.out.print("Please enter movie name, price, and tickets: ");
				name = read.next();
				price = read.nextDouble();
				tickets = read.nextInt();
				
				m.setName(name);
				m.setPrice(price);
				m.setTickets(tickets);
				m.setProfit(0.0);
				m.setSellTickets(0);
				m.setRemaintickets(tickets);
				
				
				
				System.out.println("The new information of the movie is: ");
				m.display();
				break;
			}
				
			case 3:
			{
				System.out.print("Please enter how many tickets you want to sell: ");
				num = read.nextInt();
				if (m.sellTickets(num))
					System.out.println(num + " tickets have been sold");
				
				else 
				{
					if (num<0)
						System.out.println("Tickets must be positive!");
					else
						System.out.println("Sorry we don't have enough tickets!");
				}
				

				break;
	
			}
			
			case 4:
			{
				System.out.print("Please enter how many tickets you want to sell: ");
				num = read.nextInt();
				m.addTickets(num);
				break;
			}
				
				
			case 5: 
			{
				System.out.println("Thanks Goodbye!");
				exit = false;
				break;
			}
			
			default :
			{
				System.out.println("Wrong input please try again!");
				break;
			}
			
			
			
			
			
			
			}
			
			
		} while (exit);
		
		
		
		read.close();
	}

}
