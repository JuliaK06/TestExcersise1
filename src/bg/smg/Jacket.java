package bg.smg;

public class Jacket extends Clothes implements Comparable<Jacket>{
    private String brand;
    private String season;
    private double price;



    public Jacket() {
        super();
        this.brand =" ";
        this.season =" ";
        this.price = 0.0;
    }
    public Jacket(String fabric,String brand, String season, double price) {
        super(fabric);
        this.brand = brand;
        this.season = season;
        this.price = price;
    }
    @Override
    public void sell() {
        System.out.println("Якето е продадено на цена: "+ this.price);
    }
    @Override
    public String toString() {
        return "Jacket{" +
               "fabric='" + super.getFabric() + '\'' +
                ", brand='" + brand + '\'' +
                ", season='" + season + '\'' +
                ", price=" + price +
                '}';
    }
    @Override
    public int compareTo(Jacket o) {
       if(this.getPrice()>o.getPrice()){
           return 1;
       }
       else if(this.getPrice()==o.getPrice()){
           return  0;
       }
       else {
           return -1;
       }
    }
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


}
