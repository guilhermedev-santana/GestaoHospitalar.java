import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        int opcao;
        Scanner tc = new Scanner(System.in);
        Hospital hospital = new Hospital();
        do {
            System.out.println("---- MENU ----");
            System.out.println("1. Cadastrar Médico");
            System.out.println("2. Buscar Médico");
            System.out.println("3. Remover Médico");
            System.out.println("4. Listar todos os Médico");
            System.out.println("5. Sair");
            System.out.print("\nEscolha uma das opção acima: ");
            opcao = tc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("\n---- CADASTRAR MÉDICO ----\n");
                    int opcao2;
                    System.out.println("1. Médico Cirurgião");
                    System.out.println("2. Médico Auxiliar");
                    System.out.print("\nEscolha um médico para adicionar: ");
                    opcao2 = tc.nextInt();
                    tc.nextLine();
                    switch (opcao2) {
                        case 1:
                            System.out.print("CRM: ");
                            String crmMc = tc.nextLine();
                            System.out.print("Nome: ");
                            String nomeMc = tc.nextLine();
                            System.out.print("Idade: ");
                            int idadeMc = tc.nextInt();
                            System.out.print("Salário: ");
                            double salarioMc = tc.nextDouble();
                            MedicoCirurgiao mc1 = new MedicoCirurgiao(crmMc, nomeMc, idadeMc, salarioMc);
                            hospital.adicionarMedico(mc1);
                            break;
                        case 2:
                            System.out.print("CRM: ");
                            String crmMa = tc.nextLine();
                            System.out.print("Nome: ");
                            String nomeMa = tc.nextLine();
                            System.out.print("Idade: ");
                            int idadeMa = tc.nextInt();
                            System.out.print("Salário: ");
                            double salarioMa = tc.nextDouble();
                            MedicoAuxiliar ma1 = new MedicoAuxiliar(crmMa, nomeMa, idadeMa, salarioMa);
                            hospital.adicionarMedico(ma1);
                            break;
                        default:
                            System.out.println("Escolha entre 1 e 2!");
                    }
                    break;
                case 2:
                    System.out.println("\n---- BUSCAR MÉDICO ----\n");
                    tc.nextLine();
                    System.out.print("CRM do médico: ");
                    String crmBusca = tc.nextLine();
                    Medico medico = hospital.buscarMedico(crmBusca);
                    if (medico != null) {
                        System.out.println("CRM: " + medico.getCrm());
                        System.out.println("Nome: " + medico.getNome());
                        System.out.println("Idade: " + medico.getIdade());
                        System.out.println("Salario: R$ " + medico.getSalario());
                        if (medico.medicoAposentado()) {
                            System.out.println("Status: Aposentado.");
                        } else {
                            System.out.println("Status: Não Aposentado.");
                        }
                        System.out.println("Valor da Aposentadoria: R$ " + medico.valorAposentadoria());
                    } else {
                        System.out.println("Médico não encontrado!");
                    }
                    break;
                case 3:
                    System.out.println("---- REMOVER MÉDICO ----\n");
                    tc.nextLine();
                    System.out.print("CRM do médico: ");
                    String crmRemover = tc.nextLine();
                    if (hospital.removerMedico(crmRemover)) {
                        System.out.println("Médico removido com sucesso!");
                    } else {
                        System.out.println("Médico não encontrado!");
                    }
                    break;
                case 4:
                    System.out.println("---- LISTAR MÉDICOS ----");
                    hospital.listarMedicos();
                    break;
                case 5:
                    System.out.println("Saindo... ");
                    break;
                default:
                    System.out.println("Opção Inválida");
            }
        } while (opcao != 5);
    }
}
