package task2;

public class ExcelentPupil extends Pupil {

    public ExcelentPupil(String name) {
        super(name);
    }

    @Override
    public void study() {
        System.out.println(getName() +" excellent study ");
    }

    @Override
    public void read() {
        System.out.println(getName() + " excellent read ");
    }

    @Override
    public void write() {
        System.out.println(getName() + " excellent write ");
    }

    @Override
    public void relax() {
        System.out.println(getName() + " never relax");
    }
}
