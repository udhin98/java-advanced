package es31;
//Crea una classe User che abbia i parametri privati nome ed età e i getter e setter
//        All'interno di User ci sarà anche una funzione che stampi a video le informazioni di età e il nome.
//        Creare 2 oggetti User di cui creerà un'istanza.
//        Del primo si stamperanno le informazioni di default, del secondo si cambieranno le informazioni e poi si stamperanno a video
public class User {
    private String nome;
    private int eta;

    public User() {}

    public User(String nome, int eta) {
        this.nome = nome;
        this.eta = eta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getEta() {
        return eta;
    }

    public void setEta(int eta) {
        this.eta = eta;
    }
    public void stampaInfo () {
        System.out.println("Nome: " + nome);
        System.out.println("Età: " + eta);
    }

    @Override
    public String toString() {
        return "User{" +
                "nome='" + nome + '\'' +
                ", eta=" + eta +
                '}';
    }
}
