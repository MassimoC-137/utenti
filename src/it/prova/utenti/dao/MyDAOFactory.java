package it.prova.utenti.dao;

public class MyDAOFactory {
	private static UtenteDAO utente_dao_instance = null;



    public static UtenteDAO tgetUtenteDAOINstance() {
        if (utente_dao_instance == null) {
            utente_dao_instance = new UtenteDAOImpl();

        }
        return utente_dao_instance;
    }

}
