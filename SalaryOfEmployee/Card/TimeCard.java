package Card;

import java.util.Date;

public class TimeCard {
	private Date date;//哪天的？
	private int hours;// 一天工作几个小时
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public int getHours() {
		return hours;
	}
	public void setHours(int hours) {
		this.hours = hours;
	}
	

}
