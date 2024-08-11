public class ContaBanco{
    private int numero;
    private String agencia;
    private String nomeCliente;
    private double saldo;

    public ContaBanco(){
        this.numero = 0;
        this.agencia = "";
        this.nomeCliente = "";
        this.saldo = 0.0;
    }
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public String getAgencia() {
        return agencia;
    }
    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }
    public String getNomeCliente() {
        return nomeCliente;
    }
    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString(){
        String message = "Olá "+ this.nomeCliente + ", obrigado por criar uma conta em nosso banco, " + 
        "sua agência é " + this.agencia + ", conta " + this.numero + " e seu saldo $"+ this.saldo +
        " já está disponível para saque";
        return message;
    }

}