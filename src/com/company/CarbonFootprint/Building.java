package com.company.CarbonFootprint;

public class Building implements CarbonFootprint {
    private String adress;
    private String classificationOfBuilding;
    private double electicityProMonth;
    private double gasProMonth;
    private double industrialProcessesCO2;

    private final double gasCO2 = 0.0551 / 28.32; //  m^3 CO2 / m^3 gas
    private final double electricityCO2 = 0.000707; // m^3 CO2 / KWh

    public Building(String adress, String classificationOfBuilding, double electicityProMonth,
                    double gasProMonth, double industrialProcessesCO2) {
        this.adress = adress;
        this.classificationOfBuilding = classificationOfBuilding;
        this.electicityProMonth = electicityProMonth;
        this.gasProMonth = gasProMonth;
        this.industrialProcessesCO2 = industrialProcessesCO2;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getClassificationOfBuilding() {
        return classificationOfBuilding;
    }

    public void setClassificationOfBuilding(String classificationOfBuilding) {
        this.classificationOfBuilding = classificationOfBuilding;
    }

    public double getElecticityProMonth() {
        return electicityProMonth;
    }

    public void setElecticityProMonth(double electicityProMonth) {
        this.electicityProMonth = electicityProMonth;
    }

    public double getGasProMonth() {
        return gasProMonth;
    }

    public void setGasProMonth(double gasProMonth) {
        this.gasProMonth = gasProMonth;
    }

    public double getIndustrialProcessesCO2() {
        return industrialProcessesCO2;
    }

    public void setIndustrialProcessesCO2(double industrialProcessesCO2) {
        this.industrialProcessesCO2 = industrialProcessesCO2;
    }

    public double getGasCO2() {
        return gasCO2;
    }

    public double getElectricityCO2() {
        return electricityCO2;
    }

    @Override
    public double carbonEmission() {
        return electricityCO2 * electicityProMonth + gasCO2 * getGasProMonth() + industrialProcessesCO2;
    }

    @Override
    public String toString() {
        return "Building{" +
                "adress='" + adress + '\'' +
                ", classificationOfBuilding='" + classificationOfBuilding + '\'' +
                ", electicityProMonth=" + electicityProMonth +
                ", gasProMonth=" + gasProMonth +
                ", industrialProcessesCO2=" + industrialProcessesCO2 +
                ", gasCO2=" + gasCO2 +
                ", electricityCO2=" + electricityCO2 +
                '}';
    }
}
