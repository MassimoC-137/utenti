package it.prova.utenti.model;

public class Utente {

	private Long id; 
	private String username; 
	private String password; 
	private Stato stato; 
	private String mail; 
	
	public Utente() {
		
	}
	
	public Utente(Long id, String username, String password, Stato stato, String mail) {
		this.setId(id); 
		this.setUsername(username); 
		this.setPassword(password); 
		this.setStato(stato); 
		this.setMail(mail); 
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Stato getStato() {
		return stato;
	}

	public void setStato(Stato stato) {
		this.stato = stato;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	@Override
	public String toString() {
		return "Utente [id=" + id + ", username=" + username + ", password=" + password + ", stato=" + stato + ", mail="
				+ mail + "]";
	}
	
	
}
