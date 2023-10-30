package com.MCT.RecipeManagementApi.controller;

import com.MCT.RecipeManagementApi.model.Recipe;
import com.MCT.RecipeManagementApi.service.RecipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RecipeController {

    @Autowired
    RecipeService recipeService;

//    create
    @PostMapping("recepe")
    public String addRecipe(@RequestBody List<Recipe> newRecipe){
        recipeService.addRecipe(newRecipe);
        return "recipe added";

    }
//read
    @GetMapping("getrecipe")

    public List <Recipe> getAllRecipe(){
       return recipeService.getAllRecipe();
    }
//delete
    @DeleteMapping ("getrecipe/id/{id}")

    public String removeRecipebyId(@PathVariable Integer id){
        return recipeService.removeRecipebyId(id);
    }


    @PutMapping("updaterecipe")
    public String updateRecipebyId(@RequestParam  Integer id){
        recipeService.updateRecipe(id);
        return "updated";

    }






}
