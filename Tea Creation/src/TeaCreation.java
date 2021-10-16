public abstract class TeaCreation {
    int price;
    QuantityAdapter quantity;

    abstract void setPrice(int price);

    public int calculateOrders(int units){
        return units*price;
    }
}
