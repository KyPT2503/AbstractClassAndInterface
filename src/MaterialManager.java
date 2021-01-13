import java.time.LocalDate;

public class MaterialManager {
    public Material[] materials = new Material[10];

    public static void main(String[] args) {
        MaterialManager materialManager = new MaterialManager();
        materialManager.materials[0] = new Meat().withId("#19D021").withName("buffalo").withManufacturingDate(LocalDate.now().plusDays(4)).withCost(4000).withWeight(3);
        materialManager.materials[1] = new Meat().withId("#19D022").withName("pig").withManufacturingDate(LocalDate.now().plusDays(4)).withCost(4000).withWeight(3);
        materialManager.materials[2] = new Meat().withId("#19D023").withName("bird").withManufacturingDate(LocalDate.now().plusDays(4)).withCost(4000).withWeight(3);
        materialManager.materials[3] = new Meat().withId("#19D024").withName("buffalo").withManufacturingDate(LocalDate.now().plusDays(4)).withCost(4000).withWeight(3);
        materialManager.materials[4] = new Meat().withId("#19D025").withName("buffalo").withManufacturingDate(LocalDate.now().plusDays(4)).withCost(4000).withWeight(3);

        materialManager.materials[5] = new CrispyFloor().withId("#19D021").withName("buffalo").withManufacturingDate(LocalDate.now().plusDays(4)).withCost(4000).withQuantify(3000);
        materialManager.materials[6] = new CrispyFloor().withId("#19D021").withName("buffalo").withManufacturingDate(LocalDate.now().plusDays(4)).withCost(4000).withQuantify(3000);
        materialManager.materials[7] = new CrispyFloor().withId("#19D021").withName("buffalo").withManufacturingDate(LocalDate.now().plusDays(4)).withCost(4000).withQuantify(3000);
        materialManager.materials[8] = new CrispyFloor().withId("#19D021").withName("buffalo").withManufacturingDate(LocalDate.now().plusDays(4)).withCost(4000).withQuantify(3000);
        materialManager.materials[9] = new CrispyFloor().withId("#19D021").withName("buffalo").withManufacturingDate(LocalDate.now().plusDays(4)).withCost(4000).withQuantify(3000);

        System.out.println(materialManager.materials[0].getRealMoney());
        System.out.println(materialManager.materials[0].getAmount());
        System.out.println(materialManager.materials[0].calPriceDifferent());
    }
}
