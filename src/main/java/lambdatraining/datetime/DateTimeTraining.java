package lambdatraining.datetime;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.time.OffsetTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

public class DateTimeTraining {

	public static void main(String[] args) {
		
		LocalDate date = LocalDate.now();
		LocalDateTime dateTime = LocalDateTime.now();
		LocalTime time = LocalTime.now();
		
		System.out.println("LocalDate :: " + date);
		System.out.println("LocalTime:: " + time);
		System.out.println("LocalDateTime :: " + dateTime );
		System.out.println("LocalDateTime Zoned:: " + LocalDateTime.now(ZoneId.of("-05:00")));
		System.out.println("OffsetDateTime:: " + OffsetDateTime.now());
		System.out.println("OffsetDateTime Zoned:: " + OffsetDateTime.now().atZoneSameInstant(ZoneId.of("-05:00")) );
		System.out.println("ZonedDateTime:: " + ZonedDateTime.now());
		System.out.println("ZonedDateTime:: " + ZonedDateTime.now().withZoneSameInstant(ZoneId.of("-05:00")));
		System.out.println("ZonedDateTime:: " + ZonedDateTime.now().withZoneSameInstant(ZoneId.of("Asia/Dhaka")));
		


		OffsetDateTime ofdatetime = OffsetDateTime.now();
		OffsetTime oftime = OffsetTime.now();
		
		/*
		System.out.println(ZoneId.SHORT_IDS);
		System.out.println("OffsetDateTime Local ::" + ofdatetime);
		System.out.println("OffsetDateTime GMT   ::" + ofdatetime.atZoneSameInstant( ZoneId.of("GMT") ));
		System.out.println("OffsetDateTime Asia/Dhaka   ::" + ofdatetime.atZoneSameInstant( ZoneId.of("Asia/Dhaka") ));
		System.out.println("OffsetDateTime Africa/Cairo   ::" + ofdatetime.atZoneSameInstant( ZoneId.of("Africa/Cairo") ));
		System.out.println("OffsetDateTime EST   ::" + ofdatetime.atZoneSameInstant( ZoneId.of("-05:00") ));
		System.out.println("OffsetDateTime:: "+ oftime + "\n\n\n");
		
		System.out.println("OffsetDateTime Local ::" + ofdatetime.atZoneSimilarLocal(ZoneId.of("-05:00")));
		*/
		
		LocalDateTime t1 = LocalDateTime.now();
		LocalDateTime t2 = t1.minusDays(32);
		
		System.out.println(ChronoUnit.DAYS.between(t1, t2));
	}

}

