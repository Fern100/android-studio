package com.example.cardview.Adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.cardview.databinding.CardLayoutBinding
import com.example.cardview.model.Tarefa

class TarefaAdapter: RecyclerView.Adapter<TarefaAdapter.TarefaViewHolder>() {
    var listTarefa= emptyList<Tarefa>()

    class TarefaViewHolder (val binding: CardLayoutBinding): RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TarefaViewHolder {
        return TarefaViewHolder(CardLayoutBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun onBindViewHolder(holder: TarefaViewHolder, position: Int) {
        val tarefas = listTarefa[position]
        holder.binding.textNome.text = tarefas.nome
        holder.binding.textDescricao.text = tarefas.descricao
        holder.binding.textResponsavel.text = tarefas.responsável
        holder.binding.textData.text = tarefas.data
        holder.binding.switch1.isChecked = tarefas.status
        holder.binding.textView4.text = tarefas.categoria.descricao
    }

    override fun getItemCount(): Int {
        return listTarefa.size
    }
    fun setList(list: List<Tarefa>){
        listTarefa = list
        notifyDataSetChanged()
    }
}