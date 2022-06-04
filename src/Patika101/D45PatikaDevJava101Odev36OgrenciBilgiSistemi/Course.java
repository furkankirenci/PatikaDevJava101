package Patika101.D45PatikaDevJava101Odev36OgrenciBilgiSistemi;

public class Course {
    Teacher hoca;
    String name;
    String code;
    String prefix;
    int note;
    int sozlu;

    Course(String name, String code, String prefix, Teacher hoca1){
          this.name = name;
          this.code = code;
          this.prefix = prefix;
          this.hoca = hoca1;
          int note = 0;
          int sozlu = 0;
    }
    void addTeacher(Teacher hoca1){
        if(hoca1.branch.equals(this.prefix)){
            this.hoca = hoca1;
//            printTeacherInfo();
        }else {
            System.out.println("Ogretmen  ve Ders bolumleri uyusmuyor");
        }
    }


    void printTeacherInfo(){
        this.hoca.printThat();
    }
}
