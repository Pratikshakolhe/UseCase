package caseStudy;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class TicketApplication {

	public static void main(String[] args) {
		
		System.out.println("======Ticket Application=====");
		TrainDao trainDao=new TrainDao();
		DateTimeFormatter df=DateTimeFormatter.ofPattern("yyy/MM/dd");
		
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the  train id");
		
		Train train=trainDao.findTrain(scanner.nextInt());
		System.out.println("Price is "+train.getTicketPrice());
		
		System.out.println("Enter the  travel date");
		String travelDate=scanner.next();
		LocalDate date=LocalDate.parse(travelDate,df);
		System.out.println("travelDate "+ date);
		
		
		
		
		
		
		

	}

}

