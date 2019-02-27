package lab5;

public class Person {
    private String firstName;
    private String lastNam;
    private int age;
    private int phoneNumber;
    private String gender;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setFirstName(String title, String firstName) {
        this.firstName = title + " " + firstName;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = (int) phoneNumber;

    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setLastNam(String lastNam) {
        this.lastNam = lastNam;
    }

    public void setLastNam(String title, String lastNam) {
        this.lastNam = title + " " + lastNam;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }


    private void setAge(int currentyear, int birthYear) {
        this.age = currentyear - birthYear;
    }

    public String getLastNam() {
        return lastNam;
    }


    public int getAge() {
        return age;
    }


    public String getGender() {
        return gender;
    }


}
