package model

class mahasiswa {
    private var foto:Int = 0
    private var nim:String = ""
    private var alamat:String = ""
    private var prodi:String = ""
    private var nama:String = ""

    constructor(foto:Int, nim:String, alamat:String, prodi:String, nama: String){
        this.foto = foto
        this.nim = nim
        this.alamat = alamat
        this.prodi = prodi
        this.nama = nama
    }

    fun getFoto(): Int {
        return foto
    }

    fun getNim(): String {
        return nim
    }

    fun getNama(): String{
        return nama
    }

    fun getAlamat():String{
        return alamat
    }

    fun getProdi():String{
        return prodi
    }
}