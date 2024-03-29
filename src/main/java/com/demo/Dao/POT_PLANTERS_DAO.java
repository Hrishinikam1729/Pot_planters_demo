package com.demo.Dao;

import java.util.List;

import com.demo.Model.POT_PLANTERS;

public interface POT_PLANTERS_DAO {

	List<POT_PLANTERS> getAllPot_Planters();

	List<POT_PLANTERS> getLoadedPp(int offset, int limit);

	List<POT_PLANTERS> getAllPotPlanterLoadedByRating(int offset, int limit, double rating);

	List<POT_PLANTERS> getAllPotPlanterLoadedByPrice(int offset, int limit, double price, double to);

	List<POT_PLANTERS> getAllPotPlanterLoadedByRatingPrice(int offset, int limit, double rating, double from, double to);

	List<POT_PLANTERS> getAllPotPlanterLoadedByRatingStock(int offset, int limit, double rating, int stock);

	List<POT_PLANTERS> getAllPotPlanterLoadedByPriceStock(int offset, int limit, double from, double to, int stock);

	List<POT_PLANTERS> getAllPotPlanterLoadedByPriceStockRating(int offset, int limit, double from, double to,
			int stock, double rating);

	List<POT_PLANTERS> getAllPotPlanterLoadedByRatingPriceSORTTITLE_A_Z(int offset, int limit, double rating,
			double from, double to);

	List<POT_PLANTERS> getAllPotPlanterLoadedByRatingPriceSORTTITLE_Z_A(int offset, int limit, double rating,
			double from, double to);

	List<POT_PLANTERS> getAllPotPlanterLoadedByRatingPriceSORTPRICE_L_H(int offset, int limit, double rating,
			double from, double to);

	List<POT_PLANTERS> getAllPotPlanterLoadedByRatingPriceSORTPRICE_H_L(int offset, int limit, double rating,
			double from, double to);

	List<POT_PLANTERS> getAllPotPlanterLoadedByRatingStockSORTTITLE_A_Z(int offset, int limit, double rating,
			int stock);

	List<POT_PLANTERS> getAllPotPlanterLoadedByRatingStockSORTTITLE_Z_A(int offset, int limit, double rating,
			int stock);

	List<POT_PLANTERS> getAllPotPlanterLoadedByRatingStockSORTPRICE_L_H(int offset, int limit, double rating,
			int stock);

	List<POT_PLANTERS> getAllPotPlanterLoadedByRatingStockSORTPRICE_H_L(int offset, int limit, double rating,
			int stock);

	List<POT_PLANTERS> getAllPotPlanterLoadedByPriceStockSORTTITLE_A_Z(int offset, int limit, double from, double to,
			int stock);

	List<POT_PLANTERS> getAllPotPlanterLoadedByPriceStockSORTTITLE_Z_A(int offset, int limit, double from, double to,
			int stock);

	List<POT_PLANTERS> getAllPotPlanterLoadedByPriceStockSORTPRICE_L_H(int offset, int limit, double from, double to,
			int stock);

	List<POT_PLANTERS> getAllPotPlanterLoadedByPriceStockSORTPRICE_H_L(int offset, int limit, double from, double to,
			int stock);

	List<POT_PLANTERS> getAllPotPlanterLoadedByPriceStockRatingSORTTITLE_A_Z(int offset, int limit, double from,
			double to, int stock, double rating);

	List<POT_PLANTERS> getAllPotPlanterLoadedByPriceStockRatingSORTTITLE_Z_A(int offset, int limit, double from,
			double to, int stock, double rating);

	List<POT_PLANTERS> getAllPotPlanterLoadedByPriceStockRatingSORTPRICE_L_H(int offset, int limit, double from,
			double to, int stock, double rating);

	List<POT_PLANTERS> getAllPotPlanterLoadedByPriceStockRatingSORTPRICE_H_L(int offset, int limit, double from,
			double to, int stock, double rating);

}
