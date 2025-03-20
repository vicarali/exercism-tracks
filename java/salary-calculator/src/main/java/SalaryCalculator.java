public class SalaryCalculator {
    public double salaryMultiplier(int daysSkipped) {
        return daysSkipped < 5 ? 1 : 0.85;
    }

    public int bonusMultiplier(int productsSold) {
        return productsSold >= 20 ? 13 : 10;
    }

    public double bonusForProductsSold(int productsSold) {
        return productsSold * bonusMultiplier(productsSold);
    }

    public double finalSalary(int daysSkipped, int productsSold) {
        final int baseSalary = 1000;
        final int salaryCap = 2000;

        double finalSalary = baseSalary * salaryMultiplier(daysSkipped) + bonusForProductsSold(productsSold);

        return finalSalary > salaryCap ? salaryCap : finalSalary;
    } 
}
