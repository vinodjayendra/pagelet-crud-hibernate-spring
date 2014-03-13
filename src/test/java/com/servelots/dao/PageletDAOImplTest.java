package com.servelots.dao;

import com.servelots.entity.Pagelet;
import org.junit.Assert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class PageletDAOImplTest {

    PageletDAOImpl pageletDAO;

    @Before
    public void setUp() throws Exception {
        pageletDAO = new PageletDAOImpl();
   }

    @After
    public void tearDown() throws Exception {
        pageletDAO = null;
    }

    @Test
    public void testCreate() throws Exception {
        Pagelet pagelet = new Pagelet();
        pagelet.setId("1");

        pageletDAO.create(pagelet);
    }

    @Test
    public void testRead() throws Exception {
        Pagelet pagelet = pageletDAO.read("1");
        Assert.assertEquals(pagelet.getId(), "1");
   }

    @Test
    public void testUpdate() throws Exception {
        Pagelet pagelet = new Pagelet();
        pagelet.setId("1");
        pagelet.setTitle("Title 1");

        pageletDAO.update(pagelet);
    }

    /*@Test
    public void testDelete() throws Exception {
        Pagelet pagelet = pageletDAO.read("1");
        pageletDAO.delete(pagelet);
    }*/
}
