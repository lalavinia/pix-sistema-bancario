package banks;
import clients.Titular;

public class Bancoapp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BancoCentral bc = new BancoCentral();
		Titular lavinia = new Titular();
		
		bc.cadastrar(1, "bb");
		bc.cadastrar(2, "aa");
		System.out.println(bc.getBancos(1).getNome());
		System.out.println(bc.getBancos(2).getNome());
		
		bc.getBancos(1).cadastrarAgencia("11");
		bc.getBancos(1).cadastrarAgencia("12");
		bc.getBancos(1).cadastrarAgencia("13");
		bc.getBancos(2).cadastrarAgencia("21");
		bc.getBancos(2).cadastrarAgencia("22");
		
		System.out.println(bc.getBancos(1).getAgencia("11").getCodigo());
		System.out.println(bc.getBancos(2).getAgencia("22").getCodigo());
		
		bc.getBancos(1).getAgencia("11").cadastrarConta(111, 'p', lavinia, 30);
		bc.getBancos(2).getAgencia("22").cadastrarConta(222, 'p', lavinia, 50);
		
		System.out.println(bc.getBancos(1).getAgencia("11").getConta(111).getSaldo());
		System.out.println(bc.getBancos(2).getAgencia("22").getConta(222).getSaldo());
		
		System.out.println(bc.getBancos(2).getAgencia("22").getConta(222).sacar(10));
		System.out.println(bc.getBancos(2).getAgencia("22").getConta(222).getSaldo());
		
		System.out.println(bc.getBancos(2).getAgencia("22").getConta(222).depositar(10));
		System.out.println(bc.getBancos(2).getAgencia("22").getConta(222).getSaldo());
		
		//bc.transferencia(bancoRementente, codRemetente, agRemetente, bancoDestinatario, codDestinatario, agDestinatario, valor);
		bc.transferencia(2, 222, "22", 1, 111, "11", 10.0);
		
		System.out.println(bc.getBancos(1).getAgencia("11").getConta(111).getSaldo());
		System.out.println(bc.getBancos(2).getAgencia("22").getConta(222).getSaldo());
		
	}

}
