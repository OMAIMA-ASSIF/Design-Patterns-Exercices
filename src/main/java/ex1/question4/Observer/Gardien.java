package ex1.question4.Observer;

//Observable Impl3
public class Gardien implements ObjetJeu{
    @Override
    public void update(Joueur joueur) {
        if(joueur instanceof JoueurImpl j){
            System.out.println("************** Gardien **************");
            System.out.println("New Score =" +(j.getScore()));
            System.out.println("************** Gardien **************");
        }
    }
}
