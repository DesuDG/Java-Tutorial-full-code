public class stud {
    int id;
    String name;
    static String dep="IT";

    stud(int i, String n){
        id=i;
        name=n;
    }
   static void change(){
        dep="Mathes";
    }
void display(){
    System.out.println(id+" "+name+" "+dep);
}
    public static void main(String[] args) {
        stud.change();
       stud s1= new stud(11,"desye");
       stud s2 = new stud(22,"abigal");

       s1.display();
       s2.display();
    }
}
