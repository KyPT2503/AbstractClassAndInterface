import java.time.LocalDate;

public class Meat extends Material {
    private double weight;

    public Meat() {
    }
    public Meat withWeight(double weight){
        this.weight=weight;
        return this;
    }

    public Meat withId(String id){
        this.setId(id);
        return this;
    }
    public Meat withName(String name){
        this.setName(name);
        return this;
    }
    public Meat withManufacturingDate(LocalDate manufacturingDate){
        this.setManufacturingDate(manufacturingDate);
        return this;
    }
    public Meat withCost(int cost){
        this.setCost(cost);
        return this;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    double getAmount() {
        return this.getCost() * this.getWeight();
    }

    @Override
    LocalDate getExpiryDate() {
        return this.getManufacturingDate().plusDays(7);
    }

    @Override
    public String toString() {
        return super.toString()+ "Meat{" +
                "weight=" + weight +
                '}';
    }
}
