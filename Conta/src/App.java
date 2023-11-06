import Conta.Conta;
public class App {
    public static void main(String[] args)  {
        Conta conta = new Conta(1000, 2000);
        
    }


    public Conta criaConta(double saldoInicial, int numeroConta){
        Conta contaNova = new Conta(saldoInicial, numeroConta);
        if (saldoInicial<0) {
            saldoInicial = 1000;
        }
        if (numeroConta<1000 || numeroConta>9999) {
            numeroConta = 1000;
        }
        return contaNova;
    }
    public Conta sacarConta(Conta contaSaque, double valor){
        contaSaque.sacar(valor);
        return contaSaque;
    }

    
}
