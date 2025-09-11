package sistema_radar;

public class Simulacao {
    public static void main(String[] args) {
        System.out.println("Simulação");

        Carro civic = new Carro("NWJZ234", "g10", 24, 0);   
        civic.ano = 24;
        civic.modelo = "g10";
        civic.placa = "NWJZ234";
        civic.velocidade = 0;

        Radar radar = new Radar(60, "Pistão sul");
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
        civic.velocidade = -60;
        radar.avaliarVelocidade(civic);
        
        radar.avaliarVelocidade(civic);

        civic.frear(); // 60 

        radar.avaliarVelocidade(civic);
    }
}
