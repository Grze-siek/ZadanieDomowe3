package ObiektyZOtoczenia;

public class InstrumentTest {
    public static void main(String[] args) {
        StringedInstrument guitar1 = new StringedInstrument();
        guitar1.type = "acoustic guitar";
        guitar1.model = "Fender";
        guitar1.numberOfStrings = 6;
        guitar1.price = 1500.0;
        guitar1.isItTuned = true;

        StringedInstrument guitar2 = new StringedInstrument();
        guitar2.type = "classic guitar";
        guitar2.model = "Alvaro";
        guitar2.numberOfStrings = 6;
        guitar2.price = 999.5;
        guitar2.isItTuned = false;

        System.out.println("Nazwa: " + guitar1.type + " | Model: " + guitar1.model + " | Liczba strun: " + guitar1.numberOfStrings + " | Cena: " + guitar1.price + " zł | Czy jest nastrojona? " + guitar1.isItTuned);
        System.out.println("Nazwa: " + guitar2.type + " | Model: " + guitar2.model + " | Liczba strun: " + guitar2.numberOfStrings + " | Cena: " + guitar2.price + " zł | Czy jest nastrojona? " + guitar2.isItTuned);
    }
}
