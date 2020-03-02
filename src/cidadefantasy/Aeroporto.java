package cidadefantasy;

import java.util.ArrayList;

public class Aeroporto implements Observavel {

    ArrayList<Voo> listaVoo = new ArrayList<>();
    ArrayList<Observador> ListaDeEmbarque = new ArrayList<>();
    ArrayList<Observador> ListaDeDesembarque = new ArrayList<>();

    @Override
    public void cadastrarTotemEmbarque(Observador ob) {
        this.ListaDeEmbarque.add(ob);
    }

    @Override
    public void removerTotemEmbarque(Observador ob) {
        this.ListaDeEmbarque.remove(ob);
    }

    @Override
    public void cadastrarTotemDesembarque(Observador ob) {
        this.ListaDeDesembarque.add(ob);
    }

    @Override
    public void removerTotemDesembarque(Observador ob) {
        this.ListaDeDesembarque.remove(ob);
    }

    @Override
    public void notificarTotem(Voo v) {
        if (v.getTipo() == "Embarque") {
            for (Observador emb : this.ListaDeEmbarque) {
                emb.Atualizar(v);
            }
        } else {
            if (v.getTipo() == "Desembarque") {
                for (Observador desem : this.ListaDeDesembarque) {
                    desem.Atualizar(v);
                }
            }
        }
    }
    
    @Override
    public void cadastrarVoo(Voo v){
        this.listaVoo.add(v);
        if (v.getTipo()=="Embarque"){
            this.notificarTotem(v);
        }else 
            if (v.getTipo()=="Desembarque"){
                this.notificarTotem(v);
        }
    }
    
    @Override
    public void removerVoo(Voo v){
        v.setAtivo(false);
        if(v.getTipo()=="Embarque"){
            this.ListaDeEmbarque.remove(v);
        }else
            if(v.getTipo()=="Desembarque") {
                this.ListaDeDesembarque.remove(v);
            }
    }

    @Override 
    public void atualizarVoo(int numero){
        
    }
}
