
import ma.projet.beans.Service;
import ma.projet.service.ServiceService;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author LACHGAR
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ServiceService ss = new ServiceService();
  
        ss.create(new Service("service1"));
        ss.create(new Service("service2"));
        ss.create(new Service("service3"));

        for (Service s : ss.getAll()) {
            System.out.println("" + s.getNom());
        }
    }
}
