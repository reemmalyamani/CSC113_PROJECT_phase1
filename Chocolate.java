public class Chocolate {
  protected int layers;
  public Chocolate (String type, String size, int layers, boolean extra) {
    super (type, size);
    this.layers= layers; 
    //i dont know what to do with cocoa
  }//close constructor
  public Chocolate (Chocolate c) {}
  public CalculatePrice (int size, boolean Extra){
    
  }// close Calculate price
  public double getDiscount (double prec) {} //same as comment about names in class Vanilla
  @Override 
  public String toString (){
    return "" ;
  }
}
