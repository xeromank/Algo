package bm.c03;

import java.util.HashMap;
import java.util.Map;

class ProductInfo {
    String productId;
    String productName;
    int price;

    public ProductInfo(String pi){
        String[] piArr = pi.split(",");
        this.productId = piArr[0];
        this.productName = piArr[1];
        this.price = Integer.parseInt(piArr[2]);
    }
}

class DailyProductSale{
    String date;
    String productId;
    int qty;

    public DailyProductSale(String dailyProductSale){
        String[] dailyProductSaleArr = dailyProductSale.split(",");
        this.date = dailyProductSaleArr[0];
        this.productId = dailyProductSaleArr[1];
        this.qty = Integer.parseInt(dailyProductSaleArr[2]);
    }
}

class SaleProduct {
    String date;
    String productId;
    String productName;
    int amount;

    public SaleProduct(DailyProductSale dps, ProductInfo pi){
        this.date = dps.date;
        this.productId = pi.productId;
        this.productName = pi.productName;
        this.amount = dps.qty * pi.price;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(this.date).append(",");
        sb.append(this.productId).append(",");
        sb.append(this.productName).append(",");
        sb.append(this.amount);

        return sb.toString();
    }
}

public class Solution {
    public String[] solution(String[] productInfos, String[] dailyProductSales) {
        String[] answer = new String[dailyProductSales.length];

        Map<String, ProductInfo> pis = new HashMap<>();
        for(String pi : productInfos){
            ProductInfo productInfo = new ProductInfo(pi);
            pis.put(productInfo.productId, productInfo);
        }

        int i = 0;
        for(String dps: dailyProductSales){
            DailyProductSale dailyProductSale = new DailyProductSale(dps);
            ProductInfo pi = pis.get(dailyProductSale.productId);

            SaleProduct saleProduct = new SaleProduct(dailyProductSale, pi);
            answer[i] = saleProduct.toString();
            i++;
        }

        return answer;
    }
}
