package com.kavya.wallet;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/* Defining this interface serves two purposes: First, by extending JpaRepository we get 
 * a bunch of generic CRUD methods into our type. Second, this will allow the Spring Data JPA
 *  repository infrastructure to scan the classpath for this interface and create a Spring bean for it.*/

@Repository
public interface WalletRepository extends JpaRepository<Wallet,Integer> {

	public Optional<Wallet> findById(Integer id);


}
