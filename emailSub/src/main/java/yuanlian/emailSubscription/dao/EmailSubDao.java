package yuanlian.emailSubscription.dao;


import yuanlian.emailSubscription.modele.EmailSubModele;

public interface EmailSubDao {
	
	public void addEmail(EmailSubModele emailSub);
	
	public EmailSubModele getEmail(String email);
}
