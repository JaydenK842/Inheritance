public class SalaryWorker extends Worker{
    double annualSalary;

    public SalaryWorker(String firstName, String lastName, String ID, String title, int YOB, double hourlyPayRate, double annualSalary) {
        super(firstName, lastName, ID, title, YOB, hourlyPayRate);
        this.annualSalary = annualSalary;
    }

    public double getAnnualSalary() {
        return annualSalary;
    }

    public void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }

    public double calculateWeeklyPay(double hoursWorked) {
        double pay;

        pay = annualSalary / 52;

        return pay;
    }

    public String displayWeeklyPay(double hoursWorked) {
        double weeklyPay = annualSalary / 52;

        System.out.println("Weekly pay is a fraction of yearly salary.");
        System.out.println("Weekly Pay: " + weeklyPay);
        System.out.println("Annual Salary: " + annualSalary);
        return null;
    }
}
