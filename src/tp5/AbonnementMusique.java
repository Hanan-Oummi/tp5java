package tp5;

class AbonnementMusique extends Abonnement implements Reducible {
	private int nbPlaylists;
	private boolean optionOffline;
	
	public AbonnementMusique(String nom, double prixBase, int nbProfils, int nbPlaylists, boolean optionOffline) {
		super(nom, prixBase, nbProfils);
		this.nbPlaylists = nbPlaylists;
		this.optionOffline = optionOffline;
	}
	
	public double calculerCoutMensuel() {
		double total = getPrixBase();
		
		if (optionOffline == true) {
			total = total + 15;
		}
		return total;
	}
	
	public int calculerScoreSatisfaction() {
		int score = 50;
		
		if (nbPlaylists > 20) {
			score = score + 20;
		}
		
		if (optionOffline == true) {
			score = score + 20;
		}
		
		if (getNbProfils() > 1) {
			score = score + 10;
		}
		if (score > 100) {
			score = 100;
		}
		return score;
	}
	public boolean EstEligibleReduction(double p) {
		if(p <= 30) {
			return true;
		}else {
			return false;
		}
	}
	public double AppliquerReduction(double p) {
		if(EstEligibleReduction(p) == true) {
			return calculerCoutMensuel()*(1 - p / 100.0);
		}else {
			return calculerCoutMensuel();
		}
	}

}
