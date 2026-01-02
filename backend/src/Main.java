public class Main {
    public static void main(String[] args) {

        System.out.println("AGRICULTURAL MARKET PRICE INTELLIGENCE SYSTEM");
        System.out.println("--------------------------------------------");

        String crop = "Wheat";
        String bestMarket = "Pune Market";
        int price = 2450;

        System.out.println("Crop Name       : " + crop);
        System.out.println("Best Market     : " + bestMarket);
        System.out.println("Best Price (₹)  : " + price + " per quintal");
        System.out.println("Best Time       : Morning 8 AM - 11 AM");

        System.out.println("\nSuggestion:");
        System.out.println("Sell your crop in " + bestMarket + " to get maximum profit.");
    }
}
