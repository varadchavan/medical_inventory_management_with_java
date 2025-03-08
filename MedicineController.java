package com.medinventory.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.medinventory.models.Medicine;
import com.medinventory.services.MedicineService;

import java.util.List;

@RestController
@RequestMapping("/api/medicines")
public class MedicineController {
    @Autowired
    private MedicineService service;

    @PostMapping("/add")
    public Medicine addMedicine(@RequestBody Medicine medicine) {
        return service.saveMedicine(medicine);
    }

    @GetMapping("/all")
    public List<Medicine> getAll() {
        return service.getAllMedicines();
    }

    @GetMapping("/barcode/{barcode}")
    public Medicine getByBarcode(@PathVariable String barcode) {
        return service.findByBarcode(barcode);
    }
}
