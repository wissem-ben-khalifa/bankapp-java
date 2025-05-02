package projet_java;

public class Client {
    private String nom;
    private String prenom;
    private String dateNaissance;
    private String numeroTelephone;
    private String cin;
    private String adresse;
    private String gender;
    private String email;
    private String marital_status;
    private String nacio;
    private String entite;
    private String category;
    private String Revenu;
    private String message1;
    private String message2;

    public Client(String nom, String prenom, String dateNaissance, String numeroTelephone, String cin, String adresse,String gender,String  email,String marital_status, String nacio,String entite,String category,String Revenu ,String message1,String message2) {
        this.nom = nom;
        this.prenom = prenom;
        this.dateNaissance = dateNaissance;
        this.numeroTelephone = numeroTelephone;
        this.cin = cin;
        this.adresse = adresse;
        this.gender=gender;
        this.email=email;
        this.marital_status=marital_status;
        this.nacio=nacio;
        this.entite=entite;
        this.category=category;
        this.Revenu=Revenu;
        this.message1=message1;
        this.message2=message2;
    }

    public String getnom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(String dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public String getNumeroTelephone() {
        return numeroTelephone;
    }

    public void setNumeroTelephone(String numeroTelephone) {
        this.numeroTelephone = numeroTelephone;
    }

    public String getCin() {
        return cin;
    }

    public void setCin(String cin) {
        this.cin = cin;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMarital_status() {
		return marital_status;
	}

	public void setMarital_status(String marital_status) {
		this.marital_status = marital_status;
	}

	public String getNacio() {
		return nacio;
	}

	public void setNacio(String nacio) {
		this.nacio = nacio;
	}

	public String getEntite() {
		return entite;
	}

	public void setEntite(String entite) {
		this.entite = entite;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String categor) {
		this.category = categor;
	}

	public String getRevenu() {
		return Revenu;
	}

	public void setRevenu(String revenu) {
		Revenu = revenu;
	}

	public String getMessage1() {
		return message1;
	}

	public void setMessage1(String message1) {
		this.message1 = message1;
	}

	public String getMessage2() {
		return message2;
	}

	public void setMessage2(String message2) {
		this.message2 = message2;
	}
}
