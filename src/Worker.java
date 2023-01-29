public class Worker extends Person{
    double hourlyPayRate;


    public Worker(String firstName, String lastName, String ID, String title, int YOB, double hourlyPayRate) {
        super(firstName, lastName, ID, title, YOB);
        this.hourlyPayRate = hourlyPayRate;
    }

    public double getHourlyPayRate() {
        return hourlyPayRate;
    }

    public void setHourlyPayRate(double hourlyPayRate) {
        this.hourlyPayRate = hourlyPayRate;
    }

    public double calculateWeeklyPay(double hoursWorked) {
        double pay;

        if (hoursWorked > 40) {
            pay = hourlyPayRate * 40;
            hoursWorked -= 40;
            pay += (hourlyPayRate * 1.5) * hoursWorked;
        } else {
            pay = hourlyPayRate * hoursWorked;
        }

        return pay;
    }

    public String displayWeeklyPay(double hoursWorked) {
        double regPay, oTPay = 0, regHours = 40, oTHours = 0;

        if (hoursWorked > 40) {
            regPay = hourlyPayRate * 40;
            hoursWorked -= 40;
            oTHours = hoursWorked;
            oTPay += (hourlyPayRate * 1.5) * oTHours;
        } else {
            regHours = hoursWorked;
            regPay = hourlyPayRate * hoursWorked;
        }

        System.out.println("Regular Hours worked: " + regHours);
        System.out.println("Regular Pay earned: " + regPay);
        System.out.println("Overtime Hours worked: " + oTHours);
        System.out.println("Overtime Pay earned: " + oTPay);

        return null;
    }
}
