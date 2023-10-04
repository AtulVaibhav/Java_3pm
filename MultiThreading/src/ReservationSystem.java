
class TicketBooking{
	static int availableSeats = 10;
	public synchronized void bookTicket(String username,int requestedSeats){
		try {
			System.out.println(username+" requested for "+requestedSeats+" seats");
		    System.out.println("Checking for availability...Please wait");
			Thread.sleep(2000);
			
			if(availableSeats>=requestedSeats){
				System.out.println("Seats booked successfully");
				availableSeats = availableSeats - requestedSeats;
			}else{
				System.out.println("Seats not available..Sorry for inconvience");
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}


class User1 extends Thread{
	String username;
	int requestedSeats;
	TicketBooking ticketBooking;
	public User1(String username, int requestedSeats, TicketBooking ticketBooking) {
		super();
		this.username = username;
		this.requestedSeats = requestedSeats;
		this.ticketBooking = ticketBooking;
	};
	
	public void run(){
		ticketBooking.bookTicket(username, requestedSeats);
	}
	
	
	
}


class User2 extends Thread{
	String username;
	int requestedSeats;
	TicketBooking ticketBooking;
	public User2(String username, int requestedSeats, TicketBooking ticketBooking) {
		super();
		this.username = username;
		this.requestedSeats = requestedSeats;
		this.ticketBooking = ticketBooking;
	};
	
	public void run(){
		ticketBooking.bookTicket(username, requestedSeats);
	}
	
	
	
}

public class ReservationSystem {

	public static void main(String[] args) {
		TicketBooking ticketBooking = new TicketBooking();
		User1 user1 = new User1("Harsh",7,ticketBooking);
		User2 user2 = new User2("Ravi",5,ticketBooking);
		user1.start();
		user2.start();
	}

}

//deadlock
//interthread communication
