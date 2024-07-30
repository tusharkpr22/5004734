public class FinancialForecasting {

    // Method to calculate future value recursively
    public static double calculateFutureValue(double presentValue, double growthRate, int periods) {
        // Base case
        if (periods == 0) {
            return presentValue;
        }
        // Recursive case
        return (1 + growthRate) * calculateFutureValue(presentValue, growthRate, periods - 1);
    }

    public static void main(String[] args) {
        double presentValue = 1000.0; // Present value
        double growthRate = 0.05; // Growth rate (5%)
        int periods = 10; // Number of periods

        double futureValue = calculateFutureValue(presentValue, growthRate, periods);
        System.out.println("Future Value: $" + futureValue);
    }
}

