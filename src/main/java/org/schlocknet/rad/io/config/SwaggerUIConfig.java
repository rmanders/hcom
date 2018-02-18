package org.schlocknet.rad.io.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerUIConfig {

  /** Local logger instance */
  private static final Logger LOGGER = LoggerFactory.getLogger(SwaggerUIConfig.class);

  /** Java package path to the REST controllers */
  private static final String API_CONTROLLER_PATH = "org.schlocknet.rad.io.controller";

  /**
   * Creates the Swagger-UI bean
   * @return
   */
  @Bean
  public Docket radioApi() {
    LOGGER.info("Creating Swagger UI Docket for Rad.io API");
    return new Docket(DocumentationType.SWAGGER_2)
        .select()
        .apis(RequestHandlerSelectors.basePackage(API_CONTROLLER_PATH))
        .paths(PathSelectors.regex("/.*"))
        .build()
        .apiInfo(apiMetadata());
  }

  /**
   * Returns additional Metadata for the Rad.io API
   * @return
   */
  private ApiInfo apiMetadata() {
    return new ApiInfoBuilder()
        .title("Rad.io API")
        .description("API Ddocumentation for the Rad.io Amateur radio utility suite")
        .version("1.0.0")
        .termsOfServiceUrl("")
        .contact(new Contact("","",""))
        .license("")
        .licenseUrl("")
        .build();
  }
}
