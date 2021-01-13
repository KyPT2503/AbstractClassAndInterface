import java.time.LocalDate;

public class MaterialManager {
    public Material[] materials = new Material[10];

    private static MaterialManager instance;

    private MaterialManager() {
    }

    public static MaterialManager getInstance() {
        if (instance == null) {
            synchronized (MaterialManager.class) {
                if (instance == null) {
                    instance = new MaterialManager();
                }
            }
        }
        return instance;
    }
}
