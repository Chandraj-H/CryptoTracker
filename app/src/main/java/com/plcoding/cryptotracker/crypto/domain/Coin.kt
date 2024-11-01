package com.plcoding.cryptotracker.crypto.domain

data class Coin(
    val id: String,
    val rank: Int,
    val name: String,
    val symbol: String,
    val marketCapUsd: Double,
    val priceUsd: Double,
    val changePercent24Hr: Double
)
/* This info is not directly used in ui, we make a different model for that which will display
* formatted information(with commas, 2 decimal places). This keeps ui dumb(doesn't know underlying
* logic which is preferred.*/
