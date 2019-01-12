package com.example.cleme.ocr_1

import com.chibatching.kotpref.KotprefModel


object KPrefModel : KotprefModel() {
    var userMail by stringPref(default = "")
}