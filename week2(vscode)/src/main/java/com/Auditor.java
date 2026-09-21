package com;
import com.zut.Probe;

public class Auditor {
    public void inspect() {
        Probe p = new Probe();
        System.out.println("Public from Auditor: " + p._public);  // Accessible
      //System.out.println("Protected or package-private " + p._protected);  // Not accessible outside package
      //System.out.println("Default " + p._default);  // Not accessible outside package
       // System.out.println("Private " + p._private);  // Not accessible
    }
    
}
