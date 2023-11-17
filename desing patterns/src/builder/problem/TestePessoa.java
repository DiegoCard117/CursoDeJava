package builder.problem;

import builder.Pessoa;

public class TestePessoa {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa(
                "Diego",
                "Cardoso",
                "99999999",
                "diegocardoso117@gmail.com",
                "Dih",
                "01/11/2001");

        System.out.println(pessoa);
    }

}
