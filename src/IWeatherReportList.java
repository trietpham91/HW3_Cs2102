
public interface IWeatherReportList {
	public Integer getHighTemp(Date date);
	public int getMonthlyHighTemp(int month, int year);
	public Integer getLowTemp(Date date);
	public int getMonthlyLowTemp(int month, int year);
	public void addReport(Date date, int highTemp, int lowTemp);

}
