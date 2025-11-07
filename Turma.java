public class Turma {
    private Aluno[] alunos;
    private int quantidade;

    public Turma() {
        this.alunos = new Aluno[5]; // vetor de até 5 alunos
        this.quantidade = 0;
    }
    
//adicionar
    public void adicionarAluno(Aluno aluno) {
        if (quantidade < alunos.length) {
            alunos[quantidade] = aluno;
            quantidade++;
            System.out.println("Aluno " + aluno.getNome() + " adicionado com sucesso!");
        } else {
            System.out.println("Turma cheia! Não é possível adicionar mais alunos.");
        }
    }
    
//listar
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
    
    //buscar
    public Aluno buscarPorMatricula(Sartring matricula) {
        for (int i = 0; i < quantidade; i++) {
            if (alunos[i].getMatricula().equals(matricula)) {
                return alunos[i];
            }
        }
        return null
    }
}
