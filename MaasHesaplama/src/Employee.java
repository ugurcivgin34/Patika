
public class Employee {
	String name;
	double salary;
	int workHours;
	int hireYear;
	double vergi;
	int maasBonus;
	int bonusYil;
	double zam;

	public Employee(String name, double salary, int workHours, int hireYear) {

		this.name = name;
		this.salary = salary;
		this.workHours = workHours;
		this.hireYear = hireYear;
		this.vergi = 0;
		this.maasBonus=0;
	}

	double tax() {
		if (this.salary <= 1000) {
			System.out.println("Vergi uygulanmayacakt�r");

		} else {
			vergi = (this.salary * 0.03);

			
		}
		return vergi;
	}

	int bonus() {
		if (this.workHours <= 40) {
			System.out.println("40 saatten az �al���ld��� i�in bonus yok");
		} else {
			bonusYil = this.workHours - 40;
			maasBonus = bonusYil * 30;

		}
		return maasBonus;
	}

	double raiseSalary() {
		if (2021 - this.hireYear < 10) {
			zam = (this.salary * 0.05);

		} else if ((2021 - this.hireYear > 9) && (2021 - this.hireYear < 20)) {
			zam = (this.salary * 0.10);

		} else if (2021 - this.hireYear > 19) {
			zam = (this.salary * 0.15);

		} else {
			System.out.println("Zam yok");
		}
		return zam;

	}

	void toMyString() {
		System.out.println("Ad� : " + this.name);
		System.out.println("Maa�� : " + this.salary);
		System.out.println("�al��ma saaati : " + this.workHours);
		System.out.println("Ba�lang�� y�l� : " + this.hireYear);
		System.out.println("Vergi : " + tax());
		System.out.println("Bonus : " + bonus());
		System.out.println("Maa� art��� : " + raiseSalary());
		System.out.println("Vergi ve bonuslarla maa� " + (tax() + bonus() + this.salary));
		
		System.out.println("Toplam maa� : " + (tax() + bonus() + raiseSalary() + this.salary));
	}
}
