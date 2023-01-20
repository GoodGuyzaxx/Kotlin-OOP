package app

import data.CreateCategoryRequest
import data.CreateProductRequest
import exception.ValidationException

fun validdateRequest(request: CreateProductRequest){
     if (request.id == ""){
        throw ValidationException("id is Blank")
    }else if (request.name == ""){
        throw ValidationException("name is Black")
     }
}

fun validdateRequest(request: CreateCategoryRequest){
    if (request.id == ""){
        throw ValidationException("id is Blank")
    }else if (request.name == ""){
        throw ValidationException("name is Blank")
    }
}

fun main() {
    var request = CreateProductRequest("1","Batu", 0)
    validdateRequest(request)
}