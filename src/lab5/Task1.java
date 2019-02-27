package lab5;

public class Task1 {
    public static void main(String[] args) {
        Person person = new Person();
        person.setAge(21);
        person.setFirstName("Heshmat");
        person.setLastNam("Tawfik");
        person.setGender("Male");
        person.setPhoneNumber(3800000090L);
        System.out.println(person.getFirstName());
        System.out.println(person.getLastNam());
        System.out.println(person.getGender());
        System.out.println(person.getAge());
        System.out.println(person.getPhoneNumber());

    }

}
