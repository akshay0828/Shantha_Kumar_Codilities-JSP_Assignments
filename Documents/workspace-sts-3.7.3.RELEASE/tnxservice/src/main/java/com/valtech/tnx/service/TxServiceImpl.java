package com.valtech.tnx.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.valtech.tnx.entity.Tx;
import com.valtech.tnx.repository.TxRepository;

@Service
public class TxServiceImpl implements TxService  {
	
	@Autowired
	private TxRepository txRepository;
	
	
	
	


	/* (non-Javadoc)
	 * @see com.valtech.tnx.service.TxService#createTx(com.valtech.tnx.entity.Tx)
	 */
	@Override
	public Tx createTx(Tx tx){
		return txRepository.save(tx);
	}


	/* (non-Javadoc)
	 * @see com.valtech.tnx.service.TxService#updateTx(com.valtech.tnx.entity.Tx)
	 */
	@Override
	public Tx updateTx(Tx tx){
		return txRepository.save(tx);
	}
	


	/* (non-Javadoc)
	 * @see com.valtech.tnx.service.TxService#getTx(long)
	 */
	@Override
	public Tx getTx(long id){
		return txRepository.findById(id).get();
	}
	


	/* (non-Javadoc)
	 * @see com.valtech.tnx.service.TxService#getAllTx()
	 */
	@Override
	public List<Tx> getAllTx(){
		return txRepository.findAll();
	}


	@Override
	public List<Tx> getAllTxByAccount(long id) {
		// TODO Auto-generated method stub
		return txRepository.findAllByAccountId(id);
	}
	

	
	
}
