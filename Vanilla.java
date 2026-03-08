public class Vanilla extends Cake {
  private String topping;
  public Vanilla (String type, String size, int layers, String topping){
    super (type, size);
    this.topping= toppping;
  }
  public Vanilla (Vanilla V) {}//reem: i need to understand this!!
  public double CalculatePrice (int size, String topping) {}
  public double getDiscount (double prec ) {}//chnage name of method and name of argument
  @Override 
  public String toString () {}//close to string
}
