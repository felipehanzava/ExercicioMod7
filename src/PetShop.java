public class PetShop {
    public static void main(String[] args) {
        Gatos gatos = new Gatos();
        Cachorro cachorro = new Cachorro();
        Cliente cliente = new Cliente();
        cliente.cadastrarNome("Felipe");
        System.out.println(cliente.pesquisarNome());
    }
}
