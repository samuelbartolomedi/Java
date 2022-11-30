package Entities;

public class TaxPayer {
    private double salaryIncome;
    private double serviceIncome;
    private double capitalIncome;
    private double healthSpending;
    private double educationSpending;

    private double taxRebate;

    public TaxPayer() {
    }

    public TaxPayer(double salaryIncome, double serviceIncome, double capitalIncome, double healthSpending, double educationSpending) {
        this.salaryIncome = salaryIncome;
        this.serviceIncome = serviceIncome;
        this.capitalIncome = capitalIncome;
        this.healthSpending = healthSpending;
        this.educationSpending = educationSpending;
    }

    public double getSalaryIncome() {
        return salaryIncome;
    }

    public void setSalaryIncome(double salaryIncome) {
        this.salaryIncome = salaryIncome;
    }

    public double getServiceIncome() {
        return serviceIncome;
    }

    public void setServiceIncome(double serviceIncome) {
        this.serviceIncome = serviceIncome;
    }

    public double getCapitalIncome() {
        return capitalIncome;
    }

    public void setCapitalIncome(double capitalIncome) {
        this.capitalIncome = capitalIncome;
    }

    public double getHealthSpending() {
        return healthSpending;
    }

    public void setHealthSpending(double healthSpending) {
        this.healthSpending = healthSpending;
    }

    public double getEducationSpending() {
        return educationSpending;
    }

    public void setEducationSpending(double educationSpending) {
        this.educationSpending = educationSpending;
    }

    public double salaryTax() {
        if (salaryIncome < 36000.0){
            return salaryIncome * 0.0;
        }
        else if (salaryIncome >= 36000.0 && salaryIncome <= 60000.0) {
            return salaryIncome * 0.10;
        }
        else {
            return salaryIncome * 0.20;
        }
    }

    public double servicesTax() {
        if (serviceIncome > 0.0) {
            return serviceIncome * 0.15;
        }
        else {
            return serviceIncome * 0.0;
        }
    }

    public double capitalTax() {
        if (capitalIncome > 0.0) {
            return capitalIncome * 0.20;
        }
        else {
            return capitalIncome * 0.0;
        }
    }

    public double grossTax() {
        return salaryTax() + servicesTax() + capitalTax();
    }

    public double taxRebate () {
        double percentage = grossTax() * 0.30;
        if (healthSpending + educationSpending <= percentage) {
            return taxRebate = healthSpending + educationSpending;
        }
        else if (healthSpending + educationSpending > percentage) {
            return taxRebate = percentage;
        }
        return taxRebate;
    }

    public double netTax() {
        return grossTax() - taxRebate();
    }

    public String toString(){
        return  "Imposto bruto total: " + String.format("%.2f", grossTax()) + "\n" +
                "Abatimento: " + String.format("%.2f", taxRebate()) + "\n" +
                "Imposto devido: " + String.format("%.2f",netTax());
    }
}
