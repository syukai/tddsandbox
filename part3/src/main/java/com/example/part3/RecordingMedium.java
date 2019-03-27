package com.example.part3;

public class RecordingMedium {

	private String _log = "";
	void run(Figure figure) {
		_log += figure.run();
	}
	
	public String log() {
		return _log;
	}
}
