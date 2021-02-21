package caseStudy;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

import java.util.Scanner;


public class TrainDao {
	
	public Train findTrain(int trainNumber)
	{
		int id= trainNumber;
		Train train=null;
		
		try
		{
			//step 1
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("class found");
			
			//step 2
			
			Connection con=DriverManager.getConnection("jdbc:mysql//localhost:3307/traininfo?autoReconnect=true&useSSL=false","root","root");
			System.out.println("Connected");
			
			
			
			
		}
		catch(Exception e)
		{
			System.out.println(e);
			
			
		}
	
		
		
		


		
		
	}

}
