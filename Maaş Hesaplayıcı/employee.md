```
package MaasHesaplayici;

public class employee {
    String name;
    int salary;
    int workHours;
    int hireYear;
    int bonus;
    double tax;
    double raiseSalary = 0.0;
    employee(String name, int salary, int workHours, int hireYear){
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    void tax(){
        if (this.salary > 1000) {
            tax  = this.salary * 0.03;
        }else {
            tax = 0;
        }
    }

    void bonus(){
        if (this.workHours > 40) {
            bonus = (workHours - 40) * 30;
        }else {
            bonus = 0;
        }
    }

    void raiseSalary(){
        if (2021 - this.hireYear < 10){
            raiseSalary = this.salary * 0.05;
        }else if (2021 - this.hireYear > 9 && 2021 - this.hireYear < 20){
            raiseSalary = this.salary * 0.10;
        }else if (2021 - this.hireYear > 19) {
            raiseSalary = this.salary * 0.15;
        }else
            raiseSalary = 0;
    }

    void toPrint(){
        System.out.println("Personel Ad - Soyad : " + this.name);
        System.out.println("İşe başladığı yıl : " + this.hireYear);
        System.out.println("Çalıştığı saat : " + this.workHours);
        System.out.println("Aldığı maaş : " + this.salary);
        System.out.println("Vergi : " + tax);
        System.out.println("Bonus : " + bonus);
        System.out.println("Zam : " + raiseSalary);
        System.out.println("Toplam maaş : " + (this.salary + bonus + raiseSalary - tax));
    }
}
```
