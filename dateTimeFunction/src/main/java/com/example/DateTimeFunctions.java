package com.example;

import java.time.*;

public class DateTimeFunctions {
	/*
	 * Implement the method so that whenever code is executed
	 * today's date is returned back properly
	 */
	public static LocalDate getTodaysDate() {
		//Write code here - begin
		return null; // Replace this with the actual implementation to return today's date
		//Write code here - end
		
	}
	
	/*
	 * Implement the method so that the date which is x days later 
	 * the date passed as an input is returned back properly.
	 *  
	 */
	public static LocalDate getLaterDatebyDays(LocalDate date, int x) {
		//Write code here - begin
		return null; // Replace this with the actual implementation to return the date x days later
		//Write code here - end
		
	} 
	
	/*
	 * Implement the method so that the date which is x weeks prior to
	 * the date passed as an input is returned back properly.
	 *  
	 */
	public static LocalDate getPreviousDatebyWeeks(LocalDate date, int x) {
		//Write code here - begin
		return null; // Replace this with the actual implementation to return the date x weeks prior
		//Write code here - end
		
	} 
	
	/*
	 * Implement the method so that the time difference in terms of Years, Months
	 * and Days would be return back perfectly between 2 given dates
	 * Return the String only in this format : "Year-20:Months-5:Days-1"
	 *  
	 */
	public static String getTimeDifference(LocalDate date1, LocalDate date2) {
		//Write code here - begin
		return null; // Replace this with the actual implementation to return the time difference in the specified format
		//Write code here - end
		
	} 

	public static void main(String[] args) {
		System.out.println("Today's date is : "+getTodaysDate());
		System.out.println("Date after 10 days is : "+getLaterDatebyDays(getTodaysDate(), 10));
		System.out.println("Date 5 weeks ago is : "+getPreviousDatebyWeeks(getTodaysDate(), 5));
		System.out.println("Time difference is : "+getTimeDifference(getTodaysDate(), getLaterDatebyDays(getTodaysDate(), 10)));
	}
}
