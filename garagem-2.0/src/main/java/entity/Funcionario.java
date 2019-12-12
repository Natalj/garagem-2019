package entity;

public class Funcionario extends Pessoal {

    private String codigo;
    private String usuario;
    private String senha;
    private float salario;
    private String cargo;

    public String getCargo() {return this.cargo;}

    public void setCargo(String cargo) { this.cargo = cargo; }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public float calculaSalario() {
        return salario * 1.0f;
    }
}

