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
        pagelet.setId(1L);

        Long returnedId = pageletDAO.create(pagelet);
        Assert.assertEquals(pagelet.getId(), returnedId);

        //Clean up the data
        pageletDAO.delete(pagelet);
    }

    @Test
    public void testRead() throws Exception {
        //Setup the pagelet data.
        Pagelet createdPagelet = new Pagelet();
        createdPagelet.setId(1L);

        pageletDAO.create(createdPagelet);

        //Read the pagelet
        Pagelet pagelet = pageletDAO.read(1L);
        Assert.assertEquals(pagelet.getId(), Long.valueOf(1));

        //Clean up the data
        pageletDAO.delete(pagelet);
   }


   /* @Test
    public void testUpdate() throws Exception {
        //Setup the pagelet data.
        Pagelet testPagelet = new Pagelet();
        testPagelet.setId(2L);
        pageletDAO.create(testPagelet);

        //Read the pagelet
        Pagelet toBeUpdatedPagelet = pageletDAO.read(2L);
        toBeUpdatedPagelet.setTitle("Title 1");

        pageletDAO.update(toBeUpdatedPagelet);

        //Clean up the data
        //pageletDAO.delete(testPagelet);
    }*/

    @Test
    public void testDelete() throws Exception {
        //Setup the pagelet data.
        Pagelet testPagelet = new Pagelet();
        testPagelet.setId(1L);
        pageletDAO.create(testPagelet);

        //Delete the pagelet and test
        pageletDAO.delete(testPagelet);

        //Assert.assertNull(pageletDAO.read(testPagelet.getId()));
    }

}
