package com.medinventory.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.medinventory.models.Medicine;

public interface MedicineRepository extends JpaRepository<Medicine, Long> {
    Medicine findByBarcode(String barcode);
}
