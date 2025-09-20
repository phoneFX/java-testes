package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Program {

	public static void main(String[] args) {
		
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		
		LocalDate d01 = LocalDate.now();
		
		
		System.out.println("d01: " + d01);
		
		
		LocalDateTime d02 = LocalDateTime.now();
		
		System.out.println("d02: " + d02);
		
		Instant d03 = Instant.now();
		
		System.out.println("d03: " + d03);
		
		
		LocalDate d04 = LocalDate.parse("2025-07-21");
		
		System.out.println("d04: " + d04);
		
		LocalDateTime d05 = LocalDateTime.parse("2025-07-21T23:01:00");
		
		System.out.println("d05: " + d05);
		
		Instant d06 = Instant.parse("2025-07-21T03:01:00Z");
		
		System.out.println("d06: " + d06);

		Instant d07 = Instant.parse("2025-04-11T00:22:00-03:00");
		
		System.out.println("d07: " + d07);
		
		LocalDate d08 = LocalDate.parse("11/04/2025", fmt1);
		
		System.out.println("d08: " + d08);
		
		LocalDateTime d09 = LocalDateTime.parse("14/07/2025 14:30", fmt2);
		
		System.out.println("d09: " + d09);
		
		LocalDate d10 = LocalDate.of(2025, 4, 14);
		
		System.out.println("d10: " + d10);
		
		LocalDateTime d11 = LocalDateTime.of(2025, 04, 14, 14, 30);
		
		System.out.println("d11: " + d11);
	
	}

}
