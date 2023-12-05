package com.vts.dbhibernate.util;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class AppTimeParser {
	public static Timestamp timeStampFROMyyyyMMddHHmmss(String targetStr) {
		Timestamp timeStamp = null;
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");  // from client : 2021-06-28 15:41:50.890000 
		LocalDateTime logLocalDatetime = LocalDateTime.parse(targetStr, formatter);	
		try {
			timeStamp= Timestamp.valueOf(logLocalDatetime);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return timeStamp;
	}
}
