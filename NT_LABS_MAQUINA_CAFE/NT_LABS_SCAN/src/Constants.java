public class Constants {

        public @interface MENSAGENS {
            String INICIO = "Selecione um item:";
            String ITENS = "1 - Capuccino: R$ 3,50\n2 - Vanilla R$ 3,55\n3 - Carioca R$ 3,25\n4 - Mocaccino R$ 3,75\n";
            String PAGAMENTO = "Insira o valor na maquina R$: ";
            String VALOR_TROCO = "Devolver troco de R$: ";
            String TROCO_CEDULAS = "Valor devolvido em cédulas R$: ";
            String TROCO_MOEDAS = "Valor devolvido em moedas R$: ";

        }

        public @interface ERROS {
            String NUMERO_INVALIDO = "Você deve selecionar um número!";
            String OPCAO_INVALIDA = "Opção invalida!";
            String VALOR_INVALIDO = "Valor invalido!";
        }
    }
