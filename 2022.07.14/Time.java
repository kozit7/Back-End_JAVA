package AccessModifier;

public class Time {
	// 시
	private int hour;
	// 분
	private int minute;
	// 초
	private int second;
	
	// 생성자
	Time(int hour, int minute, int second){
		setHour(hour);
		setMinute(minute);
		setSecond(second);
	}

	public int getHour() {return hour;}

	public void setHour(int hour) {
		// 시간이 0 ~ 23시 일때만 hour변수에 저장
		if(hour>=0 && hour<=23) {
			this.hour = hour;
		}
	}

	public int getMinute() {return minute;}

	public void setMinute(int minute) {
		// 분이 0 ~ 59분 일때만 minute변수에 저장
		if(minute>=0 && minute<=59) {
			this.minute = minute;
		}
	}

	public int getSecond() {return second;}

	public void setSecond(int second) {
		// 초가 0 ~ 59분 일때만 second변수에 저장
		if(second>=0 && second<=59) {
			this.second = second;
		
		}
	}
		
}
