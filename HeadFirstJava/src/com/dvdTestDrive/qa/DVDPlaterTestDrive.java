package com.dvdTestDrive.qa;
class DVDPlaterTestDrive {
public static void main(String [] args) {
	DVDPlayer t = new DVDPlayer();
	t.canRecord = true;
	t.playTape();
	
	if (t.canRecord == true) {
		t.recordTape();
}
}
}