package hr;

public class Employee {
	
	String surname;
	float salary;
	WorkBehaviour workBehaviour;
	
	public Employee(String surname, float salary) {
		this.surname = surname;
		this.salary = salary;
	}
	
	public void work() {
		workBehaviour.work();
	}
	
	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public void setWorkBehaviour(WorkBehaviour workBehaviour) {
		this.workBehaviour = workBehaviour;
	}
}