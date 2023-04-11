public class Faturamento {
    public static void main(String[] args) {
        double[] faturamento = { 22174.1664, 24537.6698, 26139.6134, 0.0, 0.0, 26742.6612, 0.0, 42889.2258, 46251.174,
                11191.4722, 0.0, 0.0, 3847.4823, 373.7838, 2659.7563, 48924.2448, 18419.2614, 0.0, 0.0, 35240.1826,
                43829.1667, 18235.6852, 4355.0662, 13327.1025, 0.0, 0.0, 25681.8318, 1718.1221, 13220.495, 13220.495 };

        // Menor valor de faturamento
        double menorFaturamento = faturamento[0];
        for (int i = 1; i < faturamento.length; i++) {
            if (faturamento[i] < menorFaturamento) {
                menorFaturamento = faturamento[i];
            }
        }
        System.out.println("O menor valor de faturamento ocorrido em um dia do mês foi: " + menorFaturamento);

        // Maior valor de faturamento
        double maiorFaturamento = faturamento[0];
        for (int i = 1; i < faturamento.length; i++) {
            if (faturamento[i] > maiorFaturamento) {
                maiorFaturamento = faturamento[i];
            }
        }
        System.out.println("O maior valor de faturamento ocorrido em um dia do mês foi: " + maiorFaturamento);

        // Média mensal de faturamento
        double somaFaturamento = 0;
        for (double faturamentoDiario : faturamento) {
            somaFaturamento += faturamentoDiario;
        }
        double mediaMensal = somaFaturamento / (double) faturamento.length;

        // Número de dias com faturamento superior à média mensal
        int diasAcimaDaMedia = 0;
        for (double faturamentoDiario : faturamento) {
            if (faturamentoDiario > mediaMensal) {
                diasAcimaDaMedia++;
            }
        }
        System.out.println("O número de dias no mês em que o faturamento diário foi superior à média mensal foi: "
                + diasAcimaDaMedia);
    }
}
