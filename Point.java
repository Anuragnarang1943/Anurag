package assignment4;
import jva.util.scanner;
class Point {
    private Integer x;
    private Integer y;
    
    public Point(){}
    public Point(Integer x, Integer y) {this.x=x; this.y=y;}
    public Integer getX() {
        return x;
    }
    public void setX(Integer x) {
        this.x = x;
    }
    public Integer getY() {
        return y;
    }
    public void setY(Integer y) {
        this.y = y;
    }
    @Override
    public String toString() {
        return "Point [x=" + x + ", y=" + y + "]";
    }
    
     public double distance() {
            return distance(0, 0);
        }
     public double distance(int x, int y) {
         System.out.println( this.x + " " + this.y);
   
         return Math.sqrt((x - this.x) * (x - this.x) + (y - this.y) * (y - this.y));
     }
     public double distance(Point secondPoint) {  
      
// return distance(secondPoint.x, secondPoint.y);
         System.out.println(+secondPoint.x+" "+ secondPoint.y);
         return distance(secondPoint.x, secondPoint.y);
         }





   public static class Main {





  public static void main(String[] args) {
           Point first = new Point();
           Point second = new Point();
           first.setY(200);
           first.setX(100);
           second.setX(200);
           second.setY(700);
           System.out.printf("The distance between above two points is"+" %.1f "+"units\n", first.distance(second));
   }
    }
}