package javafundamentals;

class Student {
    String name;
    int age;
    double marks;

    public Student(String name, int age, double marks) {
        this.name = name;
        this.age = age;
        this.marks = marks;
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Marks: " + marks);
    }

            
    public static void main(String[] args) {
        Student student1 = new Student("Danish", 19, 95.5);
        student1.displayDetails();
    }
}
