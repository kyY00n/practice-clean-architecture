package model

import com.karrot.clean.core.Product

data class ProductRecord(
    val id: String,
    val name: String,
) {
    fun toEntity(): Product = Product(id, name)
}