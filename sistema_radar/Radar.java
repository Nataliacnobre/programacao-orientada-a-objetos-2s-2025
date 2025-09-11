package sistema_radar;

public class Radar {
    public Integer limitevelocidade;
    public String localizacao;

    public Radar(Integer limiteVelocidade, String localizacao){
        this.limitevelocidade = limiteVelocidade;
        this.localizacao = localizacao;
    }

    public void avaliarVelocidade(Carro carro){
        if(carro.getVelocidade() > this.limitevelocidade){
            //emitir notificação
            emitirNotificacao(carro.placa, carro.velocidade);
        }
    }

    public void emitirNotificacao(String placa, Integer velocidadeObservada){
        System.out.println("Placa; "+placa);
        System.out.println("Velocidade observada: "+ velocidadeObservada);
        System.out.println("Limite da via"+ this.limitevelocidade);
    }
}





