package item.advanced;

import item.Item;
import item.ItemBase;
import item.basic.*;
import master.textHighlighter;

import javax.swing.*;
import java.awt.*;
import java.util.Map;

public class Beacon extends ItemBase {

  public Beacon(double num, Map<Item, JComboBox<String>> alternateRecipes, JTextArea output) {
    super(num, alternateRecipes, output, Item.BEACON);

    switch (getAlternateRecipeSelectedItem()) {
      case "Default":
        defaultBeacon();
        break;
      case "Signal":
        signalBeacon();
        break;
    }
  }

  public void defaultBeacon() {
    double ironPlates = num * 3;
    double ironRods = num;
    double wire = num * 15;
    double cable = num * 2;
    append(ds.format(num) + " Beacons / Minute:  " + ds.format(ironPlates) + " Iron Plates / minute |  " +
        ds.format(ironRods) + " Iron Rods / minute |  " + ds.format(wire) + " Wire / Minute |  " +
        ds.format(cable) + " Cable / minute" +
        ". Requires  " + ds.format(num / 7.5) + " Manufacturers\n\n");

    append("v-Beacon Start-v\n\n");
    new textHighlighter("v-Beacon Start-v", new Color(180, 15, 53), output);

    new IronPlate(ironPlates, alternateRecipes, output);
    append("-----\n\n");
    new IronRod(ironRods, alternateRecipes, output);
    append("-----\n\n");
    new Wire(wire, alternateRecipes, output);
    append("-----\n\n");
    new Cable(cable, alternateRecipes, output);

    append("^-Beacon End-^\n\n");
    new textHighlighter("^-Beacon End-^", new Color(180, 15, 53), output);
  }

  public void signalBeacon() {
    double steelBeam = num / 5;
    double steelPipe = num * (4 / 5.0);
    double crystalOscillator = num / 20;
    append(ds.format(num) + " Signal Beacons / Minute:  " + ds.format(steelBeam) + " Steel Beams / minute |  " +
        ds.format(steelPipe) + " Steel Pipes / minute |  " + ds.format(crystalOscillator) + " Crystal Oscillators / Minute" +
        ". Requires  " + ds.format(num / 10) + " Manufacturers\n\n");

    append("v-Signal Beacon Start-v\n\n");
    new textHighlighter("v-Signal Beacon Start-v", new Color(180, 15, 53), output);

    new SteelBeam(steelBeam, alternateRecipes, output);
    append("-----\n\n");
    new SteelPipe(steelPipe, alternateRecipes, output);
    append("-----\n\n");
    new CrystalOscillator(crystalOscillator, alternateRecipes, output);

    append("^-Signal Beacon End-^\n\n");
    new textHighlighter("^-Signal Beacon End-^", new Color(180, 15, 53), output);


  }


}
