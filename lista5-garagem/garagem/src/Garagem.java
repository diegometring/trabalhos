import java.util.ArrayList;

public class Garagem {

    public ArrayList<Object> veiculos = new ArrayList<Object>();

    public void adicionarVeiculos(){
        Pessoa p = new Pessoa("Joao", 32121021, 428312);
        Veiculo v = new Veiculo("BRD1029", CorVeiculo.PRATA, TipoVeiculo.CARRO, "Ford", "Ka", "2002", true, 5, p);
        veiculos.add(v);

        p = new Pessoa("Roberto", 321321, 7879978);
        v = new Veiculo("BRD102", CorVeiculo.AMARELO, TipoVeiculo.CAMINHAO, "Ford", "Cargo", "2004", true, 3, p);
        veiculos.add(v);

        p = new Pessoa("Maria", 3216421, 312642);
        v = new Veiculo("WEM321", CorVeiculo.PRETO, TipoVeiculo.MOTO, "Honda", "Bis", "2005", false, 2, p);
        veiculos.add(v);

        p = new Pessoa("Paulo", 4217421, 32163712);
        v = new Veiculo("POU7569", CorVeiculo.AZUL, TipoVeiculo.MOTO, "Honda", "PCX", "2020", true, 2, p);
        veiculos.add(v);

        p = new Pessoa("Pedro", 1231241, 6536546);
        v = new Veiculo("QAX2856", CorVeiculo.VERMELHO, TipoVeiculo.CARRO, "Volkswagen", "Virtus", "2017", false, 5, p);
        veiculos.add(v);

        p = new Pessoa("José", 987907, 321313);
        v = new Veiculo("YUM9901", CorVeiculo.AZUL, TipoVeiculo.CARRO, "Volkswagen", "Amarok", "2018", false, 5, p);
        veiculos.add(v);

    }
    
    public void consultaListaCompleta(){
        for (int i = 0; i < veiculos.size(); i++){
            System.out.println("Vaga numero " + (i+1) + ": " +veiculos.get(i));
        }
        System.out.println("-----------------------------------------------");
    }

    public void filtraPorTipo(TipoVeiculo tipoVeiculo){
        int i = 0;
        for(Object obj : veiculos){
            if(obj instanceof Veiculo){
                Veiculo v = (Veiculo)obj;
                if(v.getTipo() == tipoVeiculo){
                    System.out.println("Vaga numero " + (i+1) + ": " + v);
                }
            }
            i++;
        }
        System.out.println("-----------------------------------------------");
    }
}