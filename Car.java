import javax.lang.model.util.ElementScanner14;

public class Car {
    private String carname;
    private String carmodel;
    public int speed;
    public static final int no = 23;
    public Car(String na, String model, int speed) {
        carname = na;

    }

    public void setter(String carname) {
        this.carname = carname;

    }

    public String getname() {
        return carname;
    }

  public void settmodel(String carmodel)
  {
    if((carmodel.equals("pg"))||(carmodel.equals("rg")))
      {this.carmodel = carmodel;}
      else
      {
         this.carmodel="ng";
      }
   }

    public String getmodel() {
        return carmodel;
    }

}
