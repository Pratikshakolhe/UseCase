package caseStudy;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.TreeMap;

public class Ticket {
	
	private int count;
	private String pnr;
	private LocalDate travelDate;
	private Train train;
	private TreeMap<Passenger , Double> passengers;
	
	
	
	public Ticket(LocalDate travelDate, Train train) {
		super();
		this.travelDate = travelDate;
		this.train = train;
	}



	public Ticket(int count, String pnr, LocalDate travelDate, Train train, TreeMap<Passenger, Double> passengers) {
		super();
		this.count = count;
		this.pnr = pnr;
		this.travelDate = travelDate;
		this.train = train;
		this.passengers = passengers;
		
		
	}



	public int getCount() {
		return count;
	}



	public void setCount(int count) {
		this.count = count;
	}



	public String getPnr() {
		return pnr;
	}



	public void setPnr(String pnr) {
		this.pnr = pnr;
	}



	public LocalDate getTravelDate() {
		return travelDate;
	}



	public void setTravelDate(LocalDate travelDate) {
		this.travelDate = travelDate;
	}



	public Train getTrain() {
		return train;
	}



	public void setTrain(Train train) {
		this.train = train;
	}



	public TreeMap<Passenger, Double> getPassengers() {
		return passengers;
	}



	public void setPassengers(TreeMap<Passenger, Double> passengers) {
		this.passengers = passengers;
	}



	@Override
	public String toString() {
		return "Ticket [count=" + count + ", pnr=" + pnr + ", travelDate=" + travelDate + ", train=" + train
				+ ", passengers=" + passengers + "]";
	}
	public String generatepnr()
	{
		String S=String.valueOf(train.getSource().charAt(0));
		String D=String.valueOf(train.getDestination().charAt(0));
		String date=travelDate.format(DateTimeFormatter.ofPattern("yyy/MM/dd"));
		String pnr=S+D+"-"+date +"-"+count++;
		
		if(travelDate.isAfter(LocalDate.now()))
			return pnr;
		else 
			return "Please enter valid date";
		
	}
	
	double calPassengerFare(Passenger Passenger)
	{
		if(Passenger.getAge()<=12)
			return (0.5)*(train.getTicketPrice());

		else if(Passenger.getAge()<=60)
				return (0.6)*(train.getTicketPrice());
		else if(Passenger.getGender()=='F')
			return (0.25)*(train.getTicketPrice());
		else
			return train.getTicketPrice();
	}
	
	public void addPassenger(String name,int age,char gender) throws NullPointerException
	{
		passengers=new TrreMap();
		Integer fare=(int) calPassengerFare(new Passenger(name,age,gender));
		passengers.put(new Passenger(name,age,gender),fare);
		
		
	}
	
			
			
			
		
			
			


			
			
			
			
			

	
	}
	
	
	
	
	

}
