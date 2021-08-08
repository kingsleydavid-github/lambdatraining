package java8training.datetime;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.time.OffsetTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

public class JavaDateProg {

	public static void main(String[] args) {

		//System.out.println(LocalTime.now());
		
		System.out.println(OffsetDateTime.now() );
		System.out.println(OffsetDateTime.now().atZoneSameInstant(ZoneId.of(ZoneId.SHORT_IDS.get("BST"))));
		System.out.println(OffsetDateTime.now().withOffsetSameInstant(ZoneOffset.of("-06:00")));

		System.out.println(OffsetTime.now());
		System.out.println(OffsetTime.now().withOffsetSameInstant(ZoneOffset.of("+06:30")));

		System.out.println(ZonedDateTime.now().withZoneSameInstant(ZoneId.of(ZoneId.SHORT_IDS.get("IST"))));
		System.out.println(ZonedDateTime.now().withZoneSameInstant(ZoneId.of(ZoneId.SHORT_IDS.get("CST"))));
		System.out.println(ZonedDateTime.now().withZoneSameInstant(ZoneId.of(ZoneId.SHORT_IDS.get("ECT") )));
		
		System.out.println(ChronoUnit.DAYS.between(LocalDate.now(), LocalDate.now().minusDays(25)));

	}

}
