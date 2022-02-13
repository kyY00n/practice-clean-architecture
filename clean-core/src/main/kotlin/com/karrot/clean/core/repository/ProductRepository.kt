package com.karrot.clean.core.repository

import com.karrot.clean.core.Product

interface ProductRepository {
    fun readProductByIdOrNull(id: String): Product?
}