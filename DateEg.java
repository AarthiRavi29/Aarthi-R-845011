package com.recap;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;

public class DateEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Date date = new Date();
System.out.println("Date class: "+date);
System.out.println("Date class  with to String method : "+date.toString());

SimpleDateFormat ft = new SimpleDateFormat("E YYYY.MM.dd 'at' hh:mm:ss a ZZZ");
System.out.println("Current date with user format: "+ft.format(date));
/*
 * E -> day in words
 * Y->year
 * M->month
 * m->minutes
 * d->day
 * h->hours
 * s->seconds
 * a->Am/Pm
 * Z->zone
 * 
 */

// java 8 version
LocalDate date1 = LocalDate.now();
LocalDate yesterday = date1.minusDays(3);
//return type of date1 is local date
System.out.println("Today date : "+date1);
System.out.println("Yesterday  date : "+yesterday);

LocalTime time = LocalTime.now();
System.out.println("LocalTime :"+time);
	}

}
