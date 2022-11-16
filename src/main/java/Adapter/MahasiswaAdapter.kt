package Adapter

import android.content.Context
import android.content.SyncAdapterType
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.kln.praktikum7_muhamadzulfikar.R
import model.mahasiswa
import java.text.FieldPosition

class MahasiswaAdapter (val context:Context) : RecyclerView.Adapter<MahasiswaAdapter.MahasiswaViewHolder>() {
    private  val mhs : MutableList<mahasiswa> = mutableListOf()

    override fun getItemCount(): Int {
        return mhs.size
    }

    override fun onBindViewHolder(holder: MahasiswaAdapter.MahasiswaViewHolder, position: Int){
        holder.bindModel(mhs[position])
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MahasiswaViewHolder {
        return MahasiswaViewHolder(LayoutInflater.from(context).inflate(R.layout.list_mahasiswa, parent, false))
    }

    inner class MahasiswaViewHolder(item: View): RecyclerView.ViewHolder(item){
        val imgFoto: ImageView = item.findViewById(R.id.img_foto)
        val txtNim: TextView = item.findViewById(R.id.tx_nim)
        val txtNama: TextView = item.findViewById(R.id.mahasiswa)

        val cardViewData: CardView = item.findViewById(R.id.list_mahasiswa)

        fun bindModel(m: mahasiswa){
            imgFoto.setImageResource(m.getFoto())
            txtNim.text = m.getNim()
            txtNama.text = m.getNama()
        }
    }
    fun setListDataMahasiswa(data: List<mahasiswa>){
        mhs.clear()
        mhs.addAll(data)
        notifyDataSetChanged()
    }
}