
public class Position {
	private int positionId;
	private String positionName;
	private String positionEmail;
	private String positionPhone;
	private long salary;
	public void setPositionId(int positionId) {
		this.positionId = positionId;
	}
	public int getPositionId() {
		return positionId;
	}
	public void setPositionName(String positionName) {
		this.positionName = positionName;
	}
	public String getPositionName() {
		return positionName;
	}
	public void setPositionEmail(String positionEmail) {
		this.positionEmail = positionEmail;
	}
	public String getPositionEmail() {
		return positionEmail;
	}
	public void setPositionPhone(String positionPhone) {
		this.positionPhone = positionPhone;
	}
	public String getPositionPhone() {
		return positionPhone;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}
	public long getSalary() {
		return salary;
	}
}
