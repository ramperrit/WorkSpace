package Chapter8;

public class Audio implements RemoteControl{
	
	private int volume;
	private int memoryVolume;
	
	@Override
	public void turnOn() {
		System.out.println("오디오를 켭니다.");
	}
	
	@Override
	public void turnOff() {
		System.out.println("오디오를 끕니다.");
	}
	
	@Override
	public void setVolume(int volume) {
		//볼륨이 맥스값보다 크면 맥스값
		if(volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		}else if(volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		}else {
		this.volume = volume;
		}
		System.out.println("현재 Audio 볼륨: "+this.volume);
	}
	
	@Override
	public void getVolume() {
		System.out.println(this.volume);
	}
	
	@Override
	public void setMute(boolean mute) {
		if(mute) {
			this.memoryVolume = this.volume;
			System.out.println("무음 처리합니다.");
			setVolume(MIN_VOLUME);
		}else {
			System.out.println("무음을 해제합니다.");
			setVolume(this.memoryVolume);
		}
	}
	
	
}
