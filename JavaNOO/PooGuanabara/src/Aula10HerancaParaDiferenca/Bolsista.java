package Aula10HerancaParaDiferenca;

public class Bolsista extends Aluno{
    private float bolsa;

    private void renovarBolsa(){
        System.out.println("Renovando bolsa de "+ this.nome);

    }

    public float getBolsa() {
        return bolsa;
    }

    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }

    @Override
    public void pagarMatricula(){
        System.out.println(this.nome + " bolsita");

    }

}
