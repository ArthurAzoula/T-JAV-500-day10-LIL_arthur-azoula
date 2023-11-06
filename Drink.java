public abstract class Drink implements Food {

    protected float price;
    protected int calories;
    protected boolean aCan = false;

    protected Drink(float price, int calories) {
        this.price = price;
        this.calories = calories;
    }

    @Override
    public float getPrice() {
        return 0;
    }

    @Override
    public int getCalories() {
        return 0;
    }

    public boolean isACan() {
        return aCan;
    }
}
