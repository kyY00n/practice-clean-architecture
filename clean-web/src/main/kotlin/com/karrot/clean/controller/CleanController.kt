package com.karrot.clean.controller

import com.karrot.clean.core.usecase.GetProductUseCase
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

data class ProductResponse(
    val id: String,
    val name: String,
)

@RestController
class CleanController(
    private val getProductUseCase: GetProductUseCase,
) {
    @GetMapping("/{productId}")
    fun product(@PathVariable productId: String) : ProductResponse {
        val product = getProductUseCase.run(productId) ?: throw Exception("해당 id의 product가 없습니다.")
        return ProductResponse(product.id, product.name)
    }
}
