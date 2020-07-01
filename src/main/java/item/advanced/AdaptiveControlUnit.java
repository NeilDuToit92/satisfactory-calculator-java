package item.advanced;

import item.Item;
import item.ItemBase;
import item.intermediate.CircuitBoard;
import master.textHighlighter;

import javax.swing.*;
import java.awt.*;
import java.util.Map;

public class AdaptiveControlUnit extends ItemBase {

  public AdaptiveControlUnit(double num, Map<Item, JComboBox<String>> alternateRecipes, JTextArea output) {
    super(num, alternateRecipes, output);
    defaultControlUnit();
  }

  public void defaultControlUnit() {
    double automatedWiring = num * (15 / 2.0);
    double circuitBoard = num * 5;
    double heavyFrames = num;
    double computers = num;
    append(ds.format(num) + " Adaptive Control Units / Minute:  " + ds.format(automatedWiring) + " Automated Wiring / minute |  " +
        ds.format(circuitBoard) + " Circuit Boards / minute |  " + ds.format(heavyFrames) + " Heavy Frames / Minute |  " +
        ds.format(computers) + " Computers / minute" +
        ". Requires  " + ds.format(num / 1) + " Manufacturers\n\n");


    append("v-Adaptive Control Unit Start-v\n\n");
    new textHighlighter("v-Adaptive Control Unit Start-v", new Color(19, 111, 203), output);

    new AutomatedWiring(automatedWiring, alternateRecipes, output);
    append("-----\n\n");
    new CircuitBoard(circuitBoard, alternateRecipes, output);
    append("-----\n\n");
    new HeavyModularFrame(heavyFrames, alternateRecipes, output);
    append("-----\n\n");
    new Computer(computers, alternateRecipes, output);

    append("^-Adaptive Control Unit End-^\n\n");
    new textHighlighter("^-Adaptive Control Unit End-^", new Color(19, 111, 203), output);


  }

}
