public class java_contructor {
    int x;
    java_contructor(int z, int y){
       x=z*y;
    }

    public static void main(String[] args) {
        java_contructor obj=new java_contructor(7,5);
        System.out.println(obj.x);
    }
}
