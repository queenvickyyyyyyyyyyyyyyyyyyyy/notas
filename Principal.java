import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Turma turma = new Turma();
        
        System.out.println("=== Cadastro de Alunos ===");
        
        Aluno aluno1 = new Aluno("Ana", "101", 8.0, 9.0);
        turma.adicionarAluno(aluno1);
        
        Aluno aluno2 = new Aluno("João", "102", 5.5, 6.5);
        turma.adicionarAluno(aluno2);
        
        Aluno aluno3 = new Aluno("Maria", "103", 9.5, 8.5);
        turma.adicionarAluno(aluno3);
        
        Aluno aluno4 = new Aluno("Pedro", "104", 7.0, 7.5);
        turma.adicionarAluno(aluno4);
        
        turma.listarAlunos();
        
        System.out.println("\n=== Buscar Aluno ===");
        System.out.print("Digite a matrícula: ");
        String matriculaBusca = scanner.nextLine();
        
        Aluno alunoEncontrado = turma.buscarPorMatricula(matriculaBusca);
        
        if (alunoEncontrado != null) {
            System.out.println("\nAluno encontrado:");
            alunoEncontrado.exibirInfo();
        } else {
            System.out.println("Aluno com matrícula " + matriculaBusca + " não encontrado.");
        }
        
        scanner.close();
    }
}
