package th.ac.ku.kps.eng.cpe.oop;

import java.util.ArrayList;

public class Program3 {
	public static void main(String[] args) {
		Employees fixedsalary = new FixedSalary("Clark", "Kent", "555-999-5555", 15000);
		Employees hoursalary = new HourlySalary("Bruce", "Wayne", "555-777-1111", 20, 165);
		Employees comissionpay = new ComissionPay("Peter", "Parker", "555-999-5555", 95000, 0.06);
		
		ArrayList<Employees> employees = new ArrayList<Employees>();
		
		employees.add(fixedsalary);
		employees.add(hoursalary);
		employees.add(comissionpay);
		
		for(Employees emp: employees) {
			System.out.print(emp.getClass().getSimpleName()+" employee: ");
			System.out.println(emp);
			System.out.printf("earned %.2f\n\n", emp.earning());
			
		}
	}
}
