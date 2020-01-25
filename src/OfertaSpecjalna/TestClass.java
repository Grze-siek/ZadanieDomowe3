package OfertaSpecjalna;

public class TestClass {
    public static void main(String[] args) {
        Product produkt1 = new Product("Mleko", 2.5, "mleko bezlaktozowe", new Category("nabiał", "produkty prosto z farmy"));
        Product produkt2 = new Product("jajka", 10, "jaja L z wolnego wybiegu", new Category("nabiał", "produkty prosto z farmy"));
        Product produkt3 = new Product("chleb", 2.5, "chleb pełnoziarnisty", new Category("pieczywo", "codziennie świeże pieczywo"));
        Product produkt4 = new Product("torba foliowa", 0.5, "torba na zakupy");
        SpecialOffer specialproduct = new SpecialOffer(produkt1, "tańsze mleko tylko do końca tygodnia", "25.01-30.01", 0.2);
        System.out.printf("%s | %s | %1.2f zł | %s | %s\n", produkt1.productName, produkt1.productDescription, produkt1.price, produkt1.productCategory.name, produkt1.productCategory.description);
        System.out.printf("%s | %s | %1.2f zł | %s | %s\n", produkt2.productName, produkt2.productDescription, produkt2.price, produkt2.productCategory.name, produkt2.productCategory.description);
        System.out.printf("%s | %s | %1.2f zł | %s | %s\n", produkt3.productName, produkt3.productDescription, produkt3.price, produkt3.productCategory.name, produkt3.productCategory.description);
        System.out.printf("%s | %s | %1.2f zł", produkt4.productName, produkt4.productDescription, produkt4.price);
    }
}
