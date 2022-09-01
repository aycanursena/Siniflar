```
package OgrenciBilgiSistemi;

public class Teacher {
    String name;
    String mpno;
    String branch;

    Teacher(String name, String branch, String mpno){
        this.name = name;
        this.branch = branch;
        this.mpno = mpno;
    }
    void prinInf(){
        System.out.println("Öğretmen adı : " + this.name);
        System.out.println("Öğretmenin branşı : " + this.branch);
        System.out.println("Öğretmenin telefon numarası : " + this.mpno);
    }
}
```
