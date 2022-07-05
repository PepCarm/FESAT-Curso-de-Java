/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alimentos;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author José Carmona
 */
public class ProductoFinal {
       
    /**
     * @param args the command line arguments
     */  
    public static void main(String[] args) {
        
 //Productos Frescos
 
        Calendar fechadeEnvasadofresco1 =new GregorianCalendar(2021, Calendar.JANUARY, 21, 12, 4, 35);
        Calendar fechadeCaducidadfresco1 =new GregorianCalendar(2021, Calendar.MARCH, 21, 12, 4, 35);
        ProductoFresco fresco1 = new ProductoFresco(fechadeEnvasadofresco1,"Argentina", fechadeCaducidadfresco1,124578014);
        System.out.println(fresco1.getFechadeEnvasado().getTime());
        System.out.println(fresco1.getPaisdeOrigen());
        System.out.println(fresco1.getNumLote());
        System.out.println(fresco1.getFechadeCaducidad().getTime());
        
        Calendar fechadeEnvasadofresco2 =new GregorianCalendar(2021, Calendar.JANUARY, 21, 14, 4, 35);
        Calendar fechadeCaducidadfresco2 =new GregorianCalendar(2021, Calendar.MARCH, 21, 14, 4, 35);
        ProductoFresco fresco2 = new ProductoFresco(fechadeEnvasadofresco2,"Argentina", fechadeCaducidadfresco2,07520412);
        System.out.println(fresco2.getFechadeEnvasado().getTime());
        System.out.println(fresco2.getPaisdeOrigen());
        System.out.println(fresco2.getNumLote());
        System.out.println(fresco2.getFechadeCaducidad().getTime());      
        
//Productos Refrigerados       
        
        Calendar fechadeEnvasadoRefrigerado1 =new GregorianCalendar(2021, Calendar.FEBRUARY, 1, 9, 35, 11);
        Calendar fechadeCaducidadRefrigerado1 =new GregorianCalendar(2021, Calendar.MAY, 1, 9, 35, 11);
        ProductoRefrigerado refrigerado1 = new ProductoRefrigerado ("41203",fechadeEnvasadoRefrigerado1,-3.7,"Argentina", fechadeCaducidadRefrigerado1,17520148);
        System.out.println(refrigerado1.getFechadeEnvasado().getTime());
        System.out.println(refrigerado1.getPaisdeOrigen());
        System.out.println(refrigerado1.getNumLote());
        System.out.println(refrigerado1.getFechadeCaducidad().getTime()); 
        System.out.println(refrigerado1.getTempSugerida());
        System.out.println(refrigerado1.getCodigoOrganismo());
        
        Calendar fechadeEnvasadoRefrigerado2 =new GregorianCalendar(2020, Calendar.DECEMBER, 14, 11, 24, 11);
        Calendar fechadeCaducidadRefrigerado2 =new GregorianCalendar(2021, Calendar.APRIL, 14, 11, 24, 11);
        ProductoRefrigerado refrigerado2 = new ProductoRefrigerado ("41203",fechadeEnvasadoRefrigerado1,-3.7,"Argentina", fechadeCaducidadRefrigerado1,01420102);
        System.out.println(refrigerado2.getFechadeEnvasado().getTime());
        System.out.println(refrigerado2.getPaisdeOrigen());
        System.out.println(refrigerado2.getNumLote());
        System.out.println(refrigerado2.getFechadeCaducidad().getTime()); 
        System.out.println(refrigerado2.getTempSugerida());
        System.out.println(refrigerado2.getCodigoOrganismo());        
        
        Calendar fechadeEnvasadoRefrigerado3 =new GregorianCalendar(2020, Calendar.AUGUST, 10, 15, 27, 13);
        Calendar fechadeCaducidadRefrigerado3 =new GregorianCalendar(2020, Calendar.NOVEMBER, 10, 15, 27, 13);
        ProductoRefrigerado refrigerado3 = new ProductoRefrigerado ("41203",fechadeEnvasadoRefrigerado1,-3.7,"Argentina", fechadeCaducidadRefrigerado1,47201452);
        System.out.println(refrigerado3.getFechadeEnvasado().getTime());
        System.out.println(refrigerado3.getPaisdeOrigen());
        System.out.println(refrigerado3.getNumLote());
        System.out.println(refrigerado3.getFechadeCaducidad().getTime()); 
        System.out.println(refrigerado3.getTempSugerida());
        System.out.println(refrigerado3.getCodigoOrganismo());       
        
     //Congelados por Agua
     
        Calendar fechadeEnvasadoCongeladoxAgua1 =new GregorianCalendar(2020, Calendar.SEPTEMBER, 18, 10, 8, 57);
        Calendar fechadeCaducidadCongeladoxAgua1 =new GregorianCalendar(2020, Calendar.DECEMBER, 18, 10, 8, 57);
        CongeladoxAgua agua1 = new CongeladoxAgua (-2.5,fechadeEnvasadoCongeladoxAgua1,"Argentina",-3.7, fechadeCaducidadCongeladoxAgua1,20130753);
        System.out.println(agua1.getFechadeEnvasado().getTime());
        System.out.println(agua1.getPaisdeOrigen());
        System.out.println(agua1.getNumLote());
        System.out.println(agua1.getFechadeCaducidad().getTime()); 
        System.out.println(agua1.getSalinidadagua());
        System.out.println(agua1.getTempSugerida());
         
        Calendar fechadeEnvasadoCongeladoxAgua2 =new GregorianCalendar(2020, Calendar.SEPTEMBER, 18, 16, 17, 33);
        Calendar fechadeCaducidadCongeladoxAgua2 =new GregorianCalendar(2020, Calendar.DECEMBER, 18, 16, 17, 33);
        CongeladoxAgua agua2 = new CongeladoxAgua (-2.5,fechadeEnvasadoCongeladoxAgua1,"Argentina",-3.7, fechadeCaducidadCongeladoxAgua1,750149620);
        System.out.println(agua2.getFechadeEnvasado().getTime());
        System.out.println(agua2.getPaisdeOrigen());
        System.out.println(agua2.getNumLote());
        System.out.println(agua2.getFechadeCaducidad().getTime()); 
        System.out.println(agua2.getSalinidadagua());
        System.out.println(agua2.getTempSugerida());
        
    //Congelados x Aire
    
        Calendar fechadeEnvasadoCongeladoxAire1 =new GregorianCalendar(2020, Calendar.OCTOBER, 28, 17, 3, 27);
        Calendar fechadeCaducidadCongeladoxAire1 =new GregorianCalendar(2021, Calendar.JANUARY, 28, 17, 3, 27);
        CongeladoxAire aire1 = new CongeladoxAire (1.23,0.56,4.6,7.03,fechadeEnvasadoCongeladoxAire1,"Argentina",-3.7, fechadeCaducidadCongeladoxAire1,10475201);
        System.out.println(aire1.getFechadeEnvasado().getTime());
        System.out.println(aire1.getPaisdeOrigen());
        System.out.println(aire1.getNumLote());
        System.out.println(aire1.getFechadeCaducidad().getTime()); 
        System.out.println(aire1.getTempSugerida());
        System.out.println(aire1.getDioxidocarbono());
        System.out.println(aire1.getNitrogeno());
        System.out.println(aire1.getOxigeno());
        System.out.println(aire1.getVapordeagua());
        
        Calendar fechadeEnvasadoCongeladoxAire2 =new GregorianCalendar(2020, Calendar.OCTOBER, 28, 17, 5, 13);
        Calendar fechadeCaducidadCongeladoxAire2 =new GregorianCalendar(2021, Calendar.JANUARY, 28, 17, 5, 13);
        CongeladoxAire aire2 = new CongeladoxAire (1.23,0.56,4.6,7.03,fechadeEnvasadoCongeladoxAire1,"Argentina",-3.7, fechadeCaducidadCongeladoxAire1,35710248);
        System.out.println(aire2.getFechadeEnvasado().getTime());
        System.out.println(aire2.getPaisdeOrigen());
        System.out.println(aire2.getNumLote());
        System.out.println(aire2.getFechadeCaducidad().getTime()); 
        System.out.println(aire2.getTempSugerida());
        System.out.println(aire2.getDioxidocarbono());
        System.out.println(aire2.getNitrogeno());
        System.out.println(aire2.getOxigeno());
        System.out.println(aire2.getVapordeagua());        
        
    //Congelados x Nitro

        Calendar fechadeEnvasadoCongeladoxNitro =new GregorianCalendar(2020, Calendar.DECEMBER, 19, 14, 28, 2);
        Calendar fechadeCaducidadCongeladoxNitro =new GregorianCalendar(2021, Calendar.MARCH, 19, 14, 28, 2);
        CongeladoxNitro nitro = new CongeladoxNitro ("cocinar al vacio", 4, fechadeEnvasadoCongeladoxAire1,"Argentina",-5.7, fechadeCaducidadCongeladoxAire1,75310270);
        System.out.println(nitro.getFechadeEnvasado().getTime());
        System.out.println(nitro.getPaisdeOrigen());
        System.out.println(nitro.getNumLote());
        System.out.println(nitro.getFechadeCaducidad().getTime()); 
        System.out.println(nitro.getTempSugerida());
        System.out.println(nitro.getMetododeCongelacion());
        System.out.println(nitro.getTiempoexposicion());
    
     
    }
    
}
