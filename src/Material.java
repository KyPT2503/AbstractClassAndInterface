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

    public void setId(String id) {
        this.id = id;
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

    @Override
    public double getRealMoney() {
        if(this instanceof Meat){
            if(LocalDate.now().plusDays(3).isAfter(this.getManufacturingDate())){
                return this.getAmount()*0.5;
            } else if(LocalDate.now().plusDays(5).isAfter(this.getManufacturingDate())){
                return this.getAmount()*0.7;
            } else {
                return this.getAmount()*0.9;
            }
        } else if(this instanceof CrispyFloor) {
            if (LocalDate.now().plusMonths(2).isAfter(this.getManufacturingDate())) {
                return this.getAmount() * 0.6;
            } else if (LocalDate.now().plusDays(4).isAfter(this.getManufacturingDate())) {
                return this.getAmount() * 0.8;
            } else {
                return this.getAmount() * 0.95;
            }
        }
        return -1;
    }
}
