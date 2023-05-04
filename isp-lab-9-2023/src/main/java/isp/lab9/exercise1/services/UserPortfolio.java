/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package isp.lab9.exercise1.services;

import lombok.AllArgsConstructor;
import lombok.Data;
import yahoofinance.Stock;
import yahoofinance.YahooFinance;

import javax.swing.table.AbstractTableModel;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Uses Lombok to get rid of boilerplate code.
 *
 * @author mihai.hulea
 * @author radu.miron
 */
@Data // it creates getters, setters, equals(), hashCode() and toString() (at compile time)
@AllArgsConstructor // it creates the constructor with arguments for all the attributes (at compile time)
public class UserPortfolio extends AbstractTableModel {
    private BigDecimal cash;

    private Map<String, Integer> shares; // a map of number of shares by stock symbol
    private String[] columns = new String[]{"Symbol", "Quantity", "Price / Unit", "Total price"};
    private Map<String, Stock> stocks = new HashMap<String, Stock>();
    private ArrayList<StockItem> items = new ArrayList<>();
    public UserPortfolio(BigDecimal cash, Map<String, Integer> shares) {
        this.cash = cash;
        this.shares = shares;
    }

    public void addStocks(String symbol, int quantity){
        System.out.println("Buy "+symbol+":"+quantity);
        if(shares.containsKey(symbol)){
            int newc = shares.get(symbol)+quantity;
            shares.put(symbol,newc);
        }else{
            shares.put(symbol,quantity);
        }
        this.fireTableDataChanged();
    }
    public void refreshPortfolioData() throws IOException {
        String[] keys = new String[shares.size()];
        shares.keySet().toArray(keys);
        stocks = YahooFinance.get(keys);
        items = new ArrayList<>();
        stocks.values().stream().forEach(s -> items.add(new StockItem(s)));
        this.fireTableDataChanged();
        System.out.println(items.size());
    }


    @Override
    public int getRowCount() {
        return items.size();
    }

    @Override
    public int getColumnCount() {
        return columns.length;
    }

    @Override
    public String getColumnName(int index) {
        return columns[index];
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        StockItem i = items.get(rowIndex);

        switch (columnIndex) {
            case 0:
                return i.getSymbol();
            case 1:
                return shares.get(i.getSymbol());
            case 2:
                if (i.getPrice() != null) return i.getPrice().toPlainString();
                else return "N/A";
            case 3:
                if (i.getPrice() != null) return i.getPrice().multiply(BigDecimal.valueOf(shares.get(i.getSymbol())));
                else return "N/A";
        }
        return "EMPTY";
    }
}
