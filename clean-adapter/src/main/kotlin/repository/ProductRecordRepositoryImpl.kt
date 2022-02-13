package repository

import model.ProductRecord

class ProductRecordRepositoryImpl: ProductRecordRepository {
    override fun findProductRecordByIdOrNull(productId: String): ProductRecord? {
        return ProductRecord(productId, "뽀또")
    }
}