package AccessModifier;

public class Time {
	// ��
	private int hour;
	// ��
	private int minute;
	// ��
	private int second;
	
	// ������
	Time(int hour, int minute, int second){
		setHour(hour);
		setMinute(minute);
		setSecond(second);
	}

	public int getHour() {return hour;}

	public void setHour(int hour) {
		// �ð��� 0 ~ 23�� �϶��� hour������ ����
		if(hour>=0 && hour<=23) {
			this.hour = hour;
		}
	}

	public int getMinute() {return minute;}

	public void setMinute(int minute) {
		// ���� 0 ~ 59�� �϶��� minute������ ����
		if(minute>=0 && minute<=59) {
			this.minute = minute;
		}
	}

	public int getSecond() {return second;}

	public void setSecond(int second) {
		// �ʰ� 0 ~ 59�� �϶��� second������ ����
		if(second>=0 && second<=59) {
			this.second = second;
		
		}
	}
		
}
