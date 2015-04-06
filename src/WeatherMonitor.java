import java.util.LinkedList;


public class WeatherMonitor implements IWeatherMonitor {
	
	private IWeatherReportList reports = new WeatherReportList();

	public WeatherMonitor()
	{

	}

	public WeatherMonitor(LinkedList<DailyWeatherReport> reports)
	{
		for(DailyWeatherReport report : reports)
			this.reports.addReport(report.getDate(), report.getHighTemp(), report.getLowTemp());
	}

	public Integer averageHighForMonth(int month, int year)
	{
		return reports.getMonthlyHighTemp(month, year);
	}

	public Integer averageLowForMonth(int month, int year)
	{
		return reports.getMonthlyLowTemp(month, year);
	}

	public void addDailyReport(Date date, LinkedList<Integer> temps)
	{
		int max = temps.getFirst();
		int min = temps.getFirst();

		for(Integer temp : temps)
		{
			if (temp > max)
				max = temp;
			if (temp < min)
				min = temp;
		}
		reports.addReport(date, max, min);
	}

	
}
	
	
