/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.japo.java.main;

import java.util.Random;

/**
 *
 * @author CicloM
 */
public class Main {

    public static final Random RND = new Random();

    public static void main(String[] args) {
        final int TALLA_ZAPATO_MIN = 20;
        final int TALLA_ZAPATO_MAX = 60;

        int talla = RND.nextInt(TALLA_ZAPATO_MAX - TALLA_ZAPATO_MIN + 1) + TALLA_ZAPATO_MIN;

        System.out.printf("Talla de zapato...: %d%n", talla);
    }

}
