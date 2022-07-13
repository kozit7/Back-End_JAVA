package inheritance;
// 부모 클래스(조상클래스)
public class Tv {
	// 속성(변수)
	// 채널
	int channel;
	// 볼륨
	int volume;
	
	// 기능(메서드)
	// 채널 up
	void  channelUp() {channel++;}
	// 채널 down
	void  channelDwon() {channel--;}
	// 볼륨 up
	void  volumeUp() {volume++;}
	// 볼륨 down
	void  volumeDown() {volume--;}
}
