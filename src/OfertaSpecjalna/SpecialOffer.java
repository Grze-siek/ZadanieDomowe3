package OfertaSpecjalna;

public class SpecialOffer {
    Product specialProduct;
    String offerDescription;
    String time;
    double discount;

    SpecialOffer(Product sp, String od, String tm, double dis)
    {
        specialProduct = sp;
        offerDescription = od;
        time = tm;
        discount = dis;
        sp.price = sp.price * (1 - dis);
    }
}
