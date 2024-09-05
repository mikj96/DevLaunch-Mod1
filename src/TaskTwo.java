public class TaskTwo {
    private int weight;
    private String manufacturer;
    private String model;

    public TaskTwo(int weight, String manufacturer, String model) {
        this.weight = weight;
        this.manufacturer = manufacturer;
        this.model = model;
    }

    public int getWeight() {
        return weight;
    }

    public String getManufacturer() {
        return manufacturer;
    }
    public String getModel() {
        return model;
    }
    public void print() {
        System.out.println(this.manufacturer + " " + this.model + " " + this.weight);
    }
}
