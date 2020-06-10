package race;

public class Player {
	private String name;
	private float record;
	
	public void setName(String name) {
		this.name = name;
	}
	public void setRecord(float record) {
		this.record = record;
	}
	public void printRecord() {
		System.out.println("이름: " + this.name + ", 기록: " + this.record);
	}

}
