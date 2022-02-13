package com.karrot.clean.core.adapter

import com.karrot.clean.core.Product

interface ProductAdapter {
    fun findProductByIdOrNull(id: String): Product?
}