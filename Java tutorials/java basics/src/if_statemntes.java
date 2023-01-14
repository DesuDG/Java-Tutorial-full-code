public class if_statemntes {
    //Check if the number is even or odd
    public static void main(String[] args) {
        double n=41.5;
        double r=n%2;
        if (r==0){
            System.out.println(n+": is even number");
        }else if(r==1){
            System.out.println(n+": is Odd number");
        }else{
            System.out.println(n+": is not natural number");
        }
    }
}
