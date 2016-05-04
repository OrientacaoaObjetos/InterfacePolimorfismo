
public class Principal {

	public static void main(String[] args) {
		IBarulho[] barulhentos = new IBarulho[10];
		
		barulhentos[0] = new Bateria();
		barulhentos[1] = new Vulvuzela();
		barulhentos[2] = new Carro();
		barulhentos[3] = new Metralhadora();
		barulhentos[4] = new Metralhadora();
		barulhentos[5] = new Vulvuzela();
		barulhentos[6] = new Vulvuzela();
		barulhentos[7] = new Carro();
		barulhentos[8] = new Carro();
		barulhentos[9] = new Bateria();
		
		sons(barulhentos);

	}
	
	public static void sons(IBarulho[] barulhentos) {
		for (IBarulho barulho : barulhentos) {
			System.out.println(barulho.fazerBarulho());
		}
	}

}
