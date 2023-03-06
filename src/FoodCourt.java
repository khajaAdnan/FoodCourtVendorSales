public class FoodCourt {
    private String foodCourt;
    private String vendorName;
    private double price;

    public FoodCourt(String foodCourt, String vendorName, double price) {
        this.foodCourt = foodCourt;
        this.vendorName = vendorName;
        this.price = price;
    }

    public String getFoodCourt() {
        return foodCourt;
    }

    public void setFoodCourt(String foodCourt) {
        this.foodCourt = foodCourt;
    }

    public String getVendorName() {
        return vendorName;
    }

    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
