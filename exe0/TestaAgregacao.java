package br.com.unifacef.exe0;

/**
 *
 * @author Cadu Lourenço
 */
public class TestaAgregacao {

    public static void main(String[] args) {
        Professor p1 = new Professor("Daniel", "123.456.789-11");
        System.out.println(p1.mostra());
        
        Professor p2 = new Professor();
        p2.setNome("Carlão");
        p2.setRg("987.654.321-98");
        System.out.println(p2.mostra());
        
        Disciplina d1 = new Disciplina("PP I", 80, p1);
        System.out.println(d1.mostra());
        
        Disciplina d2 = new Disciplina();
        d2.setSigla("ES II");
        d2.setCarga(80);
        d2.setProfessor(p2);
        System.out.println(d2.mostra());
    }
}
