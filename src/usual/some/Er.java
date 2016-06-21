
import java.util.ArrayList;
import java.util.List;
import java.util.Collection;
import java.util.*;

/* To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author laatuji
 */
public class Er {

    public static void main(String[] args) {
        //Collection <String> l=new ArrayList <String> ();
        //List <String> l=new ArrayList <String> ();
        List l = new ArrayList();
        Integer a = new Integer(2);
        l.add(a);
        l.add("Anuj");
        l.add("Garg");
        l.add(a);
        System.out.println(l);
        l.remove((int) a);

        //  Iterator i= l.iterator();
        S s = new S(52);
        //s.k();
        S.K sk = s.new K(22);
        System.out.println(sk);
        for (Object o : l) {
            System.out.println(o);
        }
    }
}

class S {

    L l;
    int kk;

    S(int a) {
        l = new L(a);
        l.j = 78;
        System.out.println(l.j);
    }

    int k() {
        return (l.j);
    }

    class K {

        int jk;

        K(int h) {
            jk = h;
        }
    }
}

class L {

    int j;

    L(int h) {
        j = h;
    }
}
