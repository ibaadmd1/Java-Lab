package FactoryPatternDemo;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * Represents a Square shape that implements the Shape interface.
 * Provides the specific implementation of the draw method for drawing a square.
 *
 * @author Ibaad Mohammed
 * @version 1.0
 */
public class Square implements Shape {
    /**
     * Draws a square.
     */
     @Override
    public void draw(){
        System.out.println("Inside Square:draw() method.");
    }
    
    
}
