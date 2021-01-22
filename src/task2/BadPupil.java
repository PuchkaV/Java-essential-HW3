package task2;

public class BadPupil  extends Pupil {
    public BadPupil(String name) {
        super(name);
    }

    @Override
    public void study() {
        System.out.println(getName() + " bad study ");
    }

    @Override
    public void read() {
        System.out.println(getName() + " bad read: ");
    }

    @Override
    public void write() {
        System.out.println(getName() + " bad write ");
    }

    @Override
    public void relax() {
        System.out.println(getName() + " always relax");
    }
}
