package question2_assignment2_3560;

public class Professor extends Employee {
	
	private String field;
	
	public Professor(String name, int hours, String field)
	{
		super(name, hours);
		this.field = field;
	}

	@Override
	public double calculateSalary() {
		return super.getHours() * 30;
	}
	
	
}
