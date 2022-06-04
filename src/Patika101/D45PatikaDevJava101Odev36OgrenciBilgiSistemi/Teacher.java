package Patika101.D45PatikaDevJava101Odev36OgrenciBilgiSistemi;

public class Teacher {
    String name;
    String mpno;
    String branch;

    Teacher(String name, String branch, String mpno) {
        this.name = name;
        this.mpno = mpno;
        this.branch = branch;
    }

    void printThat() {
        System.out.println("Adi : " + this.name + "\nNumarasi : " + this.mpno + "\nBransi : " + this.branch);
    }
}
