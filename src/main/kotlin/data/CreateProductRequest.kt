package data

data class CreateProductRequest(
    val id: String,
    val name: String,
    val price: Int
)

data class CreateCategoryRequest(
    val id: String,
    val name: String
)
