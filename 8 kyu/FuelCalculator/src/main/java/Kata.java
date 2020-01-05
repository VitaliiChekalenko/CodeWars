public class Kata{
  public static double fuelPrice(int litres, double pricePerLiter) {
    return litres<2? litres*pricePerLiter :
            litres<4? litres*(pricePerLiter-0.05) :
              litres<6? litres*(pricePerLiter-0.1) :
                litres<8? litres*(pricePerLiter-0.15) :
                  litres<10? litres*(pricePerLiter-0.2) : litres*(pricePerLiter-0.25);
  }
}