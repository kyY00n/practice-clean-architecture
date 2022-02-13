package com.karrot.clean.adapter

import com.karrot.clean.core.Product
import com.karrot.clean.core.repository.ProductRepository

// Adapter는 여러 데이터소스로부터 가져올 수 있다 그래서 MySQL은 지워주는 게 나을 것같다
// repository는 adapter 로 용어를 바꿔쓰자
class ProductMySQLRepositoryImpl: ProductRepository {
    override fun readProductByIdOrNull(id: String): Product? {
        // DB 조회
        return Product(id, "뽀또")
    }
}