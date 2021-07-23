package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class MathUtil {
	
	private FileUtil fUtil;
	
	public void addOperation() {
		System.out.println("Welcome to the component.");
	}
	
	public void setFileUtil(FileUtil util) {
		this.setFileUtil(util);
	}
	public FileUtil getFileUtil() {
		return this.fUtil;
	}

}
