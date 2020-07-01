/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package master;


import item.Item;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import static item.Item.*;

/**
 * @author kiwi0
 */
public final class CalculatorFrame extends JFrame {

  /**
   * Creates new form CalculatorFrame
   */

  public CalculatorFrame() {
    initComponents();
  }

  /**
   * This method is called from within the constructor to initialize the form.
   * WARNING: Do NOT modify this code. The content of this method is always
   * regenerated by the Form Editor.
   */
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jScrollPane2 = new JScrollPane();
    jTextArea1 = new JTextArea();
    jPopupMenu1 = new JPopupMenu();
    jPanel1 = new JPanel();
    itemSelection = new JComboBox<>();
    jLabel3 = new JLabel();
    jPanel2 = new JPanel();
    IronRecipe = new JComboBox<>();
    CopperRecipe = new JComboBox<>();
    CateriumRecipe = new JComboBox<>();
    SteelRecipe = new JComboBox<>();
    ConcreteRecipe = new JComboBox<>();
    SilicaRecipe = new JComboBox<>();
    WireRecipe = new JComboBox<>();
    QuartzCrystalRecipe = new JComboBox<>();
    RIPRecipe = new JComboBox<>();
    BeaconRecipe = new JComboBox<>();
    StatorRecipe = new JComboBox<>();
    ModularFrameRecipe = new JComboBox<>();
    HeavyModularFrameRecipe = new JComboBox<>();
    ComputerRecipe = new JComboBox<>();
    ScrewRecipe = new JComboBox<>();
    VersatileFrameworkRecipe = new JComboBox<>();
    SmartPlatingRecipe = new JComboBox<>();
    TurboFuelRecipe = new JComboBox<>();
    PlasticRecipe = new JComboBox<>();
    RubberRecipe = new JComboBox<>();
    RotorRecipe = new JComboBox<>();
    EncasedIndustrialBeamRecipe = new JComboBox<>();
    CircuitBoardRecipe = new JComboBox<>();
    CrystalOscillatorRecipe = new JComboBox<>();
    MotorRecipe = new JComboBox<>();
    AutomatedWiringRecipe = new JComboBox<>();
    QuickwireRecipe = new JComboBox<>();
    TurboMotorRecipe = new JComboBox<>();
    UraniumCellRecipe = new JComboBox<>();
    ElectromagneticControlRodRecipe = new JComboBox<>();
    NuclearFuelRodRecipe = new JComboBox<>();
    AluminumIngotRecipe = new JComboBox<>();
    AluminumScrapRecipe = new JComboBox<>();
    IronRodRecipe = new JComboBox<>();
    IronPlateRecipe = new JComboBox<>();
    CopperSheetRecipe = new JComboBox<>();
    FuelRecipe = new JComboBox<>();
    CableRecipe = new JComboBox<>();
    HighSpeedConnectorRecipe = new JComboBox<>();
    HeatSinkRecipe = new JComboBox<>();
    RadioControlUnitRecipe = new JComboBox<>();
    BlackPowderRecipe = new JComboBox<>();
    jPanel3 = new JPanel();
    jLabel1 = new JLabel();
    jLabel4 = new JLabel();
    jLabel6 = new JLabel();
    jLabel8 = new JLabel();
    jLabel10 = new JLabel();
    jLabel12 = new JLabel();
    jLabel13 = new JLabel();
    jLabel16 = new JLabel();
    jLabel18 = new JLabel();
    jLabel23 = new JLabel();
    jLabel24 = new JLabel();
    jLabel26 = new JLabel();
    jLabel28 = new JLabel();
    jLabel30 = new JLabel();
    jLabel19 = new JLabel();
    jLabel32 = new JLabel();
    jLabel33 = new JLabel();
    jLabel37 = new JLabel();
    jLabel39 = new JLabel();
    jLabel41 = new JLabel();
    jLabel43 = new JLabel();
    jPanel4 = new JPanel();
    jLabel2 = new JLabel();
    jLabel5 = new JLabel();
    jLabel7 = new JLabel();
    jLabel9 = new JLabel();
    jLabel11 = new JLabel();
    jLabel14 = new JLabel();
    jLabel15 = new JLabel();
    jLabel17 = new JLabel();
    jLabel20 = new JLabel();
    jLabel22 = new JLabel();
    jLabel25 = new JLabel();
    jLabel27 = new JLabel();
    jLabel29 = new JLabel();
    jLabel21 = new JLabel();
    jLabel31 = new JLabel();
    jLabel34 = new JLabel();
    jLabel36 = new JLabel();
    jLabel38 = new JLabel();
    jLabel40 = new JLabel();
    jLabel42 = new JLabel();
    jLabel44 = new JLabel();
    jLabel35 = new JLabel();
    jLabelAlternate = new JLabel();
    amountWantedTextField = new JTextField();
    jScrollPane1 = new JScrollPane();
    outputTextArea = new JTextArea();
    CalculateButton = new JButton();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    setTitle("SatisfactoryCalculator");
    setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
    setMaximumSize(new java.awt.Dimension(1024, 712));
    setMinimumSize(new java.awt.Dimension(1024, 712));
    setResizable(false);

