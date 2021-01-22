package task2;

public class Main {

    public static void main(String[] args) {
	    Pupil vasya = new BadPupil("Vasya");
	    Pupil ira = new ExcelentPupil("Ira");
	    Pupil kolya = new GoodPupil("Kolya");
	    Pupil lena = new ExcelentPupil("Lena");

        ClassRoom classRoom = new ClassRoom(vasya, ira, kolya, lena );
        vasya.read();
        vasya.relax();
        vasya.study();
        vasya.write();
        System.out.println("-------------------");
        ira.write();
        ira.study();
        ira.relax();
        ira.read();
        System.out.println("-------------------");
        kolya.read();
        kolya.write();
        kolya.relax();
        kolya.study();
        System.out.println("-------------------");
        lena.study();
        lena.write();
        lena.relax();
        lena.study();
    }
}
