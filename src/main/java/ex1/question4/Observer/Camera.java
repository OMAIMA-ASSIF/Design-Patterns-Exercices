package ex1.question4.Observer;

//Observable Impl2
public class Camera implements ObjetJeu{
    @Override
    public void update(Joueur joueur) {
        if(joueur instanceof JoueurImpl j){
            System.out.println("************** Camera **************");
            System.out.println("New Score =" +(j.getScore()));
            System.out.println("************** Camera **************");
        }
    }
}
