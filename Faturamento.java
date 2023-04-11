public class Faturamento {
    public static void main(String[] args) {
        int[] faturamento = {1000, 2000, 1500, 3000, 2500, 1800, 2200, 1900, 2800, 2300, 2100, 2600, 2400, 2700, 2900, 1700, 3100, 3200, 3300, 3400, 3500, 3600, 3700, 3800, 3900, 4000, 4100, 4200, 4300, 4400, 4500};

        // Menor valor de faturamento
        int menorFaturamento = faturamento[0];
        for (int i = 1; i < faturamento.length; i++) {
            if (faturamento[i] < menorFaturamento) {
                menorFaturamento = faturamento[i];
            }
        }
        System.out.println("O menor valor de faturamento ocorrido em um dia do mês foi: " + menorFaturamento);

        // Maior valor de faturamento
        int maiorFaturamento = faturamento[0];
        for (int i = 1; i < faturamento.length; i++) {
            if (faturamento[i] > maiorFaturamento) {
                maiorFaturamento = faturamento[i];
            }
        }
        System.out.println("O maior valor de faturamento ocorrido em um dia do mês foi: " + maiorFaturamento);

        // Média mensal de faturamento
        int somaFaturamento = 0;
        for (int faturamentoDiario : faturamento) {
            somaFaturamento += faturamentoDiario;
        }
        double mediaMensal = somaFaturamento / (double) faturamento.length;

        // Número de dias com faturamento superior à média mensal
        int diasAcimaDaMedia = 0;
        for (int faturamentoDiario : faturamento) {
            if (faturamentoDiario > mediaMensal) {
                diasAcimaDaMedia++;
            }
        }
        System.out.println("O número de dias no mês em que o faturamento diário foi superior à média mensal foi: " + diasAcimaDaMedia);
    }
}
