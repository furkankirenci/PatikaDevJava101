package Patika101.D45PatikaDevJava101Odev36OgrenciBilgiSistemi;

public class Main {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Cengiz Dogan", "KMY", "0541");
        Teacher t2 = new Teacher("Fatma Yilmaz", "FZK", "0542");
        Teacher t3 = new Teacher("Nurten Karaoglan", "BIO", "0543");

        Course kimya = new Course("Tarih", "101", "KMY", t1);
        Course fizik = new Course("Fizik", "102", "FZK", t2);
        Course biyo = new Course("Biyoloji", "103", "BIO", t3);

        kimya.addTeacher(t1);
        fizik.addTeacher(t2);
        biyo.addTeacher(t3);

        Student s1 = new Student("Furkan", "358", "12", kimya, fizik, biyo);
        Student s2 = new Student("Basri", "359", "12", kimya, fizik, biyo);
        Student s3 = new Student("Enes", "360", "12", kimya, fizik, biyo);

        s1.addBulkExamNote(100, 50, 100,50,100,50);
        s1.isPass();
        s1.addBulkExamNote(51, 100, 50,100,50,100);
        s1.isPass();

    }


}
