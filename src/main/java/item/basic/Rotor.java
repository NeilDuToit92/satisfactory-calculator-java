/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package item.basic;

import item.Item;
import item.ItemBase;

import javax.swing.*;
import java.util.Map;

//Created a new ItemBase class so that code is not duplicated, seeing as all items have the same fields
public class Rotor extends ItemBase {
  /*
   * Made all of these constants, now they are much easier to update if the values ever need to change
   * Would also as a next step load them from a file, that way you can change them without having to recompile
   */
  public static final int DEFAULT_ROTOR_IRON_RODS = 5;
  public static final int DEFAULT_ROTOR_SCREWS = 25;
  public static final int DEFAULT_ROTOR_AMT_PER_MINUTE = 4;

  public static final int COPPER_ROTOR_COPPER_SHEETS = 2;
  public static final double COPPER_ROTOR_SCREWS = 52 / 3.0;
  public static final double COPPER_ROTOR_AMT_PER_MINUTE = 11.25;

  public static final int STEEL_ROTOR_STEEL_PIPES = 2;
  public static final int STEEL_ROTOR_WIRE = 6;
  public static final int STEEL_ROTOR_AMT_PER_MINUTE = 5;

  public Rotor(double num, Map<Item, JComboBox<String>> alternateRecipes, JTextArea output) {
    //Call the constructor of ItemBasic
    super(num, alternateRecipes, output, Item.ROTOR);

    //Switch reads a lot easier than a bunch of if statements
    switch (getAlternateRecipeSelectedItem()) {
      case "Copper":
        copperRotor();
        break;
      case "Steel":
        steelRotor();
        break;
      case "Default":
      default:
        defaultRotor();
        break;
    }
  }

  public void defaultRotor() {
    double IronRods = num * DEFAULT_ROTOR_IRON_RODS;
    double Screws = num * DEFAULT_ROTOR_SCREWS;
    append(ds.format(num) + " Rotors / Minute:  " + ds.format(IronRods) + " Iron Rods / minute |  " +
        ds.format(Screws) + " Screws / minute. Requires  " + ds.format(num / DEFAULT_ROTOR_AMT_PER_MINUTE) + " Assemblers\n\n");
    new IronRod(IronRods, alternateRecipes, output);
    append("-\n\n");
    new Screw(Screws, alternateRecipes, output);
  }

  public void copperRotor() {
    double CopperSheets = num * COPPER_ROTOR_COPPER_SHEETS;
    double Screws = num * COPPER_ROTOR_SCREWS;
    append(ds.format(num) + " Copper Rotors / Minute:  " + ds.format(CopperSheets) + " Copper Sheets / minute |  " +
        ds.format(Screws) + " Screws / minute. Requires  " + ds.format(num / COPPER_ROTOR_AMT_PER_MINUTE) + " Assemblers\n\n");
    new CopperSheet(CopperSheets, alternateRecipes, output);
    append("-\n\n");
    new Screw(Screws, alternateRecipes, output);

  }

  public void steelRotor() {
    double SteelPipes = num * STEEL_ROTOR_STEEL_PIPES;
    double Wires = num * STEEL_ROTOR_WIRE;
    append(ds.format(num) + " Steel Rotors / Minute:  " + ds.format(SteelPipes) + " Steel Pipe / minute |  " +
        ds.format(Wires) + " Wire / minute. Requires  " + ds.format(num / STEEL_ROTOR_AMT_PER_MINUTE) + " Assemblers\n\n");
    new SteelPipe(SteelPipes, alternateRecipes, output);
    append("-\n\n");
    new Wire(Wires, alternateRecipes, output);
  }

}
