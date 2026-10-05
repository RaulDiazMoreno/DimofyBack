package es.rdm.Dimofy.dto;

public class PaisMapaDashboardDTO {
    private String nombre;
    private long artistas;

    public PaisMapaDashboardDTO(String nombre, long artistas) {
        this.nombre = nombre;
        this.artistas = artistas;
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public long getArtistas() { return artistas; }
    public void setArtistas(long artistas) { this.artistas = artistas; }
}
