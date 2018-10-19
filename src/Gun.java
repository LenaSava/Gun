public class Gun {
    private int amount;
    private int capacity;
    private boolean isReady;
    private String model;
    private int totalShots;

    public Gun(String model, int capacity) {
        this.amount = 0;
        this.capacity = capacity;
        this.isReady = false;
        this.model = model;
        this.totalShots = 0;
    }

    public int getAmount() {
        return this.amount;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public boolean getReady() {
        return isReady;
    }

    public String getModel() {
        return this.model;
    }

    public int getTotalShots() {
        return this.totalShots;
    }

    public void prepare() {
        this.isReady = true;
    }

    public void reload() {
        this.amount = capacity;
    }

    public void shoot() throws NotReady, OutOfRounds {
        if ( !this.isReady ) {
            throw new NotReady();
        }

        if ( this.amount == 0 ) {
            this.isReady = false;
            throw new OutOfRounds();
        }

        System.out.println("Bang!");

        this.totalShots += 1;
        this.amount -= 1;

        if (this.amount == 0 ) {
            this.isReady = false;
        }

    }

    public String toString() {
        return "Model: " + getModel() + "; Amount: " + getAmount() + "; Capacity: " + getCapacity() + "; Ready: " + getReady() + "; TotalShots: " + getTotalShots();
    }
}