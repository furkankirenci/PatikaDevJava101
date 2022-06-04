package Patika101.D45PatikaDevJava101Odev36OgrenciBilgiSistemi;

public class Student {
    Course c1;
    Course c2;
    Course c3;
    String name;
    String stuNo;
    String classes;
    double avarage;
    boolean isPass;

    Student(String name, String stuNo, String classes, Course c1, Course c2, Course c3) {
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.avarage = 0;
        this.isPass = false;
    }

    void addBulkExamNote(int note1, int sozlu1, int note2, int sozlu2, int note3, int sozlu3) {

        if (note1 >= 0 && note1 <= 100) {
            this.c1.note = note1;
        }
        if (note2 >= 0 && note2 <= 100) {
            this.c2.note = note2;
        }
        if (note3 >= 0 && note3 <= 100) {
            this.c3.note = note3;
        }
        if (sozlu1 >= 0 && sozlu1 <= 100) {
            this.c1.sozlu = sozlu1;
        }
        if (sozlu2 >= 0 && sozlu2 <= 100) {
            this.c2.sozlu = sozlu2;
        }
        if (sozlu3 >= 0 && sozlu3 <= 100) {
            this.c3.sozlu = sozlu3;
        }
    }

    void printNote() {
        System.out.println(this.c1.name + " Notu : " + this.c1.note);
        System.out.println(this.c1.name + " Sozlu Notu : " + this.c1.sozlu);
        System.out.println(this.c2.name + " Notu : " + this.c2.note);
        System.out.println(this.c2.name + " Sozlu Notu : " + this.c2.sozlu);
        System.out.println(this.c3.name + " Notu : " + this.c3.note);
        System.out.println(this.c3.name + " Sozlu Notu : " + this.c3.sozlu);
        System.out.println("Ortamalaniz : " + this.avarage);
    }

    void isPass() {

        this.avarage = ((this.c1.note * 0.8 + this.c1.sozlu * 0.2) +
                (this.c2.note * 0.8 + this.c2.sozlu * 0.2) +
                (this.c3.note * 0.8 + this.c3.sozlu * 0.2)) / 3.0;
        printNote();
        if (this.avarage >= 55) {
            System.out.println("Sinifi Gectiniz.");
        } else {
            System.out.println("Sinifta Kaldiniz.");
        }
        System.out.println("===============");
    }
}
