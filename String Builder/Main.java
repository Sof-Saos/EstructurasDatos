public class Main {
    public static void main(String[] args) {
        ShippingLabelGeneratodr sp = new ShippingLabelGeneratodr();
        String label = sp.generateShippingLabel();
        System.out.println(label);
    }
}
