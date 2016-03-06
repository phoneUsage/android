package edu.dartmouth.phoneusage.utils;

import java.util.Calendar;

/**
 * Created by SujayBusam on 3/4/16.
 *
 * Calendar-related static utility functions.
 */
public class CalendarUtil {

	/**
	 * Return a Calendar instance set to the start of day (00:00:00:000) of the given month, day, year.
	 *
	 * IMPORTANT: For the month parameter use something like Calendar.MARCH (not the int 3)!!
	 */
	public static Calendar calendarForDateStart(int month, int day, int year) {
		Calendar calendar = Calendar.getInstance();
		calendar.set(Calendar.HOUR_OF_DAY, 0);
		calendar.set(Calendar.MINUTE, 0);
		calendar.set(Calendar.SECOND, 0);
		calendar.set(Calendar.MILLISECOND, 0);
		calendar.set(Calendar.MONTH, month);
		calendar.set(Calendar.DAY_OF_MONTH, day);
		calendar.set(Calendar.YEAR, year);
		return calendar;
	}

	/**
	 * Return a Calendar instance set to the end of day (23:59:59:999) of the given month, day, year.
	 *
	 * IMPORTANT: For the month parameter use something like Calendar.MARCH (not the int 3)!!
	 */
	public static Calendar calendarForDateEnd(int month, int day, int year) {
		Calendar calendar = Calendar.getInstance();
		calendar.set(Calendar.HOUR_OF_DAY, 23);
		calendar.set(Calendar.MINUTE, 59);
		calendar.set(Calendar.SECOND, 59);
		calendar.set(Calendar.MILLISECOND, 999);
		calendar.set(Calendar.MONTH, month);
		calendar.set(Calendar.DAY_OF_MONTH, day);
		calendar.set(Calendar.YEAR, year);
		return calendar;
	}

	/**
	 * Return a Calendar instance set to the start of day (00:00:00:000) of last Sunday, which may
	 * be today.
	 */
	public static Calendar calendarForLastSundayStart() {
		Calendar calendar = Calendar.getInstance();
		calendar.add(Calendar.DAY_OF_WEEK, -(calendar.get(Calendar.DAY_OF_WEEK) - 1));
		calendar.set(Calendar.HOUR_OF_DAY, 0);
		calendar.set(Calendar.MINUTE, 0);
		calendar.set(Calendar.SECOND, 0);
		calendar.set(Calendar.MILLISECOND, 0);
		return calendar;
	}

	/**
	 * Return a Calendar instance set to the end of day (23:59:59:999) of this Saturday, which may
	 * be today.
	 */
	public static Calendar calendarForThisSaturdayEnd() {
		Calendar calendar = Calendar.getInstance();
		calendar.add(Calendar.DAY_OF_WEEK, calendar.get(Calendar.DAY_OF_WEEK) - Calendar.SATURDAY);
		calendar.set(Calendar.HOUR_OF_DAY, 23);
		calendar.set(Calendar.MINUTE, 59);
		calendar.set(Calendar.SECOND, 59);
		calendar.set(Calendar.MILLISECOND, 999);
		return calendar;
	}

	/**
	 * Create and return a Calendar instance from the given milliseconds.
	 */
	public static Calendar calendarFromMillis(long millis) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTimeInMillis(millis);
		return calendar;
	}
}
