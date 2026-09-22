public class MedicoAuxiliar extends Medico {
    public MedicoAuxiliar(String crm, String nome, int idade, double salario) {
        super(crm, nome, idade, salario);
    }
    @Override
    public boolean medicoAposentado() {
        return getIdade() >= 60;
    }

    @Override
    public double valorAposentadoria() {
        return super.valorAposentadoria();
    }
}
