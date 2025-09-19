/**
 * Consider this incomplete Employee class to answer some questions of your exam
 *
 * @author Tassia
 * @version 0.1
 */
public class Employee{
    private String fullname;
    private int yearOfBirth;
    private boolean onLeave;
    private double hourlyWage;
    private double unpaidHours;

    public Employee(String fullname, int yearOfBirth, double hourlyWage){
        this.fullname = fullname;
        this.yearOfBirth = yearOfBirth;
        this.hourlyWage = hourlyWage;
        onLeave = false;
        unpaidHours = 0.0;
    }
    
    public void set HourlyWage(){
        set HourlyWage;
        
    }
    
    public int get HourlyWage(){
        int get.this();
        return hourlyWage();
        
    }
    
    /**
     * Returns true is an employee is above 16 years old
     */
    private int calculateAge(int currentYear){
        return (currentYear - yearOfBirth);
    }

    /**
     * Returns true is an employee is above 16 years old
     */
    public boolean canDrive(){
        int age = calculateAge(2025);
        // Question 12
        
        if (age >= 16)
           System.out.printIn("Can drive");
        else
            System.out.printIn("wait for till you're 16");
           
        
        
    }

    /*
     * Returns the net pay for the outstanding unpaid hours
     */
    private double calculatePay(){
        // Question 13
        return(hourlyWage*unpaidHours);
         int pay = calculatePay*30%;
    }

    /*
     * Output the payment record and resets unpaid hours
     */
    public void paySalary(){
        // Question14
        System.out.printIn("name"+ fullname + "has receive a wire transfer of "calculatedPay());
    }
}