package com.example.myapplication.tuan6

class Product {
    var styleid : String ? = null;
    var brand : String ? = null;
    var price : Int ? = null;
    var product_info : String ? = null;
    var image : String ?= null;

    constructor(
        styleid: String?,
        brand: String?,
        price: Int?,
        product_info: String?,
        image: String?
    ) {
        this.styleid = styleid
        this.brand = brand
        this.price = price
        this.product_info = product_info
        this.image = image
    }

}