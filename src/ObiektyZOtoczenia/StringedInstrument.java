package ObiektyZOtoczenia;

public class StringedInstrument {

    String type;
    String model;
    int numberOfStrings;
    double price;
    boolean isItTuned;

    StringedInstrument(){};

    StringedInstrument(String t, String m, int ns, double p, boolean it)
    {
      type = t;
      model = m;
      numberOfStrings = ns;
      price = p;
      isItTuned = it;
    }
}
