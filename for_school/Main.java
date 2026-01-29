
class Main {

    public static void main(String[] args) {

        Employe emp = new Employe("Samir", 22, 4500);
        Technician tech = new Technician("Ahmed", 26, 5500, (byte) 2);
        emp.show();
        tech.show();
        emp.Augumentation(500);
        tech.Augumentation(450);
        emp.show();
        tech.show();
    }

}

class Employe {

    protected final String name;
    protected int age;
    protected float salary;

    public Employe(String name, int age, float salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public void Augumentation(float amount) {

        salary += amount;
    }

    @Override
    public String toString() {

        return "Name: " + name + " Age: " + age + " salary: " + calculeSalaire();
    }

    public void show() {

        System.out.println(toString());
    }

    public float calculeSalaire() {

        return salary;

    }

}

class Technician extends Employe {

    private final byte grade;

    public Technician(String name, int age, float salary, byte grade) {

        super(name, age, salary);
        this.grade = grade;

    }

    public int prime() {
        return switch (grade) {
            case 1 ->
                100;
            case 2 ->
                200;
            case 3 ->
                300;
            default ->
                0;
        };
    }

    @Override
    public String toString() {

        return "Name: " + name + " Age: " + age + " Salary: " + calculeSalaire();
    }

    @Override
    public float calculeSalaire() {

        return salary + prime();
    }

}
