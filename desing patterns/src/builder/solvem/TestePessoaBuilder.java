package builder.solvem;

import builder.Pessoa;

public class TestePessoaBuilder {

    public static void main(String[] args) {
        Pessoa person =
                new PessoaBuilder().name("Anderson")
                .lastName("Cardoso")
                .email("diegocardoso117@gmail.com")
                .birthDate("01/11/2001")
                .document("9999999999")
                .nickName("dih")
                .createPerson();

//        Pessoa pessoa = new Pessoa(
//                "Diego",
//                "Chagas",
//                "99999999",
//                "diegocardoso117@gmail.com",
//                "Dih",
//                "01/11/2001");


        System.out.println(person);
        //System.out.println(pessoa);

    }
}
