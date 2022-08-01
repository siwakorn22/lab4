
public class Person {
	private Job job;
	
	public Person(){
		job = new Job();
		job.setSalary(12000);
	}
	public void setId(int empId){
		job.setId(empId);
	}
	public int getId(){
		return job.getId();
	}
	public void setSalary(long wage){
		job.setSalary(wage);
	}
	public long getSalary(){
		return job.getSalary();
	}
	public void setRole(String roleName){
		job.setRole(roleName);
	}
	public String getRole(){
		return job.getRole();
	}
	public void setPerson(String roleName, long wage, int empId){
		job.setRole(roleName);
		job.setSalary(25000);
		job.setId(empId);
	}
	
	public void setPerson(Job jobDetail){
		job.setRole(jobDetail.getRole());
		job.setSalary(jobDetail.getSalary());
		job.setId(jobDetail.getId());
	}
	public void setPerson(Position pos1){
		job.setRole(pos1.getPositionName());;
		job.setSalary(pos1.getSalary());
		job.setId(pos1.getPositionId());
	}
	public String toString(){
		return "Role : "+getRole()+", Salary : "+getSalary()+"  Employee ID : "+getId();
	}
}
