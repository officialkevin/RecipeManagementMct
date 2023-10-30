package com.MCT.RecipeManagementApi.service;

import com.MCT.RecipeManagementApi.model.Recipe;
import com.MCT.RecipeManagementApi.repo.IRecipeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecipeService {
    @Autowired
    IRecipeRepo iRecipeRepo;

    public String addRecipe(List<Recipe> newRecipe) {

        iRecipeRepo.saveAll(newRecipe);
        return "done";

    }

    public List<Recipe> getAllRecipe() {
       return (List<Recipe>) iRecipeRepo.findAll();
    }

    public String removeRecipebyId(Integer id) {
        iRecipeRepo.deleteById(id);
        return "done";
    }

    public String updateRecipe(Integer id) {

        return "updated";
    }
}
