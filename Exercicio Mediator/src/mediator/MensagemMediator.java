package mediator;

import java.util.ArrayList;

public class MensagemMediator implements Mediator{
	
	protected ArrayList<Colleague> contatos;
	
	public MensagemMediator() {
        contatos = new ArrayList<Colleague>();
    }
 
    public void adicionarColleague(Colleague colleague) {
        contatos.add(colleague);
    }

    @Override
    public void enviar(String mensagem, Colleague colleague) {
        for (Colleague contato : contatos) {
            if (contato != colleague) {
                definirProtocolo(contato);
                contato.receberMensagem(mensagem);
            }
        }
    }
    
    private void definirProtocolo(Colleague contato) {
        if (contato instanceof CEFColleague) {
            System.out.println("Protocolo CEF");
        } else if (contato instanceof BBColleague) {
            System.out.println("Protocolo BB");
        } else if (contato instanceof ItauColleague) {
            System.out.println("Protocolo Itau");
        } else if (contato instanceof BradescoColleague) {
        	System.out.println("Protocolo Bradesco");
        }
    }

}
