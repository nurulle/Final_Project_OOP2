package com.choco.finalprojectoop.realm

import io.realm.RealmObject
import io.realm.annotations.RealmClass

@RealmClass
open class UserChoco : RealmObject()  {
    private var id:Int = 0
    private var nim: String = ""
    private var jurusan: String = ""

    fun setId(id:Int){
        this.id = id
    }

    fun getId(): Int {
        return id

    }

    fun setNim(nim:String){
        this.nim = nim
    }

    fun getNim(): String {
        return nim

    }

    fun setJurusan(jurusan:String){
        this.jurusan = jurusan
    }

    fun getJurusan(): String {
        return jurusan

    }

}