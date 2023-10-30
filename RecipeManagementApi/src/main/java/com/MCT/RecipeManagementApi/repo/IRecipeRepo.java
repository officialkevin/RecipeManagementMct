package com.MCT.RecipeManagementApi.repo;

import com.MCT.RecipeManagementApi.model.Recipe;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRecipeRepo extends CrudRepository<Recipe,Integer> {
}
