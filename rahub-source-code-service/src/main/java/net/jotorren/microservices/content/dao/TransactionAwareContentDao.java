package net.jotorren.microservices.content.dao;

import net.jotorren.microservices.content.domain.SourceCodeItem;
import net.jotorren.microservices.tx.CompositeTransactionDao;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

@Repository
@Scope("prototype")
public class TransactionAwareContentDao extends CompositeTransactionDao{

    public SourceCodeItem findOne(String pk){    	    	  
    	return em.find(SourceCodeItem.class, pk);
    }
}
