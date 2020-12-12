package systems.stacktrace.testinggatewaysleuth;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@Slf4j
public class TestingGatewaySleuthApplication {

  public static void main(String[] args) {
    SpringApplication.run(TestingGatewaySleuthApplication.class, args);
  }

  @GetMapping
  public void logTest() {
    log.error("TESTABCTEST");
  }
}
