package eya;


public class ShapeOfYou {
	
	/* Ma chanson préférée est Shape of you celle de Ed Shreen sortie en 2017.
	 *  c'est une chanson POP de durée 4.3 minutes, de l'Album ÷.
	 *   Ed Sheeren a pris la  Grammy Award de la meilleure prestation pop solo pour cette chanson.
	 *    finalement elle est disponible sur Deezer.
	 *    
	 *    Lyrics:
	 *    The club isn't the best place to find a lover
			So the bar is where I go
			Me and my friends at the table doing shots
			Drinking fast and then we talk slow
			Come over and start up a conversation with just me
			And trust me I'll give it a chance now
			Take my hand, stop, put Van the Man on the jukebox
			And then we start to dance, and now I'm singing like
	 */

	public static void main(String[] args) {
		
		String nom = "Shape of you";
		String Artist = "Ed Shreen";
		int Year_Released = 2017;
		String Genre = "POP" ;
		double Duration = 4.30;
		char album = '÷';
		String award =" Grammy Award de la meilleure prestation pop solo";
		String disponibilite = "Deezer";
		
		System.out.print("Ma chanson préférée est ");
		System.out.print(nom);
		System.out.print(" celle de ");
		System.out.print(Artist);
		System.out.print(" sortie en ");
		System.out.print(Year_Released);
		System.out.print(". c'est une chanson ");
		System.out.print(Genre);
		System.out.print(" de durée ");
		System.out.print(Duration);
		System.out.print(" minutes, de l'Album ");
		System.out.print(album);
		System.out.print(". Ed Sheeren a pris la ");
		System.out.print(award);
		System.out.print(" pour cette chanson. finalement elle est disponible sur ");
		System.out.println(disponibilite);
	}

}
