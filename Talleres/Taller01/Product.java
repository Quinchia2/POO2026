public class Product {
    private String name;
    private double price;
    private int stock;
    public Product(String name, double price, int stock){
        this.name="Unnamed product";
        setName(name);
        setPrice(price);
        setStock(stock);
    }
    public String getName(){
        return name;
    }
    public double getPrice(){
        return price;
    }
    public int getStock(){
        return stock;
    }
    public boolean setName(String newName){
        if (newName!= null && !name.trim().isEmpty()){
            this.name=newName;
            return true;
        }
        return false;
    }
    public boolean setPrice(double newPrice){
        if (newPrice>0){
            this.price=newPrice;
            return true;
        }
        return false;
    }
    public boolean setStock(int newStock){
        if (newStock>=0){
            this.stock=newStock;
            return true;
        }
        return false;
    }
}
