package com.karrot.clean.adapter.repository

import com.karrot.clean.adapter.model.ProductRecord

class ProductRecordRepositoryImpl: ProductRecordRepository {
    override fun findProductRecordByIdOrNull(productId: String): ProductRecord? {
        return ProductRecord(productId, "뽀또")
    }
}