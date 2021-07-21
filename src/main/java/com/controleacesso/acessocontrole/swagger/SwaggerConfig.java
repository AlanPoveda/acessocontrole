package com.controleacesso.acessocontrole.swagger;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.ParameterBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.schema.ModelRef;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Collections;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
    @Bean
    public Docket apiAdmin() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.controleacesso.acessocontrole"))
                .paths(PathSelectors.ant("/**"))
                .build()
                .apiInfo(apiInfo())
                .globalOperationParameters(
                        Collections.singletonList(new ParameterBuilder().name("Autorization").description("handler for token JWT").modelRef(new ModelRef("string")).parameterType("header").required(false).build()));
    }


    public ApiInfo apiInfo(){
        return new ApiInfoBuilder().title("API-REST").description("Aprendendo a fazer API").version("1.0.0").license("Apache Livense Version 2.0").licenseUrl("https://www.apache.org/licenses/LICENSE-2.0.html").contact(new Contact("Alan Poveda", "alsepoveda@gmail.com","alsepoveda@gmail.com")).build();
    }
}
