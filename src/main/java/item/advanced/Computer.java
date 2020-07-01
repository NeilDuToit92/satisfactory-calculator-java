package item.advanced;

import item.Item;
import item.ItemBase;
import item.basic.Cable;
import item.basic.Quickwire;
import item.basic.Screw;
import item.intermediate.CircuitBoard;
import item.intermediate.Plastic;
import item.intermediate.Rubber;
import master.textHighlighter;

import javax.swing.*;
import java.awt.*;
import java.util.Map;

public class Computer extends ItemBase {

  public Computer(double num, Map<Item, JComboBox<String>> alternateRecipes, JTextArea output) {
    super(num, alternateRecipes, output, Item.COMPUTER);

    switch (getAlternateRecipeSelectedItem()) {
      case "Default":
        defaultComputer();
        break;
      case "Crystal":
        crystalComputer();
        break;
      case "Caterium":
        cateriumComputer();
        break;
    }
  }

  public void defaultComputer() {
    double circuits = num * 10;
    double cable = num * 9;
    double plastic = num * 18;
    double screw = num * 52;
    append(ds.format(num) + " Computers / Minute:  " + ds.format(circuits) + " Circuit Boards / minute |  " +
        ds.format(cable) + " Cable / minute |  " + ds.format(plastic) + " Plastic / Minute |  " +
        ds.format(screw) + " Screws / minute" +
        ". Requires  " + ds.format(num / 2.5) + " Manufacturers\n\n");

    append("v-Computer Start-v\n\n");
    new textHighlighter("v-Computer Start-v", Color.cyan, output);

    new CircuitBoard(circuits, alternateRecipes, output);
    append("-----\n\n");
    new Cable(cable, alternateRecipes, output);
    append("-----\n\n");
    new Plastic(screw, alternateRecipes, output);
    append("-----\n\n");
    new Screw(screw, alternateRecipes, output);

    append("^-Computer End-^\n\n");
    new textHighlighter("^-Computer End-^", Color.cyan, output);

  }

  public void crystalComputer() {
    double circuits = num * (8 / 3.0);
    double CrystalOscillators = num;
    append(ds.format(num) + " Crystal Computers / Minute:  " + ds.format(circuits) + " Circuit Boards / minute |  " +
        ds.format(CrystalOscillators) + " Crystal Oscillators / minute. Requires  " + ds.format(num / 2.8125) + " Assemblers\n\n");

    append("v-Computer Start-v\n\n");
    new textHighlighter("v-Computer Start-v", Color.cyan, output);
    new CircuitBoard(circuits, alternateRecipes, output);
    append("-----\n\n");
    new CrystalOscillator(CrystalOscillators, alternateRecipes, output);
    append("^-Computer End-^\n\n");
    new textHighlighter("^-Computer End-^", Color.cyan, output);

  }

  public void cateriumComputer() {
    double circuits = num * 7;
    double quickWire = num * 28;
    double rubber = num * 12;
    append(ds.format(num) + " Caterium Computers / Minute:  " + ds.format(circuits) + " Circuit Boards / minute |  " +
        ds.format(quickWire) + " Quickwire / minute |  " + ds.format(rubber) + " Rubber / Minute" +
        ". Requires  " + ds.format(num / 3.75) + " Manufacturers\n\n");

    append("v-Computer Start-v\n\n");
    new textHighlighter("v-Computer Start-v", Color.cyan, output);
    new CircuitBoard(circuits, alternateRecipes, output);
    append("-----\n\n");
    new Rubber(rubber, alternateRecipes, output);
    append("-----\n\n");
    new Quickwire(quickWire, alternateRecipes, output);
    append("^-Computer End-^\n\n");
    new textHighlighter("^-Computer End-^", Color.cyan, output);
  }


}
