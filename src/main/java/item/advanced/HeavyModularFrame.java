package item.advanced;

import item.Item;
import item.ItemBase;
import item.basic.Concrete;
import item.basic.Screw;
import item.basic.SteelPipe;
import item.intermediate.EncasedIndustrialBeam;
import item.intermediate.ModularFrame;
import item.intermediate.Rubber;
import master.textHighlighter;

import javax.swing.*;
import java.awt.*;
import java.util.Map;

public class HeavyModularFrame extends ItemBase {

  public HeavyModularFrame(double num, Map<Item, JComboBox<String>> alternateRecipes, JTextArea output) {
    super(num, alternateRecipes, output, Item.HEAVY_MODULAR_FRAME);

    switch (getAlternateRecipeSelectedItem()) {
      case "Default":
        defaultHeavyFrame();
        break;
      case "Flexible":
        flexibleHeavyFrame();
        break;
      case "Encased":
        encasedHeavyFrame();
        break;
    }
  }

  public void defaultHeavyFrame() {
    double modularFrame = num * 5;
    double steelPipe = num * 15;
    double encasedIndustrialBeam = num * 5;
    double screw = num * 100;
    append(ds.format(num) + " Heavy Modular Frames / Minute:  " + ds.format(modularFrame) + " Modular Frames / minute  | " +
        ds.format(steelPipe) + " Steel Pipes / minute |  " + ds.format(encasedIndustrialBeam) + " Encased Industrial Beams / Minute |  " +
        ds.format(screw) + " Screws / minute" +
        ". Requires  " + ds.format(num / 2) + " Manufacturers\n\n");

    append("v-Heavy Modular Frame Start-v\n\n");
    new textHighlighter("v-Heavy Modular Frame Start-v", new Color(38, 136, 57), output);

    new ModularFrame(modularFrame, alternateRecipes, output);
    append("-----\n\n");
    new SteelPipe(steelPipe, alternateRecipes, output);
    append("-----\n\n");
    new EncasedIndustrialBeam(encasedIndustrialBeam, alternateRecipes, output);
    append("-----\n\n");
    new Screw(screw, alternateRecipes, output);

    append("^-Heavy Modular Frame End-^\n\n");
    new textHighlighter("^-Heavy Modular Frame End-^", new Color(38, 136, 57), output);
  }

  public void flexibleHeavyFrame() {
    double modularFrame = num * 5;
    double rubber = num * 20;
    double encasedIndustrialBeam = num * 3;
    double screw = num * 104;
    append(ds.format(num) + " Flexible Heavy Modular Frames / Minute:  " + ds.format(modularFrame) + " Modular Frames / minute |  " +
        ds.format(rubber) + " Rubber / minute |  " + ds.format(encasedIndustrialBeam) + " Encased Industrial Beams / Minute |  " +
        ds.format(screw) + " Screws / minute" +
        ". Requires  " + ds.format(num / 3.75) + " Manufacturers\n\n");

    append("v-Flexible Heavy Frame Start-v\n\n");
    new textHighlighter("v-Flexible Heavy Frame Start-v", new Color(38, 136, 57), output);

    new ModularFrame(modularFrame, alternateRecipes, output);
    append("-----\n\n");
    new Rubber(rubber, alternateRecipes, output);
    append("-----\n\n");
    new EncasedIndustrialBeam(encasedIndustrialBeam, alternateRecipes, output);
    append("-----\n\n");
    new Screw(screw, alternateRecipes, output);

    append("^-Flexible Heavy Frame End-^\n\n");
    new textHighlighter("^-Flexible Heavy Frame End-^", new Color(38, 136, 57), output);

  }

  public void encasedHeavyFrame() {
    double modularFrame = num * (8 / 3.0);
    double steelPipe = num * 12;
    double encasedIndustrialBeam = num * (10 / 3.0);
    double concrete = num * (22 / 3.0);
    append(ds.format(num) + " Encased Heavy Modular Frames / Minute:  " + ds.format(modularFrame) + " Modular Frames / minute |  " +
        ds.format(steelPipe) + " Steel Pipes / minute |  " + ds.format(encasedIndustrialBeam) + " Encased Industrial Beams / Minute |  " +
        ds.format(concrete) + " Concrete / minute" +
        ". Requires " + ds.format(num / 2.8125) + " Manufacturers\n\n");

    append("v-Encased Heavy Frame Start-v\n\n");
    new textHighlighter("v-Encased Heavy Frame Start-v", new Color(38, 136, 57), output);

    new ModularFrame(modularFrame, alternateRecipes, output);
    append("-----\n\n");
    new SteelPipe(steelPipe, alternateRecipes, output);
    append("-----\n\n");
    new EncasedIndustrialBeam(encasedIndustrialBeam, alternateRecipes, output);
    append("-----\n\n");
    new Concrete(concrete, alternateRecipes, output);

    append("^-Encased Heavy Frame End-^\n\n");
    new textHighlighter("^-Encased Heavy Frame End-^", new Color(38, 136, 57), output);
  }


}
