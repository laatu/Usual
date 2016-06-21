package Collec1;

import java.util.*;

public class Hset {
    public static void main(String[] args) {
        //HashSet set=new HashSet();
        LinkedHashSet setl=new LinkedHashSet();
        TreeSet set=new TreeSet();
        set.add("anuj");
        set.add("garg");
        set.add("Manish");
       // set.add(77);
        //System.out.println(set);
        A a=new A(32);
        setl.add(a);
        setl.add(new A(3));
        setl.add(new A(332));
        System.out.println(setl);
               
    }    
}

class A{
int a;
A(int b){
    a=b;
}
public String toString(){
return ""+a;}
}
