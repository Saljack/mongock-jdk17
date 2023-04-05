package io.mongock.driver.mongodb.springdata.v4.driver;


import io.mongock.driver.mongodb.springdata.v4.*;
import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.boot.test.autoconfigure.data.mongo.*

@DataMongoTest
public class SpringDataMongo4DataMongoTestSupportITest {

  @Autowired
  private SpringDataMongoV4Context springDataMongoV4Context;

  public void shouldAutoconfigureSpringDataMongoV4ContextWithDataMongoTest() {
    Assertions.assertEquals(springDataMongoV4Context);
  }
 
}
