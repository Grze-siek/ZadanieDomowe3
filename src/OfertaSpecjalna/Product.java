package OfertaSpecjalna;

public class Product {
    String productName;
    double price;
    String productDescription;
    Category productCategory;

    Product(String pn, double p, String pd, Category pc)
    {
      productName = pn;
      price = p;
      productDescription = pd;
      productCategory = pc;
    }
    Product(String pn, double p, String pd)
    {
        productName = pn;
        price = p;
        productDescription = pd;
    }
}
