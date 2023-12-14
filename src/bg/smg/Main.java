package bg.smg;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        ArrayList<Jacket> jackets=new ArrayList<>();
        Jacket j1=new Jacket("textile","Gucci", "winter",24.50);
        jackets.add(j1);
        Jacket j2=new Jacket("cotton","H&M","summer",12.00);
        jackets.add(j2);
        Jacket j3=new Jacket("wool","Versace","summer", 90.00);
        jackets.add(j3);
        Jacket j4=new Jacket("cotton","Bianci","autumn",15.00);
        jackets.add(j4);

        Collections.sort(jackets);
        for(Jacket j:jackets){
            System.out.println(j.toString());
        }
    }
}
