package sistema_radar;

public class Simulacao {
    public static void main(String[] args) {
        System.out.println("Simulação");

        Carro civic = new Carro();
        civic.ano = 24;
        civic.modelo = "g10";
        civic.placa = "NWJZ234";
        civic.velocidade = 0;

        Radar radar = new Radar();
        radar.limitevelocidade = 60;
        radar.localizacao = "Pistão Sul";

        radar.avaliarVelocidade(civic);
        
        civic.acelerar(); // 10
        civic.acelerar();
        civic.acelerar();
        civic.acelerar();
        civic.acelerar();
        civic.acelerar();
        civic.acelerar(); // 70
        
        radar.avaliarVelocidade(civic);

        civic.frear(); // 60 

        radar.avaliarVelocidade(civic);
    }
}
