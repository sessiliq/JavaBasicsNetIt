package Homework9;

public class ETCompany extends Company{
    private String founderName;
    private double startCapital;
    private double currentCapital;

    public String getFounderName() {
        return founderName;
    }

    public void setFounderName(String founderName) {
        if (founderName.isEmpty()){
            System.out.println("Founder's name must be entered!");
        }
        else {
            this.founderName = founderName;
        }
    }

    public double getStartCapital() {
        return startCapital;
    }

    public void setStartCapital(double startCapital) {
        if (startCapital <= 0){
            System.out.println("Start capital cannot be zero or less!");
        }
        else {
            this.startCapital = startCapital;
        }
    }

    public double getCurrentCapital() {
        return currentCapital;
    }

    public void setCurrentCapital(double currentCapital) {
        this.currentCapital = currentCapital;
    }

    public double todayProfit(){
        double todayProfit = currentCapital - startCapital;
        return todayProfit;
    }

    public ETCompany(String founderName, double startCapital, String companyName, String dateOfFoundation, String vatNumber){
        super(companyName,dateOfFoundation,vatNumber);
        setFounderName(founderName);
        setStartCapital(startCapital);

    }
}
