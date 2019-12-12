package com.company.PayrollModifyed;

public class PieceWorker extends Employee2 {
    private int wage;
    private double nomberOfPieces;

    public PieceWorker(String firstName, String lastName, String socialSecurityNumber, int wage, double nomberOfPieces) {
        super(firstName, lastName, socialSecurityNumber);
        this.wage = wage;
        this.nomberOfPieces = nomberOfPieces;
    }

    public int getWage() {
        return wage;
    }

    public void setWage(int wage) {
        this.wage = wage;
    }

    public double getNomberOfPieces() {
        return nomberOfPieces;
    }

    public void setNomberOfPieces(double nomberOfPieces) {
        this.nomberOfPieces = nomberOfPieces;
    }

    @Override
    public double earnings() {
        return wage * nomberOfPieces;
    }

    @Override
    public String toString() {
        return "PieceWorker{" +
                super.toString() +
                "wage=" + wage +
                ", nomberOfPieces=" + nomberOfPieces +
                '}';
    }
}
