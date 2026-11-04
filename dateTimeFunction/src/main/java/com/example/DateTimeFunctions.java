package com.example;

import java.time.*;

public class DateTimeFunctions {
	/*
	 * Implement the method so that whenever code is executed
	 * today's date is returned back properly
	 */
	public static LocalDate getTodaysDate() {
		//Write code here - begin
		LocalDate today = LocalDate.now();
		return today;
		//Write code here - end
		
	}
	
	/*
	 * Implement the method so that the date which is x days later 
	 * the date passed as an input is returned back properly.
	 *  
	 */
	public static LocalDate getLaterDatebyDays(LocalDate date, int x) {
		//Write code here - begin
		LocalDate newDate = date.plusDays(x);
		return newDate;
		//Write code here - end
		
	} 
	
	/*
	 * Implement the method so that the date which is x weeks prior to
	 * the date passed as an input is returned back properly.
	 *  
	 */
	public static LocalDate getPreviousDatebyWeeks(LocalDate date, int x) {
		//Write code here - begin
		LocalDate newDate = date.minusWeeks(x);
		return newDate;
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
		Period p = Period.between(date1, date2);
		int years = p.getYears();
		int months = p.getMonths();
		int days = p.getDays();
		String str = "Years-"+years+":"+"Months-"+months+":"+"Days-"+days;
		return str;
		//Write code here - end
		
	} 

	public static void main(String[] args) {
		System.out.println("Today's date is : "+getTodaysDate());
		System.out.println("Date after 10 days is : "+getLaterDatebyDays(getTodaysDate(), 10));
		System.out.println("Date 5 weeks ago is : "+getPreviousDatebyWeeks(getTodaysDate(), 5));
		System.out.println("Time difference is : "+getTimeDifference(getTodaysDate(), getLaterDatebyDays(getTodaysDate(), 10)));
	}
}
