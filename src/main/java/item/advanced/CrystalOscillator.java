package item.advanced;

import item.Item;
import item.ItemBase;
import item.basic.Cable;
import item.basic.QuartzCrystal;
import item.basic.ReinforcedIronPlate;
import item.intermediate.AILimiter;
import item.intermediate.Rubber;
import master.textHighlighter;

import javax.swing.*;
import java.awt.*;
import java.util.Map;

public class CrystalOscillator extends ItemBase {

  public CrystalOscillator(double num, Map<Item, JComboBox<String>> alternateRecipes, JTextArea output) {
    super(num, alternateRecipes, output, Item.CRYSTAL_OSCILLATOR);

    switch (getAlternateRecipeSelectedItem()) {
      case "Default":
        defaultCrystalOscillators();
        break;
      case "Insulated":
        insulatedCrystalOscillators();
        break;
    }
  }

  public void defaultCrystalOscillators() {
    double quartzCrystal = num * 18;
    double cable = num * 14;
    double reinforcedIronPlate = num * (5 / 2.0);
    append(ds.format(num) + " Crystal Oscillators / Minute:  " + ds.format(quartzCrystal) + " Quartz Crystal / minute |  " +
        ds.format(cable) + " Cable / minute |  " + ds.format(reinforcedIronPlate) + " R.I.P / Minute" +
        ". Requires  " + ds.format(num / 1) + " Manufacturers\n\n");

    append("v-Crystal Oscillator Start-v\n\n");
    new textHighlighter("v-Crystal Oscillator Start-v", new Color(162, 117, 175), output);
    new QuartzCrystal(quartzCrystal, alternateRecipes, output);
    append("-----\n\n");
    new Cable(cable, alternateRecipes, output);
    append("-----\n\n");
    new ReinforcedIronPlate(reinforcedIronPlate, alternateRecipes, output);
    append("^-Crystal Oscillator End-^\n\n");
    new textHighlighter("^-Crystal Oscillator End-^", new Color(162, 117, 175), output);

  }

  public void insulatedCrystalOscillators() {
    double quartzCrystal = num * 10;
    double rubber = num * 7;
    double aiLimiter = num;
    append(ds.format(num) + " Insulated Crystal Oscillators / Minute:  " + ds.format(quartzCrystal) + " Quartz Crystal / minute |  " +
        ds.format(rubber) + " Rubber / minute |  " + ds.format(aiLimiter) + " AI Limiters / Minute" +
        ". Requires  " + ds.format(num / 1.875) + " Manufacturers\n\n");

    append("v-Insulated Crystal Oscillator-v\n\n");
    new textHighlighter("v-Insulated Crystal Oscillator-v", new Color(162, 117, 175), output);

    new QuartzCrystal(quartzCrystal, alternateRecipes, output);
    append("-----\n\n");
    new Rubber(rubber, alternateRecipes, output);
    append("-----\n\n");
    new AILimiter(aiLimiter, alternateRecipes, output);

    append("^-Insulated Crystal Oscillator-^\n\n");
    new textHighlighter("^-Insulated Crystal Oscillator-^", new Color(162, 117, 175), output);


  }


}
