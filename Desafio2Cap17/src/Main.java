import Entities.Sale;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors; //outra forma de escrita para o ToList, descobrir diferencas

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Sale> sales = new ArrayList<>();

        System.out.println("Informe o caminho do arquivo: ");
        String filePath = sc.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath)))
        {
            String lines;
            while ((lines = br.readLine()) != null)
            {
                String[] salesData = lines.split(",");
                sales.add(new Sale(Integer.parseInt(salesData[0]), Integer.parseInt(salesData[1]), salesData[2], Integer.parseInt(salesData[3]), Double.parseDouble(salesData[4])));
            }
        }
        catch (IOException e)
        {
            System.out.println("Erro ao ler a base de dados: " + e.getMessage());
        }

        //obter nomes únicos da lista
        Set<String> uniqueSellers = sales.stream()
                .map(Sale::getSeller)
                .collect(Collectors.toSet());

        //obter total vendido para cada vendedor
        System.out.println("Total de vendas por vendedor:");
        for (String seller : uniqueSellers)
        {
            Double totalSales = sales.stream()
                    .filter(sale ->  sale.getSeller().equals(seller))
                    .mapToDouble(Sale::getTotal)
                    .sum();
            System.out.println(seller + " - R$ " + String.format("%.2f", totalSales));
        }
    }
}