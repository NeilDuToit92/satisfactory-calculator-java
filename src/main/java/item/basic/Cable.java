/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package item.basic;

import item.Item;
import item.ItemBase;
import item.intermediate.HeavyOilResidue;
import item.intermediate.Rubber;

import javax.swing.*;
import java.util.Map;

public class Cable extends ItemBase {
  public static final int DEFAULT_CABLE_WIRE = 2;
  public static final int DEFAULT_CABLE_AMT_PER_MINUTE = 30;

  public static final double COATED_CABLE_AMT_PER_MINUTE = 67.5;
  public static final double COATED_CABLE_WIRE = (5 / 9.0);
  public static final double COATED_CABLE_HEAVY_OIL_RESIDUE = (2 / 9.0);

  public static final double INSULATED_CABLE_WIRE = (9 / 20.0);
  public static final double INSULATED_CABLE_RUBBER = (6 / 20.0);
  public static final int INSULATED_CABLE_AMT_PER_MINUTE = 100;

  public static final double QUICKWIRE_CABLE_QUICKWIRE = (3 / 11.0);
  public static final double QUICKWIRE_CABLE_RUBBER = (2 / 11.0);
  public static final double QUICKWIRE_CABLE_AMT_PER_MINUTE = 27.5;

  public Cable(double num, Map<Item, JComboBox<String>> alternateRecipes, JTextArea output) {
    super(num, alternateRecipes, output, Item.CABLE);

    switch (getAlternateRecipeSelectedItem()) {
      case "Default":
        defaultCable();
        break;
      case "Coated":
        coatedCable();
        break;
      case "Insulated":
        insulatedCable();
        break;
      case "Quickwire":
        quickwireCable();
        break;
    }
  }

  public void defaultCable() {
    double wire = num * DEFAULT_CABLE_WIRE;
    append(ds.format(num) + " Cable / Minute: " + ds.format(wire) + "  Wire / minute. Requires  " + ds.format(num / DEFAULT_CABLE_AMT_PER_MINUTE) + " Constructors\n\n");
    new Wire(wire, alternateRecipes, output);
  }

  public void coatedCable() {
    double wire = num * COATED_CABLE_WIRE;
    double heavyOilResidue = num * COATED_CABLE_HEAVY_OIL_RESIDUE;
    append(ds.format(num) + "  Coated Cable / Minute: " + ds.format(wire) + " Wire / minute |  " +
        ds.format(heavyOilResidue) + " Heavy Oil Residue(m3) / minute. Requires  " + ds.format(num / COATED_CABLE_AMT_PER_MINUTE) + " Refineries\n\n");
    new Wire(wire, alternateRecipes, output);
    append("-\n\n");
    new HeavyOilResidue(heavyOilResidue, alternateRecipes, output);

  }

  public void insulatedCable() {
    double wire = num * INSULATED_CABLE_WIRE;
    double rubber = num * INSULATED_CABLE_RUBBER;
    append(ds.format(num) + " Insulated Cable / Minute:  " + ds.format(wire) + " Wire / minute |  " +
        ds.format(rubber) + " Rubber / minute. Requires  " + ds.format(num / INSULATED_CABLE_AMT_PER_MINUTE) + " Assemblers\n\n");
    new Wire(wire, alternateRecipes, output);
    append("-\n\n");
    new Rubber(rubber, alternateRecipes, output);
  }

  public void quickwireCable() {
    double quickWire = num * QUICKWIRE_CABLE_QUICKWIRE;
    double rubber = num * QUICKWIRE_CABLE_RUBBER;
    append(ds.format(num) + " Quickwire Cable / Minute:  " + ds.format(quickWire) + " Quickwire / minute |  " +
        ds.format(rubber) + " Rubber / minute. Requires  " + ds.format(num / QUICKWIRE_CABLE_AMT_PER_MINUTE) + " Assemblers\n\n");
    new Quickwire(quickWire, alternateRecipes, output);
    append("-\n\n");
    new Rubber(rubber, alternateRecipes, output);
  }


}
