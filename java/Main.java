public class Main{
    public static void main(String[] args){
        //Chamando classe Primo
        Primo p = new Primo();
        p.verificarPrimo();

        //Chamando classe Fibonacci
        Fibonacci f = new Fibonacci();
        f.gerarFibonacci();

        //Chamando classe MDC
        MDC m = new MDC();
        m.calcularMDC();

        //Chamando classe Ordenacao
        Ordenacao o = new Ordenacao();
        o.ordenarNumeros();

        //Chamando classe Somatorio
        Somatorio s = new Somatorio();
        s.calcularSomatorio();

        //Chamando classe Contagem
        Contagem c = new Contagem();
        c.realizarContagem();
    }
}