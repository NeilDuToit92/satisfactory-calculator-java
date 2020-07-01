/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package item.intermediate;

import item.Item;
import item.ItemBase;
import item.basic.AlcadAluminumSheet;
import item.basic.CopperSheet;

import javax.swing.*;
import java.util.Map;

/**
 * @author kiwi0
 */
public class HeatSink extends ItemBase {

  public HeatSink(double num, Map<Item, JComboBox<String>> alternateRecipes, JTextArea output) {
    super(num, alternateRecipes, output, Item.HEAT_SINK);

    switch (getAlternateRecipeSelectedItem()) {
      case "Default":
        defaultHeatSink();
        break;
      case "Heat Exchanger":
        heatExchanger();
        break;
    }
  }

  public void defaultHeatSink() {
    double alcadSheets = num * 4;
    double rubber = num * 7;
    output.append(ds.format(num) + " Heat Sinks / Minute:  " + ds.format(alcadSheets) + " Alclad Aluminum Sheets / minute |  " +
        ds.format(rubber) + " Rubber / minute. Requires  " + ds.format(num / 10) + " Assemblers\n\n");
    new AlcadAluminumSheet(alcadSheets, alternateRecipes, output);
    output.append("-\n\n");
    new Rubber(rubber, alternateRecipes, output);

  }

  public void heatExchanger() {
    double alcadSheets = num * (20 / 7.0);
    double copperSheets = num * (30 / 7.0);
    output.append(ds.format(num) + " Heat Sinks / Minute:  " + ds.format(alcadSheets) + " Alclad Aluminum Sheets / minute |  " +
        ds.format(copperSheets) + " Copper Sheets / minute. Requires  " + ds.format(num / 13.125) + " Assemblers\n\n");
    new AlcadAluminumSheet(alcadSheets, alternateRecipes, output);
    output.append("-\n\n");
    new CopperSheet(copperSheets, alternateRecipes, output);

  }

}
