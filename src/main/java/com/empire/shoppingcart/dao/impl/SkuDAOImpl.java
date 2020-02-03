package com.empire.shoppingcart.dao.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.empire.mockdata.generate.DataGenerator;
import com.empire.shoppingcart.dao.SkuDAO;
import com.empire.shoppingcart.domain.SKU;
import com.empire.shoppingcart.exception.ShoppingCartException;
import com.empire.shoppingcart.persist.PersistLayer;

public class SkuDAOImpl implements SkuDAO {

	private DataGenerator dataGenerator = new DataGenerator();
	private static final Logger log = LoggerFactory.getLogger(SkuDAOImpl.class);
	private PersistLayer persistLayer = new PersistLayer();

	@Override
	public SKU get(String skuNumber) {
		log.info("Getting a Sku");
		return dataGenerator.generateRandomSku(skuNumber);
	}

	public SKU generate() {
		log.info("Generating a Sku");
		return dataGenerator.generateRandomSku();
	}

	@Override
	public SKU create(String skuNumber) {
		log.info("Creating a Sku");
		return dataGenerator.generateRandomSku(skuNumber);
	}

	@Override
	public SKU update(SKU sku) {
		try {
			log.info("Updating Sku");
			throw new ShoppingCartException("Unable to persist Sku " + sku.getSkuNumber());
		} catch (Exception ex) {
			// swallowed exception
		}
		return sku;
	}

	@Override
	public boolean delete(SKU sku) {
		log.info("Deleting a Sku");
		persistLayer.deleteSku(sku);
		return true;
	}

}
