/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package org.linh.mathutil.test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.linh.mathutil.core.MathUtility;
/**
 *
 * @author Nguyen Huy Linh
 */
public class MathUtilityTest {
    @Test
    public void getFactorial_InputInt_ReturnsTrue()
    {
        assertEquals(1, MathUtility.getFactorial(0));
    }
}
