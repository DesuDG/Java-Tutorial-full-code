class calculate{
    public  void compute(int i,int j){
        System.out.println(i+" and"+j);
    }
}

class add extends calculate{
    public  void compute(int i,int j){
        System.out.println(i+j);
    }
}
class sub extends calculate{
    public  void compute(int i,int j){
        System.out.println(i-j);
    }
}
class mult extends calculate{
    public  void compute(int i,int j){
        System.out.println(i*j);
    }
}

class poly{
    public static void main(String[] args) {
        calculate c=new calculate();
        c.compute(7,8);
        add a=new add();
        sub s=new sub();
        mult m=new mult();
        a.compute(7,8);
        s.compute(7,8);
        m.compute(7,8);
    }
}