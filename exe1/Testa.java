package br.com.unifacef.exe1;

import java.text.ParseException;

/**
 *
 * @author Cadu Lourenço
 */
public class Testa {
    public static void main(String[] args) throws ParseException {
     Passageiro p1 = new Passageiro();
     p1.setNome("Carlos");
     p1.setCpf("123.456.789-11");
     System.out.println(p1.mostra());
     
     Passageiro p2 = new Passageiro("Letícia", "987.654.432-00");
     System.out.println(p2.mostra());
     
     Voo v1 = new Voo();
     v1.setNro(100);
     v1.setOrigem("São Paulo");
     v1.setDestino("Dublin");
     System.out.println(v1.mostra());
     
     Voo v2 = new Voo(200, "Dublin", "Paris");
     System.out.println(v2.mostra());
     
     Reserva r1 = new Reserva();
     r1.setCod(1);
     r1.setData("12/02/2021");
     r1.setValor(1000);
     r1.setPassageiro(p1);
     r1.setVoo(v1);
     System.out.println(r1.mostra());
    
     Reserva r2 = new Reserva(2, "12/02/2021", 100, p2, v1);
     System.out.println(r2.mostra());
    }
}
