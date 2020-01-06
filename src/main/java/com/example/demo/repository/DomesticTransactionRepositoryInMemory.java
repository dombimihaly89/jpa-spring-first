package com.example.demo.repository;

import com.example.demo.persistence.entity.DomesticTransaction;
import org.springframework.stereotype.Repository;

import java.util.*;

//@Repository
public class DomesticTransactionRepositoryInMemory {
/*

    private Map<UUID, DomesticTransaction> domesticTransactionMap = new HashMap<>();

    public List<DomesticTransaction> findAll() {
        return new ArrayList<>(domesticTransactionMap.values());
    }

    public DomesticTransaction findById(UUID id) {
        Iterator<Map.Entry<UUID, DomesticTransaction>> iterator = domesticTransactionMap.entrySet().iterator();
        while(iterator.hasNext()) {
            Map.Entry<UUID, DomesticTransaction> entry = iterator.next();
            if (entry.getKey().equals(id)) {
                return entry.getValue();
            }
        }
        return null;
    }

    public DomesticTransaction addDomesticTransaction(DomesticTransaction data) {
        UUID id = UUID.randomUUID();
        data.setTransactionId(id);
        domesticTransactionMap.put(data.getTransactionId(), data);
        return data;
    }

    public DomesticTransaction updateDomesticTransaction(DomesticTransaction data) {
        if (domesticTransactionMap.containsKey(data.getTransactionId())) {
            domesticTransactionMap.put(data.getTransactionId(), data);
            return data;
        }
        return null;
    }

    public DomesticTransaction deleteDomesticTransaction(UUID id) {
        DomesticTransaction deleteTarget = null;

        Iterator<Map.Entry<UUID, DomesticTransaction>> iterator = domesticTransactionMap.entrySet().iterator();
        while(iterator.hasNext()) {
            Map.Entry<UUID, DomesticTransaction> entry = iterator.next();
            if (entry.getKey().equals(id)) {
                deleteTarget = entry.getValue();
                iterator.remove();
                return deleteTarget;
            }
        }
        return null;
    }
*/

}
