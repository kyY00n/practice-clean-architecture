package com.karrot.clean.configuration

import com.karrot.clean.adapter.ProductMySQLRepositoryImpl
import com.karrot.clean.core.usecase.GetProductUseCase
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class BeanConfiguration {

    @Bean
    fun productMysqlRepository() = ProductMySQLRepositoryImpl()

    @Bean
    fun getProductUseCase()= GetProductUseCase(productMysqlRepository())
}