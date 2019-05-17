
public class Komputer {
    private final String no_komputer;
    private final String merek;
    private final boolean a,b,c,d,e,f,g;
    
    public Komputer(String no_komputer, String merek, boolean a, boolean b, boolean c, boolean d, boolean e, boolean f, boolean g){
        this.no_komputer=no_komputer;
        this.merek=merek; 
        this.a=a;
        this.b=b;
        this.c=c;
        this.d=d;
        this.e=e;
        this.f=f;
        this.g=g;
    }
    public String getNo_komputer(){
        return no_komputer;
    }
    
    public String getMerek(){
        return merek;
    }
    
    public boolean getA(){
        return a;
    }
    public boolean getB(){
        return b;
    }
    public boolean getC(){
        return c;
    }
    public boolean getD(){
        return d;
    }
    public boolean getE(){
        return e;
    }
    public boolean getF(){
        return f;
    }
    public boolean getG(){
        return g;
    }
}
