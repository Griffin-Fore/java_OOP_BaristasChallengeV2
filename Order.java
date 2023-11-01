import java.text.NumberFormat;
import java.util.ArrayList;
public class Order {
    private String name;
    Double total;
    private Boolean ready;
    private ArrayList<Item> items;
    
    public Order() {
        this.name = "Guest";
        this.items = new ArrayList<Item>();
    }

    public Order(String name) {
        this.name = name;
        this.items = new ArrayList<Item>();
    }

    // getters and setters
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public Double getTotal() {
        return this.total;
    }
    public void setTotal(Double total) {
        this.total = total;
    }

    public Boolean isReady() {
        return this.ready;
    }
    public void setReady(Boolean ready) {
        this.ready = ready;
    }

    public ArrayList<Item> getItems() {
        return this.items;
    }
    public void setItems(ArrayList<Item> items) {
        this.items = items;
    }

// Class methods
    public void addItems(Item item) {
        this.items.add(item);
    }

    public String getStatusMessage() {
        Boolean orderReady = this.isReady();
        if(orderReady.equals(true)){
            return "Your order is ready.";
        }
        return "Thank you for waiting. Your order will be ready soon.";
    }

    public Double getOrderTotal() {
        Double total = 0.00;
        for(int i = 0; i < items.size(); i++){
            total += items.get(i).getPrice();
        }
        return total;
    }

    public void display() {
        System.out.println("Customer name: " + this.name);
        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        for(int i = 0; i < this.items.size(); i++) {
            System.out.println(this.items.get(i).getName() + " - " + formatter.format(this.items.get(i).getPrice()));
        }
        System.out.println("Total: " + formatter.format(this.getOrderTotal()));
    }
}
