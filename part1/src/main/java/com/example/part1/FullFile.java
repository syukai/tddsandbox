package com.example.part1;

import java.io.File;
import java.io.IOException;

public class FullFile extends File {

	public FullFile(String pathname) {
		super(pathname);
	}
	
	public boolean createNewFile() throws IOException {
		throw new IOException();
	}
	

}
