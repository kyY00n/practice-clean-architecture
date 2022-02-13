package com.karrot.clean.core.usecase

import com.karrot.clean.core.Product
import com.karrot.clean.core.adapter.ProductAdapter


class GetProductUseCase(
    private val productAdapter: ProductAdapter
) {
    data class Input(val id: String) // query

    fun run(input: Input): Product? {
        return productAdapter.findProductByIdOrNull(input.id)
    }
}