package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


import java.math.BigDecimal;

@SpringBootTest
public class InvoiceDaoTestSuite
{
    @Autowired
    private InvoiceDao invoiceDao;

    @Autowired
    private ItemDao itemDao;

    @Autowired
    private ProductDao productDao;

    @Test
    void testInvoiceDaoSave()
    {
        //Given
        Product pcGames = new Product("PC Games");

        Item pcGame1 = new Item(new BigDecimal(120), 1, new BigDecimal(120));
        Item pcGame2 = new Item(new BigDecimal(100), 2, new BigDecimal(200));
        Item pcGame3 = new Item(new BigDecimal(250), 1, new BigDecimal(250));
        Item pcGame4 = new Item(new BigDecimal(200), 3, new BigDecimal(600));
        Item pcGame5 = new Item(new BigDecimal(150), 2, new BigDecimal(350));
        Item pcGame6 = new Item(new BigDecimal(80), 5, new BigDecimal(400));

        pcGames.getItems().add(pcGame1);
        pcGames.getItems().add(pcGame2);
        pcGames.getItems().add(pcGame3);
        pcGames.getItems().add(pcGame4);
        pcGames.getItems().add(pcGame5);
        pcGames.getItems().add(pcGame6);

        pcGame1.setProduct(pcGames);
        pcGame2.setProduct(pcGames);
        pcGame3.setProduct(pcGames);
        pcGame4.setProduct(pcGames);
        pcGame5.setProduct(pcGames);
        pcGame6.setProduct(pcGames);

        Invoice invoice = new Invoice("FV 123/2021");

        invoice.getItems().add(pcGame1);
        invoice.getItems().add(pcGame2);
        invoice.getItems().add(pcGame3);
        invoice.getItems().add(pcGame4);
        invoice.getItems().add(pcGame5);
        invoice.getItems().add(pcGame6);

        pcGame1.setInvoice(invoice);
        pcGame2.setInvoice(invoice);
        pcGame3.setInvoice(invoice);
        pcGame4.setInvoice(invoice);
        pcGame5.setInvoice(invoice);
        pcGame6.setInvoice(invoice);


        //When
        productDao.save(pcGames);
        int pcGamesId = pcGames.getId();
        invoiceDao.save(invoice);
        int invoiceId = invoice.getId();

        //Then
        Assertions.assertNotEquals(0, pcGamesId);
        Assertions.assertNotEquals(0, invoiceId);
        Assertions.assertNotEquals(0, pcGame1.getId());

        //Cleanup
        invoiceDao.delete(invoice);
        productDao.delete(pcGames);
    }
}
