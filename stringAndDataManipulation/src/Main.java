import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.TextStyle;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        String name = "Diego";
        LocalDate today = LocalDate.now();
        Locale country = new Locale("pt", "BR");
        String dayWeek = today.getDayOfWeek().getDisplayName(TextStyle.FULL, country);
        LocalDateTime hour = LocalDateTime.now();

        String saudaçao;

        if (hour.getHour() >= 0 && hour.getHour() < 12) {
            saudaçao = "Bom dia";
        } else if (hour.getHour() > 12 && hour.getHour() < 18) {
            saudaçao = "Boa tarde";
        } else {
            saudaçao = "Boa noite";
        }

        System.out.printf("Olá, %s. Hoje é %s, %s.%n", name, dayWeek, saudaçao);
    }
}