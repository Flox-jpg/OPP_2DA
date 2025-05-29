package eva2_4_herencia_apa;


public class FichaApa {
    private String autor;
    private String titulo;
    private int year;
    
    public FichaApa(){
        this.autor = "Sin datos (APA)";
        this.titulo = "Sin dato (APA)";
        this.year = 0000;
    }
    public FichaApa(String autor, String titulo, int year){
        this.autor = autor;
        this.titulo = titulo;
        this.year = year;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    
    
}
