import java.time.LocalDate;

public class EstudandoDatas {

    public static void main(String[] args) {
        //ano - mês - dia
        LocalDate hoje = LocalDate.now();
        System.out.println(hoje);
        LocalDate natal = LocalDate.of(2022, 12, 25);
        System.out.println(natal);
        System.out.println(hoje.isAfter(natal));
        System.out.println(hoje.isBefore(natal));
        int ano = hoje.getYear();
        int mes = hoje.getMonthValue();
        int dia = hoje.getDayOfMonth();
        System.out.println("Hoje é : "+ dia + "/" + mes + "/" + ano);
        int diasParaNatal = natal.getDayOfYear() - hoje.getDayOfYear();
        System.out.println("Faltam " + diasParaNatal + " dias para o natal!");
    }
}
