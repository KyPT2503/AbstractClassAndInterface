import java.time.LocalDate;

public abstract class Material implements Discount, CanCalPriceDifferent {
    private String id;
    private String name;
    private LocalDate manufacturingDate;
    private int cost;


    public Material() {
    }

    public Material withId(String id){
        this.id=id;
        return this;
    }
    public Material withName(String name){
        this.name=name;
        return this;
    }
    public Material withManufacturingDate(LocalDate manufacturingDate){
        this.manufacturingDate=manufacturingDate;
        return this;
    }
    public Material withCost(int cost){
        this.cost=cost;
        return this;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getManufacturingDate() {
        return manufacturingDate;
    }

    public void setManufacturingDate(LocalDate manufacturingDate) {
        this.manufacturingDate = manufacturingDate;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    abstract double getAmount();

    abstract LocalDate getExpiryDate();

    @Override
    public double calPriceDifferent() {
        return this.getAmount() - this.getRealMoney();
    }

    @Override
    public String toString() {
        return "Material{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", manufacturingDate=" + manufacturingDate +
                ", cost=" + cost +
                '}';
    }
}
