public class Lamp{
  private int globRating;
  private boolean battery;
  private Lamptype style;
  public Lamp(int g,boolean b,Lamptype s){
    this.globRating = g;
    this.battery = b;
    this.style = s;
  }

public enum Lamptype{
  NORMAL,
  NEON,
  LAVA;
}
}

