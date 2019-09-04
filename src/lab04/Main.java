import lab04.Person;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("sahas", 18, 'm');
        System.out.println(p1);
        Student s1 = new Student(p1.getName(), p1.getAge(), p1.getGender(), 234567889L, 8.9);
    }
}
