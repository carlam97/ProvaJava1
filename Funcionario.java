public class Funcionario{

    private String cargo;
    private double salario;


    public String getCargo() {
        return cargo;
    }public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }public void setSalario(double salario) {
        this.salario = salario;
    }

    public Funcionario(){       // consultor padrão (tem o nome da classe e sem parametro) criado quando alguem instanciar a classe(new)

    }
    public Funcionario(String cargo, double salario){   // consultor com parametros
        this.cargo = cargo;
        this.salario = salario;
    }
        
    
}