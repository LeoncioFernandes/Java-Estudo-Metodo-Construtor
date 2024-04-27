public class Disciplina {
    private String codigo;
    private String nome;
    private double nota1;
    private double nota2;
    private double nota3;
    private double media;
    private enum Status {Aprovado, Reprovado};

    public Disciplina(String codigo, String nome){
        nota1 = 0;
        nota2 = 0;
        nota3 = 0;
        this.codigo = codigo;
        this.nome = nome;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    public double getMedia() {
        return media = (nota1 + nota2 + nota3) / 3;
    }
 
    public Status statusMediaDisciplina(){

        if (this.media >= 7) {
            return Status.Aprovado;
        } else {
            return Status.Reprovado;
        }

    }
    
}
