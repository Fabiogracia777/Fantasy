package cidadefantasy;

public class Voo {
    
   private int NumeroDoVoo;
   private String Emppresa;
   private String horarioDeEmbarque;
   private String horarioDeDesembarque;
   private String Tipo;

    public Voo(String Disponibilidade) {
        this.Tipo = Disponibilidade;
    }
   
   

    public int getNumeroDoVoo() {
        return NumeroDoVoo;
    }

    public void setNumeroDoVoo(int NumeroDoVoo) {
        this.NumeroDoVoo = NumeroDoVoo;
    }

    public String getEmppresa() {
        return Emppresa;
    }

    public void setEmppresa(String Emppresa) {
        this.Emppresa = Emppresa;
    }


    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }
   
}
