package com.kodilla.patterns2.adapter.company.oldhrsystem;

public class Workers {
    private String [] [] workers = {
            {"66052314258", "John", "Smith"},
            {"87072125836", "Tom", "Novak"},
            {"63122325814", "Bil", "Kowalski"},
            {"66091515975", "Ana", "Cruz"},
            {"652032825819", "Clara", "Or"}};

    private double [] salaries = {
            4500.00, 3700.00, 4350.00, 9000.00, 6200.00};

    public String getWorkers(int n) {
        if(n > salaries.length) {
            return "";
        }
        return workers[n][0] + ", " + workers[n][1] + ", " + workers[n][2] + ", " + salaries[n];
    }

    public String[][] getWorkers(){
        return workers;
    }

    public double[] getSalaries() {
        return salaries;
    }
}
