package BT;

class Student {
    private int id;
    private String name;
    private int age;
    private boolean status;


    public Student(int id, String name, int age, boolean status) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean getStatus() {
        return status;
    }

    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Age: " + age + ", Status: " + status;
    }
}
