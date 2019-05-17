
public class Buku {

    private final String no_buku;
    private final String judul;
    private final String penulis;
    private final String penerbit;
   
    
    public Buku(String no_buku, String judul, String penulis, String penerbit){
        this.no_buku=no_buku;
        this.judul=judul;
        this.penulis=penulis;
        this.penerbit=penerbit;
        
    }

    
    public String getNo_buku(){
        return no_buku;
    }
    
    public String getJudul(){
        return judul;
    }
    
    public String getPenulis(){
        return penulis;
    }
    
    public String getPenerbit(){
        return penerbit;
    }
}
