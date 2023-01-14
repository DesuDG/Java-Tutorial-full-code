public class dynamic_poly {
public void calculate(int i, int j){
    System.out.println("i = "+i+"j= "+j);
}
}
class multiple extends dynamic_poly{
    public void calculate(int i, int j){
        System.out.println("i*j = "+(i*j));
    }
}
