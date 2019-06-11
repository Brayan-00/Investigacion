import java.util.Random;

public class Libro {
    String name;
    int id;
    boolean available;
    int quantity;

    public Libro(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
        create_id();
        is_available();

    }
    private void is_available() {
        if (quantity > 0){
            available = true;
        }else{
            available = false;
        }
    }
    private void create_id() {
        Random rn = new Random();
        id = rn.nextInt(999);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
