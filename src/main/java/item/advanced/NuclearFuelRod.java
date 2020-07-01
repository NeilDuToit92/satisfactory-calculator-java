package item.advanced;

import item.Item;
import item.ItemBase;
import item.intermediate.EncasedIndustrialBeam;
import master.textHighlighter;

import javax.swing.*;
import java.awt.*;
import java.util.Map;

public class NuclearFuelRod extends ItemBase {

  public NuclearFuelRod(double num, Map<Item, JComboBox<String>> alternateRecipes, JTextArea output) {
    super(num, alternateRecipes, output, Item.NUCLEAR_FUEL_ROD);

    switch (getAlternateRecipeSelectedItem()) {
      case "Default":
        defaultNuclearFuel();
        break;
      case "Unit":
        unitNuclearFuel();
        break;
    }
  }

  public void unitNuclearFuel() {
    double encasedUranium = num * (50 / 3.0);
    double electromagneticControlRods = num * (10 / 3.0);
    double crystalOscillators = num;
    double beacons = num * 2;
    append(ds.format(num) + " Nuclear Fuel Units / Minute:  " + ds.format(encasedUranium) + " Encased Uranium Cells / minute |  " +
        ds.format(electromagneticControlRods) + " Electromagnetic Control Rods / minute |  " + ds.format(crystalOscillators) + " Crystal Oscillators / Minute |  " +
        ds.format(beacons) + " Beacons / minute" +
        ". Requires  " + ds.format(num / 7.5) + " Manufacturers\n\n");

    append("v-Nuclear Fuel Units Start-v\n\n");
    new textHighlighter("v-Nuclear Fuel Units Start-v", Color.ORANGE, output);

    new EncasedUraniumCell(encasedUranium, alternateRecipes, output);
    append("-----\n\n");
    new ElectromagneticControlRod(electromagneticControlRods, alternateRecipes, output);
    append("-----\n\n");
    new CrystalOscillator(crystalOscillators, alternateRecipes, output);
    append("-----\n\n");
    new Beacon(beacons, alternateRecipes, output);

    append("^-Nuclear Fuel Units End-^\n\n");
    new textHighlighter("^-Nuclear Fuel Units End-^", Color.ORANGE, output);

  }

  public void defaultNuclearFuel() {
    double encasedUranium = num * 25;
    double electromagneticControlRod = num * 5;
    double encasedBeam = num * 3;
    append(ds.format(num) + " Nuclear Fuel Rods / Minute:  " + ds.format(encasedUranium) + " Encased Uranium Cells / minute |  " +
        ds.format(electromagneticControlRod) + " Electromagnetic Control Rods / minute |  " + ds.format(encasedBeam) + " Encased Industrial Beams / Minute" +
        ". Requires  " + ds.format(num / 10) + " Manufacturers\n\n");

    append("v-Nuclear Fuel Rod Start-v\n\n");
    new textHighlighter("v-Nuclear Fuel Rod Start-v", Color.ORANGE, output);
    new EncasedUraniumCell(encasedBeam, alternateRecipes, output);
    append("-----\n\n");
    new ElectromagneticControlRod(electromagneticControlRod, alternateRecipes, output);
    append("-----\n\n");
    new EncasedIndustrialBeam(encasedBeam, alternateRecipes, output);
    append("^-Nuclear Fuel Rod End-^\n\n");
    new textHighlighter("^-Nuclear Fuel Rod End-^", Color.ORANGE, output);
  }


}
