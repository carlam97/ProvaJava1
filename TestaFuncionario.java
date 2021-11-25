public class TestaFuncionario {
    public static void main(String[] args) {
        
        Funcionario f = new Funcionario();
        f.setCargo("Técnico em Informática");
        f.setSalario(5500);

        System.out.println("O funcionário ocupa o cargo de " + f.getCargo());
        System.out.println("cujo salário se estabele no valor de R$ " + f.getSalario());
    }


    
}
