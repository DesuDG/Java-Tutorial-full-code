public class switch_statement {
    public static void main(String[] args) {
       char ope='+';
       int a=80, b=4;
       switch (ope){
           case '+':
               System.out.println(a+b);
               break;
           case '-':
               System.out.println(a-b);
               break;
           case '/':
               System.out.println(a/b);
               break;
           default:
               System.out.println(a*b);
       }
    }
}
