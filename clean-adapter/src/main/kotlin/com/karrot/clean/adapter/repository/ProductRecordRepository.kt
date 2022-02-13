package com.karrot.clean.adapter.repository

import com.karrot.clean.adapter.model.ProductRecord

interface ProductRecordRepository {
    fun findProductRecordByIdOrNull(productId: String): ProductRecord?
}