public class ParallelArrays {
    public static void main(String[] args) {
        int numEmployee = 5;
        int[] employeeNumbers = {21345, 51571, 39521, 69578, 52743};
        double[] hourlyWage = {25.00, 18.50, 21.25, 30.75, 28.00};
        int[] hoursWorked = {40, 44, 35, 32, 48};

        for (int i = 0; i < numEmployee; i++) {
            double earned = calculatePay(hourlyWage[i], hoursWorked[i]);
            System.out.println("Employee " + employeeNumbers[i] + " worked " + hoursWorked[i] + " hours this week at $" + hourlyWage[i] + " per hour and earned $" + earned);
        }


    }

    private static double calculatePay(double wage, int hours) {
        return (wage*hours);
    }
}
