public class TestProduct {
    public static void main(String[] args){
        Product first = new Product("Cereal", 4000, 16);
        boolean nameAccepted = first.setName("Leche");
        System.out.println("Was the new name accepted?"+ nameAccepted);
        System.out.println("Actual name: "+ first.getName());
        boolean priceAccepted = first.setPrice(5000);
        System.out.println("Was the new price accepted?"+ nameAccepted);
        System.out.println("Actual price: "+ first.getPrice());
        boolean stockAccepted = first.setStock(14);
        System.out.println("Was the new Stock accepted?"+ nameAccepted);
        System.out.println("Actual Stock: "+ first.getStock());
    }
}
