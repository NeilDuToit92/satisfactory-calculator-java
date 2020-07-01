package item.advanced;

import item.Item;
import item.ItemBase;
import item.basic.SteelBeam;
import item.intermediate.ModularFrame;
import item.intermediate.Rubber;
import master.textHighlighter;

import javax.swing.*;
import java.awt.*;
import java.util.Map;

public class VersatileFramework extends ItemBase {

  public VersatileFramework(double num, Map<Item, JComboBox<String>> alternateRecipes, JTextArea output) {
    super(num, alternateRecipes, output, Item.VERSATILE_FRAMEWORK);

    switch (getAlternateRecipeSelectedItem()) {

      case "Default":
        defaultFramework();
        break;
      case "Flexible":
        flexibleFramework();
        break;
    }
  }

  public void defaultFramework() {
    double modularFrames = num / 2;
    double steelBeams = num * 6;
    append(ds.format(num) + " Versatile Framework / Minute:  " + ds.format(modularFrames) + " Modular Frames / minute |  " +
        ds.format(steelBeams) + " Steel Beams / minute. Requires  " + ds.format(num / 5) + " Assemblers\n\n");

    append("v-Versatile Framework Start-v\n\n");
    new textHighlighter("v-Versatile Framework Start-v", Color.magenta, output);
    new ModularFrame(modularFrames, alternateRecipes, output);
    append("-----\n\n");
    new SteelBeam(steelBeams, alternateRecipes, output);
    append("^-Versatile Framework End-^\n\n");
    new textHighlighter("^-Versatile Framework End-^", Color.magenta, output);
  }

  public void flexibleFramework() {
    double modularFrames = num / 2;
    double steelBeams = num * 3;
    double rubber = num * 4;
    append(ds.format(num) + " Flexible Versatile Framework / Minute:  " + ds.format(modularFrames) + " Modular Frames / minute |  " +
        ds.format(steelBeams) + " Steel Beams / minute |  " + ds.format(rubber) + " Rubber / Minute" +
        ". Requires  " + ds.format(num / 7.5) + " Manufacturers\n\n");

    append("v-Flexible Versatile Framework Start-v\n\n");
    new textHighlighter("v-Flexible Versatile Framework Start-v", Color.magenta, output);
    new ModularFrame(modularFrames, alternateRecipes, output);
    append("-----\n\n");
    new SteelBeam(steelBeams, alternateRecipes, output);
    append("-----\n\n");
    new Rubber(rubber, alternateRecipes, output);
    append("^-Flexible Versatile Framework End-^\n\n");
    new textHighlighter("^-Flexible Versatile Framework End-^", Color.magenta, output);

  }

}
