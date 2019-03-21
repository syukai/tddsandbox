package com.example.part3;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;
import java.time.temporal.TemporalUnit;

import org.junit.jupiter.api.Test;

class MyDateTest {

	@Test
	void test() {
		assertEquals(new MyDate("2019-02-28"), new MyDate("2019-03-01").yesterday());
	}

	private static class MyDate{
		final LocalDate date;
		MyDate(String dateString) {
			date = LocalDate.parse(dateString);
			
		}
		MyDate(LocalDate date) {
			this.date = date;
		}
		MyDate yesterday(){
			return new MyDate(date.minusDays(1));
		}
		
		public boolean equals(Object object) {
			return date.equals(((MyDate)object).date);
		}
	}
}
