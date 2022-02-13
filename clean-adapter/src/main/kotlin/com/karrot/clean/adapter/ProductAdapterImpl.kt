package com.karrot.clean.adapter

import com.karrot.clean.core.Product
import com.karrot.clean.core.repository.ProductAdapter
import com.karrot.clean.adapter.repository.ProductRecordRepository

class ProductAdapterImpl(
    private val productRecordRepository: ProductRecordRepository
) : ProductAdapter {
    override fun findProductByIdOrNull(id: String): Product? =
        productRecordRepository.findProductRecordByIdOrNull(id)?.toEntity()
}