package com.karrot.clean.configuration

import com.karrot.clean.adapter.ProductAdapterImpl
import com.karrot.clean.core.usecase.GetProductUseCase
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import com.karrot.clean.adapter.repository.ProductRecordRepositoryImpl

@Configuration
class BeanConfiguration {

    @Bean
    fun productMysqlRepository() = ProductAdapterImpl(ProductRecordRepositoryImpl())

    @Bean
    fun getProductUseCase()= GetProductUseCase(productMysqlRepository())
}