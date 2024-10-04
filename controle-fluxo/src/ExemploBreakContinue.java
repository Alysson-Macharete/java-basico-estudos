public class ExemploBreakContinue {
    public static void main(String[] args) {
        for(int numero =1; numero<=5;numero ++){
            if(numero==3)
                //break; //interrompe o for completo
                continue; //não executa a pŕoxima interação, voltou pro inicio do laço
            System.out.println(numero);
        }
    }
}
