
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tddpart2;

import java.lang.reflect.InvocationTargetException;

import java.lang.reflect.Method;

public class TestCase {
    private String name;

    public TestCase(String name) {
        this.name = name;
    }
     public void run() throws SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException {
        Method method = this.getClass().getMethod(name);
        method.invoke(this);
        
  
     }
 }