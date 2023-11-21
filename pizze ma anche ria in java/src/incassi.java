import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
public class incassi {
    private int incassi;
    private int venduti;
   

public void orario(){

LocalDate dataCorrente = LocalDate.now();
System.out.println("Data corrente: " + dataCorrente);


LocalTime orarioCorrente = LocalTime.now();
System.out.println("Orario corrente: " + orarioCorrente);

LocalDateTime dataOraCorrenti = LocalDateTime.now();
System.out.println("Data e orario correnti: " + dataOraCorrenti);

int giorno = dataCorrente.getDayOfMonth();
        int ora = orarioCorrente.getHour();
        int minuto = orarioCorrente.getMinute();

        System.out.println("Giorno: " + giorno);
        System.out.println("Ora: " + ora);
        System.out.println("Minuto: " + minuto);

        LocalTime orarioModificato = orarioCorrente.withHour(15).withMinute(30);
        System.out.println("Orario modificato: " + orarioModificato);

   } 

}