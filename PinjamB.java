
class PinjamB {
    private final String  no_peminjaman, nim, no_buku;
    
    public PinjamB (String no_peminjaman, String nim, String no_buku){
        this.no_peminjaman=no_peminjaman;
        this.nim=nim;
        this.no_buku=no_buku;
    }
    
    public String getNo_peminjaman(){
        return no_peminjaman;
    }
    public String getNIM(){
        return nim;
    }
    public String getNo_buku(){
        return no_buku;
    }
}
