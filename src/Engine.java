public class Engine {
    private String model;
    private int npm;

    public Engine(String model, int npm) {
        this.model = model;
        this.npm = npm;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getNpm() {
        return npm;
    }

    public void setNpm(int npm) {
        this.npm = npm;
    }
}
