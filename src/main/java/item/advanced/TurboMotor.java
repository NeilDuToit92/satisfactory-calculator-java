package item.advanced;

import item.Item;
import item.ItemBase;
import item.intermediate.*;

import javax.swing.*;
import java.util.Map;

public class TurboMotor extends ItemBase {

  public TurboMotor(double num, Map<Item, JComboBox<String>> alternateRecipes, JTextArea output) {
    super(num, alternateRecipes, output, Item.TURBO_MOTOR);

    switch (getAlternateRecipeSelectedItem()) {
      case "Default":
        defaultTurboMotor();
        break;
      case "Rigour":
        rigourTurboMotor();
        break;
    }
  }

  public void defaultTurboMotor() {
    double heatSinks = num * 4;
    double radioControlUnits = num * 2;
    double motors = num * 4;
    double rubber = num * 24;
    append(ds.format(num) + " Turbo Motors / Minute:  " + ds.format(heatSinks) + " Heat Sinks / minute |  " +
        ds.format(radioControlUnits) + " Radio Control Units / minute |  " + ds.format(motors) + " Motors / Minute |  " +
        ds.format(rubber) + " Rubber / minute" +
        ". Requires  " + ds.format(num / 1.875) + " Manufacturers\n");

    append("{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}\n");
    new HeatSink(heatSinks, alternateRecipes, output);
    append("{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}\n");
    new RadioControlUnit(radioControlUnits, alternateRecipes, output);
    append("{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}\n");
    new Motor(motors, alternateRecipes, output);
    append("{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}\n");
    new Rubber(rubber, alternateRecipes, output);
  }

  public void rigourTurboMotor() {
    double motors = num * (7 / 3.0);
    double radioControlUnits = num * (5 / 3.0);
    double aiLimiters = num * 3;
    double stators = num * (7 / 3.0);
    append(ds.format(num) + " Turbomotors / Minute:  " + ds.format(motors) + " Motors / minute |  " +
        ds.format(radioControlUnits) + " Radio Control Units / minute |  " + ds.format(aiLimiters) + " AI Limiters / Minute |  " +
        ds.format(stators) + " Stators / minute" +
        ". Requires  " + ds.format(num / 2.8125) + " Manufacturers\n");

    append("{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}\n\n");
    new Motor(motors, alternateRecipes, output);
    append("{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}\n\n");
    new RadioControlUnit(aiLimiters, alternateRecipes, output);
    append("{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}\n\n");
    new AILimiter(aiLimiters, alternateRecipes, output);
    append("{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}\n\n");
    new Stator(stators, alternateRecipes, output);
  }

}
