package com.demo.Service;

import java.util.List;

import com.demo.Model.POT_PLANTERS;

public interface POT_PLANTERS_SERVICE {

	List<POT_PLANTERS> getAllPotPlanter();

	List<POT_PLANTERS> getAllPotPlanterLoaded(int offset, int limit);

	List<POT_PLANTERS> getAllPotPlanterLoadedRating(int offset, int limit, double rating);

	List<POT_PLANTERS> getAllPotPlanterLoadedPrice(int offset, int limit, double price, double to);

	List<POT_PLANTERS> getAllPotPlanterLoadedRatingPrice(int offset, int limit, double rating, double from, double to);

	List<POT_PLANTERS> getAllPotPlanterLoadedRatingStock(int offset, int limit, double rating, int stock);

	List<POT_PLANTERS> getAllPotPlanterLoadedPriceStock(int offset, int limit, double from, double to, int stock);

	List<POT_PLANTERS> getAllPotPlanterLoadedPriceStockRating(int offset, int limit, double from, double to, int stock,
			double rating);

	List<POT_PLANTERS> getAllPotPlanterLoadedRatingPriceSORTTITLE_A_Z(int offset, int limit, double rating, double from,
			double to);

	List<POT_PLANTERS> getAllPotPlanterLoadedRatingPriceSORTTITLE_Z_A(int offset, int limit, double rating, double from,
			double to);

	List<POT_PLANTERS> getAllPotPlanterLoadedRatingPriceSORTBYPRICE_L_TO_H(int offset, int limit, double rating,
			double from, double to);

	List<POT_PLANTERS> getAllPotPlanterLoadedRatingPriceSORTBYPRICE_H_TO_L(int offset, int limit, double rating,
			double from, double to);

	List<POT_PLANTERS> getAllPotPlanterLoadedRatingStockSORTTITLE_A_Z(int offset, int limit, double rating, int stock);

	List<POT_PLANTERS> getAllPotPlanterLoadedRatingStockSORTTITLE_Z_A(int offset, int limit, double rating, int stock);

	List<POT_PLANTERS> getAllPotPlanterLoadedRatingStockSORTBYPRICE_L_TO_H(int offset, int limit, double rating,
			int stock);

	List<POT_PLANTERS> getAllPotPlanterLoadedRatingStockSORTBYPRICE_H_TO_L(int offset, int limit, double rating,
			int stock);

	List<POT_PLANTERS> getAllPotPlanterLoadedPriceStockSORTTITLE_A_Z(int offset, int limit, double from, double to,
			int stock);

	List<POT_PLANTERS> getAllPotPlanterLoadedPriceStockSORTTITLE_Z_A(int offset, int limit, double from, double to,
			int stock);

	List<POT_PLANTERS> getAllPotPlanterLoadedPriceStockSORTBYPRICE_L_TO_H(int offset, int limit, double from, double to,
			int stock);

	List<POT_PLANTERS> getAllPotPlanterLoadedPriceStockSORTBYPRICE_H_TO_L(int offset, int limit, double from, double to,
			int stock);

	List<POT_PLANTERS> getAllPotPlanterLoadedPriceStockRatingSORTTITLE_A_Z(int offset, int limit, double from,
			double to, int stock, double rating);

	List<POT_PLANTERS> getAllPotPlanterLoadedPriceStockRatingSORTTITLE_Z_A(int offset, int limit, double from,
			double to, int stock, double rating);

	List<POT_PLANTERS> getAllPotPlanterLoadedPriceStockRatingSORTBYPRICE_L_TO_H(int offset, int limit, double from,
			double to, int stock, double rating);

	List<POT_PLANTERS> getAllPotPlanterLoadedPriceStockRatingSORTBYPRICE_H_TO_L(int offset, int limit, double from,
			double to, int stock, double rating);

																															

}
