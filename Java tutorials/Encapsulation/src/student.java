public class student {
//    Encapsulation:
//                   Attributes of the class will be hidden or private, and
//                   Can be accessed only through getters and setters method.
private int id;
private String name;

student(int i, String n){
    this.setid(i);
    this.setname(n);
}
public int getid(){
    return id;
}
    public String getname(){
        return name;
    }

    public void setid(int i){
    this.id=i;
    }
    public void setname(String n){
        this.name=n;
    }
}
