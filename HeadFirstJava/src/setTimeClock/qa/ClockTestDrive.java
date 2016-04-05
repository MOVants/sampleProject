package setTimeClock.qa;

public class ClockTestDrive {
public static void main(String[] args){
	clock c = new clock();
	c.setTime("1245");
	String tod = c.getTime();
	System.out.println("time: " + tod);
}

}
