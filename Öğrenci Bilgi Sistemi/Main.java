package OgrenciBilgiSistemi;

public class Main {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Mahmut Hoca", "TRH", "555");
        Teacher t2 = new Teacher("Graham Bell", "FZK", "000");
        Teacher t3 = new Teacher("Külyutmaz", "BIO", "111");

        //t1.prinInf();
        Course tarih = new Course("Tarih", "101", "TRH");
        tarih.addTeacher(t1);
        Course fizik = new Course("Fizik", "102","FZK");
        fizik.addTeacher(t2);
        Course biyoloji = new Course("Biyoloji", "103", "BIO");
        biyoloji.addTeacher(t3);

        Student s1 = new Student("İnek Şaban", "123", "4", tarih, fizik, biyoloji);
        s1.addBulkExamNote(100, 50, 50, 100,80,90);
        s1.isPass();
    }
}
