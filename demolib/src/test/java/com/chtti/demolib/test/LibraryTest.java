package com.chtti.demolib.test;


import com.chtti.demolib.LibraryMain;


import org.junit.Test;

import static junit.framework.TestCase.assertEquals;


public class LibraryTest {
    @Test
    public void add_is_cooresct(){

        assertEquals(4, LibraryMain.add(2, 2));
    }



}
