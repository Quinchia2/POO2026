public class TestProduct {
    public static void main(String[] args){
        Product first = new Product("Cereal", 4000, 16);

        boolean nameAccepted = first.setName("Leche");

        System.out.println("Was the new name accepted? "+ nameAccepted);
        System.out.println("Actual name: "+ first.getName());
        boolean priceAccepted = first.setPrice(5000);
        System.out.println("Was the new price accepted? "+ priceAccepted);
        System.out.println("Actual price: "+ first.getPrice());
        boolean stockAccepted = first.setStock(14);
        System.out.println("Was the new Stock accepted? "+ stockAccepted);
        System.out.println("Actual Stock: "+ first.getStock());


        nameAccepted = first.setName("");
        System.out.println("Was the new name accepted? "+ nameAccepted);
        System.out.println("Actual name: "+ first.getName());
        priceAccepted = first.setPrice(-1);
        System.out.println("Was the new price accepted? "+ priceAccepted);
        System.out.println("Actual price: "+ first.getPrice());
        stockAccepted = first.setStock(-8);
        System.out.println("Was the new Stock accepted? "+ stockAccepted);
        System.out.println("Actual Stock: "+ first.getStock());


        nameAccepted = first.setName("Leche de Soya");
        System.out.println("Was the new name accepted? "+ nameAccepted);
        System.out.println("Actual name: " + first.getName());
        priceAccepted = first.setPrice(0);
        System.out.println("Was the new price accepted? "+ priceAccepted);
        System.out.println("Actual price: "+ first.getPrice());
        stockAccepted = first.setStock(0);
        System.out.println("Was the new Stock accepted? "+ stockAccepted);
        System.out.println("Actual Stock: "+ first.getStock());
    }
}
