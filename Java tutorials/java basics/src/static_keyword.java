public class static_keyword {
    int id;
    String name;
    static String dep="MAthes";

    static_keyword(int i,String n){
        id=i;
        name=n;
    }
 static void change(){
        dep="It";
}
void display(){
    System.out.println(id+" "+name+" "+dep);
}
    public static void main(String[] args) {

        static_keyword.change();
      static_keyword s1=new static_keyword(111,"desu");
      static_keyword s2=new static_keyword(222,"abigal");

      s1.display();
      s2.display();
    }
}
