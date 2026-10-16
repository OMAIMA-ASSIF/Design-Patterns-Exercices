package ex1.question4.Observer;

//Observable Impl1
public class Couloir implements ObjetJeu{
    @Override
    public void update(Joueur joueur) {
        if(joueur instanceof JoueurImpl j){
            System.out.println("************** Couloir **************");
            System.out.println("New Score =" +(j.getScore()));
            System.out.println("************** Couloir **************");
        }
    }
}
