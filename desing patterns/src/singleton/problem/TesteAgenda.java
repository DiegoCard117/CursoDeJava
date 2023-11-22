package singleton.problem;

public class TesteAgenda {

    public static void main(String[] args) {
        reservar("Sexta");
        //reservar("Sabado");
    }

    public static void reservar(String dia) {
        Agenda agenda = new Agenda();
        agenda.ocupa(dia);
        System.out.println(agenda.getDias());
    }
}
