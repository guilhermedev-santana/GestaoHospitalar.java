public class MedicoCirurgiao extends Medico {
    public MedicoCirurgiao(String crm, String nome, int idade, double salario) {
        super(crm, nome, idade, salario);
    }

    @Override
    public boolean medicoAposentado() {
        return getIdade() >= 50;
    }

    @Override
    public double valorAposentadoria() {
        return super.valorAposentadoria() + 800;
    }
}
