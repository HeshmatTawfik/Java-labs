package lab6;

public class Task4 {
}
class Emploee{
    private String firstName;
    private String lastName;
    private String occupation;
    private long telephone;

    public static int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    private static int numberOfEmployees;

    public Emploee(String firstName, String lastName, String occupation, long telephone) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.occupation = occupation;
        this.telephone = telephone;
        numberOfEmployees++;

    }

    public String getFirstName() {

        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public long getTelephone() {
        return telephone;
    }

    public void setTelephone(long telephone) {
        this.telephone = telephone;
    }

    public static void main(String[] args) {
        Emploee emploee=new Emploee("Heshmat","Tawfik","developer",3800000);
        System.out.println(getNumberOfEmployees());

    }
}
