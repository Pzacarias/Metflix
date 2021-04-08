public class App {
    public static void main(String[] args) throws Exception {
    
        Metflix miMetflix = new Metflix();

        System.out.println("Inicializando catalogo de Metflix");

        miMetflix.inicializarCatalogo();

        Serie serieBuscada = miMetflix.buscarSerie("How I met your mother");

        Temporada temporada = serieBuscada.buscarTemporada(5);

        Episodio episodio = temporada.buscarEpisodio(1);

        episodio.reproducir();



    }
}
