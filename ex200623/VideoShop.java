package ex200623;

public class VideoShop {
	public static void main(String[] args) {
		Video video = new Video();
		video.setVideoData(100, "뽀로로 탐험대", "뽀로로");
		
		SpecialMember member = new SpecialMember();
		member.setMemberData(1, "김세영", "경기도 고양시 덕양구", video);
		member.setBonusPorint(10);
		member.printMemberData();
		member.printBonusPoint();
	}
}

class Video{
	private int videoNo;
	private String title;
	private String actor;
	
	void setVideoData(int videoNo, String title, String actor) {
		this.videoNo = videoNo;
		this.title = title;
		this.actor = actor;
	}
	
	int getVideoNo(){
		return this.videoNo;
	}
	
	String getTitle() {
		return this.title;
	}
	
	String getActor() {
		return this.actor;
	}
	
}

class GeneralMember{
	private int memberNo;
	private String name;
	private String address;
	private Video rentalVideo;
	
	void setMemberData(int memberNo, String name, String address, Video rentalVideo) {
		this.memberNo = memberNo;
		this.name = name;
		this.address = address;
		this.rentalVideo = rentalVideo;
	}
	
	void printMemberData() {
		System.out.println("회원번호: "+ memberNo);
		System.out.println("이름: "+ name);
		System.out.println("주소: "+ address);
		System.out.println("대여중인 비디오 번호: "+ rentalVideo.getVideoNo());
		System.out.println("대여중인 비디오 제목: "+ rentalVideo.getTitle());
		System.out.println("대여중인 비디오 배우: "+ rentalVideo.getActor());
	}
}

class SpecialMember extends GeneralMember{
	private int bonuspoint;
	
	void setBonusPorint(int bonus) {
		this.bonuspoint = bonus;
	}
	
	void printBonusPoint() {
		System.out.println("보너스포인트: "+ bonuspoint);
	}
}
