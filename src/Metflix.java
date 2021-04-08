import java.util.ArrayList;
import java.util.List;

public class Metflix {

    private List<Pelicula> peliculas = new ArrayList<>();
    private List<Serie> series = new ArrayList<>();

   public List<Pelicula> getPeliculas(){
       return this.peliculas;
   }
   public void setPeliculas(List<Pelicula> peliculas){
       this.peliculas = peliculas;
   }

   public List<Serie> getSeries(){
       return this.series;
   }
   public void setSeries(List<Serie> series){
       this.series = series;
   }

    public void inicializarCatalogo() {
        
        Pelicula titanic; 
        titanic = new Pelicula(); 

        titanic.setNombre("Titanic");
        titanic.setAñoLanzamiento(1997);
        titanic.setDuracion (210);      
        this.peliculas.add(titanic);

        Actor actor = new Actor();
        actor.setNombre ("Leo DiCaprio");
        titanic.getActores().add(actor);
       
        
        Pelicula batman = new Pelicula();
        batman.setNombre ("Batman: el caballero de la noche");
        batman.setAñoLanzamiento (2008);
        batman.setDuracion (152);
        this.peliculas.add(batman);

        actor = new Actor(); 
        actor.setNombre ("Christian Bale");
        batman.getActores().add(actor);


        Serie howIMetYM = new Serie();
        howIMetYM.setNombre ("How I met your mother");
        howIMetYM.setAñoLanzamiento (2005);

        actor = new Actor();
        actor.setNombre ("Neil Patrick Harris");
        howIMetYM.getActores().add(actor);

        actor = new Actor();
        actor.setNombre("Cobie Smulders");
        howIMetYM.getActores().add(actor);

        Temporada temporada = new Temporada();
        temporada.setNumero(5);

        Episodio episodio = new Episodio();
        episodio.setNombre ("The last cigarrette");
        episodio.setNumero (11);
        temporada.getEpisodios().add(episodio);

        episodio = new Episodio();
        episodio.setNombre ("Definitions");
        episodio.setNumero (1);
        temporada.getEpisodios().add(episodio);

        howIMetYM.getTemporadas().add(temporada);

 
        temporada = new Temporada();
        temporada.setNumero (3);
      
        episodio = new Episodio();
        episodio.setNombre ("Wait for it");
        episodio.setNumero (1);  
        temporada.getEpisodios().add(episodio);

        episodio = new Episodio();
        episodio.setNombre ("Little Boys");
        episodio.setNumero (4);
        temporada.getEpisodios().add(episodio);

        howIMetYM.getTemporadas().add(temporada);

        this.series.add(howIMetYM);

        Serie bbt = new Serie();
        bbt.setNombre ("The BigBang Theory");
        bbt.setAñoLanzamiento (2007);

        actor = new Actor();
        actor.setNombre ("Kaley Cuoco");
        bbt.getActores().add(actor);

        temporada = new Temporada();
        temporada.setNumero (1);

        episodio = new Episodio();
        episodio.setNombre ("Pilot");
        episodio.setNumero (1);
        temporada.getEpisodios().add(episodio);

        episodio = new Episodio();
        episodio.setNombre ("The Cooper-Hofstadter Polarization");
        temporada.getEpisodios().add(episodio);

        bbt.getTemporadas().add(temporada);
        this.series.add(bbt);

        Pelicula elResplandor = new Pelicula();
        elResplandor.setNombre ("El Resplandor");
        elResplandor.setAñoLanzamiento (1980);
        elResplandor.setDuracion (146);
        Director director = new Director();
        director.setNombre("El resplandor");
        elResplandor.setDirector(director);
        elResplandor.getDirector().setNombre("Stanley Kucbrick");

        actor = new Actor();
        actor.setNombre("Jack Nicholson") ;
        elResplandor.getActores().add(actor);

        Pelicula naranja = new Pelicula();
        naranja.setNombre ("La naranja mecánica");
        naranja.setAñoLanzamiento (1971);
        director = new Director();
        director.setNombre("La naranja mecánica");
        elResplandor.setDirector(director);
        elResplandor.getDirector().setNombre("Stanley Kucbrick");

        this.peliculas.add(naranja);
        actor = new Actor();
        actor.setNombre ("Malcolm McDowell");
        naranja.getActores().add(actor);

    }

 

  
    public Serie buscarSerie(String nombreABuscar) {

        for (Serie serie : this.series) {
            if (serie.getNombre().equals(nombreABuscar))
                return serie; 
        }
        return null;

    }

    // buscar un director
    //
}
