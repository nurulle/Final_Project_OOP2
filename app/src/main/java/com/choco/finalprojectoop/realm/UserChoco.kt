package com.choco.finalprojectoop.realm

import io.realm.RealmObject
import io.realm.annotations.RealmClass

@RealmClass
open class UserChoco : RealmObject()  {
    private var id:Int = 0
    private var nipy: String = ""
    private var nama: String = ""

    fun setId(id:Int){
        this.id = id
    }

    fun getId(): Int {
        return id

    }

    fun setNipy(nipy:String){
        this.nipy = nipy
    }

    fun getNipy(): String {
        return nipy

    }

    fun setNama(nama:String){
        this.nama = nama
    }

    fun getNama(): String {
        return nama

    }

}