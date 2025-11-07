public class Aluno {
    private String nome;
    private String matricula;
    private double nota1;
    private double nota2;
    
    // Construtor
    public Aluno(String nome, String matricula, double nota1, double nota2) {
        this.nome = nome;
        this.matricula = matricula;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }
    
    // Método para calcular a média
    public double calcularMedia() {
        return (nota1 + nota2) / 2.0;
    }
    
    // Método para verificar a situação
    public String situacao() {
        double media = calcularMedia();
        return media >= 7.0 ? "Aprovado" : "Reprovado";
    }
    
    // Método para exibir informações do aluno
    public void exibirInfo() {
        double media = calcularMedia();
        String situacao = situacao();
        
        System.out.printf("Nome: %s | Matrícula: %s | Nota1: %.1f | Nota2: %.1f | Média: %.1f | Situação: %s%n",
                         nome, matricula, nota1, nota2, media, situacao);
    }
    
    // Getters (úteis para a busca)
    public String getMatricula() {
        return matricula;
    }
    
    public String getNome() {
        return nome;
    }
}
