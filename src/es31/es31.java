package es31;
//Crea una classe User che abbia i parametri privati nome ed età e i getter e setter
//        All'interno di User ci sarà anche una funzione che stampi a video le informazioni di età e il nome.
//        Creare 2 oggetti User di cui creerà un'istanza.
//        Del primo si stamperanno le informazioni di default, del secondo si cambieranno le informazioni e poi si stamperanno a video
public class es31 {
    public static void main(String[] args) {
        User user1 = new User();
        User user2 = new User();

        System.out.println("Primo utente: ");
        user1.stampaInfo();

        user2.setNome("Pritvi");
        user2.setEta(25);
        System.out.println("Secondo utente: ");
        user2.stampaInfo();



    }
}
