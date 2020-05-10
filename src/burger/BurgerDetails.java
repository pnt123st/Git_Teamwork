package burger;

public class BurgerDetails {

    private String burgerName;
    private String burgerTopping;
    private double burgerPrice;


    public BurgerDetails() {
    }

    public BurgerDetails(String burgerName) {
        this.burgerName = burgerName;
    }

    public BurgerDetails(String burgerName, String burgerTopping) {
        this.burgerName = burgerName;
        this.burgerTopping = burgerTopping;
    }

    public BurgerDetails(String burgerName, String burgerTopping, double burgerPrice) {
        this.burgerName = burgerName;
        this.burgerTopping = burgerTopping;
        this.burgerPrice = burgerPrice;
    }

    public String getBurgerName() {
        return burgerName;
    }

    public void setBurgerName(String burgerName) {
        this.burgerName = burgerName;
    }

    public String getBurgerTopping() {
        return burgerTopping;
    }

    public void setBurgerTopping(String burgerTopping) {
        this.burgerTopping = burgerTopping;
    }

    public double getBurgerPrice() {
        return burgerPrice;
    }

    public void setBurgerPrice(double burgerPrice) {
        this.burgerPrice = burgerPrice;
    }

    public static void burgerInfo(){
        System.out.println("This just burger info.");
    }
}
