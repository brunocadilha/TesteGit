import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        System.out.println("Informe quantos funcionários serão cadastrados:");
        int quantidade = input.nextInt();

        double salarioTotal = 0;

        for (int i = 0; i < quantidade; i++) {
            input.nextLine();
            /* Atribuições do usuário */
            System.out.println("Informe a matricula:");
            String matricula = input.nextLine();

            System.out.println("Informe o nome:");
            String nome = input.nextLine();

            System.out.println("Informe o salário:");
            double salario = input.nextDouble();

            salarioTotal = salarioTotal + salario;
            /* Atribuições do usuário */

            /* Preencher objeto */

            Funcionario func = new Funcionario(matricula, nome, salario);
            
            /* Trecho da questão 1 */
            // Funcionario func = new Funcionario();
            // func.setMatricula(matricula);
            // func.setNome(nome);
            // func.setSalario(salario);
            /* Trecho da questão 1 */

            /* Preencher objeto */

            System.out.println("***FUNCIONÁRIO***");
            System.out.println("Matricula: " + func.getMatricula());
            System.out.println("Nome: " + func.getNome());
            System.out.println("Salário: " + func.getSalario());
        }

        double mediaSalarial = salarioTotal / quantidade;

        System.out.println("Média salarial: " + mediaSalarial);

        input.close();
    }
}
