package com.ironhack.purchaseruserservice.Controller.Impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.ironhack.purchaseruserservice.Model.Order;
import com.ironhack.purchaseruserservice.Model.OrderItem;
import com.ironhack.purchaseruserservice.Model.Product;
import com.ironhack.purchaseruserservice.Model.PurchaserUser;
import com.ironhack.purchaseruserservice.Repository.OrderItemRepository;
import com.ironhack.purchaseruserservice.Repository.OrderRepository;
import com.ironhack.purchaseruserservice.Repository.ProductRepository;
import com.ironhack.purchaseruserservice.Repository.PurchaserUserRepository;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import javax.ws.rs.core.MediaType;
import java.math.BigDecimal;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
@SpringBootTest
class PurchaserUserControllerImplTest {

    @Autowired
    private PurchaserUserRepository purchaserUserRepository;

    @Autowired
    private OrderItemRepository orderItemRepository;

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private WebApplicationContext webApplicationContext;
    private MockMvc mockMvc;
    private final ObjectMapper objectMapper = new ObjectMapper();

    private Product product1, product2;
    private OrderItem orderItem1, orderItem2;
    private Order order1, order2;
    private PurchaserUser purchaserUser1, purchaserUser2;

    @BeforeEach
    void setUp() {
        mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
        product1 = new Product("Sandwich", 3, 0.200, new BigDecimal(1.5));
        product2 = new Product("Burger", 4, 0.300, new BigDecimal(2.5));
        orderItem1 = new OrderItem(1L, product1, 2, new BigDecimal(3));
        orderItem2 = new OrderItem(2L, product2, 1, new BigDecimal(2.5));
        order1 = new Order((List<OrderItem>) orderItem1);
        order2 = new Order((List<OrderItem>) orderItem2);
        purchaserUser1 = new PurchaserUser("sofidelaf", "sofi1234", "Sofia de la Fuente", "sofidelaf@gmail.com", 634477559L, "Menorca 35", order1);
        purchaserUser1 = new PurchaserUser("aledelaf", "ale1234", "Alejandro de la Fuente", "aledelaf@gmail.com", 59894162230L, "Menorca 35", order2);
        productRepository.saveAll(List.of(product1, product2));
        orderItemRepository.saveAll(List.of(orderItem1, orderItem2));
        orderRepository.saveAll(List.of(order1, order2));
        purchaserUserRepository.saveAll((List.of(purchaserUser1, purchaserUser2)));

    }

    @AfterEach
    void tearDown() {
        purchaserUserRepository.deleteAll();
        orderRepository.deleteAll();
        orderItemRepository.deleteAll();
        productRepository.deleteAll();
    }

    @Test
    void createPurchaserUser() throws Exception {
        PurchaserUser purchaserUser3 = new PurchaserUser("rocio", "ro1234", "Rocio Arellano", "rocio@gmail.com", 675667890L, "Av de America 22", order1);
        String body = objectMapper.writeValueAsString(purchaserUser3);
        MvcResult mvcResult = mockMvc.perform(
                        post("/purchaser-users")
                                .content(body)
                                .contentType(MediaType.APPLICATION_JSON)
                )
                .andExpect(status().isCreated())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
                .andReturn();
        assertTrue(mvcResult.getResponse().getContentAsString().contains("rocio"));
        assertEquals(3, purchaserUserRepository.findAll().size());
    }
}
