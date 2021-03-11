package br.com.unifacef.exe1;

/**
 *
 * @author Cadu Lourenço
 */
public class Voo {
    private String origem, destino;
    private int nro;
    
    public Voo(){
    }
    
    public Voo(int nro, String origem, String destino){
        this.setNro(nro);
        this.setOrigem(origem);
        this.setDestino(destino);
    }
    
    public final void setNro(int nro){
        this.nro = nro;
    }
    
    public int getNro(){
        return nro;
    }
    
    public final void setOrigem(String origem){
        this.origem = origem;
    }
    
    public String getOrigem(){
        return origem;
    }
    
    public final void setDestino(String destino){
        this.destino = destino;
    }
    
    public String getDestino(){
        return destino;
    }
    
    public String mostra(){
        return "nro=" + nro + ", origem=" + origem + ", destino=" + destino;
    }
    
}
