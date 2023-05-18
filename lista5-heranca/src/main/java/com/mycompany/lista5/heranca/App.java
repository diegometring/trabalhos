package com.mycompany.lista5.heranca;
import java.util.ArrayList;
/**
 * @author Diegoo
 */
public class App {
    
    
    public static void main(String[] args) {

        ArrayList<Terrestre> terrestres = new ArrayList<>();
        ArrayList<Aereo> aereos = new ArrayList<>();
        ArrayList<Aquatico> aquaticos = new ArrayList<>();
        
        Terrestre te = new Terrestre("Cachorro");
        terrestres.add(te);
        te = new Terrestre("Gato");
        terrestres.add(te);
        
        Aereo ae = new Aereo("pomba");
        aereos.add(ae);
        ae = new Aereo("gaviao");
        aereos.add(ae);
        
        
        Aquatico aq = new Aquatico("peixe");
        aquaticos.add(aq);
        aq = new Aquatico("baleia");
        aquaticos.add(aq);
        
        System.out.println(terrestres);
        System.out.println(aquaticos);
        System.out.println(aereos);
        
    }


    }

