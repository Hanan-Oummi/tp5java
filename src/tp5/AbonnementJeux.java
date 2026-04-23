package tp5;

class AbonnementJeux extends Abonnement {
	private int nbJeuxInclus;
	private int heuresJeuParMois;
	
	public AbonnementJeux(String nom, double prixBase, int nbProfils, int nbJeuxInclus, int heuresJeuxParMois) {
		super(nom, prixBase, nbProfils);
		this.nbJeuxInclus = nbJeuxInclus;
		this.heuresJeuParMois = heuresJeuxParMois;
		
	}
	
	public double calculerCoutMensuel() {
		double total = getPrixBase();
		
		if (nbJeuxInclus > 50) {
			total = total + 25;
		}
		
		if(heuresJeuParMois > 40) {
			total = total + 15;
		}
		
		return total;
	}
	
	public int calculerScoreSatisfaction() {
		int score = 40;
		
		if (nbJeuxInclus >= 30) {
			score = score + 20;
		}
		
		if (heuresJeuParMois >= 20) {
			score = score + 20;
		}
		
		if (getNbProfils() >= 2) {
			score = score + 10;
		}
		
		if (score > 100) {
			score = 100;
		}
		
		return score;
	}
	
	

}
