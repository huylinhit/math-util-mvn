/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package org.linh.mathutil.test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.linh.mathutil.core.MathUtility;

/**
 *
 * @author Nguyen Huy Linh
 */
public class MathUtilityAdvancedTest {

    //Hàm trả về mảng 2 chiều, Wrapper Class/Object
    //Mảng chứa các cặp n -> expected, ví dụ 0! -> 1; 
    public static Object[][] initTestData() {
        Object[][] testData = {
            {2, 1},
            {3, 2},
            {4, 6},
            {5, 24},
            {6, 120},
            {7, 720}

        };

        return testData;
    }

    @ParameterizedTest
    @MethodSource(value = "initTestData")
    public void getFactorial_InputInt_ReturnsTrue(int n, long expected) {
        assertEquals(expected, MathUtility.getFactorial(n));
    }

}
