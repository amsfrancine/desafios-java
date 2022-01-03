public class Main {
    public static void main(String[] args) {
        ScanTutorial scan = new ScanTutorial();

        Integer indice = selectedItem(scan);
        Double valor = coletarValor(scan, indice);

        Double troco = valorTroco(indice, valor);
        System.out.println(troco);

        devolverTroco(troco);

        //   System.out.println(indice);
        //   System.out.println(valor);
    }

    private static Integer selectedItem(ScanTutorial scan) {
        boolean optionSelected = false;
        Integer indice = 0;
        do {
            System.out.println(Constants.MENSAGENS.INICIO);
            System.out.println(Constants.MENSAGENS.ITENS);

            indice = scan.coletarInteiro();

            if (indice > 0 && indice < 5) {
                optionSelected = true;
            } else {
                System.out.println(Constants.ERROS.OPCAO_INVALIDA);
            }

        } while (optionSelected == false);

        return indice;
    }

    private static Double coletarValor(ScanTutorial scan, Integer indice) {
        Double valor = 0.0;
        boolean optionSelected = false;
        do {
            System.out.println(Constants.MENSAGENS.PAGAMENTO);
            valor = scan.coletarDouble();

            switch (indice) {
                case 1:
                    if (valor >= 3.50) {
                        optionSelected = true;
                    }
                    break;
                case 2:
                    if (valor >= 3.55) {
                        optionSelected = true;
                    }
                    break;
                case 3:
                    if (valor >= 3.25) {
                        optionSelected = true;
                    }
                    break;
                case 4:
                    if (valor >= 3.75) {
                        optionSelected = true;
                    }
                    break;
            }

            if (optionSelected == false) {
                System.out.println(Constants.ERROS.VALOR_INVALIDO);
            }
        } while (optionSelected == false);

        return valor;
    }

    private static Double valorTroco(Integer indice, Double valor) {
        System.out.println(Constants.MENSAGENS.VALOR_TROCO);

        double valorTroco;

        switch (indice) {
            case 1:
                valorTroco = valor - 3.50;
                break;
            case 2:
                valorTroco = valor - 3.55;
                break;
            case 3:
                valorTroco = valor - 3.25;
                break;
            case 4:
                valorTroco = valor - 3.75;
                break;
            default:
                valorTroco = 0.0;
        }
        return valorTroco;
    }

    private static void devolverTroco(Double valorTroco) {
        int sobra;
        int[] notas = new int[] { 100, 50, 20, 10, 5, 2 };
        int[] moedas = new int[] { 100, 50, 25, 10, 5, 1 };

        while (valorTroco > 0) {
            System.out.println(Constants.MENSAGENS.TROCO_CEDULAS + (valorTroco.intValue()-1));
            for (int nota : notas) {
                sobra = valorTroco.intValue() / nota;
                valorTroco = valorTroco % nota;
                if (sobra != 0) {
                    System.out.println(sobra + " x " + nota);
                }
            }

            System.out.println(Constants.MENSAGENS.TROCO_MOEDAS + valorTroco);
            valorTroco = Math.ceil(valorTroco * 100);
            for (int moeda : moedas) {
                sobra = valorTroco.intValue() / moeda;
                valorTroco = valorTroco % moeda;
                if (sobra != 0) {
                    System.out.println(sobra + String.format(" x %.2f", (double) moeda / 100));
                }
            }
        }
    }
}

