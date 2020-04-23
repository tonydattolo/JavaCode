////////////////////////////////////////////////////////////////////////////////////
//  C212
//   
//  Released:  x/x/20
//
//  Lab 7
//  @Author  Tony Dattolo, tdattolo
//  Last Edited:  4/22/2020
//
//
//  Directions: JUnit Testing for Lab7
//               
//////////////////////////////////////////////////////////////////////////////////

package LabsMaven.Lab7Test;

import LabsMaven.Lab7.*;
import static org.junit.Assert.*;
import org.junit.*;

public class ComplexTester {


    StandardComplex z1 = new StandardComplex(-1, Math.sqrt(3));
    PolarComplex z2 = new PolarComplex(2, 5 * Math.PI / 3);

    @Test
    public void complexTest() {
        
        // assertEquals(expected, actual);

    }

}