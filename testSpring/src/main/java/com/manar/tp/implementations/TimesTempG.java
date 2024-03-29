package com.manar.tp.implementations;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.springframework.stereotype.Service;

import com.manar.tp.IdGenerator;
@Service
public class TimesTempG implements IdGenerator{
	
	@Override
	public String GenerateID() {
		  LocalDateTime now = LocalDateTime.now();
	      DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
	      String formattedDateTime = now.format(formatter);
	      return formattedDateTime;
	}

}
