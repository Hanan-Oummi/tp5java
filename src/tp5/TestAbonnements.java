package tp5;

public class TestAbonnements {
	public static void main(String[] args) {
		Abonnement video = new AbonnementVideo("Video", 90, 4, true, true);
		Abonnement musique = new AbonnementMusique("Musique", 50, 1, 30, true);
		Abonnement jeux = new AbonnementJeux("Jeux", 80, 1, 30, 50);
		
		Abonnement[] abonnements = {video, musique, jeux};
		
		for(int i = 0; i < abonnements.length; i++) {
			abonnements[i].afficherInfos();
			
			double cout = abonnements[i].calculerCoutMensuel();
			System.out.println("Cout mensuel:" + cout);
			System.out.println("score satisfaction:" + abonnements[i].calculerScoreSatisfaction());
			
			if (abonnements[i] instanceof Reducible) {
				Reducible r = (Reducible) abonnements[i];
				
				System.out.println("Réduction 20%:" + r.appliquerReduction(20));
				System.out.println("Réduction 50%:" + r.appliquerReduction(50));
			}
			
			System.out.println("#################");
		}
		
	}

}
