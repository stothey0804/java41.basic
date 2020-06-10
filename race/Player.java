package race;

public class Player {
	private String name;
	private int record;
	
	public void setName(String name) {
		this.name = name;
	}
	public void setRecord(int record) {
		this.record = record;
	}
	public String getName() {
		return this.name;
	}
	public int getRecord() {
		return this.record;
	}
	
	public void printRecord() {
		System.out.println("이름: " + this.name + ", 기록: " + this.record);
	}
	

}
