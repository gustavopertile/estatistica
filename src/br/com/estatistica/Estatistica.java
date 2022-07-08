package br.com.estatistica;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Estatistica {
public static void main(String[] args) {
EstatisticaDescritiva e = new EstatisticaDescritiva();
Scanner teclado = new Scanner(System.in);

int i;
System.out.println(" - Informe quantos valores irá adicionar! - ");
int tam = teclado.nextInt();

double dados[] = new double[tam];

for ( i = 0; i < dados.length; i++){
	System.out.println(" - Informe o valor número " + (i+1));
	dados[i] = teclado.nextDouble();
}

e.setArray(dados);

System.out.print("-----------------------------------------------");
System.out.print("\n Média Aritmética: "+ new BigDecimal(e.getMediaAritmetica()).setScale(1, RoundingMode.HALF_EVEN));
System.out.print("\n Média Geométrica: "+ new BigDecimal(e.getMediaGeometrica()).setScale(1, RoundingMode.HALF_EVEN));
System.out.print("\n Moda: "+ new BigDecimal(e.getModa()).setScale(1, RoundingMode.HALF_EVEN));
System.out.print("\n Mediana: "+ new BigDecimal(e.getMediana()).setScale(1, RoundingMode.HALF_EVEN));
System.out.print("\n Desvio Padrão: "+ new BigDecimal(e.getDesvioPadrao()).setScale(1, RoundingMode.HALF_EVEN));
System.out.print("\n Variância Amostral: "+ new BigDecimal(e.getVariancia()).setScale(1, RoundingMode.HALF_EVEN));
System.out.print("\n Coeficiente Variação Amostral: "+ new BigDecimal(e.getPearson()).setScale(1, RoundingMode.HALF_EVEN));
System.out.print("\n Soma Elementos: "+ new BigDecimal(e.getSomaDosElementos()).setScale(1, RoundingMode.HALF_EVEN));
System.out.print("\n SomaDosElementosAoQuadrado: "+ new BigDecimal(e.getSomaDosElementosAoQuadrado()).setScale(1, RoundingMode.HALF_EVEN));
System.out.print("\n Coeficiente de Assimetria: "+ new BigDecimal(e.getCoefAssimetria()).setScale(1, RoundingMode.HALF_EVEN));
}
}