package com.demo.web.test;

import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

import com.demo.web.domain.Greeting;

class GradleJspServletTest {

  @Test
  void testGreetingNotNull() {
    assertNotNull(new Greeting().getMessage());
  }

  @Test
  void testGreetingMessage() {
    assertNotEquals("", new Greeting().getMessage());
  }

}
