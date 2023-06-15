import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);
        int scanner;

        Garagem g = new Garagem();
        g.adicionarVeiculos();

        while (true) {
            System.out.println("-----------Garagem--------------");
            System.out.println("1- Mostrar lista completa ");
            System.out.println("2- Filtrar resultados por veículo ");
            System.out.println("3- Sair");
            scanner = scan.nextInt();
            
            switch (scanner) {
                case 1:
                    g.consultaListaCompleta();
                    continue;
                case 2:
                    System.out.println("Digite 1 para caminhão, 2 para carro ou 3 para moto");
                    scanner = scan.nextInt();
                    switch (scanner){
                        case 1:
                            g.filtraPorTipo(TipoVeiculo.CAMINHAO);
                            break;
                        case 2:
                            g.filtraPorTipo(TipoVeiculo.CARRO);
                            break;
                        case 3:
                            g.filtraPorTipo(TipoVeiculo.MOTO);
                            break;
                        default:
                            System.out.println("Comando inválido");
                            break;
                    }
                    continue;
                case 3:
                    break;
                default:
                    System.out.println("Comando não definido, tente novamente");
                    continue;
            }
            break;
        }
    }
}