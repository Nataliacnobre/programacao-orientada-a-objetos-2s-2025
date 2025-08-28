package sistema_radar;

public class Radar {
    public Integer limitevelocidade;
    public String localizacao;

    public void avaliarVelocidade(Carro carro){
        if(carro.velocidade > this.limitevelocidade){
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
