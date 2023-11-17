package builder;

public class Pessoa {
    private String name;
    private String lastName;
    private String document;
    private String email;
    private String nickName;
    private String birthDate;

    public Pessoa(String name, String lastName, String document, String email, String nickName, String birthDate) {
        this.name = name;
        this.lastName = lastName;
        this.document = document;
        this.email = email;
        this.nickName = nickName;
        this.birthDate = birthDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", document='" + document + '\'' +
                ", email='" + email + '\'' +
                ", nickName='" + nickName + '\'' +
                ", birthDate='" + birthDate + '\'' +
                '}';
    }
}
