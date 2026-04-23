package tp5;

abstract class Abonnement {
	private String nom;
	private double prixBase;
	private int nbProfils;
    public Abonnement(String nom, double prixBase, int nbProfils) {
	  this.nom = nom;
	  if(prixBase <= 0) {
		this.prixBase = 50;
	  }else {
		this.prixBase = prixBase;
	  }
	  if(nbProfils <= 0) {
		this.nbProfils = 1;
	  }else {
		this.nbProfils = nbProfils;
	  }
    }

    public String getNom() {
	 return nom;
    }
    public double getPrixBase() {
	  return prixBase;
    }
    public int getNbProfils() {
	  return nbProfils;
    }

    public void setNom(String nom) {
	  this.nom = nom;
    }
    public void setPrixBase(double prixBase) {
	  this.prixBase = prixBase;
    }
    public void setNbProfils(int nbProfils) {
	this.nbProfils = nbProfils;
    }

    public boolean estPartageFamilial() {
	 if (nbProfils >= 3) {
		return true;
	 }else {
		return false;
	 }
    }

    public void afficherInfos() {
	  System.out.println("Nom: " + nom);
	  System.out.println("prix de base" + prixBase);
	  System.out.println("nombre de profils: " + nbProfils);
	  System.out.println("partage familial: " + estPartageFamilial());
    }

    public abstract double calculerCoutMensuel();
    public abstract int calculerScoreSatisfaction();

}
