package assignment5_3;

class Employee1{
	
	 private int employeeId;
	 private String name;
	 private double salary;
	 private static int totalEmployees = 0;
	 private static double totalSalaryExpense = 0.0;
	 
	 public Employee1(int employeeId, String name, double salary) {
	 this.employeeId = employeeId;
	 this.name = name;
	 this.salary = salary;
	 totalEmployees++;
	 totalSalaryExpense += salary;
	 }
	 
	 public int getEmployeeId() {
	 return employeeId;
	 }
	 
	 public String getName() {
	 return name;
	 }
	 
	 public double getSalary() {
	 return salary;
	 }
	 
	 public static int getTotalEmployees() {
	 return totalEmployees;
	 }
	 
	 public static double getTotalSalaryExpense() {
	 return totalSalaryExpense;
	 }
	 
	 public void updateSalary(double newSalary) {
	 totalSalaryExpense-= salary;
	 totalSalaryExpense += newSalary;
	 this.salary = newSalary;
	 }
	 
	 public static void applyRaise(double percentage) {
	 double raiseAmount = totalSalaryExpense * 
	(percentage / 100);
	 totalSalaryExpense += raiseAmount;
	 }
	 
	 public static double calculateTotalSalaryExpense() 
	{
	 return totalSalaryExpense;
	 
	}
	 
	 public String toString() {
	 return "Employee ID: " + employeeId + ", Name: " + name + ", Salary: $" + salary;
	 }
	 
public static void main(String[] args) {
	
	 Employee1 emp1 = new Employee1(101, "Bill Gates", 50000.0);
	 Employee1 emp2 = new Employee1(102, "Steve Jobs", 60000.0);
	 
	 Employee1.applyRaise(25);
	 emp1.updateSalary(75000.0);
	 
	 System.out.println("Total Employees: " + Employee1.getTotalEmployees());
	 System.out.println("Total Salary Expense: $" + Employee1.calculateTotalSalaryExpense());
	 
	 System.out.println(emp1);
	 System.out.println(emp2);
	 }

}
