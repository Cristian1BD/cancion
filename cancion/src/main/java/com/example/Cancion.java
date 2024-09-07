package com.example;

public class Cancion {

    private String titulo;
    private String artista;
    private int duracion; 
    private String genero;
    private String album;

    private static final int SEGUNDOS_POR_MINUTO = 60;

    public Cancion() {
        this("Que mas pues", "maluna", 0, "regeton", "milnochesonose");
    }

    public Cancion(String titulo, String artista, int duracion) {
        this(titulo, artista, duracion, "regeton", "milnoches");
    }

    public Cancion(String titulo, String artista, int duracion, String genero, String album) {
        this.titulo = titulo;
        this.artista = artista;
        setDuracion(duracion); 
        this.genero = genero;
        this.album = album;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        if (duracion >= 0) { 
            this.duracion = duracion;
        }
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    private int calcularDuracionMinutos() {
        return duracion / SEGUNDOS_POR_MINUTO;
    }

    public void mostrarInformacion() {
        System.out.println(toString());
    }

    public void mostrarInformacion(String usuario) {
        mostrarInformacion();
        System.out.println("Escuchada por: " + usuario);
    }

    public String toString() {
        return "Que mas pues: " + titulo + "\n" +
               "maluna: " + artista + "\n" +
               "Duración: " + duracion + " segundos (" + calcularDuracionMinutos() + " minutos)\n" +
               "regeton: " + genero + "\n" +
               "milnochesonose: " + album;
    }
}