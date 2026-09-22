import java.util.ArrayList;

public class Hospital {
    ArrayList<Medico> medicos = new ArrayList<>();

    public void adicionarMedico(Medico medico) {
        medicos.add(medico);
        System.out.println("Médico Cadastrado!\n");

    }

    public Medico buscarMedico(String buscar) {
        for (Medico medico : medicos) {
            if (medico.getCrm().equals(buscar)) {
                return medico;
            }
        }
        return null;
    }

    public boolean removerMedico(String crm) {
        Medico medico = buscarMedico(crm);
        if (medico != null) {
            if (crm != null) {
                medicos.remove(medico);
                System.out.println("Médico removido!");
            } else {
                System.out.println("Médico não encontrado!");
            }
        }
        return false;
    }

    public void listarMedicos() {
        if (medicos.isEmpty()) {
            System.out.println("\nNenhum médico cadastrado.\n");
            return;
        }
        for (Medico medico : medicos) {
            System.out.println("-----------------------------------");
            System.out.println("CRM: " + medico.getCrm() + "| Nome: " + medico.getNome());
            System.out.println("-----------------------------------");
        }
    }
}
