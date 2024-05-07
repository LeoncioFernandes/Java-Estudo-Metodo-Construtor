import java.util.ArrayList;

public class Aluno {
    private String nome;
    private String matricula;
    private ArrayList<Disciplina> disciplinas;
    private double cre;

    public Aluno(String nome, String matricula){
        this.nome = nome;
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public ArrayList<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(ArrayList<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }

    public double getCre() {
        return cre;
    }

    public double calcularCre(){

        double cre = 0;
        int cont = 0;
        for (Disciplina disciplina : disciplinas) {
            cre += disciplina.getMedia();
            cont++;
        }
        
        return cre / cont;
    }
    
}