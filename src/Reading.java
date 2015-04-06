
public class Reading {
	private int hours;
	private int minutes;
	private int tempF;
	
	Reading (Integer hours, Integer minutes, Integer tempF){
		this.hours = hours;
		this.minutes = minutes;
		this.tempF= tempF;
	}
	
	public int getHour(){
		return this.hours;
	}
	
	public int getMin(){
		return this.minutes;
	}
	
	public int getTemp(){
		return this.tempF;
	}
	
	public boolean equals(Reading r){
		return (this.hours==r.hours) &&(this.minutes == r.minutes) && (this.tempF == r.tempF);	
		
	}

}
