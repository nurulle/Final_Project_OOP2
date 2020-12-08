package com.choco.finalprojectoop.realm

import io.realm.RealmObject

class UserZiyan : RealmObject() {
    private var  name: String = ""
    private var alamat: String = ""
    private var email: String = ""
    private var no_tlp: String = ""


    fun setname(nama:Int){
        this.name = name
    }

    fun getname(): String {
        return name

    }

    fun setalamat(alamat:String){
        this.alamat = alamat
    }

    fun getemail(): String {
        return email

    }

    fun setnotlp(notlp:String){
        this.no_tlp = no_tlp
    }

    fun getno_tlp(): String {
        return no_tlp

    }


}