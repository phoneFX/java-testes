package application;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Program {

	public static void main(String[] args) {
		
		/* LocalDate d01 = LocalDate.parse("2025-05-12");
		 LocalDateTime d02 = LocalDateTime.parse("2025-05-12T23:49:00");
		 Instant d03 = Instant.parse("2025-05-12T23:50:00Z");
		
		LocalDate r01 = LocalDate.ofInstant(d03, ZoneId.systemDefault());
		LocalDate r02 = LocalDate.ofInstant(d03, ZoneId.of("Portugal"));
		
		System.out.println(r01);
		System.out.println(r02);
		 
		
		LocalDateTime r03 = LocalDateTime.ofInstant(d03, ZoneId.systemDefault());
		LocalDateTime r04 = LocalDateTime.ofInstant(d03, ZoneId.of("Portugal"));

		System.out.println(r03);
		System.out.println(r04);
		
		
		System.out.println("D01 Dia: "+  d01.getDayOfMonth());
		
		System.out.println("D01 Mês: " + d01.getMonth()); 
		System.out.println("D01 Ano: " + d01.getYear()); 
		
		
		System.out.println("D02 Hora: "+ d02.getHour());
		System.out.println("D02 Minuto: "+ d02.getMinute());*/
		
		
		LocalDate d01 = LocalDate.parse("2020-03-13");
		LocalDateTime d02 = LocalDateTime.parse("2020-04-01T20:00:00");
		Instant d03 = Instant.parse("2020-04-01T20:00:00Z");
		
		LocalDate pastWeekLocalDate = d01.minusWeeks(1);
		
		System.out.println("Semana anterior de d01: " + pastWeekLocalDate);
		
		LocalDate nexWeekLocalDate = d01.plusWeeks(1);
		
		System.out.println("Semana depois de d01: " + nexWeekLocalDate);
		
		
		LocalDateTime pastWeekLocalDateTime = d02.minusWeeks(1);
		
		System.out.println("Semana anterior de d02: " + pastWeekLocalDateTime);
		
		LocalDateTime nexWeekLocalDateTime = d02.plusWeeks(1);
		
		System.out.println("Semana depois de d02: " + nexWeekLocalDateTime);
		
		
		Instant pastWeekInstant = d03.minus(7, ChronoUnit.DAYS);
		
		System.out.println("Semana anterior de d03: " + pastWeekInstant);
		
		Instant nexWeekInstant = d03.plus(7, ChronoUnit.DAYS);
		
		System.out.println("Semana depois de d03: " + nexWeekInstant);
		
		
		Duration t01 = Duration.between(pastWeekLocalDate.atStartOfDay(), d01.atStartOfDay());
		Duration t02 = Duration.between(pastWeekLocalDateTime, d02);
		Duration t03 = Duration.between(d03, pastWeekInstant);
		
		
		
		
		System.out.println("T01 dias: "+ t01.toDays());
		System.out.println("T02 dias: "+ t02.toDays());
		System.out.println("T03 dias: "+ t03.toDays());
		
		
		 

	}

}
