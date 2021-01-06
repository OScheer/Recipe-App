package com.example.recipeapp.view

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.example.recipeapp.R
import com.example.recipeapp.databinding.ItemMealBinding
import com.example.recipeapp.model.Recipe

class RecipesListAdapter(val recipesList: ArrayList<Recipe>): RecyclerView.Adapter<RecipesListAdapter.RecipeViewHolder>(), RecipeClickListener {

    class RecipeViewHolder(var view: ItemMealBinding): RecyclerView.ViewHolder(view.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecipeViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = DataBindingUtil.inflate<ItemMealBinding>(inflater, R.layout.item_meal, parent, false)
        return RecipeViewHolder(view)
    }

    override fun getItemCount() = recipesList.size

    override fun onBindViewHolder(holder: RecipeViewHolder, position: Int) {
        holder.view.recipe = recipesList[position]
        holder.view.listener = this
    }

    override fun onRecipeClicked(v: View) {
//        val uuid = v.
        val action = ListFragmentDirections.actionDetailFragment()
//        action.mealUuid = uuid
        Navigation.findNavController(v).navigate(action)
    }
}