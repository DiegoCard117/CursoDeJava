package singleton.solvem;

import singleton.problem.Agenda;

public class TesteAgendasSingleton {

    public static void main(String[] args) {
        reservarEager("Sexta");
        reservarEager("Sabado");
    }

    public static void reservarEager(String dia) {
        AgendaSingletonEAGER agenda = AgendaSingletonEAGER.getInstance();
        agenda.ocupa(dia);
        System.out.println(agenda.getDias());
    }
}
