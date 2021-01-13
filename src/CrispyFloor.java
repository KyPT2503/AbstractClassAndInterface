import java.time.LocalDate;

public class CrispyFloor extends Material {
    private double quantify;

    public CrispyFloor() {
    }

    public CrispyFloor withId(String id){
        this.setId(id);
        return this;
    }

    public CrispyFloor withName(String name){
        this.setName(name);
        return this;
    }

    public CrispyFloor withManufacturingDate(LocalDate manufacturingDate){
        this.setManufacturingDate(manufacturingDate);
        return this;
    }

    public CrispyFloor withCost(int cost){
        this.setCost(cost);
        return this;
    }

    public CrispyFloor withQuantify(double quantify){
        this.setQuantify(quantify);
        return this;
    }

    public void setQuantify(double quantify) {
        this.quantify = quantify;
    }

    public double getQuantify() {
        return quantify;
    }

    @Override
    double getAmount() {
        return this.getCost() * this.getQuantify();
    }

    @Override
    LocalDate getExpiryDate() {
        return this.getManufacturingDate().plusYears(1);
    }

    @Override
    public double getRealMoney() {
        if(LocalDate.now().plusMonths(2).isAfter(this.getManufacturingDate())){
            return this.getAmount()*0.6;
        } else if(LocalDate.now().plusDays(4).isAfter(this.getManufacturingDate())){
            return this.getAmount()*0.8;
        } else {
            return this.getAmount()*0.95;
        }
    }
}
