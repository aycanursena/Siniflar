```
package OgrenciBilgiSistemi;

public class Course {
    String name;
    String code;
    String prefix;
    int note;
    int sozlu_notu;
    int ders_ort;
    // mecuttaki teacher sınıfını buraya çağırma;
    Teacher teacher;

    Course(String name, String code, String prefix){
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.note = 0;
        this.sozlu_notu = 0;
        this.ders_ort = 0;
    }
    void printTeacherInfo(){
        this.teacher.prinInf();
    }
    void addTeacher(Teacher teacher){
        if (teacher.branch.equals(this.prefix)){
            this.teacher = teacher;
            printTeacherInfo();
        }else
            System.out.println("Öğretmen ve ders uyuşmuyor!");
    }
    double dersOrtalamasi(){
        this.ders_ort = ((this.note * 80 / 100) + (this.sozlu_notu * 20 / 100));
        return this.ders_ort;
    }
}
```
