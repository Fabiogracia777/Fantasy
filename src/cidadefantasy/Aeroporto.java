package cidadefantasy;

import java.util.ArrayList;

public class Aeroporto implements Observavel{
    
    ArrayList<Voo> listaVoo = new ArrayList<>();
    ArrayList<Observador> ListaDeEmbarque = new ArrayList<>();
    ArrayList<Observador> ListaDeDesembarque = new ArrayList<>();

    @Override
    public void Notificar() {
       
    }
    
public void AdicionarVoo (Voo e){
    this.listaVoo.add(e);
}

    @Override
    public void AdicionarDesembarque() {
        
    }

    @Override
    public void RemoverEmbarque() {
        
    }

    @Override
    public void RemoverDesembarque() {
        
    }

    @Override
    public void AdicionarEmbarque(SalaDeEmbarque a) {
        this.ListaDeEmbarque.add(a);
    }
    }


