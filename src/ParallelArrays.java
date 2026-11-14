public class ParallelArrays {
    public static void main(String[] args) {
        int numEmployee = 5;
        int[] employeeNumbers = {21345, 51571, 39521, 69578, 52743};
        double[] hourlyWage = {25.00, 18.50, 21.25, 30.75, 28.00};
        int[] hoursWorked = {40, 44, 35, 32, 48};

        for (int i = 0; i < numEmployee; i++) {
            double earned = calculatePay(hourlyWage[i], hoursWorked[i]);
            System.out.print("Employee " + employeeNumbers[i] + " worked " + hoursWorked[i] + " hours this week at $" + String.format("%.2f", hourlyWage[i]) + " per hour and earned $");
            System.out.println(String.format("%.2f", earned));
        }


    }

    private static double calculatePay(double wage, int hours) {
        if (hours <= 40) {
            return (wage * hours);
        }

        return (wage * 40 + wage * 1.5 * (hours-40));
    }
}
