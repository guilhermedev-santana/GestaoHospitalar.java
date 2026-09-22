public abstract class Medico {
    private String crm;
    private String nome;
    private int idade;
    private double salario;


    public Medico (String crm, String nome, int idade, double salario){
        this.crm = crm;
        this.nome = nome;
        this.idade = idade;
        this.salario = salario;
    }
    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public abstract boolean medicoAposentado();

    public double valorAposentadoria() {
        return salario * 0.8;
    }

}
