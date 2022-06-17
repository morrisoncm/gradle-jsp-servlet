package com.demo.web.utils;

import org.joda.time.Days;
import org.joda.time.LocalDate;

public class DateUtils {

	public int daysToNewYear() {
		var fromDate = new LocalDate();
		var newYear = fromDate.plusYears(1).withDayOfYear(1);
		return Days.daysBetween(fromDate, newYear).getDays();
	}
}
