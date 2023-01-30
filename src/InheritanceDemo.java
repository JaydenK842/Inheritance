import java.util.ArrayList;

public class InheritanceDemo {
    public static void main(String[] args) {
        ArrayList<Worker> list = new ArrayList<>();
        int week = 1;

        Worker Jayden, Blake, Arthur;
        SalaryWorker Ron, Teagan, Sandra;

        Jayden = new Worker("Jayden", "Knight", "000001", "Mr.", 2006, 10.50);
        Blake = new Worker("Blake", "Burrow", "000002", "Mr.", 2010, 9.75);
        Arthur = new Worker("Arthur", "Korvic", "000003", "Mr.", 1989, 12.25);

        list.add(Jayden);
        list.add(Blake);
        list.add(Arthur);

        Ron = new SalaryWorker("Ron", "Northen", "00000A", "Sr.", 1990, 10.00, 1500);
        Teagan = new SalaryWorker("Teagan", "Trent", "00000B", "Jr.", 1987, 14.50, 1750);
        Sandra = new SalaryWorker("Sandra", "Luther", "00000C", "Mrs.", 1995, 11.50, 1600);

        list.add(Ron);
        list.add(Teagan);
        list.add(Sandra);

        while(week < 4) {
            if (week == 1) {
                System.out.println("Work week 1 (40 hours)");

                for (Worker worker : list) {
                    System.out.print("\n" + worker.getFirstname() + ": $");
                    System.out.printf("%.2f", worker.calculateWeeklyPay(40));
                }
            } else if (week == 2) {
                System.out.println("\n\nWork week 2 (50 hours)");

                for (Worker worker : list) {
                    System.out.print("\n" + worker.getFirstname() + ": $");
                    System.out.printf("%.2f", worker.calculateWeeklyPay(50));
                }
            } else if (week == 3) {
                System.out.println("\n\nWork week 3 (40 hours)");

                for (Worker worker : list) {
                    System.out.print("\n" + worker.getFirstname() + ": $");
                    System.out.printf("%.2f", worker.calculateWeeklyPay(40));
                }
            }

            week++;
        }
    }
}