package com.lambdaschool.piggybank.repositories;

import com.lambdaschool.piggybank.models.Coin;
import org.springframework.data.repository.CrudRepository; // abstract class

public interface CoinRepository extends CrudRepository<Coin, Long> // table and key type
{
}
