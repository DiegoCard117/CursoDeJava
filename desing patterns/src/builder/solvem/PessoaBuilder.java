package builder.solvem;

import builder.Pessoa;

public class PessoaBuilder {
    private String name;
    private String lastName;
    private String document;
    private String email;
    private String nickName;
    private String birthDate;

    public PessoaBuilder name(String name) {
        this.name = name;
        return this;
    }

    public PessoaBuilder lastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public PessoaBuilder document(String document) {
        this.document = document;
        return this;
    }

    public PessoaBuilder email(String email) {
        this.email = email;
        return this;
    }

    public PessoaBuilder nickName(String nickName) {
        this.nickName = nickName;
        return this;
    }

    public PessoaBuilder birthDate(String birthDate) {
        this.birthDate = birthDate;
        return this;
    }

    public Pessoa createPerson() {
        return new Pessoa(name, lastName, document, email, nickName, birthDate);
    }

}
