package br.com.unifacef.exe1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Cadu Lourenço
 */
public class Reserva {
    private int cod;
    private Date data;
    private float valor;
    private Passageiro passageiro;
    private Voo voo;
    
    public Reserva(){
    }
    
    public Reserva(int cod, String data, float valor, Passageiro passageiro, Voo voo) throws ParseException{
        setCod(cod);
        setData(data);
        setValor(valor);
        setPassageiro(passageiro);
        setVoo(voo);
    }

    public int getCod() {
        return cod;
    }

    public final void setCod(int cod) {
        this.cod = cod;
    }

    public Date getData() {
        return data;
    }

    public final void setData(String data) throws ParseException {
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        this.data = formato.parse(data);
    }

    public float getValor() {
        return valor;
    }

    public final void setValor(float valor) {
        this.valor = valor;
    }

    public Passageiro getPassagerio() {
        return passageiro;
    }

    public final void setPassageiro(Passageiro passagerio) {
        this.passageiro = passagerio;
    }

    public Voo getVoo() {
        return voo;
    }

    public final void setVoo(Voo voo) {
        this.voo = voo;
    }
    
    public String mostra(){
        return "Codigo=" + cod + ", data=" + data + ", Valor=" + valor + 
                ", Passageiro=" + passageiro.mostra() + ", Voo=" + voo.mostra();
    }
    
}
