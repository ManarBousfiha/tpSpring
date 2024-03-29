package com.manar.tp.implementations;

import org.springframework.stereotype.Service;

import com.manar.tp.IdGenerator;
@Service
public class PrefixGID implements IdGenerator {
	private String prefix;
	public PrefixGID(){}
	public PrefixGID(String prefix) {
		this.prefix = prefix;
	}
	@Override
	public String GenerateID() {
		return prefix ;
	}

}
