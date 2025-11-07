public class Aluno {
    private String nome;
    private String matricula;
    private double nota1;
    private double nota2;

    public Aluno(String nome, String matricula, double nota1, double nota2) {
        this.nome = nome;
        this.matricula = matricula;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    public double calcularMedia() {
        return (nota1 + nota2) / 2.0;
    }
    
    public String situacao() {
        double media = calcularMedia();
        return media >= 7.0 ? "Aprovado" : "Reprovado";
    }
    
    public void exibirInfo() {
        double media = calcularMedia();
        String situacao = situacao();
        
        System.out.printf("Nome: %s | Matrícula: %s | Nota1: %.1f | Nota2: %.1f | Média: %.1f | Situação: %s%n",
                         nome, matricula, nota1, nota2, media, situacao);
    }
    
    public String getMatricula() {
        return matricula;
    }
    
    public String getNome() {
        return nome;
    }
}
