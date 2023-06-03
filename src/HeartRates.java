import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class HeartRates {
    private String firstName;
    private String lastName;
    private String dob;


    HeartRates(String firstName,String lastName,String dob){
        this.firstName = firstName;
        this.lastName = lastName;
        this.dob = dob;
    }

    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }

    public String getDob() {
        return dob;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public int getAge(){
        AgeCalculator ageCal = new AgeCalculator();
        LocalDate birthday = LocalDate.parse(dob);
        Period age = ageCal.calculateAge(birthday);
        return age.getYears();

    }

    public int getMaxHeartRate(){
        int MHR = 220 - getAge();
        return MHR;

    }

    public String getTargetHeartRateRange(){
        final double LB = 0.5;
        final double UB = 0.85;
        final int RHR = 70;
        int AHR = getMaxHeartRate() - RHR;
        double LBTHR = (AHR * LB) + RHR;
        double UBTHR = (AHR * UB) + RHR;

        return "The Target Heart Rate Range is between " + LBTHR + "and" + UBTHR;
    }

    public String toString(){
        return "First Name : " + firstName + "\n" + "Last Name : " + lastName + "\n" + "Age : " + getAge() + "\n" + "Date of Birth : " + dob +
                "\n" + "Maximum Heart Rate : " + getMaxHeartRate();
    }


}
