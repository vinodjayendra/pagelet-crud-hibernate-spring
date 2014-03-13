package com.servelots.util;

import org.junit.Assert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class HibernateUtilTest {

    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testGetSessionFactory() throws Exception {
      Assert.assertNotNull(HibernateUtil.getSessionFactory());
    }
}
