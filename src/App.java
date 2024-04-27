import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o NOME do aluno: ");
        String nomeAluno = teclado.nextLine();

        System.out.println("Digite a MATRÍCULA do aluno: ");
        String matriculaAluno = teclado.nextLine();

        Aluno aluno1 = new Aluno(nomeAluno, matriculaAluno);

        int contDisciplinas = 0;
        while (true) {
            System.out.println("Digite quantas disciplinas o aluno tem: ");
            contDisciplinas = teclado.nextInt();
            teclado.nextLine();

            if (contDisciplinas <= 0) {
                System.out.println("O aluno precisa ter no mínimo UMA disciplina!");
            }
            else{
                break;
            }
        }

        ArrayList<Disciplina> disciplinas = new ArrayList<>();

        for (int i = 1; i <= contDisciplinas; i++) {
            System.out.print("\nDigite o CÓDIGO da " + i + "ª DISCIPLINA: ");
            String codigoDisciplina = teclado.nextLine();

            System.out.print("Digite o NOME da " + i + "ª DISCIPLINA: ");
            String nomeDisciplina = teclado.nextLine();

            Disciplina disciplina = new Disciplina(codigoDisciplina, nomeDisciplina);

            System.out.println("Digite a 1ª NOTA da disciplina \"" + disciplina.getNome() + "\"");
            disciplina.setNota1(teclado.nextDouble());

            System.out.println("Digite a 2ª NOTA da disciplina \"" + disciplina.getNome() + "\"");
            disciplina.setNota2(teclado.nextDouble());

            System.out.println("Digite a 3ª NOTA da disciplina \"" + disciplina.getNome() + "\"");
            disciplina.setNota3(teclado.nextDouble());
            teclado.nextLine();

            disciplinas.add(disciplina);
        }

        aluno1.setDisciplinas(disciplinas);

        System.out.println("=========");
        System.out.println("RELATÓRIO");
        System.out.println("=========\n");

        System.out.println("Aluno: " + aluno1.getNome());
        System.out.println("Matrícula: " + aluno1.getMatricula());

        for (Disciplina disciplina : aluno1.getDisciplinas()) {
            System.out.println("\nDisciplina: " + disciplina.getNome());
            System.out.println("Código: " + disciplina.getCodigo());
            System.out.println("     1ª NOTA: " + disciplina.getNota1());
            System.out.println("     2ª NOTA: " + disciplina.getNota2());
            System.out.println("     3ª NOTA: " + disciplina.getNota3());
            System.out.println("     MÉDIA: " + disciplina.getMedia());
            System.out.println("     STATUS: " + disciplina.statusMediaDisciplina());
        }

        System.out.println("\nCRE: " + aluno1.calcularCre());

        teclado.close();
    }
}
