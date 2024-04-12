package FactoryPatternDemo;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * Represents a Rectangle shape that implements the Shape interface.
 * Provides the specific implementation of the draw method for drawing a rectangle.
 *
 * @author Ibaad Mohammed
 * @version 1.0
 */
public class Rectangle implements Shape {
    /**
     * Draws a rectangle.
     */
     @Override
    public void draw(){
        System.out.println("Inside Rectangle:draw() method.");
    }
    
}
