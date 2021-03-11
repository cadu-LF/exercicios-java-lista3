package br.com.unifacef.exe0;

/**
 *
 * @author Cadu Lourenço
 */
public class Disciplina {
    private String sigla;
    private int carga;
    // associação
    private Professor professor; // Professor=classe e professor=objeto
    /**
     * Professor é uma agregação, pois o objeto professor será criado de forma 
     * independente
     */
    
    public Disciplina() {
    }

    public Disciplina(String sigla, int carga, Professor professor) {
        this.setSigla(sigla);
        this.setCarga(carga);
        this.setProfessor(professor); // método que recebe um objeto como parâmentro
    }

    
    
    public String getSigla() {
        return sigla;
    }

    public final void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public int getCarga() {
        return carga;
    }

    public final void setCarga(int carga) {
        this.carga = carga;
    }

    public Professor getProfessor() {
        return professor;
    }

    public final void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public String mostra() {
        return "Disciplina{" + "sigla=" + sigla + 
                ", carga=" + carga + ", professor=" + professor.mostra() + '}';
    }
    
}