    jTextArea1.setColumns(20);
    jTextArea1.setRows(5);
    jScrollPane2.setViewportView(jTextArea1);

    jLabelAlternate.setFont(new java.awt.Font("Courier New", Font.BOLD, 18)); // NOI18N
    jLabelAlternate.setText("Alternate Recipes");
    jPanel1.add(jLabelAlternate);
    jLabelAlternate.setBounds(670, 30, 210, 21);

    setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

    jPanel1.setBackground(new java.awt.Color(226, 104, 17));
    jPanel1.setLayout(null);

    itemSelection.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"AILimiter", "AdaptiveControlUnit", "AlcadAluminumSheet", "AluminumScrap", "AluminaSolution", "AluminumIngot", "AutomatedWiring", "Battery", "Beacon", "BlackPowder", "Cable", "CateriumIngot", "CircuitBoard", "CompactedCoal", "Computer", "Concrete", "CopperIngot", "CopperSheet", "CrystalOscillator", "ElectromagneticControlRod", "EncasedIndustrialBeam", "EncasedUraniumCell", "Fuel", "HeatSink", "HeavyModularFrame", "HeavyOilResidue", "HighSpeedConnector", "IronIngot", "IronPlate", "IronRod", "ModularEngine", "ModularFrame", "Motor", "NuclearFuelRod", "PetroleumCoke", "Plastic", "QuartzCrystal", "Quickwire", "RadioControlUnit", "ReinforcedIronPlate", "Rotor", "Rubber", "Screw", "Silica", "SmartPlating", "Stator", "SteelBeam", "SteelIngot", "SteelPipe", "SulfuricAcid", "Supercomputer", "TurboFuel", "TurboMotor", "UraniumPellet", "VersatileFramework", "Wire"}));
    jPanel1.add(itemSelection);
    itemSelection.setBounds(80, 10, 160, 30);
    itemSelection.setFont(new java.awt.Font("SansSerif", Font.BOLD, 12));

    jLabel3.setFont(new java.awt.Font("Tahoma", Font.BOLD, 24)); // NOI18N
    jLabel3.setText("Item:");
    jPanel1.add(jLabel3);
    jLabel3.setBounds(10, 10, 68, 29);

    jPanel2.setBorder(BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
    jPanel2.setOpaque(false);
    jPanel2.setLayout(new java.awt.GridLayout(21, 2));

    IronRecipe.setBackground(new java.awt.Color(204, 204, 204));
    IronRecipe.setModel(new DefaultComboBoxModel<>(new String[]{"Default", "Pure", "Alloy"}));
    IronRecipe.setBorder(BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
    jPanel2.add(IronRecipe);

    CopperRecipe.setBackground(new java.awt.Color(204, 204, 204));
    CopperRecipe.setModel(new DefaultComboBoxModel<>(new String[]{"Default", "Pure", "Alloy"}));
    CopperRecipe.setBorder(BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
    jPanel2.add(CopperRecipe);

    CateriumRecipe.setBackground(new java.awt.Color(204, 204, 204));
    CateriumRecipe.setModel(new DefaultComboBoxModel<>(new String[]{"Default", "Pure"}));
    CateriumRecipe.setBorder(BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
    jPanel2.add(CateriumRecipe);

    SteelRecipe.setBackground(new java.awt.Color(204, 204, 204));
    SteelRecipe.setModel(new DefaultComboBoxModel<>(new String[]{"Default", "Coke", "Compacted", "Solid"}));
    SteelRecipe.setBorder(BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
    jPanel2.add(SteelRecipe);

    ConcreteRecipe.setBackground(new java.awt.Color(204, 204, 204));
    ConcreteRecipe.setModel(new DefaultComboBoxModel<>(new String[]{"Default", "Rubber", "Wet", "Fine"}));
    ConcreteRecipe.setBorder(BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
    jPanel2.add(ConcreteRecipe);

    SilicaRecipe.setBackground(new java.awt.Color(204, 204, 204));
    SilicaRecipe.setModel(new DefaultComboBoxModel<>(new String[]{"Default", "Cheap"}));
    SilicaRecipe.setBorder(BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
    jPanel2.add(SilicaRecipe);

    WireRecipe.setBackground(new java.awt.Color(204, 204, 204));
    WireRecipe.setModel(new DefaultComboBoxModel<>(new String[]{"Default", "Fused", "Iron", "Caterium"}));
    WireRecipe.setBorder(BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
    jPanel2.add(WireRecipe);

    QuartzCrystalRecipe.setBackground(new java.awt.Color(204, 204, 204));
    QuartzCrystalRecipe.setModel(new DefaultComboBoxModel<>(new String[]{"Default", "Pure"}));
    QuartzCrystalRecipe.setBorder(BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
    jPanel2.add(QuartzCrystalRecipe);

    RIPRecipe.setBackground(new java.awt.Color(204, 204, 204));
    RIPRecipe.setModel(new DefaultComboBoxModel<>(new String[]{"Default", "Adhered", "Bolted", "Stitched"}));
    RIPRecipe.setBorder(BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
    jPanel2.add(RIPRecipe);

    BeaconRecipe.setBackground(new java.awt.Color(204, 204, 204));
    BeaconRecipe.setModel(new DefaultComboBoxModel<>(new String[]{"Default", "Signal"}));
    BeaconRecipe.setBorder(BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
    jPanel2.add(BeaconRecipe);

    StatorRecipe.setBackground(new java.awt.Color(204, 204, 204));
    StatorRecipe.setModel(new DefaultComboBoxModel<>(new String[]{"Default", "Quickwire"}));
    StatorRecipe.setBorder(BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
    jPanel2.add(StatorRecipe);

    ModularFrameRecipe.setBackground(new java.awt.Color(204, 204, 204));
    ModularFrameRecipe.setModel(new DefaultComboBoxModel<>(new String[]{"Default", "Bolted", "Steeled"}));
    ModularFrameRecipe.setBorder(BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
    jPanel2.add(ModularFrameRecipe);

    HeavyModularFrameRecipe.setBackground(new java.awt.Color(204, 204, 204));
    HeavyModularFrameRecipe.setModel(new DefaultComboBoxModel<>(new String[]{"Default", "Flexible", "Encased"}));
    HeavyModularFrameRecipe.setBorder(BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
    jPanel2.add(HeavyModularFrameRecipe);

    ComputerRecipe.setBackground(new java.awt.Color(204, 204, 204));
    ComputerRecipe.setModel(new DefaultComboBoxModel<>(new String[]{"Default", "Crystal", "Caterium"}));
    ComputerRecipe.setBorder(BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
    jPanel2.add(ComputerRecipe);

    ScrewRecipe.setBackground(new java.awt.Color(204, 204, 204));
    ScrewRecipe.setModel(new DefaultComboBoxModel<>(new String[]{"Default", "Casted", "Steel"}));
    ScrewRecipe.setBorder(BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
    jPanel2.add(ScrewRecipe);

    VersatileFrameworkRecipe.setBackground(new java.awt.Color(204, 204, 204));
    VersatileFrameworkRecipe.setModel(new DefaultComboBoxModel<>(new String[]{"Default", "Flexible"}));
    VersatileFrameworkRecipe.setBorder(BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
    jPanel2.add(VersatileFrameworkRecipe);

    SmartPlatingRecipe.setBackground(new java.awt.Color(204, 204, 204));
    SmartPlatingRecipe.setModel(new DefaultComboBoxModel<>(new String[]{"Default", "Plastic"}));
    SmartPlatingRecipe.setBorder(BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
    jPanel2.add(SmartPlatingRecipe);

    TurboFuelRecipe.setBackground(new java.awt.Color(204, 204, 204));
    TurboFuelRecipe.setModel(new DefaultComboBoxModel<>(new String[]{"Turbofuel", "Heavy Turbofuel"}));
    TurboFuelRecipe.setBorder(BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
    jPanel2.add(TurboFuelRecipe);

    PlasticRecipe.setBackground(new java.awt.Color(204, 204, 204));
    PlasticRecipe.setModel(new DefaultComboBoxModel<>(new String[]{"Default", "Residual", "Recycled", "Most Efficient"}));
    PlasticRecipe.setBorder(BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
    jPanel2.add(PlasticRecipe);

    RubberRecipe.setBackground(new java.awt.Color(204, 204, 204));
    RubberRecipe.setModel(new DefaultComboBoxModel<>(new String[]{"Default", "Residual", "Recycled", "Most Efficient"}));
    RubberRecipe.setBorder(BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
    jPanel2.add(RubberRecipe);

    RotorRecipe.setBackground(new java.awt.Color(204, 204, 204));
    RotorRecipe.setModel(new DefaultComboBoxModel<>(new String[]{"Default", "Copper", "Steel"}));
    RotorRecipe.setBorder(BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
    jPanel2.add(RotorRecipe);

    EncasedIndustrialBeamRecipe.setBackground(new java.awt.Color(204, 204, 204));
    EncasedIndustrialBeamRecipe.setModel(new DefaultComboBoxModel<>(new String[]{"Default", "Pipe"}));
    EncasedIndustrialBeamRecipe.setBorder(BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
    jPanel2.add(EncasedIndustrialBeamRecipe);

    CircuitBoardRecipe.setBackground(new java.awt.Color(204, 204, 204));
    CircuitBoardRecipe.setModel(new DefaultComboBoxModel<>(new String[]{"Default", "Electrode", "Silicone", "Caterium"}));
    CircuitBoardRecipe.setBorder(BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
    jPanel2.add(CircuitBoardRecipe);

    CrystalOscillatorRecipe.setBackground(new java.awt.Color(204, 204, 204));
    CrystalOscillatorRecipe.setModel(new DefaultComboBoxModel<>(new String[]{"Default", "Insulated"}));
    CrystalOscillatorRecipe.setBorder(BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
    jPanel2.add(CrystalOscillatorRecipe);

    MotorRecipe.setBackground(new java.awt.Color(204, 204, 204));
    MotorRecipe.setModel(new DefaultComboBoxModel<>(new String[]{"Default", "Rigour"}));
    MotorRecipe.setBorder(BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
    jPanel2.add(MotorRecipe);

    AutomatedWiringRecipe.setBackground(new java.awt.Color(204, 204, 204));
    AutomatedWiringRecipe.setModel(new DefaultComboBoxModel<>(new String[]{"Default", "High-Speed"}));
    AutomatedWiringRecipe.setBorder(BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
    jPanel2.add(AutomatedWiringRecipe);

    QuickwireRecipe.setBackground(new java.awt.Color(204, 204, 204));
    QuickwireRecipe.setModel(new DefaultComboBoxModel<>(new String[]{"Default", "Fused"}));
    QuickwireRecipe.setBorder(BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
    jPanel2.add(QuickwireRecipe);

    TurboMotorRecipe.setBackground(new java.awt.Color(204, 204, 204));
    TurboMotorRecipe.setModel(new DefaultComboBoxModel<>(new String[]{"Default", "Rigour"}));
    TurboMotorRecipe.setBorder(BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
    jPanel2.add(TurboMotorRecipe);

    UraniumCellRecipe.setBackground(new java.awt.Color(204, 204, 204));
    UraniumCellRecipe.setModel(new DefaultComboBoxModel<>(new String[]{"Default", "Encased"}));
    UraniumCellRecipe.setBorder(BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
    jPanel2.add(UraniumCellRecipe);

    ElectromagneticControlRodRecipe.setBackground(new java.awt.Color(204, 204, 204));
    ElectromagneticControlRodRecipe.setModel(new DefaultComboBoxModel<>(new String[]{"Default", "Connection"}));
    ElectromagneticControlRodRecipe.setBorder(BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
    jPanel2.add(ElectromagneticControlRodRecipe);

    NuclearFuelRodRecipe.setBackground(new java.awt.Color(204, 204, 204));
    NuclearFuelRodRecipe.setModel(new DefaultComboBoxModel<>(new String[]{"Default", "Unit"}));
    NuclearFuelRodRecipe.setBorder(BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
    jPanel2.add(NuclearFuelRodRecipe);

    AluminumIngotRecipe.setBackground(new java.awt.Color(204, 204, 204));
    AluminumIngotRecipe.setModel(new DefaultComboBoxModel<>(new String[]{"Default", "Pure"}));
    AluminumIngotRecipe.setBorder(BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
    jPanel2.add(AluminumIngotRecipe);

    AluminumScrapRecipe.setBackground(new java.awt.Color(204, 204, 204));
    AluminumScrapRecipe.setModel(new DefaultComboBoxModel<>(new String[]{"Default", "Electrode"}));
    AluminumScrapRecipe.setBorder(BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
    jPanel2.add(AluminumScrapRecipe);

    IronRodRecipe.setModel(new DefaultComboBoxModel<>(new String[]{"Default", "Steel"}));
    IronRodRecipe.setBorder(BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
    jPanel2.add(IronRodRecipe);

    IronPlateRecipe.setModel(new DefaultComboBoxModel<>(new String[]{"Default", "Coated", "Steel Coated"}));
    IronPlateRecipe.setBorder(BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
    jPanel2.add(IronPlateRecipe);

    CopperSheetRecipe.setModel(new DefaultComboBoxModel<>(new String[]{"Default", "Steamed"}));
    CopperSheetRecipe.setBorder(BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
    jPanel2.add(CopperSheetRecipe);

    FuelRecipe.setModel(new DefaultComboBoxModel<>(new String[]{"Default", "Residual", "Diluted"}));
    FuelRecipe.setBorder(BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
    jPanel2.add(FuelRecipe);

    CableRecipe.setModel(new DefaultComboBoxModel<>(new String[]{"Default", "Coated", "Insulated", "Quickwire"}));
    CableRecipe.setBorder(BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
    jPanel2.add(CableRecipe);

    HighSpeedConnectorRecipe.setModel(new DefaultComboBoxModel<>(new String[]{"Default", "Silicone"}));
    HighSpeedConnectorRecipe.setBorder(BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
    jPanel2.add(HighSpeedConnectorRecipe);

    HeatSinkRecipe.setModel(new DefaultComboBoxModel<>(new String[]{"Default", "Heat Exchanger"}));
    HeatSinkRecipe.setBorder(BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
    HeatSinkRecipe.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        HeatSinkRecipeActionPerformed(evt);
      }
    });
    jPanel2.add(HeatSinkRecipe);

    RadioControlUnitRecipe.setModel(new DefaultComboBoxModel<>(new String[]{"Default", "System"}));
    RadioControlUnitRecipe.setBorder(BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
    jPanel2.add(RadioControlUnitRecipe);

    BlackPowderRecipe.setModel(new DefaultComboBoxModel<>(new String[]{"Default", "Gun Powder"}));
    BlackPowderRecipe.setBorder(BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
    jPanel2.add(BlackPowderRecipe);

    jPanel1.add(jPanel2);
    jPanel2.setBounds(580, 50, 380, 650);

    jPanel3.setBorder(BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
    jPanel3.setMinimumSize(new java.awt.Dimension(26, 110));
    jPanel3.setPreferredSize(new java.awt.Dimension(26, 110));
    jPanel3.setLayout(new java.awt.GridLayout(21, 0));

    jLabel1.setIcon(new ImageIcon(Objects.requireNonNull(getClass().getClassLoader().getResource("IronIngot.png")))); // NOI18N
    jPanel3.add(jLabel1);

    jLabel4.setIcon(new ImageIcon(Objects.requireNonNull(getClass().getClassLoader().getResource("CateriumIngot.png")))); // NOI18N
    jPanel3.add(jLabel4);

    jLabel6.setIcon(new ImageIcon(Objects.requireNonNull(getClass().getClassLoader().getResource("Concrete.png")))); // NOI18N
    jPanel3.add(jLabel6);

    jLabel8.setIcon(new ImageIcon(Objects.requireNonNull(getClass().getClassLoader().getResource("Wire.png")))); // NOI18N
    jPanel3.add(jLabel8);

    jLabel10.setIcon(new ImageIcon(Objects.requireNonNull(getClass().getClassLoader().getResource("ReinforcedIronPlate.png")))); // NOI18N
    jPanel3.add(jLabel10);

    jLabel12.setIcon(new ImageIcon(Objects.requireNonNull(getClass().getClassLoader().getResource("Stator.png")))); // NOI18N
    jPanel3.add(jLabel12);

    jLabel13.setIcon(new ImageIcon(Objects.requireNonNull(getClass().getClassLoader().getResource("HeavyModularFrame.png")))); // NOI18N
    jPanel3.add(jLabel13);

    jLabel16.setIcon(new ImageIcon(Objects.requireNonNull(getClass().getClassLoader().getResource("Screw.png")))); // NOI18N
    jPanel3.add(jLabel16);

    jLabel18.setIcon(new ImageIcon(Objects.requireNonNull(getClass().getClassLoader().getResource("SmartPlating.png")))); // NOI18N
    jPanel3.add(jLabel18);

    jLabel23.setIcon(new ImageIcon(Objects.requireNonNull(getClass().getClassLoader().getResource("Plastic.png")))); // NOI18N
    jPanel3.add(jLabel23);

    jLabel24.setIcon(new ImageIcon(Objects.requireNonNull(getClass().getClassLoader().getResource("Rotor.png")))); // NOI18N
    jPanel3.add(jLabel24);

    jLabel26.setIcon(new ImageIcon(Objects.requireNonNull(getClass().getClassLoader().getResource("CircuitBoard.png")))); // NOI18N
    jPanel3.add(jLabel26);

    jLabel28.setIcon(new ImageIcon(Objects.requireNonNull(getClass().getClassLoader().getResource("Motor.png")))); // NOI18N
    jPanel3.add(jLabel28);

    jLabel30.setIcon(new ImageIcon(Objects.requireNonNull(getClass().getClassLoader().getResource("Quickwire.png")))); // NOI18N
    jPanel3.add(jLabel30);

    jLabel19.setIcon(new ImageIcon(Objects.requireNonNull(getClass().getClassLoader().getResource("UraniumCell.png")))); // NOI18N
    jPanel3.add(jLabel19);

    jLabel32.setIcon(new ImageIcon(Objects.requireNonNull(getClass().getClassLoader().getResource("NuclearFuelRod.png")))); // NOI18N
    jPanel3.add(jLabel32);

    jLabel33.setIcon(new ImageIcon(Objects.requireNonNull(getClass().getClassLoader().getResource("AluminumScrap.png")))); // NOI18N
    jPanel3.add(jLabel33);

    jLabel37.setIcon(new ImageIcon(Objects.requireNonNull(getClass().getClassLoader().getResource("IronPlate.png")))); // NOI18N
    jPanel3.add(jLabel37);

    jLabel39.setIcon(new ImageIcon(Objects.requireNonNull(getClass().getClassLoader().getResource("Fuel.png")))); // NOI18N
    jPanel3.add(jLabel39);

    jLabel41.setIcon(new ImageIcon(Objects.requireNonNull(getClass().getClassLoader().getResource("HighSpeedConnector.png")))); // NOI18N
    jPanel3.add(jLabel41);

    jLabel43.setIcon(new ImageIcon(Objects.requireNonNull(getClass().getClassLoader().getResource("RadioControlUnit.png")))); // NOI18N
    jPanel3.add(jLabel43);

    jPanel1.add(jPanel3);
    jPanel3.setBounds(550, 50, 30, 650);

    jPanel4.setBorder(BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
    jPanel4.setMinimumSize(new java.awt.Dimension(26, 110));
    jPanel4.setPreferredSize(new java.awt.Dimension(26, 110));
    jPanel4.setLayout(new java.awt.GridLayout(21, 0));

    jLabel2.setIcon(new ImageIcon(Objects.requireNonNull(getClass().getClassLoader().getResource("CopperIngot.png")))); // NOI18N
    jPanel4.add(jLabel2);

    jLabel5.setIcon(new ImageIcon(Objects.requireNonNull(getClass().getClassLoader().getResource("SteelIngot.png")))); // NOI18N
    jPanel4.add(jLabel5);

    jLabel7.setIcon(new ImageIcon(Objects.requireNonNull(getClass().getClassLoader().getResource("Silica.png")))); // NOI18N
    jPanel4.add(jLabel7);

    jLabel9.setIcon(new ImageIcon(Objects.requireNonNull(getClass().getClassLoader().getResource("QuartzCrystal.png")))); // NOI18N
    jPanel4.add(jLabel9);

    jLabel11.setIcon(new ImageIcon(Objects.requireNonNull(getClass().getClassLoader().getResource("Beacon.png")))); // NOI18N
    jPanel4.add(jLabel11);

    jLabel14.setIcon(new ImageIcon(Objects.requireNonNull(getClass().getClassLoader().getResource("ModularFrame.png")))); // NOI18N
    jPanel4.add(jLabel14);

    jLabel15.setIcon(new ImageIcon(Objects.requireNonNull(getClass().getClassLoader().getResource("Computer.png")))); // NOI18N
    jPanel4.add(jLabel15);

    jLabel17.setIcon(new ImageIcon(Objects.requireNonNull(getClass().getClassLoader().getResource("VersatileFramework.png")))); // NOI18N
    jPanel4.add(jLabel17);

    jLabel20.setIcon(new ImageIcon(Objects.requireNonNull(getClass().getClassLoader().getResource("Turbofuel.png")))); // NOI18N
    jPanel4.add(jLabel20);

    jLabel22.setIcon(new ImageIcon(Objects.requireNonNull(getClass().getClassLoader().getResource("Rubber.png")))); // NOI18N
    jPanel4.add(jLabel22);

    jLabel25.setIcon(new ImageIcon(Objects.requireNonNull(getClass().getClassLoader().getResource("EncasedIndustrialBeam.png")))); // NOI18N
    jPanel4.add(jLabel25);

    jLabel27.setIcon(new ImageIcon(Objects.requireNonNull(getClass().getClassLoader().getResource("CrystalOscillator.png")))); // NOI18N
    jPanel4.add(jLabel27);

    jLabel29.setIcon(new ImageIcon(Objects.requireNonNull(getClass().getClassLoader().getResource("AutomatedWiring.png")))); // NOI18N
    jPanel4.add(jLabel29);

    jLabel21.setIcon(new ImageIcon(Objects.requireNonNull(getClass().getClassLoader().getResource("Turbomotor.png")))); // NOI18N
    jPanel4.add(jLabel21);

    jLabel31.setIcon(new ImageIcon(Objects.requireNonNull(getClass().getClassLoader().getResource("ElectromagneticControlRod.png")))); // NOI18N
    jPanel4.add(jLabel31);

    jLabel34.setIcon(new ImageIcon(Objects.requireNonNull(getClass().getClassLoader().getResource("Aluminum.png")))); // NOI18N
    jPanel4.add(jLabel34);

    jLabel36.setIcon(new ImageIcon(Objects.requireNonNull(getClass().getClassLoader().getResource("IronRod.png")))); // NOI18N
    jPanel4.add(jLabel36);

    jLabel38.setIcon(new ImageIcon(Objects.requireNonNull(getClass().getClassLoader().getResource("CopperSheet.png")))); // NOI18N
    jPanel4.add(jLabel38);

    jLabel40.setIcon(new ImageIcon(Objects.requireNonNull(getClass().getClassLoader().getResource("Cable.png")))); // NOI18N
    jPanel4.add(jLabel40);

    jLabel42.setIcon(new ImageIcon(Objects.requireNonNull(getClass().getClassLoader().getResource("HeatSink.png")))); // NOI18N
    jPanel4.add(jLabel42);

    jLabel44.setIcon(new ImageIcon(Objects.requireNonNull(getClass().getClassLoader().getResource("BlackPowder.png")))); // NOI18N
    jPanel4.add(jLabel44);

    jPanel1.add(jPanel4);
    jPanel4.setBounds(960, 50, 30, 650);

    jLabel35.setFont(new java.awt.Font("Tahoma", Font.BOLD, 18)); // NOI18N
    jLabel35.setText("Amount Wanted:");
    jPanel1.add(jLabel35);
    jLabel35.setBounds(250, 10, 170, 29);

    amountWantedTextField.setHorizontalAlignment(JTextField.CENTER);
    amountWantedTextField.setText("Enter Number");
    amountWantedTextField.setMaximumSize(new java.awt.Dimension(73, 20));
    amountWantedTextField.setMinimumSize(new java.awt.Dimension(73, 20));
    amountWantedTextField.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        amountWantedTextFieldActionPerformed(evt);
      }
    });
    jPanel1.add(amountWantedTextField);
    amountWantedTextField.setBounds(410, 10, 100, 30);

    outputTextArea.setColumns(20);
    outputTextArea.setFont(new java.awt.Font("SansSerif", Font.BOLD, 10)); // NOI18N
    outputTextArea.setRows(5);
    outputTextArea.setBorder(BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
    jScrollPane1.setViewportView(outputTextArea);

    jPanel1.add(jScrollPane1);
    jScrollPane1.setBounds(10, 50, 530, 650);

    CalculateButton.setText("CALCULATE");
    CalculateButton.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        CalculateButtonActionPerformed(evt);
      }
    });
    jPanel1.add(CalculateButton);
    CalculateButton.setBounds(520, 10, 110, 30);

    GroupLayout layout = new GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, 1000, Short.MAX_VALUE)
                .addContainerGap())
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, 712, GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
    );

    pack();
    setLocationRelativeTo(null);
  }// </editor-fold>//GEN-END:initComponents

  private void amountWantedTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_amountWantedTextFieldActionPerformed
    //Intentionally left blank
  }//GEN-LAST:event_amountWantedTextFieldActionPerformed

  private void HeatSinkRecipeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HeatSinkRecipeActionPerformed
    //Intentionally left blank
  }//GEN-LAST:event_HeatSinkRecipeActionPerformed

  private void CalculateButtonActionPerformed(java.awt.event.ActionEvent evt) {
    //Reset the font size if the previous message was an error
    outputTextArea.setFont(outputTextArea.getFont().deriveFont(10f));

    /*
     * Changed list to a map, then if the index changes, it won't be a problem
     * Using an enum so that we know the values are strictly typed (As opposed to using a String)
     * This can also be moved to class level so that the map is only built once, instead of every time calculate is clicked
     */
    Map<Item, JComboBox<String>> alternateRecipes = new HashMap<>();
    alternateRecipes.put(IRON, IronRecipe); //0
    alternateRecipes.put(COPPER, CopperRecipe);
    alternateRecipes.put(CATERIUM, CateriumRecipe);
    alternateRecipes.put(STEEL, SteelRecipe);
    alternateRecipes.put(CONCRETE, ConcreteRecipe);
    alternateRecipes.put(SILICA, SilicaRecipe);
    alternateRecipes.put(WIRE, WireRecipe);
    alternateRecipes.put(QUARTZ_CRYSTAL, QuartzCrystalRecipe);
    alternateRecipes.put(RIP, RIPRecipe);
    alternateRecipes.put(BEACON, BeaconRecipe); //9
    alternateRecipes.put(STATOR, StatorRecipe);
    alternateRecipes.put(MODULAR_FRAME, ModularFrameRecipe);
    alternateRecipes.put(HEAVY_MODULAR_FRAME, HeavyModularFrameRecipe);
    alternateRecipes.put(COMPUTER, ComputerRecipe);
    alternateRecipes.put(SCREW, ScrewRecipe); //14
    alternateRecipes.put(VERSATILE_FRAMEWORK, VersatileFrameworkRecipe);
    alternateRecipes.put(SMART_PLATING, SmartPlatingRecipe);
    alternateRecipes.put(TURBO_FUEL, TurboFuelRecipe);
    alternateRecipes.put(PLASTIC, PlasticRecipe); //18
    alternateRecipes.put(RUBBER, RubberRecipe);//19
    alternateRecipes.put(ROTOR, RotorRecipe);
    alternateRecipes.put(ENCASED_INDUSTRIAL_BEAM, EncasedIndustrialBeamRecipe);
    alternateRecipes.put(CIRCUIT_BOARD, CircuitBoardRecipe);
    alternateRecipes.put(CRYSTAL_OSCILLATOR, CrystalOscillatorRecipe);
    alternateRecipes.put(MOTOR, MotorRecipe);
    alternateRecipes.put(AUTOMATED_WIRING, AutomatedWiringRecipe); //25
    alternateRecipes.put(QUICKWIRE, QuickwireRecipe);
    alternateRecipes.put(TURBO_MOTOR, TurboMotorRecipe);
    alternateRecipes.put(URANIUM_CELL, UraniumCellRecipe);
    alternateRecipes.put(ELECTROMAGNETIC_CONTROL_ROD, ElectromagneticControlRodRecipe);
    alternateRecipes.put(NUCLEAR_FUEL_ROD, NuclearFuelRodRecipe); //30
    alternateRecipes.put(ALUMINUM_INGOT, AluminumIngotRecipe);
    alternateRecipes.put(ALUMINUM_SCRAP, AluminumScrapRecipe);
    alternateRecipes.put(IRON_ROD, IronRodRecipe);
    alternateRecipes.put(IRON_PLATE, IronPlateRecipe);
    alternateRecipes.put(COPPER_SHEET, CopperSheetRecipe); //35
    alternateRecipes.put(FUEL, FuelRecipe); //36
    alternateRecipes.put(CABLE, CableRecipe);
    alternateRecipes.put(HIGH_SPEED_CONNECTOR, HighSpeedConnectorRecipe);
    alternateRecipes.put(HEAT_SINK, HeatSinkRecipe);
    alternateRecipes.put(RADIO_CONTROL_UNIT, RadioControlUnitRecipe);
    alternateRecipes.put(BLACK_POWDER, BlackPowderRecipe);
    outputTextArea.setText("");
    try {
      new Calculator(String.valueOf(itemSelection.getSelectedItem()), Double.parseDouble(amountWantedTextField.getText()), alternateRecipes, outputTextArea);
    } catch (Exception dumbass) {
      //Show the error message in red and slightly larger
      outputTextArea.append("Enter a number");
      new textHighlighter("Enter a number", java.awt.Color.RED, outputTextArea);
      outputTextArea.setFont(outputTextArea.getFont().deriveFont(15f));
      System.out.println("Enter a number");
    }

  }

  /**
   * @param args the command line arguments
   */
  public static void main(String args[]) {
    try {
      for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
        if ("Nimbus".equals(info.getName())) {
          UIManager.setLookAndFeel(info.getClassName());
          break;
        }
      }
    } catch (ClassNotFoundException | InstantiationException | UnsupportedLookAndFeelException | IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(CalculatorFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new CalculatorFrame().setVisible(true);
      }
    });
  }

  public JComboBox<String> getAluminumIngotRecipe() {
    ArrayList<JComboBox<String>> arraylist = new ArrayList<>();
    arraylist.add(AluminumScrapRecipe);
    return AluminumIngotRecipe;
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private static JComboBox<String> AluminumIngotRecipe;
  private static JComboBox<String> AluminumScrapRecipe;
  private static JComboBox<String> AutomatedWiringRecipe;
  private static JComboBox<String> BeaconRecipe;
  private static JComboBox<String> BlackPowderRecipe;
  private static JComboBox<String> CableRecipe;
  private JButton CalculateButton;
  private static JComboBox<String> CateriumRecipe;
  private static JComboBox<String> CircuitBoardRecipe;
  private static JComboBox<String> ComputerRecipe;
  private static JComboBox<String> ConcreteRecipe;
  private static JComboBox<String> CopperRecipe;
  private static JComboBox<String> CopperSheetRecipe;
  private static JComboBox<String> CrystalOscillatorRecipe;
  private static JComboBox<String> ElectromagneticControlRodRecipe;
  private static JComboBox<String> EncasedIndustrialBeamRecipe;
  private static JComboBox<String> FuelRecipe;
  private static JComboBox<String> HeatSinkRecipe;
  private static JComboBox<String> HeavyModularFrameRecipe;
  private static JComboBox<String> HighSpeedConnectorRecipe;
  private static JComboBox<String> IronPlateRecipe;
  private static JComboBox<String> IronRecipe;
  private static JComboBox<String> IronRodRecipe;
  private static JComboBox<String> ModularFrameRecipe;
  private static JComboBox<String> MotorRecipe;
  private static JComboBox<String> NuclearFuelRodRecipe;
  private static JComboBox<String> PlasticRecipe;
  private static JComboBox<String> QuartzCrystalRecipe;
  private static JComboBox<String> QuickwireRecipe;
  private static JComboBox<String> RIPRecipe;
  private static JComboBox<String> RadioControlUnitRecipe;
  private static JComboBox<String> RotorRecipe;
  private static JComboBox<String> RubberRecipe;
  private static JComboBox<String> ScrewRecipe;
  private static JComboBox<String> SilicaRecipe;
  private static JComboBox<String> SmartPlatingRecipe;
  private static JComboBox<String> StatorRecipe;
  private static JComboBox<String> SteelRecipe;
  private static JComboBox<String> TurboFuelRecipe;
  private static JComboBox<String> TurboMotorRecipe;
  private static JComboBox<String> UraniumCellRecipe;
  private static JComboBox<String> VersatileFrameworkRecipe;
  private static JComboBox<String> WireRecipe;
  public JTextField amountWantedTextField;
  private JComboBox<String> itemSelection;
  private static JLabel jLabel1;
  private static JLabel jLabel10;
  private static JLabel jLabel11;
  private static JLabel jLabel12;
  private static JLabel jLabel13;
  private static JLabel jLabel14;
  private static JLabel jLabel15;
  private static JLabel jLabel16;
  private static JLabel jLabel17;
  private static JLabel jLabel18;
  private static JLabel jLabel19;
  private static JLabel jLabel2;
  private static JLabel jLabel20;
  private static JLabel jLabel21;
  private static JLabel jLabel22;
  private static JLabel jLabel23;
  private static JLabel jLabel24;
  private static JLabel jLabel25;
  private static JLabel jLabel26;
  private static JLabel jLabel27;
  private static JLabel jLabel28;
  private static JLabel jLabel29;
  private JLabel jLabel3;
  private static JLabel jLabel30;
  private static JLabel jLabel31;
  private static JLabel jLabel32;
  private static JLabel jLabel33;
  private static JLabel jLabel34;
  private JLabel jLabel35;
  private JLabel jLabel36;
  private JLabel jLabel37;
  private JLabel jLabel38;
  private JLabel jLabel39;
  private static JLabel jLabel4;
  private JLabel jLabel40;
  private JLabel jLabel41;
  private JLabel jLabel42;
  private JLabel jLabel43;
  private JLabel jLabel44;
  private static JLabel jLabel5;
  private static JLabel jLabel6;
  private static JLabel jLabel7;
  private static JLabel jLabel8;
  private static JLabel jLabel9;
  private static JPanel jPanel1;
  private static JPanel jPanel2;
  private JLabel jLabelAlternate;
  private JPanel jPanel3;
  private JPanel jPanel4;
  private JPopupMenu jPopupMenu1;
  private JScrollPane jScrollPane1;
  private JScrollPane jScrollPane2;
  private JTextArea jTextArea1;
  public JTextArea outputTextArea;
  // End of variables declaration//GEN-END:variables
}
