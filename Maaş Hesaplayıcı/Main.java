package MaasHesaplayici;

public class Main {
    public static void main(String[] args) {
        employee e1 = new employee("Aslı", 2000, 10, 2000);
        e1.tax();
        e1.bonus();
        e1.raiseSalary();
        e1.toPrint();
    }
}
