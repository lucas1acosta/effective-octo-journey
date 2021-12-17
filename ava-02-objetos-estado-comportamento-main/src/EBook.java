public class EBook {

    protected final String titulo;
    protected final int paginas;
    public int lendoPagina;

    public EBook(String string, int i) {
        if(string == ""){
            throw new IllegalArgumentException("Titulo vazio");
        }
        if(i < 0){
            throw new IllegalArgumentException("Páginas negativas");
        }
        if(i == 0 ){
            throw new IllegalArgumentException("Sem páginas");
        }
        if(i > 5000){
            throw new IllegalArgumentException("Livro com mais de 5000 páginas");
        }
        this.titulo = string;
        this.paginas = i;
        this.lendoPagina = 1;
    }

    public void virarPagina() {
        if(this.lendoPagina +1 > this.paginas){
            throw new IllegalStateException("Fora do intervalo de páginas");
        }
        this.lendoPagina ++;
    }

    public void voltarPagina() {
        if(this.lendoPagina -1 == 0){
            throw new IllegalStateException("Fora do intervalo de páginas");
        }
        this.lendoPagina --;
    }

    public void irParaPagina(int i) {
        if(i > this.paginas || i < 0){
            throw new IllegalArgumentException("Fora do intervalo de páginas");
        }
        this.lendoPagina = i;
    }
    
}
