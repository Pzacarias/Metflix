import java.util.ArrayList;
import java.util.List;

public class Metflix {

    private List<Pelicula> peliculas = new ArrayList<>();
    private List<Serie> series = new ArrayList<>();
    private List<Director> directores = new ArrayList<>();

    public List<Pelicula> getPeliculas() {
        return this.peliculas;
    }
    public void setPeliculas(List<Pelicula> peliculas) {
        this.peliculas = peliculas;
    }

    public List<Serie> getSeries() {
        return this.series;
    }
    public void setSeries(List<Serie> series) {
        this.series = series;
    }

    public List<Director> getDirectores() {
        return this.directores;
    }
    public void setDirectores(List<Director> directores) {
        this.directores = directores;
    }

    public void inicializarCatalogo() {

        Pelicula titanic;
        titanic = new Pelicula("Titanic",1997,210);
        Director director = new Director("James Cameron", 66);
        titanic.setDirector(director);


        this.directores.add(director);

        this.peliculas.add(titanic);

        Actor actor = new Actor("Leonardo DiCaprio",46);
        titanic.getActores().add(actor);

        Pelicula batman = new Pelicula("Batman: el caballero de la noche", 2008,152);
        batman.setDirector(new Director("Chtistopher Nolan", 50));
        this.peliculas.add(batman);

        actor = new Actor("Christian Bale", 47);
        batman.getActores().add(actor);

        Serie howIMetYM = new Serie("How I met your mother", 2005);
 
        actor = new Actor("Neil Patrick Harris", 47);
        howIMetYM.getActores().add(actor);

        actor = new Actor("Cobie Smulders", 39);
        howIMetYM.getActores().add(actor);

        Temporada temporada = new Temporada(5);

        Episodio episodio = new Episodio(11,"The last cigarette",30);
        temporada.getEpisodios().add(episodio);

        episodio = new Episodio(1, "Definitions", 30);
        temporada.getEpisodios().add(episodio);

        howIMetYM.getTemporadas().add(temporada);

        temporada = new Temporada(3);

        episodio = new Episodio(1,"Wait for it", 30);
        temporada.getEpisodios().add(episodio);

        episodio = new Episodio(4,"Little Boys",30);
        temporada.getEpisodios().add(episodio);

        howIMetYM.getTemporadas().add(temporada);

        this.series.add(howIMetYM);

        Serie bbt = new Serie("The Big Bang Theory", 2007);

        actor = new Actor("Kaley Cuoco", 35);
        bbt.getActores().add(actor);

        temporada = new Temporada(1);

        episodio = new Episodio(1,"Pilot");
        temporada.getEpisodios().add(episodio);

        episodio = new Episodio(9, "The Cooper-Hofstadter Polarization");
        temporada.getEpisodios().add(episodio);

        bbt.getTemporadas().add(temporada);
        this.series.add(bbt);

        Pelicula elResplandor = new Pelicula("El resplandor",1980,146);
        elResplandor.setDirector(new Director("Stanley Kubrick", 70));
        this.directores.add(director);

        actor = new Actor("Jack Nicholson", 83);
        elResplandor.getActores().add(actor);

        Pelicula naranja = new Pelicula("La naranja mecánica",1971,137);
        naranja.setDirector(new Director("Stanley Kubrick", 70));
        this.directores.add(director);

        this.peliculas.add(naranja);

        actor = new Actor("Malcolm McDowell",77);
        naranja.getActores().add(actor);

        Serie theOffice = new Serie("The Office",2005);

        actor = new Actor("Steve Carell", 58);
        theOffice.getActores().add(actor);

        actor = new Actor("John Krasinski", 41);
        theOffice.getActores().add(actor);

        temporada = new Temporada(1);

        episodio = new Episodio(2,"Diversity day", 23);
        temporada.getEpisodios().add(episodio);

        episodio = new Episodio(6,"The Alliance", 23);
        temporada.getEpisodios().add(episodio);

        theOffice.getTemporadas().add(temporada);
        this.series.add(theOffice);

        Websodio ws = new Websodio(35, "Nombre wesodio en internet", "http://miepisodios.com/websodio.avi");
        ws.setDuracion(42);
      
        temporada.getEpisodios().add(ws);

    }

    public Serie buscarSerie(String nombreABuscar) {

        for (Serie serie : this.series) {
            if (serie.getNombre().equals(nombreABuscar))
                return serie;
        }
        return null;

    }

    public Persona buscarDirectores(String nombreDirector) {

        for (Director director : this.directores) {
            if (director.getNombre() == nombreDirector) {
                return director;
            }

        }
        return null;
    }

}
