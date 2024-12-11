import java.util.ArrayList;
import java.util.List;

public class Abiturient {
    private int id;
    private String lastName;
    private String firstName;
    private String middleName;
    private String address;
    private String phone;
    private List<Integer> grades;

    /**
     * Constructor to initialization Abiturient
     *
     * @param id
     * @param lastName
     * @param firstName
     * @param middleName
     * @param address
     * @param phone
     * @param grades
     */
    public Abiturient(int id, String lastName, String firstName, String middleName, String address, String phone, List<Integer> grades) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
        this.address = address;
        this.phone = phone;
        this.grades = grades;
    }

    /**
     * Constructor to initialization Abiturient without marks
     *
     * @param id
     * @param lastName
     * @param firstName
     * @param middleName
     * @param address
     * @param phone
     */
    public Abiturient(int id, String lastName, String firstName, String middleName, String address, String phone) {
        this(id, lastName, firstName, middleName, address, phone, new ArrayList<>());
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public List<Integer> getGrades() {
        return grades;
    }

    public void setGrades(List<Integer> grades) {
        this.grades = grades;
    }

    // Метод вычисления суммы баллов

    /**
     * This method counts sum of marks this abiturient
     *
     * @return sum of marks
     */
    public int getTotalScore() {
        return grades.stream().mapToInt(Integer::intValue).sum();
    }

    // Метод проверки наличия неудовлетворительных оценок

    public boolean hasUnsatisfactoryGrades() {
        for (Integer x : grades) {
            if (x < 3) {
                return true;
            }
        }
        return false;

        //return grades.stream().anyMatch(grade -> grade < 3);
    }

    /**
     * method toString
     *
     * @return String
     */
    public String toString() {
        return "Abiturient{" +
                "id=" + id +
                ", lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", grades=" + grades +
                '}';
    }
}
