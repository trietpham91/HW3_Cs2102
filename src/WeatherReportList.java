import java.util.LinkedList;

public class WeatherReportList implements IWeatherReportList {

	private LinkedList<DailyWeatherReport> dailyreports = new LinkedList<DailyWeatherReport>();
	public Integer getHighTemp(Date date)
	{
		Integer h = null;
		for(DailyWeatherReport dailyreport : dailyreports)
		{
			if (dailyreport.getDate().equals(date))
				h = dailyreport.getHighTemp();
		}
		return h;
	}

	@Override
	public int getMonthlyHighTemp(int month, int year)
	{
		int accum = 0;
		int count = 0;
		for(DailyWeatherReport dailyreport : dailyreports)
		{
			if (dailyreport.getDate().getMonth() == month && dailyreport.getDate().getYear() == year)
			{
				accum += dailyreport.getHighTemp();
				count++;
			}
		}
		return accum / count;
	}

	@Override
	public Integer getLowTemp(Date date)
	{
		Integer l = null;
		for(DailyWeatherReport dailyreport : dailyreports)
		{
			if (dailyreport.getDate().equals(date))
				l = dailyreport.getLowTemp();
		}
		return l;
	}

	@Override
	public int getMonthlyLowTemp(int month, int year)
	{
		int accum = 0;
		int count = 0;
		for(DailyWeatherReport dailyreport : dailyreports)
		{
			if (dailyreport.getDate().getMonth() == month && dailyreport.getDate().getYear() == year)
			{
				accum += dailyreport.getLowTemp();
				count++;
			}
		}
		return accum / count;
	}

	@Override
	public void addReport(Date date, int high, int low)
	{
		DailyWeatherReport dwr = new DailyWeatherReport(date, high, low);
		dailyreports.add(dwr);
	}
}
	


