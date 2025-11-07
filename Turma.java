public class Turma {
    private Aluno[] alunos;
    private int quantidade;
    
    // Construtor
    public Turma() {
        this.alunos = new Aluno[5]; // vetor de até 5 alunos
        this.quantidade = 0;
    }
    
    // Método para adicionar aluno
    public void adicionarAluno(Aluno aluno) {
        if (quantidade < alunos.length) {
            alunos[quantidade] = aluno;
            quantidade++;
            System.out.println("Aluno " + aluno.getNome() + " adicionado com sucesso!");
        } else {
            System.out.println("Turma cheia! Não é possível adicionar mais alunos.");
        }
    }
    
    // Método para listar todos os alunos
    public void listarAlunos() {
        System.out.println("\n=== Lista de Alunos ===");
        if (quantidade == 0) {
            System.out.println("Nenhum aluno cadastrado.");
            return;
        }
        
        for (int i = 0; i < quantidade; i++) {
            alunos[i].exibirInfo();
        }
    }
    
    // Método para buscar aluno por matrícula
    public Aluno buscarPorMatricula(String matricula) {
        for (int i = 0; i < quantidade; i++) {
            if (alunos[i].getMatricula().equals(matricula)) {
                return alunos[i];
            }
        }
        return null; // não encontrado
    }
}
