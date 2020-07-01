/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package item.intermediate;

import item.Item;
import item.ItemBase;
import master.textHighlighter;

import javax.swing.*;
import java.awt.*;
import java.util.Map;

/**
 * @author kiwi0
 */
public class Plastic extends ItemBase {

  private boolean isResidual;
  private double extraRubber = 0;

  public Plastic(double num, Map<Item, JComboBox<String>> alternateRecipes, JTextArea output) {
    this(num, alternateRecipes, output, false);
  }


  public Plastic(double num, Map<Item, JComboBox<String>> alternateRecipes, JTextArea output, boolean isResidual) {
    super(num, alternateRecipes, output, Item.PLASTIC);
    this.isResidual = isResidual;

    switch (getAlternateRecipeSelectedItem()) {
      case "Default":
        defaultPlastic();
        break;
      case "Residual":
        residualPlastic(num);
        break;
      case "Recycled":
        recycledPlastic(num);
        break;
      case "Most Efficient":
        efficientPlastic();
        break;
    }

  }

  private void efficientPlastic() {

    append("> " + ds.format(num) + " Plastic / Min using the most efficient recipes\n\n");
    alternateRecipes.get(Item.RUBBER).setSelectedIndex(3);


    if (!isResidual) {
      String plasticStart = "v-" + num + " Plastic Start-v";
      append(plasticStart + "\n\n");
      new textHighlighter(plasticStart, new Color(123, 0, 255), output);
      double plasticCount = 0;
      double fuel = 0;
      if (String.valueOf(alternateRecipes.get(Item.FUEL).getSelectedItem()).equals("Default") || String.valueOf(alternateRecipes.get(Item.FUEL).getSelectedItem()).equals("Residual")) {
        plasticCount = num * (1497 / 1300.0);
        fuel = num * (8 / 11.0);

      } else if (String.valueOf(alternateRecipes.get(Item.FUEL).getSelectedItem()).equals("Diluted")) {
        plasticCount = num * (1200 / 953.0);
        fuel = num * (120 / 135.0);
      }
      double rubber = new Fuel(fuel, alternateRecipes, output).getPolymerResin() / 2;
      new Rubber(rubber, alternateRecipes, output, 1);
      extraRubber = rubber;
      recycledPlastic(plasticCount);
      String plasticEnd = "^-" + num + " Plastic End-^";
      append(plasticEnd + "\n\n");
      new textHighlighter(plasticEnd, new Color(123, 0, 255), output);


    } else {
      recycledPlastic(num);
    }


  }


  public void defaultPlastic() {
    double CrudeOil = num * (3 / 2.0);
    double HeavyOilResidue = num / 2;
    append(ds.format(num) + " Plastic / Minute: with  " + ds.format(HeavyOilResidue) + " Heavy Oil Residue / minute:  " +
        ds.format(CrudeOil) + " Raw Oil(m3) / minute. Requires  " + ds.format(num / 20) + " Refineries\n\n");
  }

  public void residualPlastic(double amount) {
    double PolymerResin = amount * (6 / 2.0);
    double water = amount * 1;
    append(ds.format(amount) + " Residual Plastic / Minute:  " + ds.format(PolymerResin) + " Polymer Resin / minute |  " +
        ds.format(water) + " Water(m3) / minute.  Requires " + ds.format(amount / 20) + " Refineries\n\n");
  }

  public void recycledPlastic(double amount) {

    if (!isResidual) {
      if (String.valueOf(alternateRecipes.get(Item.RUBBER).getSelectedItem()).equals("Most Efficient")) {
        double rubber = amount / 2;
        double fuel = amount / 2;
        append(ds.format(amount) + " Recycled Plastic / Minute:  " + ds.format(rubber) + " Rubber / minute |  " +
            ds.format(fuel) + " Fuel(m3) / minute. Requires  " + ds.format(amount / 60) + " Refineries\n\n");
        new Rubber(rubber - extraRubber, alternateRecipes, output, true);
      } else if (String.valueOf(alternateRecipes.get(Item.RUBBER).getSelectedItem()).equals("Recycled")) {
        amount += amount / 3;
        double rubber = amount / 2;
        double plasticFuel = amount / 2;
        double totalFuel = plasticFuel + rubber / 2;
        append(ds.format(amount) + " Recycled Plastic / Minute:  " + ds.format(rubber) + " Rubber / minute |  " +
            ds.format(plasticFuel) + " Fuel(m3) / minute. Requires  " + ds.format(amount / 60) + " Refineries\n\n");
        new Rubber(rubber, alternateRecipes, output, true);
        new Fuel(totalFuel, alternateRecipes, output);
      } else {
        double rubber = amount / 2;
        double fuel = amount / 2;
        append(ds.format(amount) + " Recycled Plastic / Minute:  " + ds.format(rubber) + " Rubber / minute |  " +
            ds.format(fuel) + " Fuel(m3) / minute. Requires  " + ds.format(amount / 60) + " Refineries\n\n");
        new Rubber(rubber, alternateRecipes, output);
        new Fuel(fuel, alternateRecipes, output);
      }
    } else {
      double rubber = amount / 2;
      double fuel = amount / 2;
      append(ds.format(amount) + " Recycled Plastic / Minute:  " + ds.format(rubber) + " Rubber (from previous production) / minute |  " +
          ds.format(fuel) + " Fuel(m3) / minute. Requires  " + ds.format(amount / 60) + " Refineries\n\n");
    }

  }

}
