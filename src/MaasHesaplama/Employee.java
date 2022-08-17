package MaasHesaplama;

public class Employee {

    String name;
    double salary;
    int workHours;
    int hireYear;

    public Employee(String name, double salary, int workHours, int hireYear) {

        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;

    }

    public double tax() {
        if (this.salary > 1000) {
            return  salary * 0.03;
        }
            return 0;
    }

    public double bonus() {
        if (this.workHours > 40) {
            return (this.workHours - 40) * 30;
        }
        return 0;
    }
    public double raiseSalary() {
        if ((2021 - this.hireYear) < 10) {
            return salary * 0.05;
        }
        if (((2021 - this.hireYear) > 9) && ((2021 - this.hireYear) < 20)) {
            return salary * 0.1;
        }
        if ((2021 - this.hireYear) > 19) {
            return salary * 0.15;
        }
        return 0;
    }
    public String toString() {

        double total = salary -tax() + bonus() + raiseSalary();
        double tot = salary +bonus() - tax();
        System.out.println("Adı : "+name);
        System.out.println("Maaşı : "+ salary);
        System.out.println("Çalışma Saati : "+ workHours);
        System.out.println("Başlangıç Yılı : "+hireYear);
        System.out.println("Vergi : "+tax());
        System.out.println("Bonus : "+bonus());
        System.out.println("Maaş artışı : "+raiseSalary());
        System.out.println("Vergi ve Bonuslar ile birlikte maaş : "+tot);
        System.out.println("Toplam Maaş : "+total);
        return null;
    }
}


