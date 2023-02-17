import java.util.Scanner;

public class ContadorMain {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Digite o primeiro parâmetro");
            int parametroUm = sc.nextInt();
            System.out.println("Digite o segundo parâmetro");
            int parametroDois = sc.nextInt();
            int contagem = parametroDois - parametroUm;
            int novoParametro2 ;

            try {
                contar(parametroUm, parametroDois);

            }catch (ParametrosInvalidosException  exception) {
                System.err.println ("O segundo parametro deve ser maior que o primeiro ");
            }

//              if (parametroUm > parametroDois){
//                  System.out.println ("digite o segundo parametro novamente: ");
//                   novoParametro2 = sc.nextInt();
//                  parametroDois = novoParametro2;
//              }novoParametro2

              System.out.println("contagem: ");
              for (int i = 0; i < contagem; i++){
                  System.out.println(i+1);
              }

    }
        static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException  { //fiz uma excecao customizada usando try/catch
              if(parametroUm > parametroDois)throw new ParametrosInvalidosException();
              //realizar o for para imprimir os números com base na variável contagem
        }
    }

