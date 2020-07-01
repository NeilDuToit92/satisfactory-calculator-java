/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package item.intermediate;

import item.Item;
import item.ItemBase;
import item.advanced.CrystalOscillator;
import item.basic.Rotor;
import master.textHighlighter;

import javax.swing.*;
import java.awt.*;
import java.util.Map;

/**
 * @author kiwi0
 */
public class Motor extends ItemBase {

  public Motor(double num, Map<Item, JComboBox<String>> alternateRecipes, JTextArea output) {
    super(num, alternateRecipes, output, Item.MOTOR);

    switch (getAlternateRecipeSelectedItem()) {
      case "Default":
        defaultMotor();
        break;
      case "Rigour":
        rigourMotor();
        break;
    }
  }

  public void defaultMotor() {
    double rotor = num * 2;
    double stator = num * 2;
    append(ds.format(num) + " Motors / Minute:  " + ds.format(rotor) + " Rotors / minute |  " +
        ds.format(stator) + " Stators / minute. Requires  " + ds.format(num / 5) + " Assemblers\n\n");

    append("v-Motor Start-v\n\n");
    new textHighlighter("v-Motor Start-v", new Color(255, 108, 0), output);
    new Rotor(rotor, alternateRecipes, output);
    append("-----\n\n");
    new Stator(stator, alternateRecipes, output);
    append("^-Motor End-^\n\n");
    new textHighlighter("^-Motor End-^", new Color(255, 108, 0), output);

  }

  public void rigourMotor() {
    double rotor = num / 2;
    double stator = num / 2;
    double crystalOscillator = num / 6;
    append(ds.format(num) + " Rigour Motors / Minute:  " + ds.format(rotor) + " Rotors / minute |  " +
        ds.format(stator) + " Stators / minute |  " + ds.format(crystalOscillator) + " Crystal Oscillators / Minute" +
        ". Requires  " + ds.format(num / 5) + " Assemblers\n\n");

    append("v-Rigour Motor Start-v\n\n");
    new textHighlighter("v-Rigour Motor Start-v", new Color(255, 108, 0), output);
    new Rotor(rotor, alternateRecipes, output);
    append("-----\n\n");
    new Stator(stator, alternateRecipes, output);
    append("-----\n\n");
    new CrystalOscillator(crystalOscillator, alternateRecipes, output);
    append("^-Rigour Motor End-^\n\n");
    new textHighlighter("^-Rigour Motor End-^", new Color(255, 108, 0), output);

  }


}
