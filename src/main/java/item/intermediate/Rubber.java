/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package item.intermediate;

import item.Item;
import item.ItemBase;

import javax.swing.*;
import java.util.Map;

/**
 * @author kiwi0
 */
public class Rubber extends ItemBase {

  private boolean isResidual;

  public Rubber(double num, Map<Item, JComboBox<String>> alternateRecipes, JTextArea output) {
    this(num, alternateRecipes, output, false);
  }

  public Rubber(double num, Map<Item, JComboBox<String>> alternateRecipes, JTextArea output, boolean isResidual) {
    super(num, alternateRecipes, output, Item.RUBBER);
    this.isResidual = isResidual;

    switch (getAlternateRecipeSelectedItem()) {
      case "Default":
        defaultRubber();
        break;
      case "Residual":
        residualRubber(num);
      case "Recycled":
        recycledRubber(num);
      case "Most Efficient":
        efficientRubber();
    }
  }

  public Rubber(double num, Map<Item, JComboBox<String>> alternateRecipes, JTextArea output, double residual) {
    this(num, alternateRecipes, output);
    residualRubber(num);
  }

  public void defaultRubber() {
    double CrudeOil = num * (3 / 2.0);
    double HeavyOilResidue = num;
    append(ds.format(num) + " Rubber / Minute:  with " + ds.format(HeavyOilResidue) + " Heavy Oil Residue / minute:  " +
        ds.format(CrudeOil) + " Raw Oil(m3) / minute. Requires  " + ds.format(num / 20) + " Refineries\n\n");
  }

  public void residualRubber(double amount) {
    double PolymerResin = amount * 2;
    double water = amount * 2;
    append(ds.format(amount) + " Residual Rubber / Minute:  " + ds.format(PolymerResin) + " Polymer Resin / minute |  " +
        ds.format(water) + " Water(m3) / minute. Requires  " + ds.format(amount / 20) + " Refineries\n\n");
  }

  public void recycledRubber(double amount) {
    if (!isResidual) {
      if (String.valueOf(alternateRecipes.get(Item.RUBBER).getSelectedItem()).equals("Most Efficient")) {
        double plastic = amount / 2;
        double fuel = amount / 2;
        append(ds.format(amount) + " Recycled Rubber / Minute:  " + ds.format(plastic) + " Plastic / minute |  " +
            ds.format(fuel) + " Fuel(m3) / minute. Requires  " + ds.format(amount / 60) + " Refineries\n\n");
        new Plastic(plastic, alternateRecipes, output, true);
      } else if (String.valueOf(alternateRecipes.get(Item.PLASTIC).getSelectedItem()).equals("Recycled")) {
        amount += amount / 3;
        double plastic = amount / 2;
        double rubberFuel = amount / 2;
        double totalFuel = rubberFuel + plastic / 2;
        append(ds.format(amount) + " Recycled Rubber / Minute:  " + ds.format(plastic) + " Plastic / minute |  " +
            ds.format(rubberFuel) + " Fuel(m3) / minute. Requires  " + ds.format(amount / 60) + " Refineries\n\n");
        new Plastic(plastic, alternateRecipes, output, true);
        new Fuel(totalFuel, alternateRecipes, output);
      } else {
        double plastic = amount / 2;
        double fuel = amount / 2;
        append(ds.format(amount) + " Recycled Rubber / Minute:  " + ds.format(plastic) + " Plastic / minute |  " +
            ds.format(fuel) + " Fuel(m3) / minute. Requires  " + ds.format(amount / 60) + " Refineries\n\n");
        new Plastic(plastic, alternateRecipes, output);
        new Fuel(fuel, alternateRecipes, output);
      }
    } else {
      double plastic = amount / 2;
      double fuel = amount / 2;
      append(ds.format(amount) + " Recycled Rubber / Minute:  " + ds.format(plastic) + " Plastic (from previous production) / minute |  " +
          ds.format(fuel) + " Fuel(m3) / minute. Requires  " + ds.format(amount / 60) + " Refineries\n\n");
    }
  }

  private void efficientRubber() {

    append("> " + ds.format(num) + " Rubber / Min using the most efficient recipes\n\n");
    alternateRecipes.get(Item.PLASTIC).setSelectedIndex(3);

    if (!isResidual) {
      double rubberCount = 0;
      double fuel = 0;
      if (String.valueOf(alternateRecipes.get(Item.FUEL).getSelectedItem()).equals("Default") || String.valueOf(alternateRecipes.get(Item.FUEL).getSelectedItem()).equals("Residual")) {
        rubberCount = num * (96.97 / 100);
        fuel = num * (72.72 / 100);
      } else if (String.valueOf(alternateRecipes.get(Item.FUEL).getSelectedItem()).equals("Diluted")) {
        rubberCount = num * (118.52 / 100.0);
        fuel = num * (88.89 / 100.0);
      }
      double rubber = new Fuel(fuel, alternateRecipes, output).getPolymerResin() / 2;
      residualRubber(rubber);
      recycledRubber(rubberCount);
    } else {
      recycledRubber(num);
    }


  }


}
