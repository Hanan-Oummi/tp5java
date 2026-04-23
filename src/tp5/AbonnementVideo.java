package tp5;

class AbonnementVideo extends Abonnement implements Reducible {
	private boolean optionHD;
	private boolean option4K;
	
	public AbonnementVideo(String nom, double prixBase, int nbProfils, boolean optionHD, boolean option4K) {
		super(nom, prixBase, nbProfils);
		this.optionHD = optionHD;
		this.option4K = option4K;
	}
	
	public double calculerCoutMensuel() {
		double total = getPrixBase();
		
		if (optionHD == true) {
			total = total + 10;
		}
		if (option4K == true) {
			total = total + 20;
		}
		
		return total;
	}
	
	public int calculerScoreSatisfaction() {
		int score = 60;
		
		if (optionHD == true) {
			score = score + 10;
		}
		
		if (option4K == true) {
			
			score = score + 20;
		}
		if (getNbProfils() >= 4) {
			score = score + 10;
		}
		
		if (score > 100) {
			score = 100;
		}
		
		return score;
	}
	
	public boolean estEligibleReduction(double p) {
		if(p<=30) {
			return true;
		}else {
			return false;
		}
	}
    public double appliquerReduction(double p) {
    	if(estEligibleReduction(p) == true) {
    		return calculerCoutMensuel()*(1 - p / 100.0);
    	}else {
    		return calculerCoutMensuel();
    	}
    }
	

}
