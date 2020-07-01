/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package item.intermediate;

import item.Item;
import item.ItemBase;
import item.basic.Concrete;
import item.basic.SteelBeam;
import item.basic.SteelPipe;

import javax.swing.*;
import java.util.Map;

/**
 * @author kiwi0
 */
public class EncasedIndustrialBeam extends ItemBase {

  public EncasedIndustrialBeam(double num, Map<Item, JComboBox<String>> alternateRecipes, JTextArea output) {
    super(num, alternateRecipes, output, Item.ENCASED_INDUSTRIAL_BEAM);

    switch (getAlternateRecipeSelectedItem()) {
      case "Default":
        defaultEIB();
        break;
      case "Pipe":
        pipeEIB();
        break;
    }
  }

  public void defaultEIB() {
    double steelBeam = num * 4;
    double concrete = num * 5;
    append(ds.format(num) + " Encased Industrial Beam / Minute:  " + ds.format(steelBeam) + " Steel Beam / minute |  " +
        ds.format(concrete) + " Concrete / minute. Requires  " + ds.format(num / 6) + " Assemblers\n\n");
    new SteelBeam(steelBeam, alternateRecipes, output);
    append("-\n\n");
    new Concrete(concrete, alternateRecipes, output);
  }

  public void pipeEIB() {
    double steelPipe = num * 7;
    double concrete = num * 5;
    append(ds.format(num) + " Encased Industrial Pipe / Minute:  " + ds.format(steelPipe) + " Steel Pipe / minute |  " +
        ds.format(concrete) + " Concrete / minute. Requires  " + ds.format(num / 4) + " Assemblers\n\n");
    new SteelPipe(steelPipe, alternateRecipes, output);
    append("-\n\n");
    new Concrete(concrete, alternateRecipes, output);

  }

}
