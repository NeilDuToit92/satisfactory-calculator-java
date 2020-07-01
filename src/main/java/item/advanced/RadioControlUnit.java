package item.advanced;

import item.Item;
import item.ItemBase;
import item.basic.QuartzCrystal;
import item.intermediate.HeatSink;
import item.intermediate.Rubber;
import master.textHighlighter;

import javax.swing.*;
import java.awt.*;
import java.util.Map;

public class RadioControlUnit extends ItemBase {

  public RadioControlUnit(double num, Map<Item, JComboBox<String>> alternateRecipes, JTextArea output) {
    super(num, alternateRecipes, output, Item.RADIO_CONTROL_UNIT);

    switch (getAlternateRecipeSelectedItem()) {
      case "Default":
        defaultRadio();
        break;
      case "System":
        systemRadio();
        break;
    }
  }

  public void defaultRadio() {
    double heatSink = num * 4;
    double rubber = num * 16;
    double crystalOscillators = num;
    double computers = num;
    append(ds.format(num) + " Radio Control Units / Minute:  " + ds.format(heatSink) + " Heat Sinks / minute |  " +
        ds.format(rubber) + " Rubber / minute |  " + ds.format(crystalOscillators) + " Crystal Oscillators / Minute |  " +
        ds.format(computers) + " Computers / minute" +
        ". Requires  " + ds.format(num / 2.5) + " Manufacturers\n\n");

    append("v-Radio Control Units Start-v\n\n");
    new textHighlighter("v-Radio Control Units Start-v", Color.red, output);

    new HeatSink(heatSink, alternateRecipes, output);
    append("-----\n\n");
    new Rubber(rubber, alternateRecipes, output);
    append("-----\n\n");
    new CrystalOscillator(crystalOscillators, alternateRecipes, output);
    append("-----\n\n");
    new Computer(computers, alternateRecipes, output);

    append("^-Radio Control Units End-^\n\n");
    new textHighlighter("^-Radio Control Units End-^", Color.red, output);
  }

  public void systemRadio() {
    double heatSink = num * (10 / 3.0);
    double supercomputers = num / 3;
    double quartzCrystals = num * 10;
    append(ds.format(num) + " Radio Control Systems / Minute:  " + ds.format(heatSink) + " Heat Sinks / minute |  " +
        ds.format(supercomputers) + " Supercomputers / minute |  " + ds.format(quartzCrystals) + " Quartz Crystals / Minute" +
        ". Requires  " + ds.format(num / 10) + " Manufacturers\n\n");

    append("v-Radio Control Systems Start-v\n\n");
    new textHighlighter("v-Radio Control Systems Start-v", Color.red, output);
    new HeatSink(heatSink, alternateRecipes, output);
    append("-----\n\n");
    new Supercomputer(supercomputers, alternateRecipes, output);
    append("-----\n\n");
    new QuartzCrystal(quartzCrystals, alternateRecipes, output);
    append("^-Radio Control Systems End-^\n\n");
    new textHighlighter("^-Radio Control Systems End-^", Color.red, output);
  }


}
