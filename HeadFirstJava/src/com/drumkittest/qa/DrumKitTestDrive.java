package com.drumkittest.qa;
class DrumKitTestDrive {
	public static void main(String [] args) {
		DrumKit d = new DrumKit();
		d.snare = false;
		d.playSnare();
		d.playtopHat();
		
	if (d.snare == true) {
		d.playSnare();
	}
	}
}