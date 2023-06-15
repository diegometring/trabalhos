public class Veiculo {
    public String placa;
    public CorVeiculo cor;
    public TipoVeiculo tipo;
    public String marca;
    public String modelo;
    public String ano;
    public boolean reboque;
    public int quantAssentos;
    public Pessoa dono;
    // TipoVeiculo tipo = TipoVeiculo.TERRESTRE;

    public Veiculo(String placa, CorVeiculo cor, TipoVeiculo tipo, String marca, String modelo, String ano,
            boolean reboque, int quantAssentos, Pessoa dono) {
        this.placa = placa; 
        this.cor = cor;
        this.tipo = tipo;
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.reboque = reboque;
        this.quantAssentos = quantAssentos;
        this.dono = dono;
    }
    public String getPlaca() {
        return placa;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    public CorVeiculo getCor() {
        return cor;
    }
    public void setCor(CorVeiculo cor) {
        this.cor = cor;
    }
    public TipoVeiculo getTipo() {
        return tipo;
    }
    public void setTipo(TipoVeiculo tipo) {
        this.tipo = tipo;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getAno() {
        return ano;
    }
    public void setAno(String ano) {
        this.ano = ano;
    }
    public boolean isReboque() {
        return reboque;
    }
    public void setReboque(boolean reboque) {
        this.reboque = reboque;
    }
    public int getQuantAssentos() {
        return quantAssentos;
    }
    public void setQuantAssentos(int quantAssentos) {
        this.quantAssentos = quantAssentos;
    }
    public Pessoa getDono() {
        return dono;
    }
    public void setDono(Pessoa dono) {
        this.dono = dono;
    }

    @Override
    public String toString(){
        return marca +", " + modelo + ", " + cor + ", " + ano + ", placa " + placa + ", " + quantAssentos + " assentos" + " de " + dono.getNome() +"";
    }
}