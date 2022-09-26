package com.ticket;

import java.util.Scanner;

public class Tickets {

	int ticketid;
	int price;
	static int availableTickets;
	
	public int calculateTicketCost(int noOfTickets) {
		Scanner tc=new Scanner(System.in);
		if(noOfTickets<availableTickets) {
			System.out.println("Enter the ticketid");
			ticketid=tc.nextInt();
			System.out.println("Enter the price");
			price=tc.nextInt();
			System.out.println("Enter the no of tickets");
			int tic=tc.nextInt();
			System.out.println("Available tickets");
			price=tc.nextInt();
			
			System.out.println("Available tickets : "+availableTickets);
			int totalPrice= tic*price;
			
			availableTickets=availableTickets-noOfTickets;
			return totalPrice;
			
		}
		return -1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of bookings :");
		int numtic=sc.nextInt();
		System.out.println("Enter the available tickets :");
		availableTickets=sc.nextInt();
		
		for(int i=0;i<numtic;i++) {
			Tickets t1=new Tickets();
			System.out.println("Total amount : "+t1.calculateTicketCost(numtic));
			System.out.println("Available ticket after booking : "+availableTickets);
		}

	}

}
