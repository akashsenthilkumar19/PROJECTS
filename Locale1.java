
import java.text.NumberFormat;
import java.util.Locale;


public class Locale1 {

    public static void main(String[] args) 
    {
       
        Locale loc=new Locale("ru","RU");
        System.out.println(loc.getDisplayCountry());
        System.out.println(loc.getDisplayLanguage());
        double amount=33545.21;
      NumberFormat nf=NumberFormat.getCurrencyInstance(loc);
      String mycurrency=nf.format(amount);
        System.out.println("currency is"+mycurrency);
        System.out.println("country is"+loc.getDisplayCountry());
        System.out.println("language is"+loc.getDisplayLanguage());
  

        
        
        
    }
    
}
