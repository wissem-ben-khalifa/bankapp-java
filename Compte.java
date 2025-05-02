package projet_java;

public class Compte extends Client {
    private String numeroCarte;
    private String pin;



    public Compte(String nom, String prenom, String dateNaissance, String numeroTelephone, String cin, String adresse,String gender,String  email,String marital_status, String nacio,String entite,String category,String Revenu ,String message1,String message2, 
                  String numeroCarte, String pin) {
        super( nom,  prenom,  dateNaissance,  numeroTelephone,  cin,  adresse, gender, email, marital_status, nacio,entite,category, Revenu ,message1,message2);
        this.numeroCarte = numeroCarte;
        this.pin = pin;
      
    }

    public String getNumeroCarte() {
        return numeroCarte;
    }

    public void setNumeroCarte(String numeroCarte) {
        this.numeroCarte = numeroCarte;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

  
}
