package com.valiton.spring.web;

import junit.framework.TestCase;

public class HomeControllerTest extends TestCase{

    private HomeController controller;

    public void setUp() {
        controller = new HomeController();
    }

    public void testHome() {
        String response = controller.home();
        assertEquals("Welcome to the home page!", response);
    }

}
