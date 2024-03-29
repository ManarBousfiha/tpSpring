package com.manar.tp.implementations;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.manar.tp.IdGenerator;
@Service
@Primary
public class AutoInrementID implements IdGenerator{
	private static Integer id = 0;
	@Override
	public String GenerateID() {
		id++;
		return id.toString();
	}

}
