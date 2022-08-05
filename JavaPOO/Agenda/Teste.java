package JavaPOO.Agenda;

public class Teste {
    public static void main(String[] args) {

        Contato contato = new Contato();
        contato.setNome("Henrique");

        Endereco endereco = new Endereco();
        endereco.setNomeRua("rua 1");
        endereco.setNumero("2");
        endereco.setComplemento("conjunto a rua 1");
        endereco.setCidade("cidade");
        endereco.setEstado("estado");
        endereco.setCep("cep");

        Telefone fone = new Telefone();
        fone.setTipo("celular");
        fone.setDdd("91");
        fone.setNumero("12345678");

        Telefone fone2 = new Telefone();
        fone2.setTipo("casa");
        fone2.setDdd("91");
        fone2.setNumero("12345678");

        Telefone[] telefones = new Telefone[2];
        telefones[0] = fone;
        telefones[1] = fone2;


        contato.setEndereco(endereco);
       contato.setTelefones(telefones);

        System.out.println(contato.getNome());

        if(contato != null && contato.getEndereco() != null){
            System.out.println(contato.getEndereco().getNomeRua());
        }
        if(contato != null && contato.getTelefones() != null){
            for (Telefone t: contato.getTelefones()){
                System.out.println(t.getDdd() +""+ t.getNumero());
            }
        }

    }
}
