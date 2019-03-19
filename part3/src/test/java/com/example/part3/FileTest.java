package com.example.part3;

import static org.junit.Assert.fail;

import java.io.File;
import java.io.IOException;

import org.junit.jupiter.api.Test;

public class FileTest {

	@Test
	public void testFileSystemError() {
		java.io.File f = new FullFile("foo");
		try {
			saveAs(f);
			fail();
		} catch (java.io.IOException e) {
			
		}
	}
	
	@Test
	private void saveAs(File file) throws IOException {
		file.createNewFile();
	}
}
