import java.util.*;

public class Serie extends Contenido {

    public Serie (String nombre, int añoLanzamiento){
        super(nombre, añoLanzamiento);
    }

    private List<Temporada> temporadas = new ArrayList<>();

    public List<Temporada> getTemporadas(){
        return this.temporadas;
    }
    public void setTemporadas (List<Temporada> temporadas){
        this.temporadas = temporadas;
    }


    public Temporada buscarTemporada(int numeroTemporada){
        for (Temporada temporada: this.temporadas){
            if(temporada.getNumero() == numeroTemporada){ 
                return temporada;
            }
            
        }
        return null;
    }
}
