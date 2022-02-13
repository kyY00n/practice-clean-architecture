package repository

import model.ProductRecord

interface ProductRecordRepository {
    fun findProductRecordByIdOrNull(productId: String): ProductRecord?
}