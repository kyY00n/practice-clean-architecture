package com.karrot.clean.core.usecase

import com.karrot.clean.core.Product
import com.karrot.clean.core.repository.ProductRepository

class GetProductUseCase(
    private val productRepository: ProductRepository
) {
    // usecase는 파라미터로 하나의 DTO를 받는 경우가 많다
    // command or query
    // command는 어떤 변화가 동반되는 애들을 가리킴
    // query는 아무런 변화가 없는 => 조회 연산
    // CQRS: 조회와 수정하는 애를 분리하는 것을 의미한다.
    fun run(id: String): Product? {
        // 리포지토리는 find~ 이런식 ^__^
        return productRepository.readProductByIdOrNull(id)
    }
}