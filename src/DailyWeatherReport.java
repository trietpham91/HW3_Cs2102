
public class DailyWeatherReport {
	 private Date date;
	 private Integer lowTemp;
	 private Integer highTemp;
	 
	 public DailyWeatherReport(Date date, Integer lowTemp, Integer highTemp) {
	  this.date = date;
	  this.lowTemp = lowTemp;
	  this.highTemp = highTemp;
	 } 
	 
	 public Date getDate() {
	  return date;
	 }
	 
	 public Integer getLowTemp() {
	  return lowTemp;
	 }
	 
	 public Integer getHighTemp() {
	  return highTemp;
	 }
	 
	 public boolean equals(DailyWeatherReport dr) {
	 
	   return (this.date == dr.date) && (this.lowTemp == dr.lowTemp) && (this.highTemp == dr.highTemp);
	 }
}




