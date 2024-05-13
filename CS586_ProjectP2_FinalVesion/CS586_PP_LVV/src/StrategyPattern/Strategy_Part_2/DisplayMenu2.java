package StrategyPattern.Strategy_Part_2;

import StrategyPattern.*;

public class DisplayMenu2 extends DisplayMenu {
    @Override
    public void DisplayMenu() {
        System.out.println("Select Type:");
        System.out.println("->.Disel Type:");
        System.out.println("->.Regular Type:");
        System.out.println("->.Premium Type:");
    }
}