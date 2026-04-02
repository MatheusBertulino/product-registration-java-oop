public class Principal {
    
    public static void main (String[] args){

        Produto p1 = new Produto ();
        Produto p2 = new Produto("Notebook", 3500.00);
        Produto p3 = new Produto("Mouse" , 100.00);
        Produto p4 = new Produto ("Monitor", 560.00);

        p1.nome = "Teclado";
        p1.preco = 200.00;  

        p1.exibirDados();
        p2.exibirDados();
        p3.exibirDados();
        p4.exibirDados();

        Produto.exibirQuantidadeTotal();
    }
}
